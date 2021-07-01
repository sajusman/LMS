package Testing.UnitTests;

import com.sajusman.lms.Utilities.RandomUtil;
import com.sajusman.lms.Models.Author;
import com.sajusman.lms.Models.Book;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

public class BookServiceTest {

    private static final String API_ROOT
            = "http://localhost:8081/api/books";

    private Book createRandomBook() {
        Book book = new Book();
        Author author = new Author();
        book.setTitle(RandomUtil.getString(10));
        author.setName(RandomUtil.getString(15));

        return book;
    }

    private String createBookAsUri(Book book) {
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(book)
                .post(API_ROOT);
        return API_ROOT + "/" + response.jsonPath().get("id");
    }


    @Test
    public void whenCreateBook_thenOK() {
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(createRandomBook())
                .post(API_ROOT);
        assertNotNull("Is null ? " , response);

    }

    @Test
    public void whenGetAllBooks_thenOK() {
        Response response = RestAssured.get(API_ROOT);

        assertEquals("Works",HttpStatus.OK.value(), response.getStatusCode());
    }
}

function postBook(book){
    Service.post(URIs.book,book,null);
}

function getAllBooks(){
    return Service.get(URIs.book);
}
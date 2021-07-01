
class  URI{
    static getBase(){
        return "http://localhost:8081/api/";
    }

    static getBook(){
        return this.getBase() + "book";
    }
    static getAuthor(){
        return this.getBase() + "author";
    }
    static getGenre(){
        return this.getBase() + "genre";
    }

}
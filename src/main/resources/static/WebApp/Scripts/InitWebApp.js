var Books = [];
var Authors = [];
var Genres = [];

function main(){
    Service.get(URI.getBook(),Books,set);
    Service.get(URI.getAuthor(),Authors,set);
    Service.get(URI.getGenre(),Genres,set);
}

function set(array,response){
    array = JSON.parse(response);
    console.log(array);
}


main();
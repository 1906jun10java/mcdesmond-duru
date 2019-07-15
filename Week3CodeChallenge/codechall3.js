let books = [{ title, author, genre, cover_image }];

let User;
let user_choice;
if (user_choice = "remove") {
    remove();
} else if (user_choice = "edit") {
    edit();
} else {
    view();
}

function view() {

    for (let i = 0; i >= 0; i++) {
        console.log(books[i]);
    }

} view();

function edit() {
    books.delete();

} edit();

function remove() {


} remove();
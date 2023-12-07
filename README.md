# book-library
Library Ticketing System
This project is a Library Ticketing System API built using Spring Boot and MongoDB. It manages tickets for library events.

Running the Application
Clone the repository: https://github.com/bhaveshdarpan/book-library/
Run the BookApplicaiton.java file. The application should now be running on http://localhost:8080.

Seeding the Database with Mock Data
To seed the database with mock book data, use the following endpoint:

Endpoint: POST /api/books/seed
This endpoint seeds the database with mock book data.

API Documentation
1. Retrieve All Books
Endpoint
GET /api/books
Description
Retrieves a list of all books from the library.
Response Format
[
    {
        "id": "",
        "title": "Book Title",
        "author": "Author Name",
        "isbn": "Book ISBN"
    },
    // ... other books
]

2. Add a New Book
Endpoint
POST /api/books
Request Format
{
    "title": "New Book Title",
    "author": "New Author",
    "isbn": "New ISBN"
}
Description
Adds a new book to the library.
Response Format
{
    "id": "2",
    "title": "New Book Title",
    "author": "New Author",
    "isbn": "New ISBN"
}

3. Update Book Details
Endpoint
PUT /api/books/{id}
Request Format
{
    "title": "Updated Book Title",
    "author": "Updated Author",
    "genre": "Updated Genre"
}
Description
Updates details of a specific book in the library.

Response Format
HTTP Status: 200 OK


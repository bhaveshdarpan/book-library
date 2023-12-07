# book-library
This project is a RESTful API for managing a library system built using Spring Boot and MongoDB. It enables CRUD operations for books in the library.

## Running the Application

1. Clone the repository: `https://github.com/bhaveshdarpan/book-library/`
2. Run the BookApplication.java file. The application should now be running on `http://localhost:8080`.

## Seeding the Database with Mock Data

To seed the database with mock book data, use the following endpoint:

**Endpoint:** `POST /api/books/seed`

This endpoint seeds the database with mock book data.

## API Documentation

### 1. Retrieve All Books

**Endpoint:** `GET /api/books`

**Description:** Retrieves a list of all books from the library.

**Response Format:**
```json
[
    {
        "id": "",
        "title": "Book Title",
        "author": "Author Name",
        "isbn": "Book ISBN"
    },
]
```

### 2. Add a New Book
**Endpoint:** `POST /api/books`

**Request Format:**
```json
{
    "title": "New Book Title",
    "author": "New Author",
    "isbn": "New ISBN"
}
```

**Description:** Adds a new book to the library.

**Response Format:**
```json
{
    "id": "2",
    "title": "New Book Title",
    "author": "New Author",
    "isbn": "New ISBN"
}
```

### 3. Update Book Details
**Endpoint:** `PUT /api/books/{id}`

**Request Format:**
```json
{
    "title": "Updated Book Title",
    "author": "Updated Author",
    "genre": "Updated Genre"
}
```

**Description:** Updates details of a specific book in the library.

**Response Format:**
```json
HTTP Status: 200 OK
```

# NewsApp

**NewsApp** is a simple yet scalable news application built using modern Android development practices. The app fetches a list of news articles using the NewsAPI and allows users to tap on an article to view detailed information. The primary goal of this project is to demonstrate a Clean Architecture approach for maintainability and scalability, while adhering to clean code principles such as SOLID, KISS, and DRY.

## Features

- **News Fetching**: Retrieves a list of news articles from NewsAPI.
- **Article Details**: Navigate to detailed views of individual news articles.
- **Clean Architecture**: Structured to separate concerns and make the codebase more maintainable and scalable.
- **Unified State Management**: Each screen follows a unified state pattern to manage UI state effectively.

## Tech Stack

- **Kotlin**: The main programming language.
- **Jetpack Compose**: For building declarative UI components.
- **Dagger Hilt**: Dependency injection framework for managing dependencies.
- **Navigation Component**: For managing in-app navigation.
- **Coroutines**: For handling asynchronous tasks.
- **MVVM**: Implements Model-View-ViewModel architecture to separate UI logic from business logic.

## Current Limitations

This project was implemented within a single working day, so there are several areas marked with TODOs that require further development:

- **Error Handling**: Proper error handling mechanisms need to be implemented.
- **Pagination**: Implement pagination to efficiently load large sets of data.
- **Query and Search Functionality**: As NewsAPI requires a "q" parameter, a search field should be included to allow users to search for specific news topics.

## Conclusion

While this project serves as a solid foundation, there are many enhancements and refinements needed to make it production-ready. The focus was on building a maintainable, scalable architecture that adheres to clean code principles, ensuring the app can be easily extended and improved upon in the future.

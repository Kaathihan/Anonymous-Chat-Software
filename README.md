# Anonymous Chat Software

## Description
The Anonymous Chat Software is a Java-based application that allows users to communicate anonymously over a network. This project was developed as part of the Software Systems Development and Integration course at Ontario Tech University, focusing on network programming and user interface design. It supports multiple clients, direct messaging, and chat log saving, providing a secure and private communication platform.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Demo](#demo)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Contributors](#contributors)
- [Contributing](#contributing)

## Introduction
The Anonymous Chat Software enables users to connect to a server and communicate with others without revealing their identities. It is designed to run on different versions of Java and Gradle, ensuring compatibility across various systems.

## Features
- **Multi-client Support**: Allows multiple users to connect and chat simultaneously.
- **Direct Messaging**: Send private messages to specific users online.
- **Chat Log Saving**: Save chat history to a local file for future reference.
- **User Interface**: Intuitive UI designed using JavaFX.

## Installation

### Prerequisites
- Java (version 15.0.2 or 16.0.2)
- Gradle (version 6.3 or 7.3.3)
- IntelliJ IDEA or another Java IDE

### Steps
1. **Clone the repository:**
   ```bash
   git clone https://github.com/Kaathihan/Anonymous-Chat-Software.git
2. **Open the project in IntelliJ IDEA.**
3. **Configure the project:**
   - Delete the "main" folder in the `src` directory of your newly created project.
   - Clone the repository into the `src` folder.
4. **Build the project using Gradle.**

### Usage
1. Login Credentials for Demo:
   - Email: test@test.com
   - Password: test1234
2. Launch the client application:
   - Open the Start.java file.
   - Enter your username, IP address, and port number to connect.
3. Communicate:
   - Use the chat interface to send messages to other connected users.
     
### Demo
Watch the demo video to see the application in action: [Demo Video](https://www.youtube.com/watch?v=gFXL_MmL9RY)

### Architecture
- Client-Server Model: The application follows a client-server architecture, where the server manages multiple client connections.
- UI Design: The user interface is built using JavaFX, providing a responsive and interactive experience.
  
### Technologies Used
- Programming Language: Java
- Build Tool: Gradle
- UI Framework: JavaFX

### Contributors
- Kaathihan Luxmachandran
- Michael DeMelo
- Wenbo Zhang
- Ginthushan Kandasamy:

### Contributing
   1. Contributions are welcome! Please follow these steps:
   2. Fork the repository.
   3. Create a new branch: git checkout -b feature/YourFeature
   4. Commit your changes: git commit -m 'Add some feature'
   5. Push to the branch: git push origin feature/YourFeature
   6. Open a pull request.

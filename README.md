# CSCI 2020U - Group 28 - Winter 2022



# About Us

-  Our team consists of the following members, with their contributions listed:
    - Ginthushan Kandasamy ([Ginthushan](https://github.com/Ginthushan))
      - The vast majority of the client's code
      - Save chat log to file function
      - Coding of UI elements
      - Video tutorial
    - Wenbo Zhang ([Falanan](https://github.com/Falanan))
      - Server's code
      - README.md file
      - A small part of the client's code
      - UI element design
    - Michael DeMelo ([OntTechUMichaelDeMelo](https://github.com/OntTechUMichaelDeMelo))
      - README.md file
      - Bug checking and testing code
      - Editing and refining code
    - Kaathihan Luxmachandran ([Kaathihan](https://github.com/Kaathihan))
      - Server code
      - Client code
      - README.md file



# Introduction

<h3>The program is an anonymous chat software.</h3>

Considering that different machines use different versions of java and gradle. We don't want to fight with the runtime environment. So, we only uploaded the folder containing the java files and the fxml files. To run this program the steps are more complicated, please follow the <a href="#runProj">bootstrap steps </a>to run the program.

<h5> Bulid tools </h5>

- Gradle

<h5>The following functions are implemented:</h5>

- Multi-client socket
- Sending direct messages to online user
- Save chat record to local file

<h5>Runs fine in the following operating environments:  </h5>

- Windows10 21H2 amd64, Java 15.0.2, Gradle 6.3
- Windows10 21H2 amd64, Java 16.0.2, Gradle 7.3.3

<h1 id="runProj">How to run this project</h1>

This project was created using IntelliJ IDEA in a Windows environment.

Video tutorial Windows version: ([CSCI2020U Group 28 Project](https://www.youtube.com/watch?v=gFXL_MmL9RY))

<h2>Setting up the project</h2>
This is done to accommodate for all machines and different versions of java and gradle. Doing these steps will setup our project to run on the java and gradle versions that your machine is running on.

<h3>Step 1: Create a project on your local disk </h3>

<img src="https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/step1M.png?raw=true" style="zoom:50%;" />

<img src="https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/step1(2)M.png?raw=true" style="zoom:50%;" />

<h3>Step 2: </h3>

Delete the "main" folder in In the src folder where you just created the project
<img src="https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/step2M.jpg?raw=true" style="zoom:50%;" />

<h3>Step 3: Clone the project </h3>

1. Go to the github web page
![](https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/step3M.jpg?raw=true)

   

2. Clone the project to src folder
![](https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/step3(2)M.jpg?raw=true)
![](https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/step3(3)M.jpg?raw=true)
![](https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/step3(4)M.jpg?raw=true)

<h3>Step 4: Back to IntelliJ IDEA </h3>
<img src="https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/step4.jpg?raw=true" style="zoom: 50%;" />



<h2>Run this project </h2>

<h3>Step 1: Start server </h3>

The port is 6666.

![](https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/RunStep1.jpg?raw=true)

<h3>Step 2:  Launch "Start.java" file</h3>

Enter the username, IP address and port number. Here is a demonstration with local environment.

![](https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/RunStep2.jpg?raw=true)

<h3>Step 3: Start Chat </h3>

<img src="https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/RunStep3.jpg?raw=true" style="zoom:50%;" />

<h5>Save chat record to file </h5>

![](https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/Savefile1M.jpg?raw=true)

<img src="https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/SaveFile2M.jpg?raw=true" style="zoom:50%;" />

<h5>The file saved </h5>

<img src="https://github.com/Ginthushan/CSCI2020U_Project/blob/master/images/SaveFile3.jpg?raw=true" style="zoom:50%;" />


Project Title: Node.js Application with Dockerized Environment and Jenkins CI/CD Pipeline

Project Description: This project is a Node.js application set up with Docker containers for development and production environments. It includes a Dockerfile for building the application image, along with Docker Compose files for development and production environments. Additionally, it incorporates a Jenkins CI/CD pipeline using a Jenkinsfile written in Groovy, enabling automated testing, building, and deployment of the application. The Jenkins CI/CD pipeline is set up on an EC2 instance on AWS, with port 8080 opened to access Jenkins.

Table of Contents:

Installation and Setup
Usage
Branches
Main
Bugfix
Feature
How to Install and Run the Project:

1. Clone the repository:
```bash
  git clone https://github.com/OEltoukhy/Node.js-Application-with-Dockerized-Environment-and-Jenkins-CI-CD-Pipeline.git
```
2. Navigate to the project directory:
```bash
   cd <project-directory>
``` 
4. Install dependencies:
```bash
  npm install
``` 
6. Build the Docker image:
```bash
  docker build -t node-docker-app .
```

8. Run the Docker container for development:
```bash
  docker-compose -f docker-compose.dev.yml up
```
10. Access the application in your browser at http://localhost:port

How to Use the Project:
Development Environment:

The development environment can be accessed using Docker Compose by running docker-compose -f docker-compose.dev.yml up. This will start the development server and expose the application on the specified port.
Production Environment:

For deploying the application in a production environment, use the docker-compose.dev.prod.yml file. Modify the configuration as needed for production settings and run docker-compose -f docker-compose.dev.prod.yml up.
Branches:

Main:

The main branch represents the stable version of the application. It is typically used for production releases.


Bugfix:

The bugfix branch is used for fixing bugs found in the main branch. Developers work on bug fixes in this branch and merge them back into the main branch after testing.


Feature:

The feature branch is used for developing new features or enhancements for the application. Once a feature is complete and tested, it can be merged into the main branch.


Jenkins CI/CD Pipeline Setup:

1. Ensure you have an EC2 instance set up on AWS.
   
2. Open port 8080 in the security group associated with the EC2 instance to make Jenkins accessible.

3. Install Jenkins on the EC2 instance.
   
4. Configure Jenkins by following the installation wizard.
   
5. Install necessary plugins such as Docker Pipeline, Git, etc.
  
6. Create a new Jenkins pipeline job and configure it to use the Jenkinsfile included in the repository.

7. Configure Jenkins credentials if required for accessing Git or Docker Hub.

8. Run the Jenkins job to trigger the CI/CD pipeline for testing, building, and deploying the application.

   
For further details on Jenkins setup and configuration, refer to the Jenkins documentation or the Jenkinsfile included in the repository.


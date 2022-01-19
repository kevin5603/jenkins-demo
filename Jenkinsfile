pipeline {
    agent {
        maven 'my-maven'
    }

    stages {
        stage('build code') {
            steps {
                git 'https://github.com/jglick/simple-maven-project-with-tests.git'
                git 'mvn clean compile jib:build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying.....:))'
            }
        }
    }
}

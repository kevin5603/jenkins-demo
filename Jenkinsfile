pipeline {
    agent any
    tools {
        maven 'my-maven'
    }

    stages {
        stage('build code') {
            steps {
                git 'https://github.com/kevin5603/jenkins-demo.git'
                sh 'ls -al'
                sh 'mvn -v'
                sh 'mvnw -ntp clean compile jib:build'
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

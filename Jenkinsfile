pipeline {
    agent any
    tools {
        maven 'my-maven'
    }

    stages {
        stage('build code') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub-account')]) {
                    sh 'ls -al'
                    sh 'cat Jenkinsfile'
                    sh './mvnw -ntp clean compile jib:build'
                }
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

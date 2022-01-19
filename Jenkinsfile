pipeline {
    agent any
    tools {
        maven 'my-maven'
    }

    stages {
        stage('build code') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub-account', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
                    sh 'ls -al'
                    sh 'cat Jenkinsfile'
                    sh './mvnw clean compile jib:build -Djib.to.auth.username=$USERNAME -Djib.to.auth.password=$PASSWORD'
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

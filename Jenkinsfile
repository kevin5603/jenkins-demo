pipeline {
    agent any
    tools {
        maven 'my-maven'
    }

    stages {
        stage('build code') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub-account', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD'))]) {
                    sh 'ls -al'
                    sh 'cat Jenkinsfile'
                    sh './mvnw -ntp clean compile jib:build -Djib.to.auth.username=$USERNAME -Djib.to.auth.password=$PASSWORD'
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

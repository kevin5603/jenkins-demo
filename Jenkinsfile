pipeline {
    agent any

    stages {
        stage('build code') {
            steps {
                git 'https://github.com/kevin5603/jenkins-demo.git'
                sh './mvnw -ntp clean compile jib:build'
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

pipeline {
    agent any
    tools {
        maven 'my-maven'
    }

    stages {
        stage('build code') {
            steps {
                
                sh 'ls -al'
                
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

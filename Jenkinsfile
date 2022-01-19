
pipeline {
    agent any
    tools {
        maven 'my-maven'
    }

    stages {
        stage('build code') {
            steps {
//                 withCredentials([usernamePassword(credentialsId: 'docker-hub-account', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
//                     sh 'ls -al'
//                     sh 'cat Jenkinsfile'
//                     sh './mvnw clean compile jib:build -Djib.to.auth.username=$USERNAME -Djib.to.auth.password=$PASSWORD'
//                 }
                    withCredentials([file(credentialsId: 'Jenkins-master', variable: 'PEM')]) {
                       script {
                         def remote = [name: 'test', host: 'line.bot.kevin5603.click', user: 'ec2-user', allowAnyHosts: true]
                         remote.identityFile = PEM
                         sshCommand remote: remote, command: "for i in {1..5}; do echo -n \"Loop \$i \"; date ; sleep 1; done"
                       }
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


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
                         sshCommand remote: remote, command: "docker image ls"
                         sshCommand remote: remote, command: "docker pull rabbitmq"
                         sshCommand remote: remote, command: "cd /home/ec2-user/project/line-bot-demo"
                         sshCommand remote: remote, command: "pwd"
                         sshCommand remote: remote, command: "docker-compose -f project/line-bot-demo/docker-compose.yml up -d"
//                          sshScript remote: remote, script: "restart.sh"
//                             writeFile file: 'test.sh', text: 'ls -al'
//                             sshPut remote: remote, from: 'test.sh', into: '.'
//                             sshScript remote: remote, script: "test.sh"
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

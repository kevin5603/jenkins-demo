pipeline {
    agent any

    stages {
        stage('build') {
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
                echo 'TODO...'
            }
        }
        stage('deploy to ec2') {
            steps {
                    withCredentials([file(credentialsId: 'Jenkins-master', variable: 'PEM_FILE')]) {
                       script {
                         def remote = [name: 'ec2', host: 'project.demo.kevin5603.click', user: 'ec2-user', allowAnyHosts: true]
                         remote.identityFile = PEM_FILE
                         sshCommand remote: remote, command: "docker-compose -f project/line-bot-demo/docker-compose.yml restart"
                       }
                    }
            }
        }
    }
}

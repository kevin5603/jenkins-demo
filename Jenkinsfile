
pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'TODO...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('deploy to ec2') {
            steps {
//                 withCredentials([usernamePassword(credentialsId: 'docker-hub-account', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
//                     sh 'ls -al'
//                     sh 'cat Jenkinsfile'
//                     sh './mvnw clean compile jib:build -Djib.to.auth.username=$USERNAME -Djib.to.auth.password=$PASSWORD'
//                 }
                    withCredentials([file(credentialsId: 'Jenkins-master', variable: 'PEM_FILE')]) {
                       script {
                         def remote = [name: 'ec2', host: 'project.demo.kevin5603.click', user: 'ec2-user', allowAnyHosts: true]
                         remote.identityFile = PEM_FILE
                         sshCommand remote: remote, command: "docker-compose -f project/line-bot-demo/docker-compose.yml up -d"
//                          sshScript remote: remote, script: "restart.sh"
//                             writeFile file: 'test.sh', text: 'ls -al'
//                             sshPut remote: remote, from: 'test.sh', into: '.'
//                             sshScript remote: remote, script: "test.sh"
                       }
                    }
            }
        }
    }
}

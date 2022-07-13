pipeline {
    agent any
    
    tools{
        maven 'maven_3_5_0'
    }
    stages{
        stage('Gitscm'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Pranavpatel986/ci-cd.git']]])
            }
        }
        stage('Built maven'){
            steps{
                script{
                    bat 'mvn clean install'
                }
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t pranavpatel986/devops-project:0.0.1 .'
                }
            }
        }
        stage('Push'){
            steps{
                bat 'docker login -u pranavpatel986 -p Ram@2531patel'
                bat 'docker push pranavpatel986/devops-project:0.0.1'
            }
        }
    }
    post{
        always{
            bat 'docker logout'
        }
    }
    
}

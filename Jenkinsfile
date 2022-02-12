pipeline {
    agent { label 'lcubes-demo-server' }

    options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    environment {
        DOCKER_CRED = credentials('lcubestudio-docker')
    }
    stages {
        stage('Init') {
            steps{
                sh "docker compose up -d"
               
            }        
        }
        stage('Build') {
            steps{
                sh "docker compose down"
            }        
        }
        stage('Jenkins') {
            steps{
                sh 'docker compose up -d --build' 
            }        
        }
    }
    post {
        always{
            echo 'Login Out of the Account'
            sh 'docker logout'
        }
    }
}

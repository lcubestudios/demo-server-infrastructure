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
                echo "phase 1 done"
               
            }        
        }
        stage('Build') {
            steps{
                echo "phase 2 done"
            }        
        }
        stage('Jenkins') {
            steps{
                echo 'phase 3 done' 
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

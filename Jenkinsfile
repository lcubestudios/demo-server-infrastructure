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
                echo "loading the function file"
                script{
                    gv = load "script.groovy"
                }                
            }        
        }
        stage('Build') {
            steps{
                echo "Building images"
                script {
                    gv.build_postgres()
                    gv.build_app()
                }
            }        
        }
        stage('Push') {
            steps{
                echo 'Pushing both images'
                script {
                    gv.push_postgres()
                    gv.push_app()
                }
            }        
        }
        stage('SSH') {
            steps{
                echo 'command with ssh'
                //sh "ssh root@45.79.139.42 '/home/messaging_backend/staging/script.sh'"
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

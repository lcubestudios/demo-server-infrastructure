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
                    //gv.build_postgres()
                    //gv.build_app()
                }
            }        
        }
        stage('Push') {
            steps{
                echo 'Pushing both images'
                script {
                    //gv.login()
                    //gv.push_postgres()
                    //gv.push_app()
                }
            }        
        }
        stage('DockerInServer') {
            steps{
                echo 'running command for containers in the Server'
                script {
                    //gv.dockerimages()
                }  
            }        
        }
    }
    post {
        always{
            echo 'Login Out of the Account'
            //sh 'docker logout'
        }
    }
}

def build_postgres() {
//    sh 'docker build -t lcubestudios/messaging:postgres ./postgres'
    echo 'Done'
}

def build_app() {
//    sh 'docker build -t lcubestudios/messaging:app ./app'
    echo 'Done'
}

def login() {
//    sh 'echo $DOCKER_CRED_PSW | docker login -u $DOCKER_CRED_USR --password-stdin'
    echo 'Done'
}

def push_postgres() {
//    sh 'docker push lcubestudios/messaging:postgres'
    echo 'Done'
}

def push_app() {
//    sh 'docker push lcubestudios/messaging:app'
    echo 'Done'
}

def dockerimages() {
    //sh 'docker compose up -d'
    //sh 'docker run -dit --name dennysdblcube -e POSTGRES_USER=dennys -e POSTGRES_PASSWORD=dennys -p 4444:5432 lcubestudios/messaging:postgres'
//    sh 'docker run -dit --name dennyslcube -v /home/workspace/demo_infrastructure_main/app/html/:/var/www/html/ -v /home/workspace/demo_infrastructure_main/app/config:/etc/apache2/ -v /home/workspace/demo_infrastructure_main/app/log:/var/log/apache2/ -p 4444:80 lcubestudios/messaging:app'
    //sh 'docker run -dit --name dennyslcube -v ./app/html/:/var/www/html/ -v ./app/config:/etc/apache2/ -v ./app/log:/var/log/apache2/ -p 4444:80 lcubestudios/messaging:app'
    echo 'Done'
}

def logout() {
    echo 'Login Out of the Account'
//    sh 'docker logout'
    echo 'Done'
}

return this
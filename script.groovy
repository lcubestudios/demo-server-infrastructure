def build_postgres() {
    sh 'docker build -t lcubestudios/messaging:postgres ./postgres'
}

def build_app() {
    sh 'docker build -t lcubestudios/messaging:app ./app'
}

def login() {
    sh 'echo $DOCKER_CRED_PSW | docker login -u $DOCKER_CRED_USR --password-stdin'
}

def push_postgres() {
    sh 'docker push lcubestudios/messaging:postgres'
}

def push_app() {
    sh 'docker push lcubestudios/messaging:app'
}

def dockerimages() {
    //sh 'docker compose up -d'
    //sh 'docker run -dit --name dennysdblcube -e POSTGRES_USER=dennys -e POSTGRES_PASSWORD=dennys -p 4444:5432 lcubestudios/messaging:postgres'
    sh 'docker run -dit --name dennyslcube -v /home/workspace/demo_infrastructure_main/app/html/:/var/www/html/ -v /home/workspace/demo_infrastructure_main/app/config:/etc/apache2/ -v /home/workspace/demo_infrastructure_main/app/log:/var/log/apache2/ -p 4444:80 lcubestudios/messaging:app'
    //sh 'docker run -dit --name dennyslcube -v ./app/html/:/var/www/html/ -v ./app/config:/etc/apache2/ -v ./app/log:/var/log/apache2/ -p 4444:80 lcubestudios/messaging:app'
}

def logout() {
    echo 'Login Out of the Account'
    sh 'docker logout'
}

return this
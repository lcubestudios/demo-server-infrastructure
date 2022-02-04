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

def logout() {
    echo 'Login Out of the Account'
    sh 'docker logout'
}

return this
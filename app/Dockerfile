FROM ubuntu/apache2:latest
RUN apt-get update
RUN apt-get -y upgrade

ENV MAIN_DIR=/var/www/html
WORKDIR ${MAIN_DIR}

RUN apt-get install php -y
RUN apt-get install git nano python3 -y
RUN apt install python3-pip -y

RUN apt-get install nodejs gcc g++ make -y 
EXPOSE 80
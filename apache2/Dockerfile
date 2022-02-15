FROM ubuntu/apache2:2.4-20.04_beta
RUN apt-get update
RUN apt-get -y upgrade

ENV MAIN_DIR=/var/www/html
WORKDIR ${MAIN_DIR}

RUN apt-get install -y git
RUN apt-get install -y ca-certificates \
  && apt-get install -y curl gnupg build-essential \
  && curl --silent --location https://deb.nodesource.com/setup_14.x | bash - \
  && curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | apt-key add - \
  && apt-get update \
  && apt-get install -y --no-install-recommends nodejs \
  && curl -o- -L https://yarnpkg.com/install.sh | bash


RUN apt-get install -y python3 php
RUN apt install -y python3-pip
RUN pip3 install requests 
RUN apt install -y build-essential libssl-dev libffi-dev python3-dev
RUN apt install -y libapache2-mod-php openssl php-imagick php-common php-curl php-gd php-imap php-intl php-json php-ldap php-mbstring php-pgsql php-ssh2 php-xml php-zip unzip
RUN a2enmod cgi
RUN pip3 install psycopg2-binary

COPY 000-default.conf /etc/apache2/sites-enable/000-default.conf

EXPOSE 80
FROM  devopsedu/webapp
MAINTAINER TEJA
CMD yum -y install apache2
CMD yum -y install php7.0
CMD yum -y install libapache2-mod-php7.0
CMD yum -y install php7.0-cli
CMD yum -y install php7.0-common
CMD yum -y install php7.0-mbstring
CMD yum -y install php7.0-gd
CMD yum -y install php7.0-intl
CMD yum -y install php7.0-xml
CMD yum -y install php7.0-mysql
CMD yum -y install php7.0-mcrypt
CMD yum -y install php7.0-zip
RUN rm -rf /var/www/html/*
ADD website /var/www/html
EXPOSE 80
CMD ["/usr/sbin/apache2ctl","-D","FOREGROUND"]

FROM ubuntu:22.04
LABEL author = "aleksejdanilik0@gmail.com"
RUN apt-get update 
RUN apt-get install nginx -y
WORKDIR /var/www/html/
COPY index.html .
COPY style.css .
EXPOSE 80
CMD ["nginx","-g","daemon off;"]
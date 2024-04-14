FROM ubuntu:latest

RUN apt update && apt install -y openssh-server

RUN mkdir /run/sshd/

EXPOSE 22

ENTRYPOINT /usr/sbin/sshd -D 

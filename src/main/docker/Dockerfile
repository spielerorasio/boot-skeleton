FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD boot-skeleton-1.0-SNAPSHOT.jar boot-skeleton.jar
RUN sh -c 'touch /boot-skeleton.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/boot-skeleton.jar"]
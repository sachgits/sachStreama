FROM java:8-jdk

WORKDIR /usr/lib/java

ENV GRAILS_VERSION 2.4.4
ENV GRADLE_VERSION 3.1

RUN wget https://github.com/grails/grails-core/releases/download/v${GRAILS_VERSION}/grails-${GRAILS_VERSION}.zip
RUN unzip grails-${GRAILS_VERSION}.zip
RUN rm -rf grails-${GRAILS_VERSION}.zip
RUN ln -s grails-${GRAILS_VERSION} grails

ENV GRAILS_HOME /usr/lib/java/grails
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
ENV PATH $GRAILS_HOME/bin:$PATH

#Install Gradle
WORKDIR /usr/local
RUN wget  https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip
RUN unzip gradle-$GRADLE_VERSION-bin.zip
RUN rm -f gradle-$GRADLE_VERSION-bin.zip
RUN ln -s gradle-$GRADLE_VERSION gradle

RUN mkdir /app
COPY . /app
VOLUME ~/Documents/sachStreama /app
WORKDIR /app

RUN grails compile

EXPOSE 8080

ENTRYPOINT ["grails"]

CMD ["-Dgrails.env=docker", "run-app"]

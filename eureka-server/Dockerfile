FROM java
WORKDIR /opt/java
CMD ["echo","switch workdir"]
COPY /target/erureka-server.jar /
CMD ["echo"," copy success"]
EXPOSE 1001
CMD ["echo"," expose 1001"]
ENTRYPOINT ["java","-jar","erureka-server.jar"]
CMD ["--spring.profiles.active=peer1"]
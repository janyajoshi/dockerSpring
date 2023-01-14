# dockerSpring

gradle -> clean

gradle -> bootJar

docker build -t spring-docker .

docker run -p 3001:5001 spring-docker

# DUMMY

## Plain dockerfile with separate class files

```bash
./gradlew build
 mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)
docker build --build-arg DEPENDENCY=build/dependency -t rmuhamedgaliev/solvery-java-docker .
docker run -p 8080:8080 -t rmuhamedgaliev/solvery-java-docker:latest
```

## Build container with gradle

```bash
./gradlew bootBuildImage --imageName=rmuhamedgaliev/solvery-java-docker
docker run -p 8080:8080 -t rmuhamedgaliev/solvery-java-docker:latest
```

## Build project in docker container

```bash
```

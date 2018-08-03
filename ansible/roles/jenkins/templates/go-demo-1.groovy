node("migscicd") {
    git "https://github.com/migspulido/go-demo.git"

    stage "pre-dep-tests"
    sh "docker-compose -f docker-compose-test.yml run --rm unit"

    stage "build"
    sh "docker build -t migspulido/go-demo ."
    // sh "docker push migspulido/go-demo"

    stage "deploy"
    withEnv(['DOCKER_HOST=tcp://swarm-master:2375']) {
        sh "docker-compose up -d"
        sh "docker-compose ps"
    }
}
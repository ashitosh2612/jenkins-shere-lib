def call (String project, String hubUser , String ImageTag){
    sh """
    docker image build -t $(hubUsers)/$(project) .
    docker image tag $(hubUsers)/$(project) $(hubUsers)/$(project):$(ImageTag)
     docker image tag $(hubUsers)/$(project) $(hubUsers)/$(project):latest
    """
}
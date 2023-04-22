def call (String project, String imagetag , String hubuser){
    sh """
    docker image build -t ${hubUsers}/${project} .
    docker image tag ${hubUsers}/${project} ${hubUsers}/${project}:${ImageTag}
     docker image tag ${hubUsers}/${project} ${hubUsers}/${project}:latest
     """
}
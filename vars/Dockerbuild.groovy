def call (String project, String imagetag , String hubuser){
    sh """
    docker image build -t ${hubUsers}/${project} .
    docker image tag ${hubUsers}/${project} ${hubUser}/${project}:${ImageTag}
     docker image tag ${hubUsers}/${project} ${hubUser}/${project}:latest
     """
}
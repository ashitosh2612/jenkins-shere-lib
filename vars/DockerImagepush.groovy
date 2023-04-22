def call (String project, String ImageTag , String hubUser){
    withCredentials([string(credentialsId: 'Dockerhub', variable: 'dockerpass')]) {
    sh """
    docker login -u ${hubUser} -p ${dockerpass}
    docker image build -t ${hubUser}/${project} .
    docker image push  ${hubUser}/${project}:${ImageTag}
    
     """
}
}
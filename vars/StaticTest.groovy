def call (credentialsId){
     withSonarQubeEnv(credentialsId: 'sonar') {
    sh 'mvn clean package sonar:sonar'
}
}
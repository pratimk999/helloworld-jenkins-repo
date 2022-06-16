pipeline {
 agent any
 stages {
  stage('Maven Compile'){
     steps{
        echo 'Project compile stage'
        bat label: 'Compilation running', script: '''mvn compile'''
     }
  }

  stage('Unit Test') {
     steps {
        echo 'Project Testing stage'
        bat label: 'Test running', script: '''mvn test'''

     }
  }

  stage('Jacoco Coverage Report') {
     steps{
       jacoco()
     }
  }

  stage('SonarQube'){
     steps{
       bat label: '', script: '''mvn sonar:sonar \
       -Dsonar.host.url=http://localhost:9000 \
       -Dsonar.login=squ_f8d0bcfdcddfb275a0df92e4b3d0e460c1e92048'''
     }
  }

  stage('Maven Package'){
     steps{
        echo 'Project packaging stage'
        bat label: 'Project packaging', script: '''mvn package'''
     }
  }
 }
}

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat(script: 'gradle build', returnStatus: true)
      }
    }
  }
}
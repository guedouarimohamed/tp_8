pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        archiveArtifacts(artifacts: 'build/libs/*.jar', excludes: 'docs')
      }
    }
    stage('Mail Notification') {
      steps {
        mail(subject: 'result build', body: 'result', bcc: 'em_guedouari@esi.dz')
      }
    }
    stage('Test Reporting') {
      steps {
        echo 'hello'
      }
    }
    stage('Deployment') {
      steps {
        bat(script: 'gradle uploadArchives', returnStatus: true)
      }
    }
  }
}
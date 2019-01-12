pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        archiveArtifacts(artifacts: 'build/libs/*.jar', excludes: 'docs')
        bat 'gradle build'
      }
    }
    stage('Mail Notification') {
      steps {
        mail(subject: 'result build', body: 'result', bcc: 'em_guedouar@esi.dz')
      }
    }
  }
}
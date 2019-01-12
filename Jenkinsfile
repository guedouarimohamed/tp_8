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
    stage('Code Analysis') {
      parallel {
        stage('Code Analysis') {
          steps {
            waitForQualityGate true
          }
        }
        stage('Test Reporting') {
          steps {
            echo 'hello'
          }
        }
      }
    }
  }
}
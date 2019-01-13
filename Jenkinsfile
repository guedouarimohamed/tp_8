pipeline {
  agent any
  stages {
    stage('Build') {
      post {
        failure {
          mail(subject: 'result build', body: 'result : build failed', bcc: 'em_guedouari@esi.dz')

        }

        success {
          mail(subject: 'result build', body: 'result : build success', bcc: 'em_guedouari@esi.dz')

        }

      }
      steps {
        bat 'gradle build'
        bat 'gradle javadoc'
        archiveArtifacts 'build/libs/*.jar , build/doc/javadoc'
      }
    }
    stage('Mail Notification') {
      steps {
        mail(subject: 'result build', body: 'result', bcc: 'em_guedouari@esi.dz')
      }
    }
    stage('Test Reporting') {
      parallel {
        stage('Test Reporting') {
          steps {
            echo 'hello'
          }
        }
        stage('Code Analysis') {
          steps {
            withSonarQubeEnv('sonarqube') {
              bat 'sonar-scanner'
            }

          }
        }
      }
    }
    stage('Deployment') {
      steps {
        bat(script: 'gradle uploadArchives', returnStatus: true)
      }
    }
    stage('Slack Notification') {
      steps {
        slackSend(channel: 'tp_jenkins', baseUrl: 'https://tp-jenkins.slack.com/services/hooks/jenkins-ci/', attachments: 'test_slack', token: 'Z1sr3VvwbF2eHpFX0lCO4Eld', tokenCredentialId: 'id_slack', message: 'hellow')
      }
    }
  }
  tools {
    gradle 'GRADLE_LATEST'
  }
}
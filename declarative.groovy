 pipeline {
        agent any 
        pipelineJob('example-007')
        stages {
          stage('Build') { 
            steps {
              git 'https://github.com/Chandole/sample.git'
            }
          }
          stage('print') { 
            steps {
               echo 'code deploy'
            }
          }
          stage('kiran') { 
            steps {
              sh label: '', script: 'ls'
            }
          }
        }
      }
 
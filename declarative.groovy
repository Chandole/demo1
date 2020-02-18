 pipeline {
        agent any 
        stages {
          stage('Build') { 
            steps {
              git 'https://github.com/Chandole/sample.git'
            }
          }
          stage('Test') { 
            steps {
              // 
            }
          }
          stage('Deploy') { 
            steps {
              // 
            }
          }
        }
      }
 
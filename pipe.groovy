  node {  
      stage('Build') { 
        git 'https://github.com/Chandole/sample.git'
      }
      stage('print') { 
        echo 'code deploy'
      }
      stage('Deploy') { 
        
      }
    }
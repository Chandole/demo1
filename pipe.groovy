  node {  
      stage('Build') { 
        git 'https://github.com/Chandole/sample.git'
      }
      stage('Test') { 
        // 
      }
      stage('Deploy') { 
        // 
      }
    }
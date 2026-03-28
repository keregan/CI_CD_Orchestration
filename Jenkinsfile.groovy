pipeline {
    agent any
    
    stages {
        stage('Test') {
            steps {
                sh 'nmp test'
            }
        }
		
		stage('Build') {
            steps {
                sh 'nmp run build'
            }
        } 
		
		stage('Deploy') {
            steps {
                sh 'echo "Deploying to staging..."'
            }
        }
    }
}

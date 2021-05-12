pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('Git checkout'){
            steps{
                git 'https://github.com/kaeltk/cicdlab'
            }
        }
        stage('Maven package'){
            steps{
                bat 'mvn clean install'
            }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Sonar Analysis'){
            steps{
                bat 'mvn sonar:sonar'
            }
        }
        stage('Docker Build'){
            steps{
                bat 'docker build -f Dockerfile -t dsrcdemo .'
            }
        }
    }
}

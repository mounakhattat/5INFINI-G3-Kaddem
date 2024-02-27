pipeline {
    agent any

    stages {
        stage ('GIT'){
            steps {
                // Utilisez git pour récupérer le code depuis GitHub
                git branch: 'nada', credentialsId: '1234', url: 'https://github.com/mounakhattat/5INFINI-G3-Kaddem.git'
            }
        }
        stage('Maven') {
            steps {
                // Exécutez la commande Maven 'clean' et 'compile'
                sh 'mvn clean compile'
            }
        }


        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t nada/imagepost:latest .'
                    }
            }
        }
        /*stage('Push Docker Image') {
            steps {
                // Étape de connexion à DockerHub

                sh 'docker login -u nadabaabaa -p nadanada1'


                // Étape de poussée de l'image Docker sur DockerHub
                sh 'docker push nada/imagepost:latest'
            }*/

       /* stage('Start Docker Compose') {
            steps {
                script {
                    timeout(time: 10, unit: 'MINUTES') {
                        // Lancer docker-compose en arrière-plan
                        sh 'docker compose up -d'
                    }
                }
            }
        } */
        stage('Test unitaire') {
                              steps {
                                     sh 'mvn -f pom.xml test'
                                }
                }
    }

}

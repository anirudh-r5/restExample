pipeline{
    agent any
    stages{
        stage("compilePhase"){
            steps{
                bat "mvn compile"
            }
        }

        stage("testPhase"){
            steps{
                bat "mvn test"
            }
        }

        stage("packagePhase"){
            steps{
                bat "mvn clean package"
            }
        }
    }
}
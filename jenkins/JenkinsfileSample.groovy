pipeline
{
    agent {
        label 'DevServer'
    }

    stages {
        stage('Build')
            {
                steps{
                    echo " This is build stage"
                    sh 'mvn clean package'
                }
            post {
                success {
                    archiveArtifacts artifacts: '**/target/*.war'
            }
            }
            }
 /*       stage('test')
        {
            steps{
                echo "This is testing phase"
            }
        }
        stage("Deploy")
        {
            steps {
                echo "This is Deploy phase"
            }
        }
*/
    }
}

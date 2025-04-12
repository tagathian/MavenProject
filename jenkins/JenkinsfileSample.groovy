pipeline
{
    agent {
        label 'DevServer'
    }
tools {
    maven 'myMaven'
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
                    archiveArtifacts artifacts: '**/*.war'
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

pipeline
{
    agent any

    stages {
        stage('Build')
            {
                steps{
                    echo " This is build stage"
                }
            }
        stage('test')
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
    }
}

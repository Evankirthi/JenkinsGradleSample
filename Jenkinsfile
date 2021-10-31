pipeline{
     agent any
     stages{
        stages("Clone"){
            steps{
                echo 'Inside Clone stage'
                sh "git clone https://github.com/Evankirthi/JenkinsGradleSample.git"
            }
        }
        stage("Test"){
            steps{
                script{
                    try{
                        echo 'Inside test stage'
                        sh "./gradlew clean test"
                    }finally {
                         junit '**/build/test-results/test/*.xml' //make the junit test results available in any case (success & failure)
                    }
                }
            }
        }
         stage("Build"){
             steps{
                echo 'Inside build'
                sh "./gradlew build"
             }
         }
     }
 }


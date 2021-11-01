pipeline{
     agent any
     stages{

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
          stage("Build docker image"){
              steps{
                 echo 'Inside Build docker image'
                 sh 'docker build -t spring-jenkins-demo .'
              }
          }
          stage ('Deploy') {
              steps {
                  sh 'docker run -d -p 8090:8090 spring-jenkins-demo'
              }
          }
     }
 }


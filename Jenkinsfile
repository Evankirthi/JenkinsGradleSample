pipeline{
     agent any
     stages{
        stage("Test"){
            steps{
                script{
                    try{
                        echo 'Inside test'
                        sh "./gradlew clean test"
                    }finally{
                    }
                }
            }
        }
         stage("Build"){
             steps{
                echo 'Inside build'
             }
         }
     }
 }


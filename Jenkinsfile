pipeline{
     agent any
     stages{
        stage("Test"){
            steps{
                script{
                    try{
                        sh "./gradlew clean test"
                    }finally{
                    }
                }
            }
        }
         stage("Build"){
             steps{

             }
         }
     }
 }


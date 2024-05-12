def gv
pipeline{
  agent any
  
  // parameters{
     // comment 4
     // string(name="VARIABLE", defaultvalue: "", description: "")
     // choice (name: "Version", choices: ["2.0.0","2.0.1"], description: "The available version for now")
     // booleanParam (name: "Execute_tests", defaultValue: true, description: "Execute tests or not")

  // }

  environment{
    BUILD_VERSION = "1.3.0"
    SERVER_CREDENTIALS = credentials("github-credentials")
    AUTHOR_NAME= "Omar Eltoukhy2"
  }

  tools{
    nodejs "node-1"
  }

  stages{
     stage("init"){
      steps{
        script{
            gv = load "script.groovy"
        } 
      }
    }
    stage("test"){
      steps{
      script{
        gv.testapp()
      }
      }
    }

    stage("build"){
      when {
        expression {
          BRANCH_NAME == "main"
        }
      }
      steps{
        script{
            gv.buildapp()
        }     
      }
    }

    stage("deploy"){
      when {
        expression {
          BRANCH_NAME == "main"
        }
      }
      steps{
        script{
            gv.deployapp()
        }

      }
    }
  }
  post{
    always{
      echo "the build is done"
    }
    success{
            echo "the build is done sucessfully"
  }
    failure{
      echo "There is an error please try to fix it"
   }
  }
}



























// // 44
//                 // script {
//                 //     try {
//                 //         when{
//                 //             expression{
//                 //                 BRANCH_NAME == "dev" || BRANCH_NAME == "main" || BRANCH_NAME == "origin"
//                 //             }
//                 //         }
//                 //     }
//                 //      catch (Exception e) {
//                 //         currentBuild.result = 'SUCCESS'
//                 //         echo "Stage 1 failed but build continues"
//                 //     }
//                 // }
// //58

















//   86

//     //   echo "The user credentials is: ${github-credentials}"
//         //   echo "The user credentials is: ${github-credentials}"
// //     withCredentials(
// //         [
// //             usernamePassword
// //             (credentialsId: 'github-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')
// //             ]
// //             )
// //              {
// //     sh "the username is: ${USER} and the password is: ${PWD.length()}"
// // }

// // 100

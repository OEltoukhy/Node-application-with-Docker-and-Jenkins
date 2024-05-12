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
    AUTHOR_NAME= "Omar Eltoukhy01060"
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

      //   input{
      //     message "what kind of test do you to be executed"
      //     ok "select"
      //   parameters{
      //     choice (name: "test", choices: ["Quick Test","Full Test"], description: "The test type")
          
      //   }
      // }
      steps{
      script{
        gv.testapp()
        // echo "the ${test} is executed successfully"

      }
      }
    }

    stage("build"){

      steps{
        script{
            gv.buildapp()
        }     
      }
    }

    stage("deploy"){
      // input {
      //   message "What environment do you want the APK to deploy on? "
      //   ok "select"
      // parameters{
      //   choice (name: "ENV", choices: ["DEV","Test","PROD"], description: "choose the environment that U want")
      //   }
      // }
      steps{
        script{
            gv.deployapp()
            // echo "deploying on ${ENV} environment"

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














// // comment 6
// // pipeline{
// //     agent any
// //     environment{
// //         NAME ="Omar Eltoukhy"
// //     }
// //     tools{
// //         nodejs "node-1"
// //     }
// //     stages{
// //         stage("hello"){
// //             steps{
// //                 echo "hello world"
// //                 sh "npm install"
// //             }
// //         }
// //     }
// //     post{
// //         always{
// //             echo "the build is over"
// //         }
// //         failure{
// //             echo "the build is wrong"
// //         }
// //         success{
// //             echo "the duild done successfully"
// //             echo "the dev name is : ${NAME}"
// //         }
// //     }
// // }
// // end of co 6










// def gv
// pipeline{
//   agent any
//   parameters{
//     choice (name: "Version", choices: ["2.0.0","2.0.1"], description: "The available version for now")
//     booleanParam (name: "Execute_tests", defaultValue: true, description: "Execute tests or not")
//   }
//   environment{
//     AUTHOR_NAME="Omar Eltoukhy"
//   }
//   tools{
//     nodejs "node-1"
//   }
//   stages{
//     stage("init"){
//       steps{
//         script {
//           gv = load "script.groovy"
//         }
//     }
//   }
//     stage("Test"){
//       input{
//         message "what kind of test do you to be executed"
//         ok "select"
//         parameters{
//           choice (name: "test", choices: ["Quick Test","Full Test"], description: "The test type")
//         }
//       }
//       steps{
//         script {
//           gv.testapp()
//           echo "the ${test} is executed successfully"
//         }
//       }
//     }

//     stage("Build"){
//       steps{
//         script {
//           gv.buildapp()
//         }
//       }
//     }
//     stage("Deploy"){
//       input {
//         message "What environment do you want the APK to deploy on? "
//         ok "select"
//         parameters{
//             choice (name: "ENV", choices: ["DEV","Test","PROD"], description: "choose the environment that U want")

//         }
//       }
//       steps{
//         script {
//           gv.deployapp()
//           echo "deploying on ${ENV} environment"
//         }
//       }
//     }
// }
//   post {
//     always{
//       echo "The build id done" 
//     }
//     success{
//       echo "The build done successfully"
//     }
//     failure{
//       echo "The build failed"
//     }
//   }
// }


























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
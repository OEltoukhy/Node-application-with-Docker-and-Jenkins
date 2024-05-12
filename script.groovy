// def initapp(){
//     echo "Initalizing app . . . . ."
// }


// def testapp() {
//     if (params.executetests == true) {
//         echo "Running tests..."
//     } else {
//         echo " Tests are skipped"
//         // com 1
//         // Add your testing logic here
//         // #
//     }
// }

// def buildapp(){
//     echo "Building app . . . . ."
//     sh "npm install"  
// }




// def deployapp(){
//     echo "Deploying app. . . . ."
//     // com 2
//     // echo "The new version build is: ${env.BUILD_VERSION}"    
//     // echo "deploying...."
//     // #
//     echo "deploying version ${params.version}"
// }

// return this


def initapp(){
    echo "Initalizing app . . . . ."
}

def testapp() {
    if (params.Execute_tests == true){
        echo "Running tests..."
    } else{
        echo "Skipping tests"
    }
    echo "The test is done on branch ${BRANCH_NAME}"
}

def buildapp(){
    sh "npm install"
    echo "Building app . . . . . . . . ."
}

def deployapp(){
    echo "Deploying app. . . . ."
    echo "The new version is: ${params.Version}"
    echo "The one who developed this build is: ${env.AUTHOR_NAME}"
    echo "The deploying is done"
}
 return this
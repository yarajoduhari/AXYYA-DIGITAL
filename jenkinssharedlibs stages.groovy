def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "npm install"
     }
  else if ("${stageName}" == "docker hub")
     {
       sh "docker login -u yarajodudocker -p Prasad@123"
     }
}

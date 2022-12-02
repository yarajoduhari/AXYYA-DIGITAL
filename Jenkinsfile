node
{
 
  stage("CheckOutCodeGit")
  {
   git branch: 'master', credentialsId: '65fb834f-a83b-4fe7-8e11-686245c47a65', url: 'https://github.com/yarajoduhari/AXYYA-DIGITAL'
 }
 
 stage("Build") {
 nodejs(nodeJSInstallationName: 'nodejs14') {
        sh 'npm install'
    }
 }  
 
 stage ('docker build') {
        sh "docker build -t yarajodudocker/node:$buildnumber ."
    }
    stage ('docker hub') {
        sh "docker login -u yarajodudocker -p Prasad@123"
    }
    stage ('docker push') {
        sh "docker push yarajodudocker/node:$buildnumber"
    }
  stage ('kubernetes login & deploy') {
        sshagent(['82f31a7e-6e27-44d5-a3df-695e00050d5d']) {
        sh "scp -o StrictHostKeyChecking=no nodejs.yml ubuntu@13.233.158.90:/home/ubuntu"
        sh "ssh -o StrictHostKeyChecking=no ubuntu@13.233.158.90 kubectl apply -f nodejs.yml"
}
    }
    
}

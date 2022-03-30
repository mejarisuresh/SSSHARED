def call(user,ip){
             sshagent(['omsai']) {
    
    sh "scp -o StrictHostKeyChecking=no target/*.war $(name)@$(ip):/opt/tomcat8/webapps"
   
     sh "ssh  $(name)@$(ip) /opt/tomcat8/bin/startup.sh"
}
       
}

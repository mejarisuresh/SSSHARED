def call(ips,user,credid){
                      sshagent(['aaaa']) {
    // some block
                        Ip-each{
       sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/opt/tomcat8/webapps"
     sh "ssh ${user}@${ip} /opt/tomcat8/bin/startup.sh"
                     
}
                      }
  
       
}

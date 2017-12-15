artifactory('Old'){
   remoteRepository ("maven-remote") {
     packageType "maven"
     description "My maven repo"
     url "http://central.maven.org/maven2"
     listRemoteFolderItems true
   }
}
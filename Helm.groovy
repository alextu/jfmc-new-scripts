variable = userInput (
    name : "User Friendly Name", // Optional
    type : "ARTIFACTORY",
    //value : "default value",
    description : "please provide a value"
  )





artifactory('Old') {
  localRepository('some-helm') {
  description "Public description"
  notes "Some internal notes"
  includesPattern "**/*" // default
  excludesPattern "" // default
  repoLayoutRef "maven-2-default"
  // xrayIndex false
  // blockXrayUnscannedArtifacts false
  // xrayMinimumBlockedSeverity "" // "Minor" | "Major" | "Critical"
  propertySets // (["ps1", "ps2"])
  archiveBrowsingEnabled false
  blackedOut false // default
  packageType "helm" // "bower" | "chef" | "cocoapods" | "debian" | "docker" | "gems" | "generic" | "gitlfs" | "gradle" | "ivy" | "maven" | "npm" | "nuget" | "opkg" | "puppet" | "pypi" | "sbt" | "vagrant" | "yum"
  
}
  


  

}

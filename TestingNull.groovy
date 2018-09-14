additionnalRepos = userInput (
    name : "Repos",
    type : "REPOSITORY", 
    multivalued : true,
    description : "please provide a value"
  )

variable = userInput (
    name : "User Friendly Name", // Optional
    type : "STRING", // "BOOLEAN", "INTEGER", "SERVICE", "XRAY", "EDGE", "ARTIFACTORY", "REPOSITORY", "PACKAGE_TYPE"
    //value : "default value",
    description : "please provide a value"
  )



artifactory('Main600') {
security {
  
  permissions {
    permission('some-perm') {
      includesPattern '**'
      excludesPattern ''
      anyLocal false
      anyRemote false
      anyDistribution false
      repositories (["chef-local", "cran-local"] + additionnalRepos*.key) // values (["local-rep1", "local-rep2", ...]) are examples. Please set existing values from the instance 
      users { 
        'sometestuser' (['delete', 'manage', 'annotate', 'read', 'deploy']) // value userA - is example. Please set existing user names from the instance 
      }
    }
  }
}  
}



additionnalRepos = userInput (
    name : "Repo", // Optional
    type : "REPOSITORY", // "BOOLEAN", "INTEGER", "SERVICE", "XRAY", "EDGE", "ARTIFACTORY", "REPOSITORY", "PACKAGE_TYPE"
    //value : "default value",
    multivalued : true,
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
        
        'userA' (['delete', 'manage', 'annotate', 'read', 'deploy']) // value userA - is example. Please set existing user names from the instance 
      }
      groups {
        'groupsG1' (['delete', 'manage', 'annotate', 'read', 'deploy']) // value groupsG1 - is example. Please set existing group names from the instance 
      }
    }
  }

}  
}



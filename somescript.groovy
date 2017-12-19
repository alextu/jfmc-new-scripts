artifactory('Art1') {
  security {
    
  permissions {
    permission('name') {
      includesPattern '**'
      excludesPattern ''
      anyLocal false
      anyRemote false
      anyDistribution false
      repositories (["npm-local", "docker-local"])
      groups {
        "itz"(['manage', 'delete', 'deploy', 'annotate', 'read'])
      }
    }
  }

}
}



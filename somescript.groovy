artifactory('Old') {
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
        '\0069t'(['manage', 'delete', 'deploy', 'annotate', 'read'])
      }
    }
  }

}
}



artifactory('Old') {
  security {
    
  permissions {
    permission('name') {
      includesPattern '**'
      excludesPattern ''
      anyLocal false
      anyRemote false
      anyDistribution false
      repositories (["alexistest-local"])
      groups {
        '\0069t'(['manage', 'delete', 'deploy', 'annotate', 'read'])
      }
    }
  }

}
}



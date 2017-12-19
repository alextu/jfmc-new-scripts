artifactory('Old') {
  security {
  
    groups {
    group('it') {
      description 'it'
      autoJoin false
    }
  }

    
  permissions {
    permission('name') {
      includesPattern '**'
      excludesPattern ''
      anyLocal false
      anyRemote false
      anyDistribution false
      repositories (["alexistest-local"])
      groups {
        '\\u0069t'(['manage', 'delete', 'deploy', 'annotate', 'read'])
      }
    }
  }

}
}



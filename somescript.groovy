artifactory('Oldz') {
  security {
  
    groups {
    group('it') {
      description 'it'
      autoJoin false
    }
  }

  def groupIt = 'it'  
  permissions {
    permission('name') {
      includesPattern '**'
      excludesPattern ''
      anyLocal false
      anyRemote false
      anyDistribution false
      repositories (["alexistest-local"])
      groups {
        "$groupIt"(['manage', 'delete', 'deploy', 'annotate', 'read'])
      }
    }
  }

}
}



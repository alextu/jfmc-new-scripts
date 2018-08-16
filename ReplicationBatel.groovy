art = userInput (

 type : "ARTIFACTORY",

 name : "Instance",

 description : "Please select the artifactory instance to run against"

)

 
user = userInput (

   type : "STRING",

   description : "Please provide a user for replication"

 )

 
passwd = userInput (

   type : "STRING",

   description : "Please provide a password for replication"

 )

 
replication_url = userInput (

   type : "STRING",

   description : "Please provide the replication URL"

 )

artifactory(art.name) {

   localRepository(repo) {

    replication(replication_url) {

     cronExp "0 0/9 14 * * ?"

     socketTimeoutMillis 15000

     username user

     password passwd

     proxy //"proxy-ref"

     enableEventReplication true

     enabled true

     syncDeletes false

     syncProperties true

   }

   }

}

# soapbox-race

Webserver to handle cars and pilots profiles.

##How to:
My advice is to download Eclipse JavaEE, and after that download eGit Maven SCM profile from the Eclipse marketplace(both free). Then build the server with the in-built maven using `clean compile assembly:single`.

##Running the server is as simple as:

    java -jar soapbox-race-version-jarname.jar ip-to-xmpp-host(optional) ip-to-udp-host(optional)

##How to login

- Users + Password hashes(SHA-1) (default MySQL entries):
```
format:
email           passwordHash
debug@player1	a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
debug@player2	a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
debug@player3	a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
```

- Get loginToken and userID with:
`http://localhost:1337/soapbox/nothing/user/authenticateUser?email=SOME_EMAIL&password=SOME_HASH_PASSWORD`

- Launch soapbox.exe with the parameters: 

`soapbox.exe ANYTHING_YOU_WANT http://ip-to-http-host:1337/soapbox/Engine.svc loginToken userId`
    
##Launcher development

Please follow https://github.com/berkay2578/soapbox-race-launcher for more info.

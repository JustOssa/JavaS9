# RMI: Remote Method Invocation

## Steps

### Server : (src\main\java\me\oussa\RMI\Server\)

1. Définir une interface et un objet qui l’implémente (*Information* et *InformationImpl*)

2. Nommer et enregistrer l'objet dans un registre
`register.rebind("testRMI", lObjetDistant)`

### Client : (src\main\java\me\oussa\RMI\Client\Client.java)

3. Récupérer une référence sur l’objet distant
`Naming.lookup("rmi://127.0.0.1:1099/testRMI")`

4. Utiliser les méthodes de l’objet distant via la référence

> *Information* interface must have the same name/path (ex: me.oussa.RMI.common.Information) if we have two separate projects (client & server)
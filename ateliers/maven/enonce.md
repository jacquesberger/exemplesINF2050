Maven
=====

Maven est un outil de _build_ très connu dans l'univers du développement Java.
Il propose une structure de projet et une gestion des dépendances plutôt
intéressantes. Aucune solution ne sera fournie pour les exercices mais les
manipulations nécessaires à leur réalisation seront présentées par la
monitrice durant l'atelier.

Objectifs
---------

* Créer un projet Maven.
* Manipuler les dépendances d'un projet avec le fichier `POM.xml`.

Exercices
---------

1. Créez un projet Maven dans IntelliJ utilisant Java 14. Placez-y des classes que vous avez déjà
   fait dans un autre projet/TP/atelier, sans dépendance vers une librairie
   externe (jar).

   Assurez-vous que vous compilez et que vous exécutez le code avec Java 14.

2. Ajoutez une dépendance vers la librairie `json-lib` dans le fichier `POM`.

   Voici le code à placer dans le `POM` :
   ```
   <dependencies>
     <dependency>
       <groupId>net.sf.json-lib</groupId>
       <artifactId>json-lib</artifactId>
       <version>2.4</version>
       <classifier>jdk15</classifier>
     </dependency>
   </dependencies>
   ```

   Ajoutez un petit bout de code qui utilise cette librairie pour vérifier que
   ça fonctionne correctement.

3. Allez sur le site [https://mvnrepository.com/](https://mvnrepository.com/).
   Trouvez la librairie Apache Commons Logging 1.2. Ajoutez cette dépendance à
   votre projet en utilisant Maven.

   Ajoutez un petit bout de code qui utilise cette librairie pour vérifier que
   ça fonctionne correctement. Le site web possède un lien vers la documentation
   de la librairie.

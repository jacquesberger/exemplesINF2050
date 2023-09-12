Git
===

Dans cet atelier, vous serez initié à l'utilisation de git à la ligne de
commande. Aucune solution ne sera fournie pour les exercices mais les
manipulations nécessaires à leur réalisation seront présentées par les moniteurs
durant l'atelier.

Vous devez avoir un compte sur le [GitLab du département d'informatique](https://gitlab.info.uqam.ca/) pour réaliser cet
atelier.

Objectifs
---------

* Manipuler les fonctionnalités principales de git à la ligne de commande.
* Utiliser GitLab.
* Manipuler un dépôt distant.

Exercices
---------

1. Créez un dépôt distant vide sur GitLab.
2. Créez un dépôt local vide. Y ajouter un fichier `readme.txt` avec votre nom à
   l'intérieur. Faites un `commit` de ce fichier et un `push` sur votre dépôt
   distant.
3. Modifiez le fichier `readme.txt` pour y ajouter le signe du cours. Poussez
   (`push`) vos changements sur le dépôt distant.
4. Supprimez complètement le répertoire contenant votre projet de votre
   ordinateur. Clônez le dépôt distant sur votre poste.
5. Ajoutez un programme Java dans votre dépôt. Votre programme doit être un
   FizzBuzz ([détails de FizzBuzz](https://en.wikipedia.org/wiki/Fizz_buzz)].
   Faites votre FizzBuzz pour aller de 1 à 100. Poussez votre programme sur le
   dépôt distant. Assurez-vous de ne pas pousser le fichier `.class` sur le
   dépôt distant.
6. Ajoutez un fichier `.gitignore` pour ignorer les fichiers `.class`.
7. Modifiez votre programme pour faire le FizzBuzz de 1 à 200. Poussez vos
   modifications.
8. Partagez votre dépôt avec un collègue de classe. Votre collègue doit clôner
   le dépôt, y ajouter un commentaire (au début du fichier) et pousser ses 
   changements.
9. Faites une modification sur votre dépôt ensuite en ajoutant aussi un
   commentaire (mais à la fin du fichier). Poussez vos changements. Le `push`
   devrait échouer parce que vos sources ne sont pas à jour avec le dépôt
   distant. Mettez vos sources à jour avec un `pull` et poussez vos changements
   à nouveau.
10. Provoquez un conflit en modifiant tous les deux la même portion de code.
   Réglez le conflit.
11. Faites un changement dans le code (introduisez un bogue par exemple). Faites
    le `commit` du bogue. Annulez la modification (`revert`) et replacez votre
    dépôt local comme il l'était avant l'introduction du bogue.

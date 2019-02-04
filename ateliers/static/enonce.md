Plugins et analyse de code
==========================

L'analyse statique du code source est une excellente façon d'avoir une idée
rapide sur la qualité du code sour ce d'un projet. Pour faire ce type d'analyse,
nous devons ajouter des fonctionnalités à IntelliJ à l'aide de plugins.

Objectifs
---------

* Installer des plugins dans IntelliJ.
* Manipuler des outils d'analyse statique.

Exercices
---------

1. Installez le plugin Checkstyle-IDEA dans IntelliJ.

2. À l'aide de Checkstyle, faites une analyse du code source de votre projet de
   session. Configurez Checkstyle pour utiliser les règles de style de Sun.

3. Faites quelques améliorations à votre projet de session, selon les
   recommandations de Checkstyle.

4. Installez le plugin PMDPlugin dans IntelliJ.

5. Faites une analyse statique du code source de votre projet de session.
   Observez bien les résultats de l'analyse. Quelles conclusions pouvez-vous
   tirer sur la qualité du code de votre projet basées sur les résultats de
   l'analyse statique?

6. Faites quelques améliorations à votre projet de session, selon les éléments
   soulevés par PMD.

7. Intégrez Checkstyle et PMD au build Maven en modifiant le fichier `POM.xml`.

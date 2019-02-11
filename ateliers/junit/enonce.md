JUnit
=====

JUnit est la plateforme xUnit par excellence pour un projet Java. C'est d'ailleurs l'outil
le plus utilisé pour des tests unitaires en Java.

Objectifs
---------

* Initiation aux tests unitaires
* Introduction de JUnit

Exercices
---------

1. Créez une classe possédant une méthode statique servant à calculer les taxes
   de vente en vigueur sur un sous-total. La méthode reçoit 3 paramètres :
   * un `long` représentant un montant en sous; par exemple 100.00$ sera
     représenté comme un entier valant 10000;
   * un `boolean` indiquant si l'on doit appliquer la taxe fédérale de 5%;
   * un `boolean` indiquant si l'on doit appliquer la taxe provinciale de
     9.975%.
   La méthode retourne un `long` représentant le montant total, incluant les
   taxes applicables, toujours en sous.
   La méthode lève un IllegalArgumentException si on lui passe en paramètre un
   montant nul (0) ou négatif.

2. Créez des tests unitaires pour vérifier toutes les possibilités de cette
   méthode.

3. Créez une classe Monnaie qui doit représenter une valeur monétaire mais qui
   conserve l'argent sous forme d'entier (comme l'exercice précédent). La classe
   doit être immuable, comme String, c'est-à-dire qu'une instance de la classe
   ne changera jamais de valeur. Si on doit changer la valeur d'une instance de
   Monnaie, on crée une nouvelle instance. Écrivez des méthodes pour :
   * additionner 2 valeurs monétaires;
   * calculer un pourcentage d'une valeur monétaire;
   * convertir la valeur monétaire en chaîne de caractères;
   * soustraire un montant d'une valeur monétaire.

   Rédigez des tests unitaires pour toutes ces méthodes.

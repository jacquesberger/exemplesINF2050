Test-Driven Development
=======================

Le TDD est une méthode de rédaction de code source où la rédaction des tests
unitaires est faite juste avant la rédaction du code source.

La méthode :

1. Rédiger un test unitaire pour une fonctionnalité qui n'existe pas.

2. Faire une implémentation dans le but de faire compiler le test et de le faire échouer.

3. Rédiger une première vraie implémentation de la fonctionnalité, sans se préoccuper de la qualité du code ou du design.

4. Faire du refactoring jusqu'à l'obtention d'un design satisfaisant.

Aucune solution ne sera fournie pour cet atelier. Dans ce cas-ci, c'est la
méthode qui est plus importante que les solutions.

Objectifs
---------

* Mettre en pratique le TDD.

Exercices
---------

Vous devez développer un ensemble de fonctions utilitaires avec la méthodologie
TDD. Vous placez ces fonctionnalités des classes en regroupant celles qui sont
reliées.

1. Une fonction qui prend en paramètre une chaîne de caractères correspondant à
   un chemin relatif ou absolu vers un fichier et qui retourne uniquement le nom
   du fichier (incluant l'extension).

2. Une fonction qui prend en paramètre un nom de fichier et qui retourne
   uniquement l'extension du fichier.

3. Une fonction qui prend en paramètre chaîne de caractères contenant une date
   en format ISO 8601 (ex. `2019-11-21`) et qui retourne une chaîne de
   caractères contenant la même date en version lisible (ex. `21 novembre
   2016`; `1er décembre 2017`).

4. Une fonction qui prend en paramètre 2 nombres, une valeur minimale et une
   valeur maximale, et la fonction retourne un nombre aléatoire situé entre les
   deux paramètres.

5. Une fonction qui prend en paramètre une chaîne de caractères et qui retourne
   la même chaîne encodée selon le chiffre de César avec un décalage de 13.

6. Une fonction qui décode une chaîne encodée par la fonction précédente.

7. Une fonction qui prend deux dates en paramètre et qui calcule l'âge séparant
   ces deux dates. Par exemple, si la première date est une date de naissance et
   la deuxième date est une date de décès, nous obtiendrons l'âge de la personne
   lors de son décès. Même exemple mais plus optimiste, si la première date est
   une date de naissance et la deuxième date est la date du jour, nous
   obtiendrons l'âge de la personne aujourd'hui. L'âge est calculée en années.

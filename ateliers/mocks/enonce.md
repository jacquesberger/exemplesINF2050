Mock objects
============

Une utilisation pertinente et adéquate des mocks objects demande un peu de
pratique. Cet atelier vise à vous introduire à cette pratique en expérimentant
sur un projet existant. Finalement, vous serez invité à expérimenté sur votre
projet de session.

Objectifs
=========

* Observer du code utilisant cette pratique.
* Mettre en place l'injection de dépendance.
* Tester des méthodes à l'aide de mock objects.

Exercices
=========

1. Faites un `clone` de [ce projet](https://github.com/jacquesberger/PerGen).

2. Trouvez la classe `MockFileWriter` et observez son fonctionnement. Trouvez
   également la classe de tests `Java6ProviderTest` et observez comment elle
   utilise le mock object pour faire ses tests unitaires. Ne passez au point
   suivant qu'une fois que vous avez compris en détail la mécanique.

3. Trouvez la classe `Java6Provider` et sa méthode `provideClassDeclaration`. À
   l'aide d'un mock object, effectuez un test unitaire sur cette méthode.

4. Choisissez une autre méthode dans cette classe et faites un (ou plusieurs)
   tests unitaires sur la méthode.

5. Trouvez la classe `SQLGenerator` et sa méthode `generate`. Pratiquez de
   l'injection de dépendance sur cette méthode. Conseil : créez une méthode où
   vous déplacerez les 5 méthodes `build`. Ainsi, la méthode `generate` demeure
   intestable, mais la nouvelle méthode pourrait être testée.

6. Faites des tests de caractérisation sur la nouvelle méthode que vous venez de
   créer.

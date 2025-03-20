Documentation des requêtes HTTP

1. Ajouter un produit

Méthode HTTP

POST

URL

localhost:9000/api/produit

Body (Exemple JSON valide)

{
    "nom": "Produit Exemple",
    "prix": 25.99,
    "categorie": {
        "id": 1
    }
}

Body (Exemple JSON non valide)

{
    "nom": "P",
    "prix": 1,
}

2. Afficher tous les produits

Méthode HTTP

GET

URL

localhost:9000/api/produits

3. Afficher une catégorie par son ID

Méthode HTTP

GET

URL

localhost:9000/api/categorie/{id}

Exemple

localhost:9000/api/categories/2


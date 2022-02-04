export default function Recipe(recipe){
    return `
    <h1>${recipe.dish}</h1>
    <h2>Ingredients: ${recipe.ingredients}</h2>
    <h3>Directions: ${recipe.directions}</h3>
    <h3>Type of Meal: ${recipe.meal.timeOfDay}</h3>
    <h3>Ratings: </h3>
    <ul>
    ${recipe.ratings.map(rating => {
        return `
        <li>
        <span>${rating.name}</span>
        </li>
        `;
    }).join('')}
    </ul>

    <section class ='add-rating'>
        <input class = 'add-rating__name' type='text' placeholder='Add a Rating' />
        <button class = 'add-rating__submit'>Add</button>
        <input type='hidden' id='recipeId' value='${recipe.id}'/>
        </section>
`;
}
    
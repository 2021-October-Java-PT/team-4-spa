export default function Cook(recipes) {
  return `
  <h1>Our Recipes </h1>
  <ul class = 'recipe-list'>
  ${recipes.map(recipe => {
      return `
      <li class='recipe-list__name'>${recipe.dish}
      
      <input type='hidden' id='recipeId' value='${recipe.id}'</li> `;
  }).join('')}
  </ul>
  `;
}
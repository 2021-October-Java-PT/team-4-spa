export default function Cook(recipes) {
  return `
  <h1>Fun Recipes </h1>
  <ul class = 'recipe-list'>
  ${recipes.map(recipe => {
      return `
      <li {cursor: pointer; } class='recipe-list__name'>${recipe.dish}
      
      <input type='hidden' id='recipeId' value='${recipe.id}'</li> `;
  }).join('')}
  </ul>
  `;
}
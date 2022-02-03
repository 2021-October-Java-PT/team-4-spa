export default function Recipe(recipe){
    return `
    <h1>${recipe.dish}</h1>
    <h2>${recipe.ingredients}</h2>
    <h3>${recipe.directions}</h3>
    <h3>${recipe.meal.timeOfDay}</h3>
`;
}
    
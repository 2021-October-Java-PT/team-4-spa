export default function Ratings(ratings){
    return `
    <h1> Ratings </h1>
    <ul class = 'ratings-list'>
    ${ratings.map(rating => {
        return `
        <li class='ratings-list__name'>${rating.name}</li> `;
    }).join('')}
    </ul>

    <section class ='add-rating'>
        <input class = 'add-rating__name' type='text' placeholder='Add a Rating' />
        <button class = 'add-rating__submit'>Add</button>
        </section>
    `;
}
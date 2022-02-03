import About from './components/About';
import Activity from './components/Activity';
import Bored from './components/Bored';
import Contact from './components/Contact';
import Cook from './components/Cook';
import Footer from './components/Footer';
import Header from './components/Header';
import Home from './components/Home';
import Met from './components/Met';
import Ratings from './components/Ratings';
import Recipe from './components/Recipe';
import apiHelpers from './api-helpers/apiHelpers';
import crud from './crud/crud';

buildPage();

function buildPage() {
    home();
    about();
    met();
    contact();
    activity();
    cook();
    cookingInfo();
}

// function home() {
//     const displayElem = document.querySelector('.pageTextDisplay');
//     displayElem.innerHTML = Home();
// }
// function home() {
//     const displayElem = document.querySelector('.pageTextDisplay');
//     displayElem.innerHTML = Home();
// }

// homeBtn.addEventListener("click", ()=>{
//    home(); 
// });
function home() {
    const homeElem = document.querySelector('#headerImg');
    const homeFooterElem = document.querySelector('#footerImg');
    homeElem.addEventListener("click", () => {
        appContent.innerHTML = Home();
    });
    homeFooterElem.addEventListener('click', () => {
        appContent.innerHTML = Home();
    });
}

function about() {
    const contactElem = document.querySelector('#aboutUs');
    const contactFooterElem = document.querySelector('#aboutUsFooter');
    contactElem.addEventListener('click', () => {
        appContent.innerHTML = About();
    });
    contactFooterElem.addEventListener('click', () => {
        appContent.innerHTML = About();
    });
}

function met() {
    const metElem = document.querySelector('#met');
    const metBodyElem = document.querySelector('#artBtn');
    metElem.addEventListener('click', () => {
        appContent.innerHTML = Met();
    });
    metBodyElem.addEventListener('click', () => {
        appContent.innerHTML = Met();
    });
}

function contact() {
    const contactElem = document.querySelector('#contact');
    const contactFooterElem = document.querySelector('#contactFooter');
    contactElem.addEventListener('click', () => {
        appContent.innerHTML = Contact();
    });
    contactFooterElem.addEventListener('click', () => {
        appContent.innerHTML = Contact();
    })
}

function activity() {
    const activityElem = document.querySelector('#activityBored');
    const activityBodyElem = document.querySelector('#doBtn');
    activityElem.addEventListener('click', () => {
        appContent.innerHTML = Activity();
    });
    activityBodyElem.addEventListener('click', () => {
        appContent.innerHTML = Activity();
    });
}

function cook() {
    const cookElem = document.querySelector('#cookStuff');
    const cookBodyElem = document.querySelector('#cookBtn');
    cookBodyElem.addEventListener('click', () => {
        crud.getRequest('http://localhost:8080/api/recipes', recipes => {
            appContent.innerHTML = Cook(recipes);
        });

        cookingInfo();
    });
    cookElem.addEventListener('click', () => {
        crud.getRequest('http://localhost:8080/api/recipes', recipes => {
            appContent.innerHTML = Cook(recipes);
        })

        cookingInfo();

    })

}

function cookingInfo() {
    appContent.addEventListener('click', (event) => {
        if (event.target.classList.contains('recipe-list__name')) {
            const recipeId = event.target.querySelector('#recipeId').value;
            crud.getRequest(`http://localhost:8080/api/recipes/${recipeId}`, recipe => {
                appContent.innerHTML = Recipe(recipe);
            });
        }
        
    });

    appContent.addEventListener('click', (event) => {
        if (event.target.classList.contains('add-rating__submit')) {
            const recipeId = event.target.parentElement.querySelector('#recipeId').value;
            const ratingName = event.target.parentElement.querySelector('.add-rating__name').value;
            console.log(ratingName);
            console.log(recipeId);
            const ratingUrl = 'http://localhost:8080/api/recipes/' + recipeId + '/add-rating';
            crud.postRequest(ratingUrl, {
                ratingName: ratingName
            }, (recipe) => appContent.innerHTML = Recipe(recipe));
        };
    })
}

    

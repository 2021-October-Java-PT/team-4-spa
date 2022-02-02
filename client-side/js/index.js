import About from './components/About';
import Activity from './components/Activity';
import Bored from './components/Bored';
import Contact from './components/Contact';
import Cook from './components/Cook';
import Footer from './components/Footer';
import Header from './components/Header';
import Home from './components/Home';
import Met from './components/Met';
import apiHelpers from './api-helpers/apiHelpers';

buildPage();

function buildPage() {
    home();
    about();
    met();
    contact();
    activity();
    cook();
    
    
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
    homeElem.addEventListener("click", ()=>{
        appContent.innerHTML = Home();
     });
    homeFooterElem.addEventListener('click', ()=>{
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

function met(){
    const metElem = document.querySelector('#met');
    const metBodyElem = document.querySelector('#artBtn');
    metElem.addEventListener('click', ()=>{
        appContent.innerHTML = Met();
    });
    metBodyElem.addEventListener('click',()=>{
        appContent.innerHTML = Met();
    });
}

function contact(){
    const contactElem = document.querySelector('#contact');
    const contactFooterElem = document.querySelector('#contactFooter');
    contactElem.addEventListener('click',()=>{
        appContent.innerHTML = Contact();
    });
    contactFooterElem.addEventListener('click',()=>{
        appContent.innerHTML = Contact();
    })
}

function activity(){
    const activityElem = document.querySelector('#activityBored');
    const activityBodyElem = document.querySelector('#doBtn');
    activityElem.addEventListener('click',()=>{
        appContent.innerHTML = Activity();
    });
    activityBodyElem.addEventListener('click',()=>{
        appContent.innerHTML = Activity();
    });
}

function cook(){
    const cookElem = document.querySelector('#cookStuff');
    const cookBodyElem = document.querySelector('#cookBtn');
    cookBodyElem.addEventListener('click',()=>{
        appContent.innerHTML = Cook();
    });
    cookElem.addEventListener('click',()=>{
        appContent.innerHTML = Cook();
    })
}

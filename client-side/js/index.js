import About from './components/About';
import Activity from './components/Activity';
import Bored from './components/Bored';
import Contact from './components/Contact'
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
    
    
}

function home() {
    const displayElem = document.querySelector('.pageTextDisplay');
    displayElem.innerHTML = Home();
}

function about() {
    const contactElem = document.querySelector('#aboutUs');
    contactElem.addEventListener('click', () => {
      app.innerHTML = About();
    });
}

function met(){
    const metElem = document.querySelector('#met');
    metElem.addEventListener('click', ()=>{
        app.innerHTML = Met();
    })
}

function contact(){
    const contactElem = document.querySelector('#contact');
    contactElem.addEventListener('click',()=>{
        app.innerHTML = Contact();
    })
}

function activity(){
    const activityElem = document.querySelector('#activity');
    activityElem.addEventListener('click',()=>{
        app.innerHTML = Activity();
    })
}


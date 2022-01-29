import About from './components/About';
import Bored from './components/Bored';
import Footer from './components/Footer';
import Header from './components/Header';
import Home from './components/Home';
import Met from './components/Met';
import apiHelpers from './api-helpers/apiHelpers';

buildPage();

function buildPage() {
    
}

function home() {
    const displayElem = document.querySelector('.pageTextDisplay');
    displayElem.innerHTML = Home();
}


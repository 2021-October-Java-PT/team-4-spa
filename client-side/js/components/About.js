import aaronPic from '../../images/aaron-profile.png'
import landonPic from '../../images/dolph.jpg'
import mattPic from '../../images/jason.jpg'
import tjPic from '../../images/cartoon-tj.png'
import tommyPic from '../../images/terry.webp'

export default function About() {
    return `
    <div class="page__container">
    <h1>Meet The Team</h1>
    <div class="aboutDisplay">
    
    <div class = "bio">
        <h2>TJ Willis</h2>
        <img id="tjPic" src="${tjPic}" alt="tj-profile-img">
        <p>TJ is a wiley software developer with a passion for excellence and an obsession with perfection. He has been with the JAC team for roughly 2 weeks and has catapulted himself to President of Youth Education. A truely elite ascension</p>
        <h4>Contact</h4>
        <li>Personal Site: thewillisworld.com</li>
        <li>Email: TJ@JACenterprises.com</li>
    </div>
    <div class = "bio">
        <h2>Matt Welfley</h2>
        <img id="mattPic" src="${mattPic}" alt="matt-profile-img">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi libero nibh, cursus at eleifend a, sodales sit amet magna. Duis convallis orci venenatis nisl iaculis elementum. Nunc tempor nibh elit, id volutpat mi tempus tempor.</p>
        <h4>Contact</h4>
        <li>Personal Site: iDontTalkEnough4TJtoThinkofAfunnyDomain.com</li>
        <li>Email: matt@JACenterprises.com</li>
    </div>
    <div class = "bio">
        <h2>Thomas Fountain</h2>
        <img id="tommyPic" src="${tommyPic}" alt="tommy-profile-img">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi libero nibh, cursus at eleifend a, sodales sit amet magna. Duis convallis orci venenatis nisl iaculis elementum. Nunc tempor nibh elit, id volutpat mi tempus tempor.</p>
        <h4>Contact</h4>
        <li>Personal Site: turndown4WHAT.com</li>
        <li>Email: tommy@JACenterprises.com</li>
    </div>
    <div class = "bio">
        <h2>Landon Sims</h2>
        <img id="landonPic" src="${landonPic}" alt="landon-profile-img">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi libero nibh, cursus at eleifend a, sodales sit amet magna. Duis convallis orci venenatis nisl iaculis elementum. Nunc tempor nibh elit, id volutpat mi tempus tempor.</p>
        <h4>Contact</h4>
        <li>Personal Site: iLOVEgreasyRussians.com</li>
        <li>Email: Landon@JACenterprises.com</li>
    </div>
    
    
    <div class = "bio">
        <h2>Aaron Dormer</h2>
        <img id="aaronPic" src="${aaronPic}" alt="aaron-profile-img">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi libero nibh, cursus at eleifend a, sodales sit amet magna. Duis convallis orci venenatis nisl iaculis elementum. Nunc tempor nibh elit, id volutpat mi tempus tempor.</p>
        <h4>Contact</h4>
        <li>Personal Site: eatYourHeartOutGordanRamsey.com</li>
        <li>Email: aaron@JACenterprises.com</li>
    </div>
  
</div>
    </div>
      `;
}
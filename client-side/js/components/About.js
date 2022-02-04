import aaronPic from '../../images/aaron-profile.png'
import landonPic from '../../images/dolph.jpg'
import mattPic from '../../images/matt-headshot.jpg'
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
        <p>Matt graduated from Kent State University in 2014 with a Bachelor of
        Arts in Organizational Communication. He enjoys playing disc golf,
        climbing, and backpacking in my freetime. He also enjoys working with
        raspberry pi's; specifically running pihole.</p>
        <h4>Contact</h4>
        <li><a href= "https://matt1218.github.io/">Personal Site</li>
        <li><a href= "https://github.com/Matt1218">GitHub</li>
    </div>
    <div class = "bio">
        <h2>Thomas Fountain</h2>
        <img id="tommyPic" src="${tommyPic}" alt="tommy-profile-img">
        <p>Thomas Fountain graduated from WeCanCodeIT in 2022 with a certication in software development. He enjoys playing basketball in his spare time. He also enjoys finding new ways to create solutions through coding!</p>
        <h4>Contact</h4>
        <li>Personal Site: https://thomasfountain3.github.io/</li>
        <li>Email: tfountain15@gmail.com</li>
    </div>
    <div class = "bio">
        <h2>Landon Sims</h2>
        <img id="landonPic" src="${landonPic}" alt="landon-profile-img">
        <p>Landon has many interests from art to mathematics and most things in between. He is currently working on a side project that echos the work of Edward Thorpe, a mathematician that beat the casino and later wall street. After that he plans to use those same skills to transition to a new algorithmic trading project.</p>
        <h4>Contact</h4>
        <li>Personal Site: iLOVEgreasyRussians.com</li>
        <li>Email: Landon@JACenterprises.com</li>
    </div>
    
    
    <div class = "bio">
        <h2>Aaron Dormer</h2>
        <img id="aaronPic" src="${aaronPic}" alt="aaron-profile-img">
        <p>I am a hard working, loyal, and open minded problem solver who sees things clearly and appreciates creative outlets like music, both as and instrumentalist and record collector, and cooking. I have been a member of the workforce since I was a teenager, which equates to 30+ years, with a background in office administration, management, and HR with a specialty in staffing and new hire onboarding. I’ve also been involved in fixed asset management and safety/maintenance coordination. I’m currently enrolled in a software development bootcamp with a focus in Java in order to expand my talents and toolkit so I can be as valuable as possible to an organization.</p>
        <h4>Contact</h4>
        <li>Personal Site: eatYourHeartOutGordanRamsey.com</li>
        <li>Email: aaron@JACenterprises.com</li>
    </div>
  
</div>
    </div>
      `;
}

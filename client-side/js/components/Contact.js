import grigs from '../../images/grigs.jpeg'

export default function Contact() {
    return   `
    <div class="pageTextDisplay">
    <div>
        <img class='page-image' src= ${grigs} alt='grigs'/>
        <h2>Contact Us</h2>
        <article>
          <p>Perelman: 0+(112) 358-1321</p>
          <p>Perelman: grigs@gmail.com</p>
        </article>
    </div>
    <div class ="customer-Service">
      <h1>Our Customer Service Team!</h1>
      <p>
      Hello this is Grigory Perelman. Although a famous mathematician, we are lucky to have him
      on our customer support team. This may seem like a real waste of talent. It is especially 
      since he doesn't really like communicating with people much on the phone or answering trivial
      questions via email. A developer on staff thought he would be a good asset to the team if for nothing more
      than entertainment. He happens to be a fan of the art we have to offer to everyone that visits the site. After 
      declining the milineum prize money he needed a part time job somewhere and was happy to accept a job where he 
      feels appreciated.
      </p>
    </div>
  </div>
    `;

}
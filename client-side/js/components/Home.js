import activityBtnImg from '../../images/activityBtn.png';
import artBtnImg from '../../images/artButton.png';
import cookBtnImg from '../../images/cookBtn.png'

export default function Home() {
    return `
    <div class="pageTextDisplay">
    <div id="learn">
        <h2>Learn a Thing</h2>
        <p>Expand your knowledge of Art by exploring the beautiful works shown by the Metropolitan Museum of Art</p>
        <a href="#">
        <img id="artBtn" src="${artBtnImg}" alt="art btn">
        </a>
    </div>
    <div id="do">
        <h2>Do a Thing</h2>
        <p>Bored and don't know how to kill time?? Check out this page to get a random activity to entertain on even the most boring days!</p>
        <a href="#">
            <img id="doBtn" src="${activityBtnImg}" alt="activty btn">
        </a>
</div>
    <div id="cook">
        <h2>Cook a Thing</h2>
        <p>Learn to make a simple yet delicious meal! We have carefully curated these recipes to be easy and fun for all ages (with some parental supervision). Dig in!!</p>
        <a href="#">
            <img id="cookBtn" src="${cookBtnImg}" alt="cook Btn">
        </a>
    </div>
</div>
</div>
    `
}
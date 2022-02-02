import activityBtnImg from '../../images/activityBtn.png';
import artBtnImg from '../../images/artButton.png';
import cookBtnImg from '../../images/cookBtn.png'

export default function Home() {
    return `
    <div class="pageTextDisplay">
    <div id="learn">
        <h2>Learn a Thing</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu sagittis lectus. Nam lobortis neque eu pharetra efficitur. Integer maximus urna id imperdiet porta. Praesent imperdiet dolor id sapien tempus eleifend. Donec arcu ex, semper eu tempus non, gravida a ligula. Quisque sodales accumsan interdum. Duis aliquet, eros quis varius porta, nibh risus ullamcorper est, non luctus risus elit ac ligula. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur mauris ante, vulputate sed eleifend vitae, finibus eu sapien.</p>
        <a href="#">
        <img id="artBtn" src="${artBtnImg}" alt="art btn">
        </a>
    </div>
    <div id="do">
        <h2>Do a Thing</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu sagittis lectus. Nam lobortis neque eu pharetra efficitur. Integer maximus urna id imperdiet porta. Praesent imperdiet dolor id sapien tempus eleifend. Donec arcu ex, semper eu tempus non, gravida a ligula. Quisque sodales accumsan interdum. Duis aliquet, eros quis varius porta, nibh risus ullamcorper est, non luctus risus elit ac ligula. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur mauris ante, vulputate sed eleifend vitae, finibus eu sapien.</p>
        <a href="#">
            <img id="doBtn" src="${activityBtnImg}" alt="activty btn">
        </a>
</div>
    <div id="cook">
        <h2>Cook a Thing</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu sagittis lectus. Nam lobortis neque eu pharetra efficitur. Integer maximus urna id imperdiet porta. Praesent imperdiet dolor id sapien tempus eleifend. Donec arcu ex, semper eu tempus non, gravida a ligula. Quisque sodales accumsan interdum. Duis aliquet, eros quis varius porta, nibh risus ullamcorper est, non luctus risus elit ac ligula. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur mauris ante, vulputate sed eleifend vitae, finibus eu sapien.</p>
        <a href="#">
            <img id="cookBtn" src="${cookBtnImg}" alt="cook Btn">
        </a>
    </div>
</div>
</div>
    `
}
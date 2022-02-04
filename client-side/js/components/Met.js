// import apiHelpers from "../api-helpers/apiHelpers";

export default function Met(painting) {
    // const timer = {
    //   timeToGo: 30,
    //   get time(){
    //     return this.timeToGo;
    //   }
    // }
    // setInterval(()=>{
    //   if(timer.time>0){
    //     timer.timeToGo-=1
    //     clock.innerText = timer.time;
    //   } else{}
    // },1000);
  
    // console.log('Met Mountains',mountainPicIds);
    // console.log(mountainPicIds.objectIDs);
    // console.log(mountainPicIds.objectIDs[0]);

    // function getRandomNumber(min,max) {
    //   step1 = max - min + 1;
    //   step2 = Math.random() * step1;
    //   randMount = Math.floor(step2) + min;
    //   return randMount;
    // };
      
    // const mountains = mountainPicIds.objectIDs;
    // const randMountain = getRandomNumber(0,mountains.length-1);
    // console.log(randMountain);
    // function concatUrl(id){
    //   const url = 'https://collectionapi.metmuseum.org/public/collection/v1/objects/';
    //   const newUrl = url.concat(id);
    //   return newUrl;
    // }
    // console.log(concatUrl(randMountain));
    // apiHelpers.getRequest(concatUrl(randMountain),(mObj)=>{
    //   console.log(mObj.artistDisplayName);
    //   mountainInfo.innerHTML = mObj.artistDisplayName;
    //   console.log(mObj.primaryImageSmall);
    //   const metImage = mObj.primaryImageSmall;
    //   Img.innerHTML = metImage;
    //   return metImage;
    // });
    // console.log(painting.name)
    return`
    <h1>
          ${painting.title}
    </h1>
    <image src = ${painting.primaryImageSmall}></image>
    <p>${painting.artistDisplayName}</p>
    <p>${painting.artistDisplayBio}</p>
    `;
}

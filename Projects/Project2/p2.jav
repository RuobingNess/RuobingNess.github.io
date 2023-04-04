let myList=null;
fetch('data.json')
            .then(response => response.json())
            .then(data => {
                //Get the list element
                const list = document.getElementsByClassName('space');
                myList=data;
                console.log(myList);
                //loop through the data and each item to the list 
                data.forEach(student => {
                const li = document.createElement ('li');
                const a = document.createElement ('a');

                //set the text content and the attributes for the link
                
                

                //add the link to the list 
                
               });
})



var popupWindow = null;
function positionedPopupparsons(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupparsons() {
  if (window.innerWidth > 768) {
    positionedPopupparsons("parsons.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonparsons = document.getElementById("enterparsons");
const myImageparsons = document.getElementById("parsons");

showImageButtonparsons.addEventListener("click", () => { 
  myImageparsons.style.display = "block"; 
  const keyword="New School id";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "enterparsons") {
    myImageparsons.style.display = "none";
  }
});


var popupWindow = null;
function positionedPopupgoogle(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupgoogle() {
  if (window.innerWidth > 768) {
    positionedPopupgoogle("google.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtongoogle = document.getElementById("googleenter");
const myImagegoogle = document.getElementById("googlespace");

showImageButtongoogle.addEventListener("click", () => { 
  myImagegoogle.style.display = "block"; 
  const keyword="Set of account and passward for my Google account";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "googleenter") {
    myImagegoogle.style.display = "none";
  }
});


var popupWindow = null;
function positionedPopupzoom(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupzoom() {
  if (window.innerWidth > 768) {
    positionedPopupzoom("zoom.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonzoom = document.getElementById("zoomenter");
const myImagezoom = document.getElementById("zoomspace");

showImageButtonzoom.addEventListener("click", () => { 
  myImagezoom.style.display = "block"; 
  const keyword="Zoom link";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "zoomenter") {
    myImagezoom.style.display = "none";
  }
});


var popupWindow = null;
function positionedPopupplane(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupplane() {
  if (window.innerWidth > 768) {
    positionedPopupplane("air.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonplane = document.getElementById("enterplane");
const myImageplane = document.getElementById("planespace");

showImageButtonplane.addEventListener("click", () => { 
  myImageplane.style.display = "block"; 
  const keyword="Airplane ticket from Seoul to New York";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "enterplane") {
    myImageplane.style.display = "none";
  }
});


var popupWindow = null;
function positionedPopupmail(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupmail() {
  if (window.innerWidth > 768) {
    positionedPopupmail("mail.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonmail = document.getElementById("mailenter");
const myImagemail = document.getElementById("mailspace");

showImageButtonmail.addEventListener("click", () => { 
  myImagemail.style.display = "block"; 
  const keyword="Mail box key";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "mailenter") {
    myImagemail.style.display = "none";
  }
});




var popupWindow = null;
function positionedPopuppcovid(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopuppcovid() {
  if (window.innerWidth > 768) {
    positionedPopuppcovid("covid.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtoncovid = document.getElementById("entercovid");
const myImagecovid = document.getElementById("covidspace");

showImageButtoncovid.addEventListener("click", () => { 
  myImagecovid.style.display = "block"; 
  const keyword="PCR test Record/绿码";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "entercovid") {
    myImagecovid.style.display = "none";
  }
});



var popupWindow = null;
function positionedPopuppgym(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopuppgym() {
  if (window.innerWidth > 768) {
    positionedPopuppgym("gym.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtongym = document.getElementById("gymenter");
const myImagegym = document.getElementById("gymspace");

showImageButtongym.addEventListener("click", () => { 
  myImagegym.style.display = "block"; 
  const keyword="Key to the gym";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "gymenter") {
    myImagegym.style.display = "none";
  }
});


var popupWindow = null;
function positionedPopupintro(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupintro() {
  if (window.innerWidth > 768) {
    positionedPopupintro("intro.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonintro = document.getElementById("enterintro");
const myImageintro = document.getElementById("introduction");

showImageButtonintro.addEventListener("click", () => { 
  myImageintro.style.display = "block"; 
  const keyword="Website ticket";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "enterintro") {
    myImageintro.style.display = "none";
  }
});



var popupWindow = null;
function positionedPopupcostco(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupcostco() {
  if (window.innerWidth > 768) {
    positionedPopupcostco("costco.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtoncostco = document.getElementById("costcoenter");
const myImagecostco = document.getElementById("costcospace");

showImageButtoncostco.addEventListener("click", () => { 
  myImagecostco.style.display = "block"; 
  const keyword="Costco membership card";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "costcoenter") {
    myImagecostco.style.display = "none";
  }
});




var popupWindow = null;
function positionedPopupvisa(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupvisa() {
  if (window.innerWidth > 768) {
    positionedPopupvisa("visa.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonvisa = document.getElementById("visaenter");
const myImagevisa = document.getElementById("visaspace");

showImageButtonvisa.addEventListener("click", () => { 
  myImagevisa.style.display = "block"; 
  const keyword="Visa to the United State";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "visaenter") {
    myImagevisa.style.display = "none";
  }
});




var popupWindow = null;
function positionedPopupmuseum(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupmuseum() {
  if (window.innerWidth > 768) {
    positionedPopupmuseum("museum.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonmuseum = document.getElementById("museumenter");
const myImagemuseum = document.getElementById("museumspace");

showImageButtonmuseum.addEventListener("click", () => { 
  myImagemuseum.style.display = "block"; 
  const keyword="Museum ticket";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "museumenter") {
    myImagemuseum.style.display = "none";
  }
});




var popupWindow = null;
function positionedPopuphome(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopuphome() {
  if (window.innerWidth > 768) {
    positionedPopuphome("home.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonhome = document.getElementById("homeenter");
const myImagehome = document.getElementById("homespace");

showImageButtonhome.addEventListener("click", () => { 
  myImagehome.style.display = "block"; 
  const keyword="Key to my home";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "homeenter") {
    myImagehome.style.display = "none";
  }
});



/*const showImageButtonvac = document.getElementById("entervac");
      const myImagevac = document.getElementById("vacspace");
      showImageButtonvac.addEventListener("click", () => { 
            myImagevac.style.display = "block"; 
      const keyword="International certificate of vaccination";  
      const item= myList.find(function(item,index,arr){
            console.log(item.Name);
             return item.Name.indexOf(keyword)>=0;
      });
      console.log('click');
      console.log(item);
      if(item!=null){
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "entervac") {
        myImagevac.style.display = "none";
      }
});*/

var popupWindow = null;
function positionedPopup(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopup() {
  if (window.innerWidth > 768) {
    positionedPopup("vac.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonvac = document.getElementById("entervac");
const myImagevac = document.getElementById("vacspace");

showImageButtonvac.addEventListener("click", () => { 
  myImagevac.style.display = "block"; 
  const keyword="International certificate of vaccination";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "entervac") {
    myImagevac.style.display = "none";
  }
});


    




var popupWindow = null;
function positionedPopupferry(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupferry() {
  if (window.innerWidth > 768) {
    positionedPopupferry("ferry.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonferry = document.getElementById("ferryenter");
const myImageferry = document.getElementById("ferryspace");

showImageButtonferry.addEventListener("click", () => { 
  myImageferry.style.display = "block"; 
  const keyword="Ferry ticket";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "ferryenter") {
    myImageferry.style.display = "none";
  }
});



var popupWindow = null;
function positionedPopuppassport(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopuppassport() {
  if (window.innerWidth > 768) {
    positionedPopuppassport("passport.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonpassport = document.getElementById("passportenter");
const myImagepassport = document.getElementById("passportspace");

showImageButtonpassport.addEventListener("click", () => { 
  myImagepassport.style.display = "block"; 
  const keyword="Passport";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "passportenter") {
    myImagepassport.style.display = "none";
  }
});



/*const showImageButtonmask = document.getElementById("entermask");
      const myImagemask = document.getElementById("maskspace");
      showImageButtonmask.addEventListener("click", () => { 
            myImagemask.style.display = "block"; 
      const keyword="Mask";  
      const item= myList.find(function(item,index,arr){
            console.log(item.Name);
             return item.Name.indexOf(keyword)>=0;
      });
      console.log('click');
      console.log(item);
      if(item!=null){
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});*/

/*const showImageButtonmask = document.getElementById("entermask");
const myImagemask = document.getElementById("maskspace");

// Add click event listener to show image button
showImageButtonmask.addEventListener("click", () => { 
  myImagemask.style.display = "block"; 

  // Retrieve item from myList
  const keyword="Mask";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });

  console.log('click');
  console.log(item);

  // Display item details in sidebar
  if(item!=null){
    const sidebar= document.getElementsByClassName('sidebar');
    sidebar[0].innerHTML="Name: " + item.Name +"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
  }
});

// Add click event listener to body
document.body.addEventListener("click", (event) => {
  // Check if target is not the show image button or the image itself
  if (event.target != showImageButtonmask && event.target != myImagemask) {
    myImagemask.style.display = "none";
  }
});*/



var popupWindow = null;
function positionedPopupmask(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupmask() {
  if (window.innerWidth > 768) {
    positionedPopupmask("mask.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonmask = document.getElementById("entermask");
const myImagemask = document.getElementById("maskspace");

showImageButtonmask.addEventListener("click", () => { 
  myImagemask.style.display = "block"; 
  const keyword="Mask";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "entermask") {
    myImagemask.style.display = "none";
  }
});







var popupWindow = null;
function positionedPopupchrome(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupchrome() {
  if (window.innerWidth > 768) {
    positionedPopupchrome("chrome.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonchrome = document.getElementById("chromeenter");
const myImagechrome = document.getElementById("chromespace");

showImageButtonchrome.addEventListener("click", () => { 
  myImagechrome.style.display = "block"; 
  const keyword="Chrome Heart Shopping Appointment";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "chromeenter") {
    myImagechrome.style.display = "none";
  }
});








var popupWindow = null;
function positionedPopupred(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupred() {
  if (window.innerWidth > 768) {
    positionedPopupred("concert.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonred = document.getElementById("redenter");
const myImagered = document.getElementById("redspace");

showImageButtonred.addEventListener("click", () => { 
  myImagered.style.display = "block"; 
  const keyword="Radwimps conert ticket";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "redenter") {
    myImagered.style.display = "none";
  }
});



var popupWindow = null;
function positionedPopupland(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupland() {
  if (window.innerWidth > 768) {
    positionedPopupland("japan.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonland = document.getElementById("landenter");
const myImageland = document.getElementById("landspace");

showImageButtonland.addEventListener("click", () => { 
  myImageland.style.display = "block"; 
  const keyword="Landing Permission";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "landenter") {
    myImageland.style.display = "none";
  }
});




var popupWindow = null;
function positionedPopupdisney(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupdisney() {
  if (window.innerWidth > 768) {
    positionedPopupdisney("disney.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtondisney = document.getElementById("disneyenter");
const myImagedisney = document.getElementById("disneyspace");

showImageButtondisney.addEventListener("click", () => { 
  myImagedisney.style.display = "block"; 
  const keyword="Disney land ticket";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "disneyenter") {
    myImagedisney.style.display = "none";
  }
});







var popupWindow = null;
function positionedPopupdriver(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupdriver() {
  if (window.innerWidth > 768) {
    positionedPopupdriver ("drive.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtondriver = document.getElementById("driverenter");
const myImagedriver = document.getElementById("driverspace");

showImageButtondriver.addEventListener("click", () => { 
  myImagedriver.style.display = "block"; 
  const keyword="Drivers licence";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "driverenter") {
    myImagedriver.style.display = "none";
  }
});




var popupWindow = null;
function positionedPopuptemp(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopuptemp() {
  if (window.innerWidth > 768) {
    positionedPopuptemp("temp.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtontemp = document.getElementById("tempenter");
const myImagetemp = document.getElementById("tempspace");

showImageButtontemp.addEventListener("click", () => { 
  myImagetemp.style.display = "block"; 
  const keyword="Temporary entrance approval of Buji street";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "tempenter") {
    myImagetemp.style.display = "none";
  }
});


var popupWindow = null;
function positionedPopuphospital(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopuphospital() {
  if (window.innerWidth > 768) {
    positionedPopuphospital ("hospital.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonhospital = document.getElementById("hospitalenter");
const myImagehospital = document.getElementById("hospitalspace");

showImageButtonhospital.addEventListener("click", () => { 
  myImagehospital.style.display = "block"; 
  const keyword="Mount Sinai patient bracelet";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "hospitalenter") {
    myImagehospital.style.display = "none";
  }
});



var popupWindow = null;
function positionedPopupvisit(url, winName, w, h, t, l, scroll) {
  var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
  var popup = window.open(url, winName, settings);
}

function openPopupvisit() {
  if (window.innerWidth > 768) {
    positionedPopupvisit("visit.html","pull down", 530, 445, "50%", "50%", "yes");
  }
}

const showImageButtonvisit = document.getElementById("visitenter");
const myImagevisit = document.getElementById("visitspace");

showImageButtonvisit.addEventListener("click", () => { 
  myImagevisit.style.display = "block"; 
  const keyword="Mount Sinai patient visit approval";  
  const item= myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword)>=0;
  });
  console.log('click');
  console.log(item);
  if(item!=null){
    const infos= document.getElementsByClassName('infos');
    infos[0].innerHTML="Name: " + item.Name+"<br/>Date: "+item.Date+"<br/>Location: "+item.Locatio+"<br/>Access: "+item.Access+"<br/>How: "+item.How;
  }
});

document.addEventListener("click", (event) => {
  if (event.target.id !== "visitenter") {
    myImagevisit.style.display = "none";
  }
});






var popupWindow = null;
  function positionedPopup(url, winName, w, h, t, l, scroll) {
    var settings = 'height=' + h + ',width=' + w + ',top=' + t + ',left=' + l + ',scrollbars=' + scroll + ',resizable';
    var popup = window.open(url, winName, settings);
}




const allBtn = document.getElementById("all");
const singleBtn = document.getElementById("single");
const multiBtn = document.getElementById("multi");
const pics = document.querySelector(".pics .everything");

allBtn.addEventListener("click", function() {
  pics.querySelectorAll("img, button").forEach(function(el) {
    el.style.display = "block";
  });
});

singleBtn.addEventListener("click", function() {
  pics.querySelectorAll("img.single, button.single").forEach(function(el) {
    el.style.display = "block";
  });
  pics.querySelectorAll("img:not(.single), button:not(.single)").forEach(function(el) {
    el.style.display = "none";
  });
});

multiBtn.addEventListener("click", function() {
  pics.querySelectorAll("img.multi, button.multi").forEach(function(el) {
    el.style.display = "block";
  });
  pics.querySelectorAll("img:not(.multi), button:not(.multi)").forEach(function(el) {
    el.style.display = "none";
  });
});

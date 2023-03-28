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



const showImageButton = document.getElementById("enterparsons");
const myImage = document.getElementById("parsons");

// add event listener to show image on button click
showImageButton.addEventListener("click", () => { 
  myImage.style.display = "block"; 
  const keyword = "New School id";  
  const item = myList.find(function(item,index,arr){
    console.log(item.Name);
    return item.Name.indexOf(keyword) >= 0;
  });
  console.log('click');
  console.log(item);
  if(item != null) {
    const sidebar = document.getElementsByClassName('sidebar');
    sidebar[0].innerHTML = "Name:" + item.Name + "<br/><br/>Date:" + item.Date + "<br/><br/>Location:" + item.Locatio + "<br/><br/>Access:" + item.Access + "<br/><br/>How:" + item.How;
  }
});

// add event listener to hide image when any other button is clicked
document.addEventListener("click", (event) => {
  if (event.target.id !== "enterparsons") {
    myImage.style.display = "none";
  }
});





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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});

document.addEventListener("click", (event) => {
      if (event.target.id !== "enterplane") {
        myImageplane.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "mailenter") {
        myImagemail.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "entercovid") {
        myImagecovid.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "gymenter") {
        myImagegym.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "costcoenter") {
        myImagecostco.style.display = "none";
      }
});



const showImageButtonvisa = document.getElementById("visaenter");
      const myImagevisa = document.getElementById("visaspace");
      showImageButtonvisa.addEventListener("click", () => { 
            myImagevisa.style.display = "block"; 
      const keyword="Costco membership card";  
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
      if (event.target.id !== "visaenter") {
        myImagevisa.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "museumenter") {
        myImagemuseum.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "homeenter") {
        myImagehome.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "entervac") {
        myImagevac.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "ferryenter") {
        myImageferry.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
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

const showImageButtonmask = document.getElementById("entermask");
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
    sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
  }
});

// Add click event listener to body
document.body.addEventListener("click", (event) => {
  // Check if target is not the show image button or the image itself
  if (event.target != showImageButtonmask && event.target != myImagemask) {
    myImagemask.style.display = "none";
  }
});





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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "hospitalenter") {
        myImagehospital.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "redenter") {
        myImagered.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "landenter") {
        myImageland.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "disneyenter") {
        myImagedisney.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "chromeenter") {
        myImagechrome.style.display = "none";
      }
});



const showImageButtondriver = document.getElementById("driverenter");
      const myImagedriver = document.getElementById("driverspace");
      showImageButtondriver.addEventListener("click", () => { 
            myImagedriver.style.display = "block"; 
      const keyword="Drivers license";  
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
      if (event.target.id !== "driverenter") {
        myImagedriver.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
});
document.addEventListener("click", (event) => {
      if (event.target.id !== "tempenter") {
        myImagetemp.style.display = "none";
      }
});



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
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
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

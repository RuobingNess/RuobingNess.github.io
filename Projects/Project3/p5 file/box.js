let cubeHeight;
let cubeWidth;
let cubeThickness;
let cubes = [];
let data, url;
let num = 30;
let total = [];
let female = [];
let male = [];
let children = [];
let rotationOn = false; // add this line to initialize the variable
let font;
let boxsW=[1231,253]
let strs=["COALITION FOR\nTHE HOMELESS\n\n(212)7762000\n\n Emergency Help\nLong-term Stability","WIN ORGEANIZATION\n\n(212)6954758\n\nHousing, Critical Service\n for Women","THE DEPARTMENT OF \nHOMELESS SHELTER \n\n Call 3-1-1\n\nApply to Enter the \nShelter System","THE BOWERY MISSION\n\n1-800-BOWERY-1\n\nDonation and \n Volunteer Organization", "BRONX WORKS\n\n(646)3934000\n\nHomeless Services\nSocial Assistance", "THE DOE FUND\n\n(212)6285207\n\nDonation and \n Volunteer Organization","PICTURE THE HOMELESS\n\n(646)3146423\n\nFunded by the Homeless\nOrganizing for \nJustice and Respect."]

function preload() {
  url = "https://data.cityofnewyork.us/resource/k46n-sa2m.json";
  data = loadJSON(url);
  font = loadFont("HelveticaNeueLTStd-Lt.otf");
}

function setup() {
  createCanvas(windowWidth, windowHeight, WEBGL);
  textFont(font);
//   cubeHeight = createSlider(0, 500, 150);
//   cubeHeight.position(20, 20);

//   cubeWidth = createSlider(0, 500, 150);
//   cubeWidth.position(20, 50);

//   cubeThickness = createSlider(0, 500, 150);
//   cubeThickness.position(20, 80);

//   button = createButton("Take Screenshot");
//   button.position(20, 660);
//   button.mousePressed(saveScreenshot);

//   button2 = createButton("Rotate");
//   button2.position(20, 120);
//   button2.mousePressed(toggleRotation);
}

function draw() {
  background(255, 255, 255);
  fill(230, 230, 63);
  stroke(0, 0, 0);
  

  
  orbitControl();
  if (rotationOn) {
    rotateY(frameCount * 0.01);
  } // add this condition to rotate only when rotationOn is true

  // const heightVal =100
  // const widthVal =200
  // const thicknessVal =200
  for (let i = 0; i < cubes.length; i++) {
    // cubes[i].height = map(heightVal, 0, 255, 0, 300);
    // cubes[i].width = map(widthVal, 0, 255, 0, 300);
    // cubes[i].thickness = map(thicknessVal, 0, 100, 0, 100);
    cubes[i].display();
  }
}

function saveScreenshot() {
  saveCanvas("screenshot", "png");
}

function mouseClicked() {
  if (cubes.length < 7) {
    cubes.push(
      new Cube(mouseX - width / 2, mouseY - height / 2, random(50, 100),180,190,250, strs[cubes.length] )
    );
  }
}

function keyPressed() {
  cubes.pop();
}

class Cube {
  constructor(x, y, size,w,h,d, str) {
    this.x = x;
    this.y = y;
    this.z = 0;
    this.height = w;
    this.width = h;
    this.thickness = d;
    this.size = size;
    this.rotationSpeed = random(0.0, 0);
    this.str = str;
    
  }
  display() {
    push();
    translate(this.x, this.y, this.z);
    
    rotateX(frameCount * this.rotationSpeed);
    rotateY(frameCount * this.rotationSpeed);
    rotateZ(frameCount * this.rotationSpeed);
    stroke(1);
    fill(230, 230, 63);
    box(this.width, this.height, this.thickness);
    translate(0, 0, this.thickness / 2 + 2);
    fill(0);
    textSize(15);
    textAlign(CENTER, CENTER);
    text(this.str, 0, 0);
 

    pop();
  }
}

function toggleRotation() {
  rotationOn = !rotationOn;
}

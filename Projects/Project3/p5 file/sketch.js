let img;
function preload() {
  url = "https://data.cityofnewyork.us/resource/k46n-sa2m.json";
  data = loadJSON(url);
  font = loadFont("HelveticaNeueLTStd-Lt.otf");
  img = loadImage("backgroundfi.png");
}
let num = 30;
let slider;
let d;
let family = [];
let female = [];
let male = [];
let children = [];
let str = ["TOTAL MALE:", "TOTAL FEMALE:", "TOTAL CHILDREN:", "TOTAL FAMILY:"];
function setup() {
  let scl = 0.54;
  // createCanvas(1777, 964);
  createCanvas(windowWidth, windowWidth*scl);
  img.resize(width, height);
  slider = createSlider(0, 29, 0);
  print(30/height)
  slider.position(width * 0.1, height - height*0.03);
  slider.size(width * 0.8);

  print(data);
  for (let i = 0; i < num; i++) {
    family[i] = data[num - i - 1].families_with_children_in_shelter;
    female[i] = data[num - i - 1].single_adult_women_in_shelter;
    male[i] = data[num - i - 1].single_adult_men_in_shelter;
    children[i] = data[num - i - 1].total_children_in_shelter;
  }
}

function draw() {
  background(255);
  background(img);
  d = 29 - slider.value();
  let maxHei = 0.17 * height;
  let minHei = 0.05 * height;

  // drawRect(
  //   nfc(mouseX / width, 3) * width,
  //   nfc(mouseY / height, 3) * height,
  //   width * 0.11,
  //   map(male[slider.value()], min(male), max(male), minHei, maxHei)
  // );

  drawRect(
    0.114 * width,
    0.444 * height,
    width * 0.11,
    map(male[slider.value()], min(male), max(male), minHei, maxHei),0,male[slider.value()]  );
  drawRect(
    0.114 * width,
    0.723 * height,
    width * 0.11,
    map(female[slider.value()], min(female), max(female), minHei, maxHei),
    1,female[slider.value()]
  );
  drawRect(
    0.384 * width,
    0.426 * height,
    width * 0.11,
    map(children[slider.value()], min(children), max(children), minHei, maxHei),
    2,children[slider.value()]
  );
  drawRect(
    0.675 * width,
    0.633 * height,
    width * 0.11,
    map(family[slider.value()], min(family), max(family), minHei, maxHei),
    3,family[slider.value()]
  );
  textSize(height * 0.028);
  textAlign(CENTER, CENTER);
  text(
    subset(data[d].date_of_census, 0, 10),
    width / 2,
    height - height * 0.05
  );
  
  textSize(height * 0.055);
  textAlign(LEFT, CENTER);
  text("SHELTER "+ '\n' + "AS BOXES", 0.230 * width,
    0.71 * height)
  
  textSize(height * 0.015);
  textAlign(LEFT, CENTER);
  text("THERE IS NO SPEED, NO DESTINATION  "+ '\n' + "（UNLIKE SUBWAYS OR ANY OTHER “BOXES”）" + '\n' + "WHERE IT COULD ONLY  ACCOMODATE " +'\n'+"THEIR BODIES, LIKE A SNAIL SHELL", 0.230 * width,
    0.6 * height)
  
  textSize(height * 0.012);
  textAlign(LEFT, CENTER);
  text("This dataset includes the daily number  "+ '\n' + "of families and individuals residing in " + '\n' + "the Department of Homeless Services (DHS) " +'\n'+"shelter system and the daily number of " +'\n'+ "families applying to the DHS shelter system.", 0.82 * width,
    0.125 * height)
  
  textSize(height * 0.012);
  textAlign(LEFT, CENTER);
  text("DHS is the The Department of Homeland  "+ '\n' + "Security works to improve the security of the " + '\n' + "United States. The Department's work " +'\n'+"includes customs, border, and immigration" +'\n'+ "enforcement, emergency response to natu-" +'\n'+ "ral and manmade disasters, antiterrorism " +'\n'+ "work, and cybersecurity.", 0.82 * width,
    0.24 * height)
}
function mousePressed() {
  print(nfc(mouseX / width, 3), nfc(mouseY / height, 3));
}
function drawRect(x, y, w, h, index,n) {
  push();
  fill(230,230,63);
  rectMode(CENTER);
  translate(x, y - h / 2);
  rect(0, 0, w, h);
  pop()
  push()
  fill(0);
  translate(x, y);
  
  textSize(height * 0.021);
  textAlign(LEFT, TOP);
  if (index == 1) {
    text(str[index]+'\n'+n, -w / 2, height * 0.065);
  } else {
    text(str[index]+'\n'+n, -w / 2, height * 0.035);
  }
  pop();
}


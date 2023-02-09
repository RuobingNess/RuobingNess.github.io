
var controller = new ScrollMagic.Controller();


ScrollReveal({ reset: true });

ScrollReveal().reveal(".show-once", {
  reset: false
});


ScrollReveal().reveal(".typing", {
    duration: 2000,
    origin: "bottom",
    distance: "100px",
    easing: "cubic-bezier(.37,.01,.74,1)",
    opacity: 0.3,
    scale: 0.5
  });
// Fetch the content of sidebar_employee.html and insert it into the 'sidebar' div
fetch('/templates/sidebar_employee.html')
  .then(response => response.text())
  .then(data => {
    document.getElementById('sidebar').innerHTML = data;

   // Add event listener after sidebar has been added to page
      addToggleMenuListener();
    });


/* global bootstrap: false */
// Anonymous function to initialize tooltips using Bootstrap
(function () {
  'use strict'

  // Retrieve a list of all elements with the data-bs-toggle attribute "tooltip"
  var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'))

  // For each element in the list, initialize a tooltip using Bootstrap Tooltip
  tooltipTriggerList.forEach(function (tooltipTriggerEl) {
    new bootstrap.Tooltip(tooltipTriggerEl)
  })
})()

// Add an event listener to the element with id 'toggleMenu'
function addToggleMenuListener() {
    var toggleMenuButton = document.getElementById('toggleMenu');
    if (toggleMenuButton) {
        toggleMenuButton.addEventListener('click', function() {

        // Retrieve the submenu by selecting the next element of the clicked element
        var submenu = this.nextElementSibling;
        console.log(submenu);

        // Check if the submenu is currently visible
        if (submenu.style.display === 'block') {

        // If the submenu is visible, hide it
            submenu.style.display = 'none';
        } else {

        // If the submenu is hidden, show it
            submenu.style.display = 'block';
            }
        });
    }
}
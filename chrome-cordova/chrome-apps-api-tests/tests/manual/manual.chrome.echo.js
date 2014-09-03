registerManualTests('chrome.echo', function(rootEl, addButton) {

  addButton('Basic Test', function() {
    chrome.echo.test();
  });

});

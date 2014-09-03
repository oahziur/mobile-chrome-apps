var exec = require('cordova/exec');

exports.test = function() {
  var message = 'This is a test message';
  var success = function (message) {
    console.log(message);
    alert(message);
  }
  var failure = function (err) {
    console.log(err);
  }
  exec(success, failure, 'ChromeEcho', 'echo', [message]);
}

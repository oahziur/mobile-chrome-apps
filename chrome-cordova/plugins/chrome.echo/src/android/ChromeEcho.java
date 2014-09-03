package org.chromium;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ChromeEcho extends CordovaPlugin {
  @Override
  public boolean execute(
      String action,
      JSONArray args,
      CallbackContext callbackContext) throws JSONException {
    if ("test".equals(action)) {
      String message = args.getString(0);
      this.test(message, callbackContext);
      return true;
    }
    return false;
  }

  private void test(String message, CallbackContext callbackContext) {
    if (message != null) {
      callbackContext.success(message);
    } else {
      callbackContext.error("Empty message");
    }
  }
}

#import "ChromeEcho.h"

@implementation ChromeEcho

- (void) test:(CDVInvokedUrlCommand*)command
{
  CDVPluginResult *pluginResult = nil;
  NSString *message = [command.arguments objectAtIndex:0];

  if (message != nil) {
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:message];
  } else {
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
  }

  [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}
@end

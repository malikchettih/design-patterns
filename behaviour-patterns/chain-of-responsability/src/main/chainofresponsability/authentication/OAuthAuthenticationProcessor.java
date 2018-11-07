package chainofresponsability.authentication;

import chainofresponsability.Handler;
import chainofresponsability.Request;

public class OAuthAuthenticationProcessor extends Handler {
    
    public OAuthAuthenticationProcessor() {
    }

    public OAuthAuthenticationProcessor(Handler handler) {
        super(handler);
    }

    public boolean handleRequest(Request request) {
        if(request instanceof OAuthRequest){
            return true;
        }               
        return false;
    }
}

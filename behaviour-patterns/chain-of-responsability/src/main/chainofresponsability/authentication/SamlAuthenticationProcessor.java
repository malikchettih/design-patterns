package chainofresponsability.authentication;

import chainofresponsability.Handler;
import chainofresponsability.Request;

public class SamlAuthenticationProcessor extends Handler {

    public SamlAuthenticationProcessor() {
    }

    public SamlAuthenticationProcessor(Handler handler) {
        super(handler);
    }

    public boolean handleRequest(Request request) {
        if(request instanceof SamlRequest){
            return true;
        }               
        return false;
    }
}

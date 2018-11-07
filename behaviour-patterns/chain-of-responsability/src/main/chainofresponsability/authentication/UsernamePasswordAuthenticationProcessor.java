package chainofresponsability.authentication;

import chainofresponsability.Handler;
import chainofresponsability.Request;

public class UsernamePasswordAuthenticationProcessor extends Handler {

    public UsernamePasswordAuthenticationProcessor() {
    }

    public UsernamePasswordAuthenticationProcessor(Handler handler) {
        super(handler);
    }

    public boolean handleRequest(Request request) {
        if(request instanceof UsernamePasswordRequest){
            return true;
        }               
        return false;
    }
}

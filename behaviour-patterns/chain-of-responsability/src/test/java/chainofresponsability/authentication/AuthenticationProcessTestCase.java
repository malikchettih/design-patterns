package chainofresponsability.authentication;

import chainofresponsability.Handler;
import org.junit.Before;
import org.junit.Test;

public class AuthenticationProcessTestCase {
    
    private Handler authenticationChain;
    
    @Before
    public void init(){
        authenticationChain = new OAuthAuthenticationProcessor(new SamlAuthenticationProcessor(new OAuthAuthenticationProcessor()));
    }
    
    @Test
    public void testOAuthAuthentication(){
        authenticationChain.handle(new OAuthRequest());
    }

    @Test
    public void testUsernamePasswordAuthentication(){
        authenticationChain.handle(new UsernamePasswordRequest());
    }

    @Test
    public void testSamlAuthentication(){
        authenticationChain.handle(new SamlRequest());
    }

    @Test
    public void testOtherAuthentication(){
        authenticationChain.handle(new OtherRequest());
    }
}

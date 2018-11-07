package chainofresponsability;

public abstract class Handler {
    
    protected Handler successor;
    
    protected Handler(){
        super();
    }

    protected Handler(Handler handler){
        this.successor = handler;
    }    
    
    public void setSuccessor(Handler handler){
        this.successor = handler;
    }
    
    public void handle(Request request){
        boolean isHandled = handleRequest(request);
        if(isHandled){
            System.out.println("Request Handled by " + this.getClass().getSimpleName());
        }else{
            if(this.successor != null){
                isHandled = this.successor.handleRequest(request);
                if(isHandled){
                    System.out.println("Request Handled by " + this.getClass().getSimpleName());
                }
            }
        }
        if(!isHandled){
            System.out.println(request.getClass().getSimpleName()+ " is not Handled.");
        }
    }
    
    protected abstract boolean handleRequest(Request request);
}

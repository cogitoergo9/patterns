package comportamiento.state;

public class RunState {
    public static void main(String[] args) {
        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.alert();
        context.setCurrentState(new Vibration());
        context.alert();
        context.alert();
        context.setCurrentState(new Silent());
        context.alert();
        context.alert();
    }
}

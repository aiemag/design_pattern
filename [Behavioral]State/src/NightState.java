
public class NightState implements State{
	private static NightState singleton = new NightState();
	private NightState() {
		
	}
	
	public static State getInstance() {
		return singleton;
	}
	
	public void doClock(Context context, int hour) {
		if(9 <= hour && hour <= 17) {
			context.changeState(DayState.getInstance());
		}
	}
	
	public void doUse(Context context) {
		context.recordLog("Using vault(night time)");
	}
	
	public void doAlarm(Context context) {
		context.callSecurityCenter("Alarm(night time)");
	}
	
	public void doPhone(Context context) {
		context.callSecurityCenter("Phone(night time)");
	}
	
	public String toString() {
		return "[night time]";
	}
}

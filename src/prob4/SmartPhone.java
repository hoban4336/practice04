package prob4;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if(function =="음악"){
			Download();
			return;
		}
		if(function == "앱"){
			StartApp();
			return;
		}
		super.execute(function);
	}
	
	public void Download(){
		System.out.println("다운로드 해서 음악재생");
	}
	public void StartApp(){
		System.out.println("앱실행");
	}
	
	
}

package jsw;

//@Data <- 만 쓰면 내부에 생성자, getter & setter가 있다고 자동 인식되게함.(lombok)

public class JswVO {
	//VO -> 생성자를 비어있는 생성자가 사용가능한지 여부
	//EL문법에서 ArrayList에 있는 VO에 필드(변수)값을 바로 출력하려면 getter & setter메소드를 이용함.
	//DTO: 생성자 메소드를 만들고 getter&setter

	
	private int iNum;
	private String str;
	public int getiNum() {
		return iNum;
	}
	public void setiNum(int iNum) {
		this.iNum = iNum;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
}

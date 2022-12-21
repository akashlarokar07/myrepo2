package collectionFrmaework;

public class State {

	private String code;
	private String name;
	private String capital;
	public State(String code, String name, String capital) {
		super();
		this.code = code;
		this.name = name;
		this.capital = capital;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
}

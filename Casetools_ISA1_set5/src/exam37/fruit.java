package exam37;

public class fruit {
	String color;
	fruit(String color){
		this.color = color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fruit cherry = new fruit ("green");
		String color = cherry.getColor();
		System.out.println("Color of cherry is "+color);
	}
	
	String getColor() {
		return color;
	}

}

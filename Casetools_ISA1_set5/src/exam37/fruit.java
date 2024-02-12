package exam37;

public class fruit {
	String color;
	String name;
	fruit(String color,String name){
		this.color = color;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fruit cherry = new fruit ("green","rohan");
		String color = cherry.getColor();
		System.out.println("Color of cherry is "+color);
	}
	
	String getColor() {
		return color;
	}
	
	String getName() {
		return name;
	}

}

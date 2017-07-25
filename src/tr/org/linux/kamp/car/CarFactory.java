package tr.org.linux.kamp.car;

public class CarFactory {
	public static void main(String [] args) {
		Car cara =new Car();
		Car carb =new Car();
		cara.setBrand("toyota");
		cara.changeGear(2);
		cara.speedUp(300);
		System.out.println(cara.getBrand() + cara.getGear() + cara.getSpeed());
		carb.setBrand("mersedes");
		carb.changeGear(2);
		carb.speedUp(500);
		System.out.println(carb.getBrand() + carb.getGear() + carb.getSpeed());
		Car mycar = new Car (1,150,"BMW")
				System.out.println("Mycar hızı:" + myCar.getspeed() + "vites:" + + myCar.getgear());
	carb.changeGear(2);
	System.out.println(c"ar2 Hız:" + car2.getspeed);
	}

}

package designpattern_adapterpattern;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USSocketInterface usSocket = new USSocket();
		USPowerplug usPowerplug = new USPowerplug(usSocket);
		usPowerplug.pluginandrun();
		IndianSocketInterface ISocket = new IndianSocket();
		usPowerplug = new USPowerplug(new IndianPowerAdapter(ISocket));
		usPowerplug.pluginandrun();
		

	}

}

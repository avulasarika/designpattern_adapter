package designpattern_adapterpattern;

public class USPowerplug {
	USSocketInterface usSocketInterface;
	public USPowerplug(USSocketInterface usSocketInterface) {
		this.usSocketInterface = usSocketInterface;
	}
		
		public void pluginandrun()
		{
			usSocketInterface.powerup();	
		}
		
	}
		



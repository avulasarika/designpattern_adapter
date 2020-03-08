package designpattern_adapterpattern;

public class IndianPowerAdapter implements USSocketInterface {
      IndianSocketInterface indianSocket = null;
      public IndianPowerAdapter(IndianSocketInterface indianSocket) {
    	  this.indianSocket = indianSocket;
      }

	@Override
	public void powerup() {
		// TODO Auto-generated method stub
		indianSocket.provideelectricity();

	}

}

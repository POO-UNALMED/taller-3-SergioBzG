package taller3.televisores;

public class Control{
	TV tv;
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int numCanal) {
		tv.setCanal(numCanal);
	}
	public void enlazar(TV televisor) {
		this.tv = televisor;
		tv.setControl(this);
	}
	public TV getTV() {
		return this.tv;
	}
	public void setTV(TV tv) {
		this.tv = tv;
	}
}
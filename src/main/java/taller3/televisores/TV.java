package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
    public TV(Marca raza, boolean tvOn){
    	this.marca = raza; this.estado = tvOn; this.numTV++;
    }
    public Marca getMarca() {
    	return this.marca;
    }
    public void setMarca(Marca raza) {
    	this.marca = raza;
    }
    public Control getControl() {
    	return this.control;
    }
    public void setControl(Control ctrl) {
    	this.control = ctrl;
    }
    public int getPrecio() {
    	return this.precio;
    }
    public void setPrecio(int price) {
    	this.precio = price;
    }
    public int getVolumen() {
    	return this.volumen;
    }
    public void setVolumen(int vol) {
    	if(this.estado == true) {
    		if(vol >= 0 && vol <= 7) {
    			this.volumen = vol;
    		}
    	}	
    }
    public int getCanal() {
    	return this.canal;
    }
    public void setCanal(int cnl) {
    	if(this.estado == true) {
    		if(cnl >= 1 && cnl <= 120) {
    			this.canal = cnl;
    		}
    	}
    }
    public static int getNumTV() {
    	return numTV;
    }
    public static void setNumTV(int number) {
    	numTV = number;
    }
    public void turnOn() {
    	this.estado = true;
    }
    public void turnOff() {
    	this.estado = false;
    }
    public boolean getEstado() {
    	return this.estado;
    }
    public void canalUp() {
    	if(this.estado == true && this.canal < 120) {
    		this.canal++;
    	}
    }
    public void canalDown() {
    	if(this.estado == true && this.canal > 1) {
    		this.canal--;
    	}
    }
    public void volumenUp() {
    	if(this.estado == true && this.volumen < 7) {
    		this.volumen++;
    	}
    }
    public void volumenDown() {
    	if(this.estado == true && this.volumen > 1) {
    		this.volumen--;
    	}
    }
}
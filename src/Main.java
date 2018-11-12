//EQUIPO Lollipop
//Ejercicio 2

public class Main
{
	public static void main(String[] args)
	{
                sedan gt = new sedan();
                moto harley = new moto();
                gt.acelerar();
                gt.setCantPasajeros(4);
                gt.setNumRuedas(4);
                gt.setSonido(400);
                gt.setBocinas(4);
                gt.setTransmision("estandar");
                harley.acelerar();
                harley.setCantPasajeros(2);
                harley.setNumRuedas(2);
                harley.setTransmision("estandar");
                estacionar(gt);
                estacionar(harley);
                
	}
	public static void estacionar(vehiculo mustang)
	{
            if(mustang instanceof sedan)
            {
                System.out.println("Tipo de vehiculo: Sedan");
                mustang.acelerometro();
                mustang.freno();
                System.out.println("pasajeros permitidos en el vehiculo: " + mustang.getCantPasajeros());
                System.out.println("los whatts de potencia del sonido del vehiculo: " + ((sedan) mustang).getSonido());
                System.out.println("Número de bocinas del vehiculo: " + ((sedan) mustang).getBocinas());
                System.out.println("Tipo de transmisión del vehiculo: " + mustang.getTransmision());
                System.out.println("número de ruedas en el vehiculo: " + mustang.getNumRuedas());
            }
            else if(mustang instanceof moto)
            {
                System.out.println("Tipo de vehiculo: Motocicleta");
                mustang.acelerometro();
                mustang.freno();
                System.out.println("pasajeros permitidos en el vehiculo: " + mustang.getCantPasajeros());
                System.out.println("Tipo de transmisión del vehiculo: " + mustang.getTransmision());
                System.out.println("número de ruedas del vehiculo: " + mustang.getNumRuedas());
            }
	}
}
class vehiculo{
	private int numRuedas, cantPasajeros, velocidad;
	private String transmision;
	public void setNumRuedas(int numRuedas)
	{
		this.numRuedas=numRuedas;
	}
	public void setCantPasajeros(int cantPasajeros)
	{
		this.cantPasajeros=cantPasajeros;
	}
	public int getNumRuedas()
	{
		return numRuedas;
	}
	public int getCantPasajeros()
	{
		return cantPasajeros;
	}
	public void setTransmision(String transmision)
	{
		this.transmision=transmision;
	}
	public String getTransmision()
	{
		return transmision;
	}
	public void acelerar()
	{
		velocidad = velocidad+10;
	}
	public void frenar()
	{
		velocidad = velocidad-10;
	}
	public void freno()
	{
		for(int i=0; i<(velocidad/10); i++)
		{
			frenar();
		}
		System.out.println("vehiculo estacionado");
		System.out.println("velocidad: "+velocidad+" km/h");
	}
	public void acelerometro()
	{
		if(velocidad==0)
		{
			System.out.println("vehiculo detenido");
		}
		else if(velocidad>0)
		{
			System.out.println("vehiculo en moviniento a "+velocidad+" km/h");
		}
	}
}
interface Tuneable
{
	public int sonido=200, Bocinas=4;//sonido son los whatts de potncia que dio el profe.
	public void setSonido(int sonido);
	public void setBocinas(int Bocinas);
	public int getSonido();
	public int getBocinas();
}
class sedan extends vehiculo implements Tuneable
{
	@Override
	public void setSonido(int sonido)
	{
            
	}

	@Override
	public void setBocinas(int Bocinas)
	{
		
	}

	@Override
	public int getSonido()
	{
		return sonido;
	}
        
        @Override
	public int getBocinas()
	{
		return Bocinas;
	}
}
class moto extends vehiculo
{
	
}
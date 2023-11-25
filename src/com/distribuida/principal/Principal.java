package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Clientes;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;
import com.distribuida.entities.detalleFactura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clientes cliente=  new Clientes();
		
		cliente.setIdCliente(1);
		cliente.setCedula("1207595941");
		cliente.setNombre("Dario");
		cliente.setApellido("Cardozo");
		cliente.setEdad(26);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Tumbaco");
		cliente.setTelefono("0958851088");
		cliente.setCorreo("darioC17@correo.com");
		
		
		Producto producto =new Producto();
		producto.setIdProducto(1);
		producto.setNombre("Manzana");
		producto.setDescripcion("Caja de Manzanas");
		producto.setPrecio(25.30);
		producto.setStock(100);
		
		
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-0001");
		factura.setFecha(new Date());
		factura.setTotalNeto(56.32);
		factura.setIva(0.12);
		factura.setTotal(60.15);
		
		
		detalleFactura detalleFactura = new detalleFactura();
		detalleFactura.setIdetalleFactura(2);
		detalleFactura.setCantidad(8);
		detalleFactura.setSubtotal(84.60);
		
		cliente.setIdCliente(2);
		cliente.setCedula("1209856651");
		cliente.setNombre("Jose");
		cliente.setApellido("Cardenas");
		cliente.setEdad(18);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Pifo");
		cliente.setTelefono("098965741");
		cliente.setCorreo("joseC18@correo.com");
		
		Producto producto2 =new Producto();
		producto.setIdProducto(2);
		producto.setNombre("Pera");
		producto.setDescripcion("Caja de Peras");
		producto.setPrecio(22.50);
		producto.setStock(120);
		
        Factura factura2 = new Factura();
		
		factura.setIdFactura(2);
		factura.setNumFactura("FAC-0002");
		factura.setFecha(new Date());
		factura.setTotalNeto(50.20);
		factura.setIva(0.12);
		factura.setTotal(90.15);
		
		
		///inyeccion de dependencias
		
		factura.setCliente(cliente);
		detalleFactura.setProducto(producto);
		
		
		/// impresion
		System.out.println(factura.toString());
		System.out.println(detalleFactura.toString());
	}

}

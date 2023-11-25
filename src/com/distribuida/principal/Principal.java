package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cliente cliente = context.getBean("beanCliente", Cliente.class);
		Cliente cliente2 = context.getBean("beanCliente2", Cliente.class);
		
		Producto producto = context.getBean("beanProducto", Producto.class);
		Producto producto2 = context.getBean("beanProducto2", Producto.class);
		
		Factura factura = context.getBean("beanFactura", Factura.class);
		
		FacturaDetalle facturaDetalle = context.getBean("beanDetalleFactura", FacturaDetalle.class);
		
		
		DatosEmpresa datosEmpresa = context.getBean("beanDatosEmpresa", DatosEmpresa.class);
		
		
		cliente.setIdCliente(1);
		cliente.setCedula("1234567890");
		cliente.setNombre("Pamela");
		cliente.setApellido("Scotch");
		cliente.setDireccion("av. por ahi y mas alla");
		cliente.setTelefono("0987654321");
		cliente.setCorreo("pscotch@correo.com");
		
		factura.setIdFactura(1);
		factura.setNumFactura("Fac-001");
		factura.setFecha(new Date());
		factura.setTotalNeto(236.23);
		factura.setIva(0.12);
		factura.setTotal(265.97);
		
		
		producto.setIdProducto(1);
		producto.setNombre("manzana");
		producto.setDescripcion("caja de manzanas");
		producto.setPrecio(25.36);
		producto.setStock(100);
		
		
		facturaDetalle.setIdFacturaDetalle(1);
		facturaDetalle.setCantidad(5);
		
		
		
		System.out.println(factura.toString());
		System.out.println(facturaDetalle.toString());
		
		
		System.out.println(datosEmpresa.toString());
		
		context.close();
		
		
	}

}

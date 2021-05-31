package Entite.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Entite.Convertisseur;
import Entite.UniteDistincteException;

import org.junit.Test;

public class examenTest {
	static int d=0,e=0;
	 Convertisseur convertisseur;
	
	@Before
	public void Init() {
		//exécutée au début de chaque méthode de test et qui initialise notre objet
		convertisseur=new Convertisseur(15.0);
		System.out.println("Deb -> c est le passage numero : "+ (++d));
	}
	
	@After
	public void End() {
		//Methode exécutée après chaque test
		System.out.println("Reultat obtenu : "+this.convertisseur.getResultat());
		System.out.println("End -> c est le passage numero : "+(++e));
		System.out.println();
		
	}
	
	
	@Test
	public void Testing1() {
		try {
			convertisseur.Convertir(1.5);
		} catch (UniteDistincteException e) {
			
			e.toString();
		}
		Assert.assertEquals( (double)22.5, convertisseur.getResultat(),0.0);
		
	}
	
	@Test
	public void Testing2() {
		try {
			convertisseur.Convertir(2.5);
		} catch (UniteDistincteException e) {
			e.toString();
		}
		Assert.assertTrue(convertisseur.getResultat()==(37.5));
	}
	
	
	@Test
	public void Testing3() {
		try {
			convertisseur.Convertir(0);
		} catch (UniteDistincteException e) {
			
			System.out.println(e.toString());
		}
		//Assert.assertEquals( (double)22.5, convertisseur.getResultat(),0.0);
		
	}

}

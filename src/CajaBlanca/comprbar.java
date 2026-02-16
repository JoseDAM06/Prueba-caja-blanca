package CajaBlanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class comprbar {

	CajaBlanca a=new CajaBlanca();
	
	@Test
	void test1() {
		assertFalse(a.compruebaMatricula(0,'x','x','x'));
	}
	
	@Test
	void test2() {
		assertFalse(a.compruebaMatricula(10000,'x','x','x'));
	}
	
	@Test
	void test3() {
		assertFalse(a.compruebaMatricula(50,' ','x','x'));
	}
	
	@Test
	void test4() {
		assertFalse(a.compruebaMatricula(50,'x',' ','x'));
	}
	
	@Test
	void test5() {
		assertFalse(a.compruebaMatricula(50,'x','x',' '));
	}
	
	@Test
	void test6() {
		assertTrue(a.compruebaMatricula(50,'x','x','x'));
	}

}

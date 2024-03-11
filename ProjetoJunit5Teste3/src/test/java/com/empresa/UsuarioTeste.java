package com.empresa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioTeste {

	@Test
	public void testeCriarUsuarioValido() {
		Usuario usuario = new Usuario(1L, "José Tirabassi", "jose@gmail.com", "123456");
		assertEquals(1L, usuario.getId());
		assertEquals("José Tirabassi", usuario.getNome());
		assertEquals("jose@gmail.com", usuario.getEmail());
		assertEquals("123456", usuario.getSenha());
	}

	@Test
	public void testNaoPermitirUsuarioSemNome() {
		ValidationException ex = assertThrows(ValidationException.class, () -> {
			Usuario usuario = new Usuario(1L, null, "bts@gmail.com", "123456");
		});
		assertEquals("Nome é Obrigatório", ex.getMessage());
	}

	@Test
	public void testNaoPermitirUsuarioSemEmail() {
		ValidationException ex = assertThrows(ValidationException.class, () -> {
			Usuario usuario = new Usuario(1L, "Vitória", null, "123456");
		});
		assertEquals("E-mail é Obrigatório", ex.getMessage());
	}

	@Test
	public void testNaoPermitirUsuarioSemSenha() {
		ValidationException ex = assertThrows(ValidationException.class, () -> {
			Usuario usuario = new Usuario(1L, "Hoseok", "bts@gmail.com", null);
		});
		assertEquals("Senha é Obrigatória", ex.getMessage());
	}

}

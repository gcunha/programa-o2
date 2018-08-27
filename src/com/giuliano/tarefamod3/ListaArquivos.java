package com.giuliano.tarefamod3;

import java.io.File;

public class ListaArquivos {

	public static void main(String[] args) {

		File f = new File("C:\\wamp");

		if (f.isDirectory()) {

			String[] arquivos = f.list();

			for (int i = 0; i < arquivos.length; i++) {

				System.out.println(arquivos[i]);

			}

		}

	}

}
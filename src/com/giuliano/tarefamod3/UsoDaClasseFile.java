package com.giuliano.tarefamod3;

import java.io.File;

public class UsoDaClasseFile {

	public static void main(String[] args) {

		File arquivo = new File("alunos.txt");

		System.out.println("Nome: " + arquivo.getName());

		System.out.println("Caminho: " + arquivo.getAbsolutePath());

		System.out.println("Existe? " + arquivo.exists());

		System.out.println("É um diretório? " + arquivo.isDirectory());

		System.out.println("É um arquivo? " + arquivo.isFile());

		System.out.println("Pode ser lido? " + arquivo.canRead());

		System.out.println("Pode ser escrito? " + arquivo.canWrite());

		System.out.println("Tamanaho do arquivo: " + arquivo.length());

	}

}
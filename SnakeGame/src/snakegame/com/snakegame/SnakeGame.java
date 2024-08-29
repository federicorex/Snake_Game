package com.snakegame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;

public class SnakeGame {

	public static void main(String[] args) {
		Component emptyLabel = new Container();
		
		
		JFrame jFrame = new JFrame("Frame Demo");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		jFrame.pack();
		jFrame.setVisible(true);
	}

}

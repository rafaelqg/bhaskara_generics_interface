package view;

import javax.swing.JFrame;

public class TelaTemplate<E> extends JFrame {
	protected E estado;
	public void setEstado(E e) {
		this.estado = e;
	}
}

package canal.calculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import canal.calculadora.logica.Memoria;
import canal.calculadora.logica.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(103, 112, 114));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 40));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 60));
		
		add(label);
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
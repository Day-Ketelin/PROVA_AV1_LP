import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VotacaoGUI extends JFrame {
    private JPanel votacao = new JPanel();
    private JLabel label = new JLabel("Em quem você vota para sair da casa?");

    private JButton jButtonVotar = new JButton("Votar");

    public VotacaoGUI() {
        this.setTitle("** Votação BBB - 2024 **");
        this.setSize(620,480);
        votacao.setLayout(new FlowLayout(FlowLayout.CENTER, 95,20));
        votacao.setBackground(new Color(226, 225, 225));
        votacao.setForeground(Color.DARK_GRAY);

        label.setForeground(Color.BLACK);
        label.setVisible(true);
        label.setFont(new Font("Arial", Font.ITALIC,20));

        jButtonVotar.setBackground((new Color(165,58, 82)));
        jButtonVotar.setForeground(Color.pink);
        jButtonVotar.setFont(new Font("Arial", Font.BOLD,18));

        jButtonVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               votar();

            }
        });

        jButtonVotar.setPreferredSize(new Dimension(350, 120));

        votacao.add(label);
        votacao.add(jButtonVotar);

        this.getContentPane().add(votacao);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    private void votar() {
        Object votar = JOptionPane.showInputDialog(null, "Digite o nome de quem você deseja que saia da casa: ", "Votos - BBB 2024", JOptionPane.INFORMATION_MESSAGE);
        String novoVoto = JOptionPane.showMessageDialog(null,"" );
    }




    public static void main(String[] args) {
        new VotacaoGUI();
    }

}

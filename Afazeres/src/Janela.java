import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    private JLabel llbox;

    private JButton Afazerbbt;

    private JCheckBox Afazer;
    private JCheckBox Afazer2;
    private JCheckBox Afazer3;
    private JCheckBox Afazer4;

    public Janela(){
        JFrame frame = new JFrame();
        setLayout(null);
        setResizable(false);
        setTitle("Afazeres");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        listadeafazeres();
        setVisible(true);
    }

    public void listadeafazeres(){
        JPanel abc = new JPanel();
        abc.setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
        abc.setBounds(0,0,400,50);

        llbox = new JLabel("Caixa de entrada");

        Afazerbbt = new JButton("Nova Tarefa");

        JPanel cba = new JPanel();
        cba.setBounds(0,50,400,280);
        cba.setLayout(new BoxLayout(cba,BoxLayout.PAGE_AXIS));

        Afazer = new JCheckBox("Comprar Carvão !!");
        Afazer.setFocusable(false);
        Afazer.setAlignmentX(Component.CENTER_ALIGNMENT);

        Afazer2 = new JCheckBox("Comprar Carvão !!");
        Afazer2.setFocusable(false);
        Afazer2.setAlignmentX(Component.CENTER_ALIGNMENT);

        Afazer3 = new JCheckBox("Comprar Carvão !!");
        Afazer3.setFocusable(false);
        Afazer3.setAlignmentX(Component.CENTER_ALIGNMENT);

        Afazer4 = new JCheckBox("Comprar Carvão !!");
        Afazer4.setFocusable(false);
        Afazer4.setAlignmentX(Component.CENTER_ALIGNMENT);


        abc.add(llbox);
        abc.add(Afazerbbt);
        cba.add(Box.createRigidArea(new Dimension(5,5)));
        cba.add(Afazer);
        cba.add(Box.createRigidArea(new Dimension(5,5)));
        cba.add(Afazer2);
        cba.add(Box.createRigidArea(new Dimension(5,5)));
        cba.add(Afazer3);
        cba.add(Box.createRigidArea(new Dimension(5,5)));
        cba.add(Afazer4);

        add(abc);
        add(cba);
    }
}
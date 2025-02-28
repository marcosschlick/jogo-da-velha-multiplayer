import app.views.TelaInicial;
import app.views.TelaJogo;
import app.views.TelaResultado;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Jogo da velha");
        frame.setSize(800, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        CardLayout cardLayout = new CardLayout();
        JPanel cards = new JPanel(cardLayout);

        cards.add(new TelaInicial(cardLayout, cards), "TelaInicial");
        cards.add(new TelaJogo(cardLayout, cards), "TelaJogo");
        cards.add(new TelaResultado(cardLayout, cards), "TelaResultado");
        frame.add(cards);

        frame.setVisible(true);
    }
}
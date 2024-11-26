import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Membuat dan menampilkan GUI untuk Rock-Paper-Scissors
            RockPaperScissorGUI rockPaperScissorGUI = new RockPaperScissorGUI();
            rockPaperScissorGUI.setVisible(true);
        });
    }
}
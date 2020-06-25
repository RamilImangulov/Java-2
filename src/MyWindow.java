import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    JTextArea textArea;
    JTextField textMassage;

    public MyWindow() {
        setTitle("Main"); //название
        setBounds(800, 300, 400, 400); // положение окна и размер
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //когда Х нажмем, то закроем и окно и программу

        JPanel centerPanel = new JPanel(); // разделил окно на две панели, эта часть верхняя
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.gray);
        centerPanel.setLayout(new BorderLayout());

        JPanel bottonPanel = new JPanel(); // разделил окно на две панели, эта часть нижняя
        add(bottonPanel, BorderLayout.SOUTH);
        bottonPanel.setBackground(Color.darkGray);
        bottonPanel.setPreferredSize(new Dimension(1, 40));
        bottonPanel.setLayout(new BorderLayout());



        JButton startButton = new JButton("Send message"); //добавил кнопку
        bottonPanel.add(startButton, BorderLayout.EAST);

        textArea = new JTextArea(); // большое текстовое поле
        JScrollPane textAreaScroll = new JScrollPane(textArea); // прокручиваем текст
        centerPanel.add(textAreaScroll, BorderLayout.CENTER);
        textArea.setEditable(false); // не можем большо писать текст в нижнем окне

        textMassage = new JTextField(); // тексовое поле одинароное для набора сообщений
        bottonPanel.add(textMassage, BorderLayout.CENTER);

        startButton.addActionListener(new ActionListener() { // тут через ананимный класс активируем кнопку
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });

        textMassage.addActionListener(new ActionListener() { // тут через ананимный класс активируем поле
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });

        setVisible(true); // теперь видим окно
    }
    void addText() {
        textArea.append(textMassage.getText()+"\n");
        textMassage.setText(""); // чистем поле после
    }
}

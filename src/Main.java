/*TudorS 2023 L11 P1: Working calculator :D*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Frame properties
class MyFrame extends JFrame{
    public MyFrame(String title){
        super(title);
        this.setSize(500,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// Driver class
public class Main {
    static double total = 0, n1 = 0, n2 = 0;
    static char operation;
    public static void main(String[] args) {

        // panel
        JPanel panel = new JPanel(new GridLayout(5,4,10,10));

        ////////Component declarations////////
        // input label
        panel.add(new JLabel("  Input:"));

        // input text
        JTextField inputField = new JTextField();
        panel.add(inputField);

        // clear button
        JButton buttonClear = new JButton("clear");
        buttonClear.setForeground(Color.white);
        buttonClear.setBackground(Color.blue);
        panel.add(buttonClear);


        // divide button
        JButton buttonDiv = new JButton("/");
        buttonDiv.setForeground(Color.white);
        buttonDiv.setBackground(Color.blue);
        panel.add(buttonDiv);

        // 7 button
        JButton button7 = new JButton("7");
        panel.add(button7);

        // 8 button
        JButton button8 = new JButton("8");
        panel.add(button8);

        // 9 button
        JButton button9 = new JButton("9");
        panel.add(button9);

        // multiplication button
        JButton buttonX = new JButton("X");
        buttonX.setForeground(Color.white);
        buttonX.setBackground(Color.blue);
        panel.add(buttonX);

        // 4 button
        JButton button4 = new JButton("4");
        panel.add(button4);

        // 5 button
        JButton button5 = new JButton("5");
        panel.add(button5);

        // 6 button
        JButton button6 = new JButton("6");
        panel.add(button6);

        // minus button
        JButton buttonMinus = new JButton("-");
        buttonMinus.setForeground(Color.white);
        buttonMinus.setBackground(Color.blue);
        panel.add(buttonMinus);

        // 1 button
        JButton button1 = new JButton("1");
        panel.add(button1);

        // 2 button
        JButton button2 = new JButton("2");
        panel.add(button2);

        // 3 button
        JButton button3 = new JButton("3");
        panel.add(button3);

        // delete button
        JButton buttonDel = new JButton("DEL");
        panel.add(buttonDel);
        buttonDel.setForeground(Color.white);
        buttonDel.setBackground(Color.blue);

        // 0 button
        JButton button0 = new JButton("0");
        panel.add(button0);

        //dot button
        JButton buttonDot = new JButton(".");
        panel.add(buttonDot);

        //plus button
        JButton buttonPlu = new JButton("+");
        buttonPlu.setForeground(Color.white);
        buttonPlu.setBackground(Color.blue);
        panel.add(buttonPlu);

        //equal button
        JButton buttonEqual = new JButton("=");
        buttonEqual.setForeground(Color.white);
        buttonEqual.setBackground(Color.blue);
        panel.add(buttonEqual);

        ////////Listeners////////
        // 0 button
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("0");
                else
                    inputField.setText(inputField.getText() + "0");
            }
        });

        //1 button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("1");
                else
                    inputField.setText(inputField.getText() + "1");
            }
        });

        //2 button
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("2");
                else
                    inputField.setText(inputField.getText() + "2");
            }
        });

        //3 button
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("3");
                else
                    inputField.setText(inputField.getText() + "3");
            }
        });

        //4 button
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("4");
                else
                    inputField.setText(inputField.getText() + "4");
            }
        });

        //5 button
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("5");
                else
                    inputField.setText(inputField.getText() + "5");
            }
        });

        //6 button
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("6");
                else
                    inputField.setText(inputField.getText() + "6");
            }
        });

        //7 button
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("7");
                else
                    inputField.setText(inputField.getText() + "7");
            }
        });

        //8 button
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("8");
                else
                    inputField.setText(inputField.getText() + "8");
            }
        });

        //9 button
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputField.getText().matches("0") == true)
                    inputField.setText("9");
                else
                    inputField.setText(inputField.getText() + "9");

            }
        });

        //dot button
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText(inputField.getText() + ".");
            }
        });

        //DEL
        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = 0;
                inputField.setText("0");
            }
        });

        //Clear
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("0");
            }
        });

        //Plus
        buttonPlu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(inputField.getText());
                operation ='+';
                inputField.setText("0");
            }
        });

        //MINUS
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(inputField.getText());
                operation = '-';
                inputField.setText("0");
            }
        });


        //Multiply
        buttonX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(inputField.getText());
                operation = '*';
                inputField.setText("0");
            }
        });

        //Divide
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(inputField.getText());
                operation = '/';
                inputField.setText("0");
            }
        });

        //Equal
        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n2 = Double.parseDouble(inputField.getText());
                switch (operation){
                    case '+':
                        total = n1+n2;
                    break;
                    case '-':
                        total = n1-n2;
                    break;
                    case '*':
                        total = n1*n2;
                    break;
                    case '/':
                        total = n1/n2;
                    break;
                    default:
                        inputField.setText(inputField.getText());
                }
                inputField.setText(Double.toString(total));

            }
        });

        //frame
        MyFrame f = new MyFrame("Calculator");
        f.add(panel);
    }
}

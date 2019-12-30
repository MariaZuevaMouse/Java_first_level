
import com.sun.xml.internal.ws.handler.HandlerException;
import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.util.Scanner;

public class Form extends JFrame {
    public Form()throws HandlerException{
        setTitle("Test application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600,600,600,600);
       // JButton[] jbutton = new JButton[3];
        setMinimumSize(new Dimension());


        setLayout(new GridLayout(2,3));



        Scanner scan = new Scanner(System.in);
        final int[] a = {0};
        final int[] b = {0};
        final int[] result = {0};


        JLabel jLabel1 = new JLabel("Введите первую переменную");
        add(jLabel1);
        JLabel jLable2 = new JLabel("Введите вторую переменную");
        add(jLable2);
        JPanel jpanel = new JPanel();
        jpanel.add(new JLabel("Введите 1 - сложение"));
        jpanel.add(new JLabel("ВВедите 2 - вычитание "));
        jpanel.add(new JLabel("ВВедите 3 - умножение "));
        jpanel.add(new JLabel("Введите 4 - деление "));

        jpanel.setVisible(true);
        add(jpanel);
//        JLabel jLable3 =new JLabel("Введите 1 - если хотите произвести операцию сложения, " +
//                "\n ВВедите 2 - если хотите прлучить результат вычитания " +
//                "\n ВВедите 3 - если хотите получить результат умножения" +
//                "\n Введите 4 - если хотите получить результат деления");
//        add(jLable3);

        JTextField textField1 = new JTextField("число");
        add(textField1);
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Первая переменная  = " + textField1.getText());
                a[0] =Integer.parseInt(textField1.getText());

            }
        });
        JTextField textField2 = new JTextField("число");
        add(textField2);
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Вторая переменная = " + textField2.getText());
                b[0] =Integer.parseInt(textField2.getText());
            }
        });
        JTextField textField3 =new JTextField("операция");
        add(textField3);
        textField3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch(textField3.getText()){
                    case "1":
                        result[0] = a[0] + b[0];
                        System.out.println("результат сложения чисел "+ result[0]);
                        break;
                    case "2":
                        result[0] = a[0] - b[0];
                        System.out.println("результат вычитания чисел "+ result[0]);
                        break;
                    case  "3":
                        result[0] = a[0] * b[0];
                        System.out.println("результат умножения чисел "+ result[0]);
                        break;
                    case  "4":
                        if(b[0]!=0){
                            result[0] =(int) a[0] / b[0];
                            System.out.println("результат деления чисел"+ result[0]);
                        }else System.out.println("Деление на ноль не возможно");
                        break;
                    default:

                        System.out.println("какие-то переменные были введены не верно");
                        break;
                }

            }
        });

//        JLabel jLabel1 = new JLabel("Введите первую переменную");
//        add(jLabel1);
//        JLabel jLable2 = new JLabel("Введите вторую переменную");
//        add(jLable2);
//        JLabel jLable3 =new JLabel("Введите 1 - если хотите произвести операцию сложения, " +
//                "\n ВВедите 2 - если хотите прлучить результат вычитания " +
//                "\n ВВедите 3 - если хотите получить результат умножения" +
//                "\n Введите 4 - если хотите получить результат деления");
//        add(jLable3);


//        for(int i = 0; i<jbutton.length; i++){
//            jbutton[i]= new JButton("#"+i);
//            jbutton[i].addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    System.out.println("button pressed");
//                }
//            }
//            );
//            add(jbutton[i]);
//        }

//        JTextField textField1 = new JTextField("поле ввода");
//        add(textField1);
//        textField1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("enter pressed "+textField1.getText());
//            }
//        });

//        JTextArea textArea = new JTextArea(10,20);
//        textArea.setEditable(true);
//        JScrollPane scrollPane = new JScrollPane(textArea);
//        add(scrollPane);

//        JPanel jPanel = new JPanel();
//        jPanel.add(new JRadioButton("yes"));
//        jPanel.add(new JRadioButton("no"));
//        jPanel.setVisible(true);
//        add(jPanel);

       //        add(new JRadioButton("yes"));
       //        add(new JRadioButton("no"));




//
//        for (int i= 0; i<3; i++){
//            add(new JCheckBox("test"+i));
//        }

//        JTextArea textArea = new JTextArea();
//        add(textArea);
//        JRadioButton radioButton = new JRadioButton();
//        add(radioButton);
//        JTextField textField= new JTextField();
//        add(textField);
//        JCheckBox checkBox = new JCheckBox();
//        add(checkBox);
//        JTable table = new JTable();
//        add(table);
//        JMenuBar menuBar = new JMenuBar();
//        add(menuBar);
//        JScrollPane scrolPane = new JScrollPane();
//        add(scrolPane);


        //FlowLayout
//        setLayout(new FlowLayout());
//        for (int i = 0 ; i<jbutton.length; i++){
//            jbutton[i] = new JButton("#" + i);
//            add(jbutton[i]);
//        }
        //BoxLayout
//        setLayout((new BoxLayout(getContentPane(), BoxLayout.X_AXIS)));
//        for(int i=0; i<jbutton.length; i++){
//            jbutton[i] = new JButton("#"+i);
//            jbutton[i].setAlignmentX(Component.CENTER_ALIGNMENT);
//            add(jbutton[i]);
//        }

        //BorderLayout
//        setLayout(new BorderLayout());
//        jbutton[0].setPreferredSize(new Dimension(100, 100));
//        add(jbutton[0], BorderLayout.NORTH);
//        add(jbutton[1], BorderLayout.SOUTH);
//        add(jbutton[2], BorderLayout.WEST);
//        add(jbutton[3], BorderLayout.EAST);
//        add(jbutton[4], BorderLayout.CENTER);


        setVisible(true);
    }

}
class AppStart{
    public static void main(String[] args) {
        Form form = new Form();



    }
}


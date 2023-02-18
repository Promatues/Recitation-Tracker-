import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UI{
    public static void main(String[] args){
        
        JFrame frame = new JFrame("Recitation Tracker");
        Font font = new Font("Courier new", Font.BOLD, 21);

        //Frames
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();               
        frame.setSize(screenSize.width, screenSize.height);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.getContentPane().setBackground(new Color(0xE5E5E5));
        frame.setLayout(null);
        //Buttons
        JButton recitationButton = new JButton("Recitation");
        JButton attendanceButton = new JButton("Attendance");
        JButton analyticsButton = new JButton("Analytics");
        JButton exitButton = new JButton("EXIT");
        frame.add(recitationButton);
        frame.add(attendanceButton);
        frame.add(analyticsButton);
        frame.add(exitButton);

        //Removes annoying little box inside buttons
        recitationButton.setFocusable(false);
        attendanceButton.setFocusable(false);
        analyticsButton.setFocusable(false);
        exitButton.setFocusable(false);

        int frameWidth = screenSize.width;
        int frameHeight = screenSize.height;

        //Title
        JLabel title = new JLabel("Recitation Tracker");
        title.setFont(new Font("Courier new", Font.BOLD, 38));
        title.setForeground(Color.BLACK);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(0, 150, frameWidth, 50);
        frame.add(title);

        //Fonts for each buttons
        recitationButton.setFont(font);
        attendanceButton.setFont(font);
        analyticsButton.setFont(font);
        exitButton.setFont(font);

        //Colors of each buttons
        recitationButton.setBackground(new Color(0x889696));
        attendanceButton.setBackground(new Color(0x889696));
        analyticsButton.setBackground(new Color(0x889696));
        exitButton.setBackground(new Color(0x889696));

        //Sets bounds for each button since .setLayout is null
        recitationButton.setBounds((frameWidth - 350) / 2, (frameHeight + 50) / 2, 350, 55);
        attendanceButton.setBounds((frameWidth - 350) / 2, (frameHeight + 50) / 2 + 75, 350, 55);
        analyticsButton.setBounds((frameWidth - 350) / 2, (frameHeight + 50) / 2 + 150, 350, 55);
        exitButton.setBounds((frameWidth - 350) / 2, (frameHeight + 50) / 2 + 225, 350, 55);

        //Hover bar
        JPanel sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(100, 0));
        frame.add(sidebar);
        int SBframeWidth = screenSize.width;
        int SBframeHeight = screenSize.height;
        sidebar.setBounds(0, 0, 100, SBframeHeight);
        sidebar.setBackground(new Color(0x5F7470));

        //To hover when mouse in area(Function)
        sidebar.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                sidebar.setBounds(0, 0, 400, SBframeHeight);
        }

        public void mouseExited(MouseEvent e) {
            sidebar.setBounds(0, 0, 100, SBframeHeight);
        }
});        

        //Functions of each buttons
        recitationButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame recitationFrame = new JFrame("Recitation Frame");

                frame.setVisible(false);

                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension screenSize = toolkit.getScreenSize();
                recitationFrame.setSize(screenSize.width, screenSize.height);
                recitationFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                recitationFrame.setUndecorated(true);
                recitationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                recitationFrame.setVisible(true);

            }
        });

        attendanceButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame attendanceFrame = new JFrame("Attendance Frame");

                frame.setVisible(false);

                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension screenSize = toolkit.getScreenSize();
                attendanceFrame.setSize(screenSize.width, screenSize.height);
                attendanceFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                attendanceFrame.setUndecorated(true);
                attendanceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                attendanceFrame.setVisible(true);
            }
        });

                analyticsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame analyticsFrame = new JFrame("Analytics Frame");

                frame.setVisible(false);

                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension screenSize = toolkit.getScreenSize();
                analyticsFrame.setSize(screenSize.width, screenSize.height);
                analyticsFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                analyticsFrame.setUndecorated(true);
                analyticsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                analyticsFrame.setVisible(true);
            }
        });

        exitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        

    }
}
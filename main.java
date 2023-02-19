import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class main{
    public static void main(String[] args){
        
        JFrame frame = new JFrame("Recitation Tracker");
        Font font = new Font("Courier new", Font.BOLD, 21);

        //sa Toolkit at Dimension na to, kinukuha niya lang yung pinaka size ng screen mo
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        //fullscreen
        frame.setSize(screenSize.width, screenSize.height);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.getContentPane().setBackground(new Color(0xE5E5E5));//background color
        frame.setLayout(null);

        //dito sa line of code na to, gagawa tayo ng mga label ng buttons
        JButton recitationButton = new JButton("Recitation");
        JButton attendanceButton = new JButton("Attendance");
        JButton analyticsButton = new JButton("Analytics");
        JButton exitButton = new JButton("EXIT");

        //frame ng mga buttons
        frame.add(recitationButton);
        frame.add(attendanceButton);
        frame.add(analyticsButton);
        frame.add(exitButton);

        //Title
        int frameWidth = screenSize.width;
        int frameHeight = screenSize.height;

        JLabel title = new JLabel("Recitation Tracker");
        title.setVisible(true);
        title.setFont(new Font("Courier new", Font.BOLD, 38));
        title.setForeground(Color.BLACK);
        title.setHorizontalAlignment(JLabel.CENTER);

        // Set the bounds of the title
        title.setBounds(0, 100, frameWidth, 50);

        // Add the title to the frame
        frame.add(title);

        JLabel line = new JLabel("_______________________");
        line.setBounds(0, 101, frameWidth, 50);
        line.setFont(new Font("Courier new", Font.BOLD, 38));
        line.setHorizontalAlignment(JLabel.CENTER);
        line.setForeground(Color.BLACK);
        frame.add(line);

        JLabel exampleSection = new JLabel("ICTE101A");

        exampleSection.setForeground(Color.BLACK);
        exampleSection.setVisible(true);
        exampleSection.setBounds(0, 140, frameWidth, 50);
        exampleSection.setHorizontalAlignment(JLabel.CENTER);
        exampleSection.setFont(new Font("Courier new", Font.BOLD, 38));
        frame.add(exampleSection);

        //font ng mga text sa buttons
        recitationButton.setFont(font);
        attendanceButton.setFont(font);
        analyticsButton.setFont(font);
        exitButton.setFont(font);
        //colors ng mga button
        recitationButton.setBackground(new Color(0x889696));
        attendanceButton.setBackground(new Color(0x889696));
        analyticsButton.setBackground(new Color(0x889696));
        exitButton.setBackground(new Color(0x889696));

        //sidebar naman to
        JPanel sidebar = new JPanel();
        //iseset natin yung size ng sidebar
        sidebar.setPreferredSize(new Dimension(100, 0));
        // Add the sidebar to the frame
        frame.add(sidebar);
        int SBframeWidth = screenSize.width;
        int SBframeHeight = screenSize.height;
        // Set the bounds of the sidebar
        sidebar.setBounds(0, 0, 100, SBframeHeight);
        //color ng sidebar
        sidebar.setBackground(new Color(0x5F7470));

        //SECTION Tab
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.PAGE_AXIS));

        JLabel S = new JLabel("S");
        S.setFont(new Font("Courier new", Font.BOLD, 38));
        sidebar.add(S);

        JLabel E = new JLabel("E");
        E.setFont(new Font("Courier new", Font.BOLD, 38));
        sidebar.add(E);

        JLabel C = new JLabel("C");
        C.setFont(new Font("Courier new", Font.BOLD, 38));
        sidebar.add(C);

        JLabel T = new JLabel("T");
        T.setFont(new Font("Courier new", Font.BOLD, 38));
        sidebar.add(T);

        JLabel I = new JLabel("I");
        I.setFont(new Font("Courier new", Font.BOLD, 38));
        sidebar.add(I);

        JLabel O = new JLabel("O");
        O.setFont(new Font("Courier new", Font.BOLD, 38));
        sidebar.add(O);

        JLabel N = new JLabel("N");
        N.setFont(new Font("Courier new", Font.BOLD, 38));
        sidebar.add(N);

        //hovering shii
        sidebar.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                sidebar.setBounds(0, 0, 400, SBframeHeight);
            
                S.setVisible(false);
                E.setVisible(false);
                C.setVisible(false);
                T.setVisible(false);
                I.setVisible(false);
                O.setVisible(false);
                N.setVisible(false);

        }

        public void mouseExited(MouseEvent e) {
            sidebar.setBounds(0, 0, 100, SBframeHeight);
                
                S.setVisible(true);
                E.setVisible(true);
                C.setVisible(true);
                T.setVisible(true);
                I.setVisible(true);
                O.setVisible(true);
                N.setVisible(true);
        }
});
        //di ko malagay sa gitna eh, kaya isesetbound nalang natin
        recitationButton.setBounds((frameWidth - 350) / 2, (frameHeight + 75) / 2, 350, 55);
        attendanceButton.setBounds((frameWidth - 350) / 2, (frameHeight + 75) / 2 + 75, 350, 55);
        analyticsButton.setBounds((frameWidth - 350) / 2, (frameHeight + 75) / 2 + 150, 350, 55);
        exitButton.setBounds((frameWidth - 350) / 2, (frameHeight + 75) / 2 + 225, 350, 55);

        //functions ng buttons
        recitationButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JFrame recitationFrame = new JFrame("Recitation Frame");

                frame.setVisible(false);
                
                //full screen
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension screenSize = toolkit.getScreenSize();
                recitationFrame.setSize(screenSize.width, screenSize.height);
                recitationFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                recitationFrame.setUndecorated(true);
                recitationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                recitationFrame.setVisible(true);

                JLabel recitation = new JLabel("Recitation");
                recitation.setBounds(0, 100, frameWidth, 50);
                recitation.setFont(new Font("Courier new", Font.BOLD, 38));
                recitation.setHorizontalAlignment(JLabel.CENTER);
                recitation.setForeground(Color.BLACK);
                recitationFrame.add(recitation);

                JLabel line = new JLabel("_______________________");
                line.setBounds(0, 101, frameWidth, 50);
                line.setFont(new Font("Courier new", Font.BOLD, 38));
                line.setHorizontalAlignment(JLabel.CENTER);
                line.setForeground(Color.BLACK);
                recitationFrame.add(line);

                JLabel exampleSection = new JLabel("ICTE101A");
                exampleSection.setForeground(Color.BLACK);
                exampleSection.setVisible(true);
                exampleSection.setBounds(0, 140, frameWidth, 50);
                exampleSection.setHorizontalAlignment(JLabel.CENTER);
                exampleSection.setFont(new Font("Courier new", Font.BOLD, 38));
                recitationFrame.add(exampleSection);

                //sidebar naman to
                JPanel recitationSidebar = new JPanel();
                recitationSidebar.setPreferredSize(new Dimension(100, 0));
                recitationFrame.add(sidebar);
                int SBframeWidth = screenSize.width;
                int SBframeHeight = screenSize.height;
                recitationSidebar.setBounds(0, 0, 100, SBframeHeight);
                recitationSidebar.setBackground(new Color(0x5F7470));//color of sidebar
                recitationSidebar.addMouseListener(new MouseAdapter() {//hovering function
                    public void mouseEntered(MouseEvent e) {
                        recitationSidebar.setBounds(0, 0, 400, SBframeHeight);
                }
                public void mouseExited(MouseEvent e) {
                    recitationSidebar.setBounds(0, 0, 100, SBframeHeight);
                }
        });
                //buttons
                JButton backButton = new JButton("Back");
                recitationFrame.add(backButton);            
                //BG Color
                recitationFrame.getContentPane().setBackground(new Color(0xE5E5E5));
                recitationFrame.setLayout(null);
                
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

                JLabel attendance = new JLabel("Attendance");
                attendance.setBounds(0, 100, frameWidth, 50);
                attendance.setFont(new Font("Courier new", Font.BOLD, 38));
                attendance.setHorizontalAlignment(JLabel.CENTER);
                attendance.setForeground(Color.BLACK);
                attendanceFrame.add(attendance);

                JLabel line = new JLabel("_______________________");
                line.setBounds(0, 101, frameWidth, 50);
                line.setFont(new Font("Courier new", Font.BOLD, 38));
                line.setHorizontalAlignment(JLabel.CENTER);
                line.setForeground(Color.BLACK);
                attendanceFrame.add(line);

                JLabel exampleSection = new JLabel("ICTE101A");
                exampleSection.setForeground(Color.BLACK);
                exampleSection.setVisible(true);
                exampleSection.setBounds(0, 140, frameWidth, 50);
                exampleSection.setHorizontalAlignment(JLabel.CENTER);
                exampleSection.setFont(new Font("Courier new", Font.BOLD, 38));
                attendanceFrame.add(exampleSection);            

                //sidebar naman to
                JPanel attendanceSidebar = new JPanel();
                attendanceSidebar.setPreferredSize(new Dimension(100, 0));
                attendanceFrame.add(sidebar);
                int SBframeWidth = screenSize.width;
                int SBframeHeight = screenSize.height;
                attendanceSidebar.setBounds(0, 0, 100, SBframeHeight);
                attendanceSidebar.setBackground(new Color(0x5F7470));//sidebar color
                attendanceSidebar.addMouseListener(new MouseAdapter() {//hovering function
                    public void mouseEntered(MouseEvent e) {
                        attendanceSidebar.setBounds(0, 0, 400, SBframeHeight);
                }

                public void mouseExited(MouseEvent e) {
                    attendanceSidebar.setBounds(0, 0, 100, SBframeHeight);
                }
        });
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
                
                JLabel analytics = new JLabel("Analytics");
                analytics.setBounds(0, 100, frameWidth, 50);
                analytics.setFont(new Font("Courier new", Font.BOLD, 38));
                analytics.setHorizontalAlignment(JLabel.CENTER);
                analytics.setForeground(Color.BLACK);
                analyticsFrame.add(analytics);

                JLabel line = new JLabel("_______________________");
                line.setBounds(0, 101, frameWidth, 50);
                line.setFont(new Font("Courier new", Font.BOLD, 38));
                line.setHorizontalAlignment(JLabel.CENTER);
                line.setForeground(Color.BLACK);
                analyticsFrame.add(line);

                JLabel exampleSection = new JLabel("ICTE101A");
                exampleSection.setForeground(Color.BLACK);
                exampleSection.setVisible(true);
                exampleSection.setBounds(0, 140, frameWidth, 50);
                exampleSection.setHorizontalAlignment(JLabel.CENTER);
                exampleSection.setFont(new Font("Courier new", Font.BOLD, 38));
                analyticsFrame.add(exampleSection);  
                
                //sidebar naman to
                JPanel analyticsSidebar = new JPanel();
                analyticsSidebar.setPreferredSize(new Dimension(100, 0));
                analyticsFrame.add(sidebar);
                int SBframeWidth = screenSize.width;
                int SBframeHeight = screenSize.height;
                analyticsSidebar.setBounds(0, 0, 100, SBframeHeight);
                analyticsSidebar.setBackground(new Color(0x5F7470));//color of the sidebar
                analyticsSidebar.addMouseListener(new MouseAdapter() {//hovering function
                    public void mouseEntered(MouseEvent e) {
                        analyticsSidebar.setBounds(0, 0, 400, SBframeHeight);
                }
                public void mouseExited(MouseEvent e) {
                    analyticsSidebar.setBounds(0, 0, 100, SBframeHeight);
                }
        });
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

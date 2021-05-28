package main;

import function.FileChooser;
import function.FontLoader;
import function.Method;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.ConnectException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;

public class Login extends javax.swing.JFrame
{
    private static final long serialVersionUID = 5455364458445364L;
    
    public Login()
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //will set the default installed l&F as windows Native
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(ChatConsole.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        initComponentsNew();
        open();
    }
    
    private void open()
    {
        //Title icon
        setIconImage(new ImageIcon(getClass().getResource("/Icons/icon.png")).getImage());
        Method.setTextFieldStyle(UserNameField, "Username");
        Method.setTextFieldStyle(IpField, "IP Address");
        Method.setTextFieldStyle(PortField, "Port Number");
        showStatus(ms);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        UserNameField = new javax.swing.JTextField();
        IpField = new javax.swing.JTextField();
        PortField = new javax.swing.JTextField();
        ConnectBtn = new SwingCustom.Button();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        errorStatus = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Socketty Connect");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        UserNameField.setBackground(new java.awt.Color(204, 204, 204));
        UserNameField.setFont(FontLoader.getConsolasFont().deriveFont(1, 16f));
        UserNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserNameField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        UserNameField.setSelectionColor(new java.awt.Color(131, 188, 227));
        UserNameField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                UserNameFieldKeyTyped(evt);
            }
        });

        IpField.setBackground(new java.awt.Color(204, 204, 204));
        IpField.setFont(FontLoader.getConsolasFont().deriveFont(1, 16f));
        IpField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IpField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        IpField.setSelectionColor(new java.awt.Color(131, 188, 227));
        IpField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                IpFieldKeyTyped(evt);
            }
        });

        PortField.setBackground(new java.awt.Color(204, 204, 204));
        PortField.setFont(FontLoader.getConsolasFont().deriveFont(1, 16f));
        PortField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PortField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        PortField.setSelectionColor(new java.awt.Color(131, 188, 227));

        ConnectBtn.setBackground(new java.awt.Color(101, 167, 232));
        ConnectBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConnectBtn.setText("Connect");
        ConnectBtn.setColorClick(new java.awt.Color(152, 196, 239));
        ConnectBtn.setColorOver(new java.awt.Color(31, 121, 208));
        ConnectBtn.setFillBorder(20);
        ConnectBtn.setFocusable(false);
        ConnectBtn.setFont(FontLoader.getSans_Serif_Font().deriveFont(1, 13f));
        ConnectBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConnectBtnActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        errorStatus.setFont(FontLoader.getKhmer_Font());
        errorStatus.setForeground(new java.awt.Color(204, 0, 0));
        errorStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/profile.png"))); // NOI18N
        profile.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                profileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(profile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(errorStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IpField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PortField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(ConnectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile))
                .addGap(18, 18, 18)
                .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IpField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PortField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(ConnectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(errorStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsNew()
    {
        SystemTray = SystemTray.getSystemTray();
        PopupMenu = new PopupMenu();
        showItem = new MenuItem("Socketty's Client");
        showItem.setFont(FontLoader.getSans_Serif_Font().deriveFont(0, 11f));
        exitItem = new MenuItem("Exit");
        exitItem.setFont(FontLoader.getSans_Serif_Font().deriveFont(0, 11f));
        URL url = getClass().getResource("/Icons/tray_icon.png");
        ico = Toolkit.getDefaultToolkit().getImage(url);
        trayIcon = new TrayIcon(ico, "Socketty Connector", PopupMenu);
        //adjust to default size as per system recommendation
        trayIcon.setImageAutoSize(true);
        PopupMenu.add(showItem);
        PopupMenu.addSeparator();
        PopupMenu.add(exitItem);
        
        showItem.addActionListener((java.awt.event.ActionEvent evt) ->
        {
            showItemActionPerformed(evt);
        });
        
        exitItem.addActionListener((ActionEvent evt) ->
        {
            exitItemActionPerformed(evt);
        });
        try
        {
            SystemTray.add(trayIcon);
        }
        catch(AWTException e)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void showItemActionPerformed(ActionEvent evt)
    {
        this.setVisible(true);
        this.revalidate();
    }
    
    private void exitItemActionPerformed(ActionEvent evt)
    {
        this.setVisible(true);
        this.setVisible(true);
        System.exit(0);
    }

    private void ConnectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectBtnActionPerformed
        try
        {
            
            String IpValidator = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
            Pattern ptrn = Pattern.compile(IpValidator);
            String ipv4 = IpField.getText();
            Matcher mtch = ptrn.matcher(ipv4);
            boolean isValidated, isValidName, isValidPort, isValidIP;
            isValidated = isValidPort = isValidName = isValidIP = false;
            int port = 0;
            if(UserNameField.getText().isEmpty() || !UserNameField.getName().equals("have"))
            {
                isValidated = false;
                UserNameField.grabFocus();
                showStatus("Please input your Username");
            }
            if(!PortField.getText().isEmpty())
            {
                if(PortField.getText().trim().matches("^\\d+$"))
                {
                    isValidPort = true;
                    port = Integer.parseInt(PortField.getText());
                }
                else
                {
                    isValidPort = false;
                    PortField.grabFocus();
                    System.out.println("Wrong Value for Port");
                    showStatus("Port can only be an Integer Number !");
                }
            }
            
            if((port < 10) || (port >= 65536))
            {
                isValidPort = false;
                showStatus("Port not in Range (10 - 65535)");
                PortField.grabFocus();
            }
            
            if((!IpField.getText().toLowerCase().trim().equals("localhost")) || (!mtch.matches()))
            {
                isValidIP = false;
                IpField.grabFocus();
            }
            
            if(UserNameField.getText().trim().length() > 15)
            {
                isValidName = false;
                UserNameField.grabFocus();
                showStatus("Username must less than 15 characters");
            }
            if(UserNameField.getText().trim().length() < 15)
            {
                isValidName = true;
            }
            if(UserNameField.getText().isEmpty())
            {
                showStatus("Name can't be left Empty");
            }
            
            if(port > 10 && port < 65536)//in range function (checking after being in the memory first)
            {
                if((IpField.getText().toLowerCase().trim().equals("localhost")) || (mtch.matches()))
                {
                    isValidIP = true;
                    System.out.println("IP and port are both valid !");
                }
                else if(IpField.getText().isEmpty())
                {
                    showStatus("IP address can't be left Empty");
                }
                else if(isValidIP == false)
                {
                    isValidIP = false;
                    IpField.grabFocus();
                    showStatus("Malformed IP address Entered !");
                }
                isValidPort = true;
            }
            if(isValidPort == true && isValidName == true && isValidIP == true)
            {
                isValidated = true;
                System.out.println("Everthing is perfect mate");
            }
            if(isValidated == true)
            {
                Method.connect(profile_pic, UserNameField.getText().trim(), IpField.getText().trim(), port);
                this.dispose();
                SystemTray.remove(trayIcon);
                ChatConsole.main(null);
            }
        }
        catch(UnknownHostException | java.rmi.UnknownHostException e)
        {
            showStatus("Unknown host : " + IpField.getText() + "@" + PortField.getText());
        }
        catch(ConnectException | java.rmi.ConnectException e)
        {
            showStatus("Server not found");
        }
        catch(NumberFormatException e)
        {
            showStatus("Value not an instanceof Integer");
        }
        catch(Exception e)
        {
            showStatus("Network is currently unreachable");
            System.out.println("Exception caught already (Status label is displayed the error already)");
            Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_ConnectBtnActionPerformed

    private void UserNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameFieldKeyTyped
        if(evt.getKeyChar() == 10)
        {
            IpField.grabFocus();
        }
        if(UserNameField.getText().trim().length() >= 15)
        {
            evt.consume();
        }
    }//GEN-LAST:event_UserNameFieldKeyTyped

    private void IpFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IpFieldKeyTyped
        if(evt.getKeyChar() == 10)
        {
            ConnectBtnActionPerformed(null);
        }
    }//GEN-LAST:event_IpFieldKeyTyped

    private void profileMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_profileMouseClicked
    {//GEN-HEADEREND:event_profileMouseClicked
        if(evt.getClickCount() == 1 && SwingUtilities.isLeftMouseButton(evt))
        {
            JFileChooser fileChooser = new JFileChooser();
            FileChooser preview = new FileChooser();
            fileChooser.setAccessory(preview);
            fileChooser.addPropertyChangeListener(preview);
            fileChooser.setFileFilter(new FileFilter()
            {
                @Override
                public boolean accept(File file)
                {
                    String name = file.getName();
                    return file.isDirectory() || name.endsWith(".png") || name.endsWith(".PNG") || name.endsWith("jpg") || name.endsWith("JPG");
                }
                
                @Override
                public String getDescription()
                {
                    return "png,jpg";
                }
            });
            int selectedValue = fileChooser.showOpenDialog(this);
            if(selectedValue == JFileChooser.APPROVE_OPTION)
            {
                ImageIcon image = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
                Image img;
                if(image.getIconWidth() > image.getIconHeight())
                {
                    img = image.getImage().getScaledInstance(100, -1, Image.SCALE_SMOOTH);
                }
                else
                {
                    img = image.getImage().getScaledInstance(-1, 100, Image.SCALE_SMOOTH);
                }
                profile_pic = new ImageIcon(img);
                profile.setIcon(profile_pic);
            }
        }
    }//GEN-LAST:event_profileMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        if(!SystemTray.isSupported())
        {
            System.exit(0);
        }
        if(SystemTray.isSupported())
        {
            this.setVisible(false);
        }
    }//GEN-LAST:event_formWindowClosing
    
    private ImageIcon profile_pic;
    private Timer timer = new Timer(5000, new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            errorStatus.setText("");
            timer.stop();
        }
    });
    
    private void showStatus(String errorData)
    {
        if(timer.isRunning())
        {
            errorStatus.setText("");
            timer.stop();
        }
        timer.start();
        errorStatus.setText(errorData);
    }
    
    private static String ms = "";
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() ->
        {
            if(args.length == 1)
            {
                ms = args[0];
            }
            new Login().setVisible(true);
        });
    }
    private SystemTray SystemTray;
    private PopupMenu PopupMenu;
    private MenuItem showItem;
    private MenuItem exitItem;
    private Image ico;
    private TrayIcon trayIcon;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingCustom.Button ConnectBtn;
    private javax.swing.JTextField IpField;
    private javax.swing.JTextField PortField;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel errorStatus;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}

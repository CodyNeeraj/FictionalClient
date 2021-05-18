package main;

import function.FileChooser;
import function.Method;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;

public class Login extends javax.swing.JFrame
{

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
        open();
    }

    private void open()
    {
        //Title icon
        setIconImage(new ImageIcon(getClass().getResource("/icon/icon.png")).getImage());
        Method.setTextFieldStyle(UserNameField, "User Name");
        Method.setTextFieldStyle(IpField, "IP Address");
        showStatus(ms);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        UserNameField = new javax.swing.JTextField();
        IpField = new javax.swing.JTextField();
        ConnectBtn = new SwingCustom.Button();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        profile = new javax.swing.JLabel();
        errorStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        UserNameField.setBackground(new java.awt.Color(204, 204, 204));
        UserNameField.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 18)); // NOI18N
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
        IpField.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 18)); // NOI18N
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

        ConnectBtn.setBackground(new java.awt.Color(101, 167, 232));
        ConnectBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConnectBtn.setText("Connect");
        ConnectBtn.setColorClick(new java.awt.Color(152, 196, 239));
        ConnectBtn.setColorOver(new java.awt.Color(31, 121, 208));
        ConnectBtn.setFillBorder(20);
        ConnectBtn.setFocusable(false);
        ConnectBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ConnectBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConnectBtnActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profile.png"))); // NOI18N
        profile.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                profileMouseClicked(evt);
            }
        });
        jLayeredPane1.add(profile);

        errorStatus.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 14)); // NOI18N
        errorStatus.setForeground(new java.awt.Color(204, 0, 0));
        errorStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errorStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IpField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(ConnectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IpField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConnectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConnectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectBtnActionPerformed
        try
        {
            if(UserNameField.getText().equals("") || !UserNameField.getName().equals("have"))
            {
                UserNameField.grabFocus();
                showStatus("Please input your user name");
            }
            else
            {
                if(UserNameField.getText().trim().length() > 15)
                {
                    UserNameField.grabFocus();
                    showStatus("User name must less than 15 character");
                }
                else
                {
                    String IP = IpField.getText().trim();
                    if(IpField.getText().equals("") || !IpField.getName().equals("have"))
                    {
                        IP = "localhost";
                        System.err.println("have");
                    }
                    String userName = UserNameField.getText().trim();
                    Method.connect(profile_pic, userName, IP);
                    this.dispose();
                    ChatConsole.main(null);
                }

            }
        }
        catch(UnknownHostException | java.rmi.UnknownHostException e)
        {
            showStatus("Unknown host : " + IpField.getText());
        }
        catch(ConnectException | java.rmi.ConnectException e)
        {
            showStatus("Server not found");
        }
        catch(Exception e)
        {
            showStatus("Network is unreachable : connect");
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SwingCustom.Button ConnectBtn;
    private javax.swing.JTextField IpField;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel errorStatus;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}

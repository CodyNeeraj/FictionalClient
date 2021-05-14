package main;

import SwingCustom.Emoji;
import SwingCustom.Emoji_Group;
import SwingCustom.Friend_Box;
import SwingCustom.Get_Box;
import SwingCustom.Get_Box_New;
import SwingCustom.Get_Emoji;
import SwingCustom.Get_Emoji_New;
import SwingCustom.Get_File;
import SwingCustom.Get_File_New;
import SwingCustom.Get_Photo_Box;
import SwingCustom.Get_Photo_Box_New;
import SwingCustom.Get_Sound;
import SwingCustom.Get_Sound_New;
import SwingCustom.Send_Box;
import SwingCustom.Send_Box_New;
import SwingCustom.Send_Emoji;
import SwingCustom.Send_Emoji_New;
import SwingCustom.Send_File;
import SwingCustom.Send_File_New;
import SwingCustom.Send_Photo_Box;
import SwingCustom.Send_Photo_Box_New;
import SwingCustom.Send_Sound;
import SwingCustom.Send_Sound_New;
import function.FileChooser;
import function.Method;
import function.Scrolling;
import java.awt.Adjustable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;
import message.Message;

public class ChatConsole extends javax.swing.JFrame
{
    private static final long serialVersionUID = 1L;

    public ChatConsole()
    {
        try
        {
            //will set the default installed l&F as windows Native
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
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
        setIconImage(new ImageIcon(getClass().getResource("/icon/icon.png")).getImage());
        popUp.add(panel);
        popUp_emoji.add(panel_emoji);
        popMix.add(panelMix);
        popMix.setBackground(new Color(0, 0, 0, 0));
        Method.setFram(this);
        new Scrolling(panelChat);
        new Scrolling(panelFriend);
        Method.setTextFieldStyle(txt, " Type a message here ...");
        for(int i = 0; i < 10; i++)
        {
            cmdSendActionPerformed(null);
        }
        Emoji_Group eg1 = new Emoji_Group("emoji_green.png", 28);
        eg1.setName("emoji_green");
        eg1.addActionListener((ActionEvent ae) ->
        {
            setEmoji(eg1);
        });
        panelGroup.add(eg1);
        Emoji_Group eg2 = new Emoji_Group("emoji_yellow.png", 28);
        eg2.setName("emoji_yellow");
        eg2.addActionListener((ActionEvent ae) ->
        {
            panelEmoji.removeAll();
            for(int i = 1; i <= eg2.getIcons(); i++)
            {
                Emoji emo = new Emoji(eg2.getName() + " (" + i + ").png");
                emo.addActionListener((ActionEvent ae1) ->
                {
                    setEmoji(emo.getName());
                });
                panelEmoji.add(emo);
            }
            panelEmoji.revalidate();
            panelEmoji.repaint();
        });
        panelGroup.add(eg2);
        setEmoji(eg1);
    }

    @SuppressWarnings(
            {
                "unchecked"
            })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        popUp = new javax.swing.JPopupMenu();
        panel = new SwingCustom.Panel();
        cmdPhoto = new SwingCustom.Button();
        cmdEmoji = new SwingCustom.Button();
        cmdFile = new SwingCustom.Button();
        cmdAudio = new SwingCustom.Button();
        popUp_emoji = new javax.swing.JPopupMenu();
        panel_emoji = new SwingCustom.Panel();
        panel1 = new SwingCustom.Panel();
        panelEmoji = new javax.swing.JLayeredPane();
        spGroup = new javax.swing.JScrollPane();
        panelGroup = new javax.swing.JPanel();
        popMix = new javax.swing.JPopupMenu();
        panelMix = new SwingCustom.Panel();
        panel2 = new SwingCustom.Panel();
        cmdMix = new javax.swing.JButton();
        panel_bg = new javax.swing.JPanel();
        spChat = new javax.swing.JScrollPane();
        panelChat = new javax.swing.JDesktopPane()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        spFriend = new javax.swing.JScrollPane();
        panelFriend = new javax.swing.JPanel();
        txt = new javax.swing.JTextField()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(new Color(195, 191, 191));
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 0, 0);
            }
        };
        cmdSend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdMore = new javax.swing.JButton();
        cmdLogOut = new SwingCustom.Button();
        lbStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ServerAddress = new javax.swing.JLabel();
        myname = new javax.swing.JLabel();
        date_now = new javax.swing.JLabel();
        uptimeLbl = new javax.swing.JLabel();
        time_now = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        popUp.setBackground(new java.awt.Color(0,0,0,0));

        panel.setBackground(new java.awt.Color(255, 255, 255));

        cmdPhoto.setBackground(new java.awt.Color(255, 255, 255));
        cmdPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/photo.png"))); // NOI18N
        cmdPhoto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/photo_pressed.png"))); // NOI18N
        cmdPhoto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdPhotoActionPerformed(evt);
            }
        });

        cmdEmoji.setBackground(new java.awt.Color(255, 255, 255));
        cmdEmoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emoji.png"))); // NOI18N
        cmdEmoji.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emoji_pressed.png"))); // NOI18N
        cmdEmoji.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdEmojiActionPerformed(evt);
            }
        });

        cmdFile.setBackground(new java.awt.Color(255, 255, 255));
        cmdFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file.png"))); // NOI18N
        cmdFile.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file_pressed.png"))); // NOI18N
        cmdFile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdFileActionPerformed(evt);
            }
        });

        cmdAudio.setBackground(new java.awt.Color(255, 255, 255));
        cmdAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/microphone.png"))); // NOI18N
        cmdAudio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/microphone_pressed.png"))); // NOI18N
        cmdAudio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdAudioActionPerformed(evt);
            }
        });

        panel.setLayer(cmdPhoto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(cmdEmoji, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(cmdFile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(cmdAudio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout panelLayout = new org.jdesktop.layout.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(cmdFile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, cmdPhoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(cmdEmoji, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cmdAudio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(cmdPhoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cmdEmoji, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cmdFile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cmdAudio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        popUp_emoji.setBackground(new java.awt.Color(0,0,0,0));
        popUp_emoji.setMaximumSize(new java.awt.Dimension(504, 355));
        popUp_emoji.setMinimumSize(new java.awt.Dimension(504, 355));
        popUp_emoji.setPreferredSize(new java.awt.Dimension(504, 355));

        panel_emoji.setBackground(new java.awt.Color(153, 153, 153));
        panel_emoji.setMaximumSize(new java.awt.Dimension(502, 349));
        panel_emoji.setMinimumSize(new java.awt.Dimension(502, 349));

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        panelEmoji.setMaximumSize(new java.awt.Dimension(488, 291));
        panelEmoji.setMinimumSize(new java.awt.Dimension(488, 291));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        panelEmoji.setLayout(flowLayout1);

        spGroup.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spGroup.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelGroup.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0);
        flowLayout2.setAlignOnBaseline(true);
        panelGroup.setLayout(flowLayout2);
        spGroup.setViewportView(panelGroup);

        panel1.setLayer(panelEmoji, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel1.setLayer(spGroup, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout panel1Layout = new org.jdesktop.layout.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(spGroup)
                    .add(panelEmoji, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(spGroup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelEmoji, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_emoji.setLayer(panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout panel_emojiLayout = new org.jdesktop.layout.GroupLayout(panel_emoji);
        panel_emoji.setLayout(panel_emojiLayout);
        panel_emojiLayout.setHorizontalGroup(
            panel_emojiLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_emojiLayout.createSequentialGroup()
                .add(1, 1, 1)
                .add(panel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(1, 1, 1))
        );
        panel_emojiLayout.setVerticalGroup(
            panel_emojiLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_emojiLayout.createSequentialGroup()
                .add(1, 1, 1)
                .add(panel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(1, 1, 1))
        );

        popUp.setBackground(new java.awt.Color(0,0,0,0));

        panelMix.setBackground(new java.awt.Color(102, 102, 102));

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        cmdMix.setBackground(new java.awt.Color(242, 67, 67));
        cmdMix.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        cmdMix.setForeground(new java.awt.Color(255, 255, 255));
        cmdMix.setText("Start");
        cmdMix.setContentAreaFilled(false);
        cmdMix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdMix.setOpaque(true);
        cmdMix.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                cmdMixMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                cmdMixMouseReleased(evt);
            }
        });
        cmdMix.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdMixActionPerformed(evt);
            }
        });

        panel2.setLayer(cmdMix, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout panel2Layout = new org.jdesktop.layout.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(cmdMix, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(cmdMix, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMix.setLayer(panel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout panelMixLayout = new org.jdesktop.layout.GroupLayout(panelMix);
        panelMix.setLayout(panelMixLayout);
        panelMixLayout.setHorizontalGroup(
            panelMixLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelMixLayout.createSequentialGroup()
                .add(1, 1, 1)
                .add(panel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(1, 1, 1))
        );
        panelMixLayout.setVerticalGroup(
            panelMixLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelMixLayout.createSequentialGroup()
                .add(1, 1, 1)
                .add(panel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(1, 1, 1))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CodyNeeraj's Socketty Client");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        panel_bg.setBackground(new java.awt.Color(255, 255, 255));

        spChat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        spChat.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spChat.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelChat.setBackground(new java.awt.Color(255, 255, 255));
        panelChat.setLayout(new javax.swing.BoxLayout(panelChat, javax.swing.BoxLayout.Y_AXIS));
        spChat.setViewportView(panelChat);

        spFriend.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        spFriend.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spFriend.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelFriend.setBackground(new java.awt.Color(255, 255, 255));
        panelFriend.setPreferredSize(new java.awt.Dimension(0, 0));
        panelFriend.setLayout(new javax.swing.BoxLayout(panelFriend, javax.swing.BoxLayout.Y_AXIS));
        spFriend.setViewportView(panelFriend);

        txt.setFont(new java.awt.Font("Khmer UI", 0, 14)); // NOI18N
        txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txt.setSelectionColor(new java.awt.Color(131, 188, 227));
        txt.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtKeyTyped(evt);
            }
        });

        cmdSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/send.png"))); // NOI18N
        cmdSend.setBorder(null);
        cmdSend.setContentAreaFilled(false);
        cmdSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdSend.setFocusable(false);
        cmdSend.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/send_click.png"))); // NOI18N
        cmdSend.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdSendActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(62, 62, 62));
        jLabel1.setText("Participants");
        jLabel1.setFocusCycleRoot(true);

        jLabel2.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(62, 62, 62));
        jLabel2.setText("Chat");

        cmdMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/more.png"))); // NOI18N
        cmdMore.setBorder(null);
        cmdMore.setContentAreaFilled(false);
        cmdMore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdMore.setFocusable(false);
        cmdMore.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/more_pressed.png"))); // NOI18N
        cmdMore.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdMoreActionPerformed(evt);
            }
        });

        cmdLogOut.setBackground(new java.awt.Color(255, 255, 255));
        cmdLogOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        cmdLogOut.setForeground(new java.awt.Color(62, 62, 62));
        cmdLogOut.setColorClick(new java.awt.Color(255, 255, 255));
        cmdLogOut.setColorOver(new java.awt.Color(243, 243, 243));
        cmdLogOut.setFocusable(false);
        cmdLogOut.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        cmdLogOut.setLabel("Logout");
        cmdLogOut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdLogOutActionPerformed(evt);
            }
        });

        lbStatus.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(62, 62, 62));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel3.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 62, 62));
        jLabel3.setText("Connected with  :");
        jLabel3.setFocusCycleRoot(true);

        jLabel4.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 62, 62));
        jLabel4.setText("NickName :");
        jLabel4.setFocusCycleRoot(true);

        jLabel5.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(62, 62, 62));
        jLabel5.setText("Date :");
        jLabel5.setFocusCycleRoot(true);

        jLabel6.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 62, 62));
        jLabel6.setText("Connected Since :");
        jLabel6.setFocusCycleRoot(true);

        ServerAddress.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        ServerAddress.setForeground(new java.awt.Color(62, 62, 62));
        ServerAddress.setText("Server IP wit port");
        ServerAddress.setFocusCycleRoot(true);
        ServerAddress.addAncestorListener(new javax.swing.event.AncestorListener()
        {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt)
            {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt)
            {
                ServerAddressAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt)
            {
            }
        });

        myname.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        myname.setForeground(new java.awt.Color(62, 62, 62));
        myname.setText("Your entered name");
        myname.setFocusCycleRoot(true);
        myname.addAncestorListener(new javax.swing.event.AncestorListener()
        {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt)
            {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt)
            {
                mynameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt)
            {
            }
        });

        date_now.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        date_now.setForeground(new java.awt.Color(0, 0, 255));
        date_now.setText("null");
        date_now.setFocusCycleRoot(true);
        date_now.addAncestorListener(new javax.swing.event.AncestorListener()
        {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt)
            {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt)
            {
                date_nowAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt)
            {
            }
        });

        uptimeLbl.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        uptimeLbl.setForeground(new java.awt.Color(0, 0, 255));
        uptimeLbl.setText("null");
        uptimeLbl.setFocusCycleRoot(true);
        uptimeLbl.addAncestorListener(new javax.swing.event.AncestorListener()
        {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt)
            {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt)
            {
                uptimeLblAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt)
            {
            }
        });

        time_now.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        time_now.setForeground(new java.awt.Color(0, 0, 255));
        time_now.setText("null");
        time_now.setFocusCycleRoot(true);

        jLabel9.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(62, 62, 62));
        jLabel9.setText("Time :");
        jLabel9.setFocusCycleRoot(true);

        org.jdesktop.layout.GroupLayout panel_bgLayout = new org.jdesktop.layout.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_bgLayout.createSequentialGroup()
                .addContainerGap()
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(spFriend)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(panel_bgLayout.createSequentialGroup()
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel6)
                            .add(jLabel3))
                        .add(18, 18, 18)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(panel_bgLayout.createSequentialGroup()
                                .add(ServerAddress)
                                .add(0, 1, Short.MAX_VALUE))
                            .add(uptimeLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, cmdLogOut, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(8, 8, 8)
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(spChat)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panel_bgLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(panel_bgLayout.createSequentialGroup()
                                .add(jLabel5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(date_now, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(time_now, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(panel_bgLayout.createSequentialGroup()
                                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(26, 26, 26)
                                .add(myname)))
                        .add(32, 32, 32))
                    .add(panel_bgLayout.createSequentialGroup()
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(panel_bgLayout.createSequentialGroup()
                                .add(txt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 539, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(cmdMore)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(cmdSend, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(panel_bgLayout.createSequentialGroup()
                                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 309, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, 0)
                                .add(lbStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 244, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_bgLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, date_now, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel3)
                        .add(ServerAddress)
                        .add(time_now)
                        .add(jLabel9)
                        .add(jLabel5)))
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(panel_bgLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel6)
                            .add(uptimeLbl))
                        .add(0, 4, Short.MAX_VALUE)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(jLabel2)))
                    .add(panel_bgLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(myname))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lbStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(spFriend, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 412, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(spChat, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 8, Short.MAX_VALUE)
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txt)
                    .add(cmdMore, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(cmdSend, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(cmdLogOut, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_bg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(panel_bg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setEmoji(Emoji_Group eg1)
    {
        panelEmoji.removeAll();
        for(int i = 1; i <= eg1.getIcons(); i++)
        {
            Emoji emo = new Emoji(eg1.getName() + " (" + i + ").png");
            emo.addActionListener((ActionEvent ae) ->
            {
                setEmoji(emo.getName());
            });
            panelEmoji.add(emo);
        }
        panelEmoji.revalidate();
        panelEmoji.repaint();
    }
    private void cmdSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSendActionPerformed
        if(txt.getName().equals("have") && !txt.getText().equals(""))
        {
            try
            {
                Method.sendMessage(txt.getText().trim());
                txt.setText("");
                txt.grabFocus();
            }
            catch(Exception e)
            {
            }
        }
    }//GEN-LAST:event_cmdSendActionPerformed

    private void cmdMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMoreActionPerformed
        popUp.show(cmdMore, -10, -155);
    }//GEN-LAST:event_cmdMoreActionPerformed

    private void txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyTyped
        if(evt.getKeyChar() == 10)
        {
            cmdSendActionPerformed(null);
        }
    }//GEN-LAST:event_txtKeyTyped

    private Thread th;
    private int currentID = 0;

    private void start()
    {
        th = new Thread(() ->
        {
            try
            {
                while(true)
                {
                    System.out.println("waiting message ...");
                    Message ms = (Message) Method.getIn().readObject();
                    String status = ms.getStatus();
                    switch(status)
                    {
                        case "Message":
                            getMessage(ms.getID(), ms.getMessage());
                            break;
                        case "New":
                            newFriend(ms.getImage(), ms.getID(), ms.getName().split("!")[0], ms.getName().split("!")[1]);
                            break;
                        case "Photo":
                            getPhoto(ms.getID(), ms.getImage());
                            break;
                        case "File":
                            getFile(ms.getID(), ms.getName(), ms.getImage());
                            break;
                        case "Error":
                            errorFrient(ms.getID());
                            break;
                        case "Emoji":
                            getEmoji(ms.getID(), ms.getMessage());
                            break;
                        case "GetFile":
                            download(ms);
                            break;
                        case "Sound":
                            getSound(ms.getID(), ms.getData(), ms.getMessage());
                            break;
                        default:
                            break;
                    }
                }
            }
            catch(Exception e)
            {
                String ms = e.getMessage();
                switch(ms)
                {
                    case "Socket closed":
                        signOut("Sign out");
                        break;
                    case "Connection reset":
                        signOut("Server has error");
                        break;
                    default:
                        signOut("Error : " + ms);
                        break;
                }
            }
        });
        th.start();
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        start();
    }//GEN-LAST:event_formWindowOpened

    private void cmdPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPhotoActionPerformed
        popUp.setVisible(false);
        setImage();
    }//GEN-LAST:event_cmdPhotoActionPerformed

    private void cmdEmojiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEmojiActionPerformed
        popUp.setVisible(false);
        popUp_emoji.show(txt, 5, -365);
    }//GEN-LAST:event_cmdEmojiActionPerformed

    private void cmdFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFileActionPerformed
        try
        {
            popUp.setVisible(false);
            setFile();
        }
        catch(Exception e)
        {
            showStatus("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_cmdFileActionPerformed

    private void cmdAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAudioActionPerformed
        popMix.show(txt, 170, -90);
    }//GEN-LAST:event_cmdAudioActionPerformed

    private void cmdMixMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdMixMousePressed
        cmdMix.setBackground(new Color(94, 197, 95));
        cmdMix.setText("Starting");
        Method.getRecoder().captureAudio();
    }//GEN-LAST:event_cmdMixMousePressed

    private void cmdMixMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdMixMouseReleased
        try
        {
            cmdMix.setBackground(new Color(242, 67, 67));
            cmdMix.setText("Start");
            Method.sendSound(Method.getRecoder().stop(), Method.getRecoder().getTime());
            popMix.setVisible(false);
        }
        catch(Exception e)
        {
            showStatus("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_cmdMixMouseReleased

    private void cmdLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogOutActionPerformed
        int c = JOptionPane.showConfirmDialog(this,
                "Are you sure to Sign out ?",
                "Session",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(c == JOptionPane.YES_OPTION)
        {
            try
            {
                Method.getClient().close();
            }
            catch(Exception e)
            {
                Logger.getLogger(ChatConsole.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_cmdLogOutActionPerformed

    private void cmdMixActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdMixActionPerformed
    {//GEN-HEADEREND:event_cmdMixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMixActionPerformed

    private void uptimeLblAncestorAdded(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_uptimeLblAncestorAdded
    {//GEN-HEADEREND:event_uptimeLblAncestorAdded
        RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
        Timer t1 = new Timer();
        TimerTask task = new TimerTask()
        {
            long hrs, mins, secs;
            int day;

            @Override
            public void run()
            {
                secs = rb.getUptime() / 1000;
//                hrs = TimeUnit.SECONDS.toHours(secs) - (day * 24);
//                mins = TimeUnit.SECONDS.toMinutes(secs) - (TimeUnit.SECONDS.toHours(secs) * 60);
//                // day = (int) TimeUnit.SECONDS.toDays(secs);
//                uptimeLbl.setText(new StringBuilder()
//                        .append(hrs)
//                        .append(":")
//                        .append(mins)
//                        .append(":")
//                        .append(secs).toString());

                int sec = (int) secs % 60;
                int min = (int) ((secs / 60) % 60);
                int hr = (int) ((secs / 60) / 60);
                uptimeLbl.setText(new StringBuilder()
                        .append(hr)
                        .append(":")
                        .append(min)
                        .append(":")
                        .append(sec).toString());
            }
        };
        t1.scheduleAtFixedRate(task, 0, 1000);
    }//GEN-LAST:event_uptimeLblAncestorAdded

    private void date_nowAncestorAdded(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_date_nowAncestorAdded
    {//GEN-HEADEREND:event_date_nowAncestorAdded
        date_now.setText(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDateTime.now()));
        Timer t2 = new Timer();
        TimerTask task = new TimerTask()
        {
            @Override
            public void run()
            {
                time_now.setText(DateTimeFormatter.ofPattern("hh:mm:ss a").format(LocalDateTime.now()));
            }
        };
        t2.scheduleAtFixedRate(task, 0, 1000);
    }//GEN-LAST:event_date_nowAncestorAdded

    private void mynameAncestorAdded(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_mynameAncestorAdded
    {//GEN-HEADEREND:event_mynameAncestorAdded
        myname.setText(Method.getMyName());
    }//GEN-LAST:event_mynameAncestorAdded

    private void ServerAddressAncestorAdded(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_ServerAddressAncestorAdded
    {//GEN-HEADEREND:event_ServerAddressAncestorAdded
        ServerAddress.setText(Method.getIP() + " : " + Method.getPort());;
    }//GEN-LAST:event_ServerAddressAncestorAdded

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        cmdLogOut.doClick();
    }//GEN-LAST:event_formWindowClosing

    private void signOut(String ms)
    {
        try
        {
            this.dispose();
            String[] v =
            {
                ms
            };
            Login.main(v);
        }
        catch(Exception e)
        {
            Logger.getLogger(ChatConsole.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void getMessage(int ID, String ms)
    {
        if(ID == Method.getMyID())
        {
            if(ID == currentID)
            {
                Send_Box box = new Send_Box();
                box.setMessage(ms);
                panelChat.add(box);
            }
            else
            {
                Send_Box_New box = new Send_Box_New();
                box.setMessage(ID, ms);
                panelChat.add(box);
            }
        }
        else
        {
            if(ID == currentID)
            {
                Get_Box box = new Get_Box();
                box.setMessage(ms);
                panelChat.add(box);
            }
            else
            {
                Get_Box_New box = new Get_Box_New();
                box.setMessage(ID, ms);
                panelChat.add(box);
            }
            playSound();
        }
        currentID = ID;
        refresh(panelChat);
        scrollToBottom(spChat);
    }

    private void getPhoto(int ID, ImageIcon image)
    {
        if(ID == Method.getMyID())
        {
            if(ID == currentID)
            {
                Send_Photo_Box box = new Send_Photo_Box();
                box.setPhoto(image);
                panelChat.add(box);
            }
            else
            {
                Send_Photo_Box_New box = new Send_Photo_Box_New();
                box.setPhoto(ID, image);
                panelChat.add(box);
            }
        }
        else
        {
            if(ID == currentID)
            {
                Get_Photo_Box box = new Get_Photo_Box();
                box.setPhoto(image);
                panelChat.add(box);
            }
            else
            {
                Get_Photo_Box_New box = new Get_Photo_Box_New();
                box.setPhoto(ID, image);
                panelChat.add(box);
            }
            playSound();
        }
        currentID = ID;
        refresh(panelChat);
        scrollToBottom(spChat);
    }

    private void getEmoji(int ID, String emoji)
    {
        if(ID == Method.getMyID())
        {
            if(ID == currentID)
            {
                Send_Emoji box = new Send_Emoji();
                box.setPhoto(emoji);
                panelChat.add(box);
            }
            else
            {
                Send_Emoji_New box = new Send_Emoji_New();
                box.setPhoto(ID, emoji);
                panelChat.add(box);
            }
        }
        else
        {
            if(ID == currentID)
            {
                Get_Emoji box = new Get_Emoji();
                box.setPhoto(emoji);
                panelChat.add(box);
            }
            else
            {
                Get_Emoji_New box = new Get_Emoji_New();
                box.setPhoto(ID, emoji);
                panelChat.add(box);
            }
            playSound();
        }
        currentID = ID;
        refresh(panelChat);
        scrollToBottom(spChat);
    }

    private void getFile(int ID, String ms, ImageIcon icon)
    {
        if(ID == Method.getMyID())
        {
            if(ID == currentID)
            {
                Send_File box = new Send_File();
                box.set(ms, icon);
                panelChat.add(box);
            }
            else
            {
                Send_File_New box = new Send_File_New();
                box.set(ID, ms, icon);
                panelChat.add(box);
            }
        }
        else
        {
            if(ID == currentID)
            {
                Get_File box = new Get_File();
                box.set(ms, icon);
                panelChat.add(box);
            }
            else
            {
                Get_File_New box = new Get_File_New();
                box.set(ID, ms, icon);
                panelChat.add(box);
            }
            playSound();
        }
        currentID = ID;
        refresh(panelChat);
        scrollToBottom(spChat);
    }

    private void getSound(int ID, byte[] sound, String time)
    {
        if(ID == Method.getMyID())
        {
            if(ID == currentID)
            {
                Send_Sound box = new Send_Sound();
                box.set(sound, time);
                panelChat.add(box);
            }
            else
            {
                Send_Sound_New box = new Send_Sound_New();
                box.set(ID, sound, time);
                panelChat.add(box);
            }
        }
        else
        {
            if(ID == currentID)
            {
                Get_Sound box = new Get_Sound();
                box.set(sound, time);
                panelChat.add(box);
            }
            else
            {
                Get_Sound_New box = new Get_Sound_New();
                box.set(ID, sound, time);
                panelChat.add(box);
            }
            playSound();
        }
        currentID = ID;
        refresh(panelChat);
        scrollToBottom(spChat);
    }

    private void download(Message ms)
    {
        try
        {
            File file = new File(ms.getName());
            try(FileOutputStream out = new FileOutputStream(file))
            {
                out.write(ms.getData());
            }
        }
        catch(Exception e)
        {
            showStatus("Error : can't download");
            Logger.getLogger(ChatConsole.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void newFriend(ImageIcon image, int ID, String name, String time)
    {
        Friend_Box friend = new Friend_Box();
        friend.set(image, ID, name, time);
        Method.getFriends().put(ID, friend);
        if(Method.getMyName().equalsIgnoreCase(name))
        {
            Method.setMyID(ID);
            friend.itMe();
        }
        panelFriend.add(friend);
        refresh(panelFriend);
    }

    private void errorFrient(int ID)
    {
        panelFriend.remove((Component) Method.getFriends().get(ID));
        Method.getFriends().remove(ID);
        refresh(panelFriend);
    }

    private void refresh(Component obj)
    {
        obj.revalidate();
        obj.repaint();
    }

    private void setImage()
    {
        JFileChooser ch = new JFileChooser();
        FileChooser preview = new FileChooser();
        ch.setAccessory(preview);
        ch.addPropertyChangeListener(preview);
        ch.setFileFilter(new FileFilter()
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
        int c = ch.showOpenDialog(this);
        if(c == JFileChooser.APPROVE_OPTION)
        {
            ImageIcon image = new ImageIcon(ch.getSelectedFile().getAbsolutePath());
            try
            {
                Method.sendPhoto(image);
            }
            catch(Exception e)
            {
                showStatus("Error : Can't send photo");
            }
        }
    }

    private void setFile() throws Exception
    {
        JFileChooser ch = new JFileChooser();
        FileChooser preview = new FileChooser();
        ch.setAccessory(preview);
        ch.addPropertyChangeListener(preview);
        int c = ch.showOpenDialog(this);
        if(c == JFileChooser.APPROVE_OPTION)
        {
            Method.sendFile(ch.getSelectedFile());
        }
    }

    private void scrollToBottom(JScrollPane scrollPane)
    {
        JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener()
        {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e)
            {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }

    private void setEmoji(String emoji)
    {
        try
        {
            Method.sendEmoji(emoji);
        }
        catch(Exception e)
        {
            showStatus("Error : " + e.getMessage());
        }
    }

    private void playSound()
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    URL url = this.getClass().getClassLoader().getResource("sound/sound.wav");
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                }
                catch(IOException | LineUnavailableException | UnsupportedAudioFileException e)
                {
                    Logger.getLogger(ChatConsole.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }).start();
    }
    private javax.swing.Timer timer = new javax.swing.Timer(5000, new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            lbStatus.setText("");
            timer.stop();
        }
    });

    private void showStatus(String error)
    {
        if(timer.isRunning())
        {
            lbStatus.setText("");
            timer.stop();
        }
        timer.start();
        lbStatus.setText(error);
    }

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() ->
        {
            new ChatConsole().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ServerAddress;
    private SwingCustom.Button cmdAudio;
    private SwingCustom.Button cmdEmoji;
    private SwingCustom.Button cmdFile;
    private SwingCustom.Button cmdLogOut;
    private javax.swing.JButton cmdMix;
    private javax.swing.JButton cmdMore;
    private SwingCustom.Button cmdPhoto;
    private javax.swing.JButton cmdSend;
    private javax.swing.JLabel date_now;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel myname;
    private SwingCustom.Panel panel;
    private SwingCustom.Panel panel1;
    private SwingCustom.Panel panel2;
    private javax.swing.JDesktopPane panelChat;
    private javax.swing.JLayeredPane panelEmoji;
    private javax.swing.JPanel panelFriend;
    private javax.swing.JPanel panelGroup;
    private SwingCustom.Panel panelMix;
    private javax.swing.JPanel panel_bg;
    private SwingCustom.Panel panel_emoji;
    private javax.swing.JPopupMenu popMix;
    private javax.swing.JPopupMenu popUp;
    private javax.swing.JPopupMenu popUp_emoji;
    private javax.swing.JScrollPane spChat;
    private javax.swing.JScrollPane spFriend;
    private javax.swing.JScrollPane spGroup;
    private javax.swing.JLabel time_now;
    private javax.swing.JTextField txt;
    private javax.swing.JLabel uptimeLbl;
    // End of variables declaration//GEN-END:variables
}

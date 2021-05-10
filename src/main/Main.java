package main;

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
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileFilter;
import message.Message;
import my_swing.Emoji;
import my_swing.Emoji_Group;
import my_swing.Friend_Box;
import my_swing.Get_Box;
import my_swing.Get_Box_New;
import my_swing.Get_Emoji;
import my_swing.Get_Emoji_New;
import my_swing.Get_File;
import my_swing.Get_File_New;
import my_swing.Get_Photo_Box;
import my_swing.Get_Photo_Box_New;
import my_swing.Get_Sound;
import my_swing.Get_Sound_New;
import my_swing.Send_Box;
import my_swing.Send_Box_New;
import my_swing.Send_Emoji;
import my_swing.Send_Emoji_New;
import my_swing.Send_File;
import my_swing.Send_File_New;
import my_swing.Send_Photo_Box;
import my_swing.Send_Photo_Box_New;
import my_swing.Send_Sound;
import my_swing.Send_Sound_New;

public class Main extends javax.swing.JFrame
{
    public Main()
    {
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
        Method.setTextFieldSyle(txt, "Type a message here ...");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        popUp = new javax.swing.JPopupMenu();
        popUp_emoji = new javax.swing.JPopupMenu();
        popMix = new javax.swing.JPopupMenu();
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
        cmdLogOut = new my_swing.Button();
        lbStatus = new javax.swing.JLabel();

        popUp.setBackground(new java.awt.Color(0,0,0,0));

        popUp_emoji.setBackground(new java.awt.Color(0,0,0,0));
        popUp_emoji.setMaximumSize(new java.awt.Dimension(504, 355));
        popUp_emoji.setMinimumSize(new java.awt.Dimension(504, 355));
        popUp_emoji.setPreferredSize(new java.awt.Dimension(504, 355));

        popUp.setBackground(new java.awt.Color(0,0,0,0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desi Client");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
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
        panelFriend.setLayout(new javax.swing.BoxLayout(panelFriend, javax.swing.BoxLayout.Y_AXIS));
        spFriend.setViewportView(panelFriend);

        txt.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 14)); // NOI18N
        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
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
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("List Friend");

        jLabel2.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Real Chat");

        cmdMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/more.png"))); // NOI18N
        cmdMore.setBorder(null);
        cmdMore.setContentAreaFilled(false);
        cmdMore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdMore.setFocusable(false);
        cmdMore.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/more_click.png"))); // NOI18N
        cmdMore.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdMoreActionPerformed(evt);
            }
        });

        cmdLogOut.setBackground(new java.awt.Color(255, 255, 255));
        cmdLogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmdLogOut.setForeground(new java.awt.Color(51, 51, 51));
        cmdLogOut.setText("Sign out");
        cmdLogOut.setColorClick(new java.awt.Color(255, 255, 255));
        cmdLogOut.setColorOver(new java.awt.Color(243, 243, 243));
        cmdLogOut.setFocusable(false);
        cmdLogOut.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 12)); // NOI18N
        cmdLogOut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdLogOutActionPerformed(evt);
            }
        });

        lbStatus.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(255, 0, 51));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        org.jdesktop.layout.GroupLayout panel_bgLayout = new org.jdesktop.layout.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_bgLayout.createSequentialGroup()
                .addContainerGap()
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(spFriend)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panel_bgLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(cmdLogOut, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 212, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panel_bgLayout.createSequentialGroup()
                        .add(txt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cmdMore)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cmdSend, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(spChat, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .add(panel_bgLayout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 309, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lbStatus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .add(10, 10, 10)))
                .addContainerGap())
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel_bgLayout.createSequentialGroup()
                .add(65, 65, 65)
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lbStatus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(panel_bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(spFriend, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 412, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(spChat))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
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
            .add(panel_bg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(panel_bg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(0, 0, 0))
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
                    if(status.equals("Message"))
                    {
                        getMessage(ms.getID(), ms.getMessage());
                    }
                    else if(status.equals("New"))
                    {
                        newFriend(ms.getImage(), ms.getID(), ms.getName().split("!")[0], ms.getName().split("!")[1]);
                    }
                    else if(status.equals("Photo"))
                    {
                        getPhoto(ms.getID(), ms.getImage());
                    }
                    else if(status.equals("File"))
                    {
                        getFile(ms.getID(), ms.getName(), ms.getImage());
                    }
                    else if(status.equals("Error"))
                    {
                        errorFrient(ms.getID());
                    }
                    else if(status.equals("Emoji"))
                    {
                        getEmoji(ms.getID(), ms.getMessage());
                    }
                    else if(status.equals("GetFile"))
                    {
                        download(ms);
                    }
                    else if(status.equals("Sound"))
                    {
                        getSound(ms.getID(), ms.getData(), ms.getMessage());
                    }
                }
            }
            catch(Exception e)
            {
                String ms = e.getMessage();
                if(ms.equals("Socket closed"))
                {
                    signOut("Sign out");
                }
                else if(ms.equals("Connection reset"))
                {
                    signOut("Server has error");
                }
                else
                {
                    signOut("Error : " + ms);
                }

            }
        });
        th.start();
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        start();
    }//GEN-LAST:event_formWindowOpened

    private void cmdLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogOutActionPerformed
        int c = JOptionPane.showConfirmDialog(this, "Are you sure you want to sign out ?", "Sign out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(c == JOptionPane.YES_OPTION)
        {
            try
            {
                Method.getClient().close();
            }
            catch(Exception e)
            {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_cmdLogOutActionPerformed

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
            FileOutputStream out = new FileOutputStream(file);
            out.write(ms.getData());
            out.close();
        }
        catch(Exception e)
        {
            showStatus("Error : can't download");
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
                catch(Exception e)
                {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }).start();
    }
    private Timer timer = new Timer(5000, new ActionListener()
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
        try
        {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() ->
        {
            new Main().setVisible(true);
            System.out.println("error chako");
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private my_swing.Button cmdLogOut;
    private javax.swing.JButton cmdMore;
    private javax.swing.JButton cmdSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JDesktopPane panelChat;
    private javax.swing.JPanel panelFriend;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JPopupMenu popMix;
    private javax.swing.JPopupMenu popUp;
    private javax.swing.JPopupMenu popUp_emoji;
    private javax.swing.JScrollPane spChat;
    private javax.swing.JScrollPane spFriend;
    private javax.swing.JTextField txt;
    private my_swing.Button cmdEmoji;
    private my_swing.Button cmdFile;
    private my_swing.Button cmdMicro;
    private javax.swing.JButton cmdMix;
    private my_swing.Button cmdPhoto;
    private my_swing.Panel panel;
    private my_swing.Panel panel1;
    private my_swing.Panel panel2;
    private javax.swing.JLayeredPane panelEmoji;
    private javax.swing.JPanel panelGroup;
    private my_swing.Panel panelMix;
    private my_swing.Panel panel_emoji;
    private javax.swing.JScrollPane spGroup;
    // End of variables declaration//GEN-END:variables
}

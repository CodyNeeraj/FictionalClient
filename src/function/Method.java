package function;

import SwingCustom.ImageViewer;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.HeadlessException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import main.ChatConsole;
import message.Message;
import model.Friend;

public class Method
{
    private static int port;
    private static String address;

    public static AudioRecorder getRecorder()
    {
        return recorder;
    }

    public static void setRecorder(AudioRecorder Recorder)
    {
        recorder = Recorder;
    }

    private static HashMap<Integer, Friend> friends = new HashMap<>();
    private static Socket client;
    private static ObjectOutputStream out;
    private static ObjectInputStream in;
    private Font khmerFont;
    private static int myID;
    private static String myName;
    private static String time;
    private static JFrame frame;
    private static AudioRecorder recorder = new AudioRecorder();

    public static void setTextFieldStyle(JTextField txt, String style)
    {
        txt.setName("");
        txt.setForeground(new Color(130, 130, 130));
        txt.setText(style);
        txt.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent fe)
            {
                if(txt.getName().equals(""))
                {
                    txt.setForeground(new Color(25, 25, 25));
                    txt.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent fe)
            {
                if(txt.getText().trim().equals(""))
                {
                    txt.setForeground(new Color(130, 130, 130));
                    txt.setText(style);
                    txt.setName("");
                }
                else
                {
                    txt.setName("have");
                }
            }
        });
        txt.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent ke)
            {
                if(txt.getText().trim().equals(""))
                {
                    txt.setName("");
                }
                else
                {
                    txt.setName("have");
                }
            }
        });
    }

    public static void connect(ImageIcon icon, String userName, String IP, int Port) throws Exception
    {
        port = Port;
        client = new Socket(IP, port);
        address = IP;
        out = new ObjectOutputStream(client.getOutputStream());
        in = new ObjectInputStream(client.getInputStream());
        SimpleDateFormat df = new SimpleDateFormat("hh:mm aa");
        String t = df.format(new Date());
        Message ms = new Message();
        ms.setStatus("New");
        ms.setImage(icon);
        ms.setName(userName + "!" + t);
        out.writeObject(ms);
        out.flush();
        myName = userName;
        time = t;
    }

    public static void sendMessage(String text) throws Exception
    {
        Message ms = new Message();
        ms.setStatus("Message");
        ms.setID(Method.getMyID());
        ms.setMessage(text);
        out.writeObject(ms);
        out.flush();
    }

    public static void sendPhoto(ImageIcon photo) throws Exception
    {
        Message ms = new Message();
        ms.setStatus("Photo");
        ms.setID(Method.getMyID());
        ms.setImage(photo);
        out.writeObject(ms);
        out.flush();
    }

    public static void sendFile(File file) throws Exception
    {
        byte[] data;
        try(FileInputStream ins = new FileInputStream(file))
        {
            data = new byte[ins.available()];
            ins.read(data);
        }
        String fileSize = convertSize(file.length());
        Message ms = new Message();
        ms.setStatus("File");
        ms.setID(Method.getMyID());
        ms.setData(data);
        ms.setName(file.getName() + "!" + fileSize);
        out.writeObject(ms);
        out.flush();
    }

    public static void sendEmoji(String emoji) throws Exception
    {
        Message ms = new Message();
        ms.setStatus("Emoji");
        ms.setID(Method.getMyID());
        ms.setMessage(emoji);
        out.writeObject(ms);
        out.flush();
    }

    private static String getDurationString(int seconds)
    {
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;
        return oneDigitString(minutes) + ":" + twoDigitString(seconds);
    }

    private static String twoDigitString(int number)
    {
        if(number == 0)
        {
            return "00";
        }
        if(number / 10 == 0)
        {
            return "0" + number;
        }
        return String.valueOf(number);
    }

    private static String oneDigitString(int number)
    {
        if(number == 0)
        {
            return "0";
        }
        if(number / 10 == 0)
        {
            return "" + number;
        }
        return String.valueOf(number);
    }

    public static void sendSound(ByteArrayOutputStream sount, int time) throws Exception
    {
        Message ms = new Message();
        ms.setStatus("Sound");
        ms.setID(Method.getMyID());
        ms.setMessage(getDurationString(time) + "!" + time);
        ms.setData(sount.toByteArray());
        out.writeObject(ms);
        out.flush();
    }

    public static void downloadFile(int ID, String name)
    {
        try
        {
            String ex[] = name.split("\\.");
            String x = ex[ex.length - 1];
            JFileChooser ch = new JFileChooser();
            ch.setSelectedFile(new File(name));
            int c = ch.showSaveDialog(ChatConsole.getFrames()[0]);
            if(c == JFileChooser.APPROVE_OPTION)
            {
                File f = ch.getSelectedFile();
                if(f.exists())
                {
                    int click = JOptionPane.showConfirmDialog(ChatConsole.getFrames()[0], "This file name has already Exists, do you want to replace", "Save File", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(click != JOptionPane.YES_OPTION)
                    {
                        return;
                    }
                }
                String parth = f.getAbsolutePath();
                if(!parth.endsWith("." + x))
                {
                    parth += "." + x;
                }
                Message ms = new Message();
                ms.setStatus("download");
                ms.setID(Method.getMyID());
                ms.setName(parth);
                ms.setMessage(ID + "");
                out.writeObject(ms);
                out.flush();
            }
        }
        catch(HeadlessException | IOException e)
        {
            JOptionPane.showMessageDialog(frame, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void showImage(ImageIcon image)
    {
        JPopupMenu pop = new JPopupMenu();
        pop.setBackground(new Color(0, 0, 0, 0));
        ImageViewer obj = new ImageViewer();
        obj.setImage(image);
        pop.add(obj);
        int w = (int) obj.getPreferredSize().getWidth();
        int h = (int) obj.getPreferredSize().getHeight();
        pop.show(frame, frame.getWidth() / 2 - w / 2, frame.getHeight() / 2 - h / 2);
    }
    private static final String[] fileSizeUnits =
    {
        "bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"
    };

    private static String convertSize(double bytes)
    {
        String sizeToReturn;
        DecimalFormat df = new DecimalFormat("0.#");
        int index;
        for(index = 0; index < fileSizeUnits.length; index++)
        {
            if(bytes < 1024)
            {
                break;
            }
            bytes = bytes / 1024;
        }
        System.out.println("Systematic file size: " + bytes + " " + fileSizeUnits[index]);
        sizeToReturn = df.format(bytes) + " " + fileSizeUnits[index];
        return sizeToReturn;
    }

    public Font getKhmer_Font()
    {
        try
        {
            // load a custom font in your project folder
            khmerFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Font/Khmer_SBBIC_Serif.ttf"));
//            Can also be used as an alternative to the above code
//            InputStream fileStream = getClass().getResourceAsStream("/Font/Khmer_SBBIC_Serif.ttf");
//            khmerFont = Font.createFont(Font.TRUETYPE_FONT, fileStream);
//            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("/Font/Khmer_SBBIC_Serif.ttf")));
        }
        catch(FontFormatException | IOException e)
        {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, e);
        }
        return khmerFont.deriveFont(0, 12f);
    }

    public static Font getFont()
    {
        return new Method().getKhmer_Font();
    }

    public static Font getFontBold()
    {
        return new Method().getKhmer_Font().deriveFont(Font.BOLD);
    }

    public static HashMap<Integer, Friend> getFriends()
    {
        return friends;
    }

    public static void setFriends(HashMap<Integer, Friend> Friends)
    {
        friends = Friends;
    }

    public static ObjectOutputStream getOut()
    {
        return out;
    }

    public static void setOut(ObjectOutputStream Out)
    {
        out = Out;
    }

    public static ObjectInputStream getIn()
    {
        return in;
    }

    public static void setIn(ObjectInputStream In)
    {
        in = In;
    }

    public static int getMyID()
    {
        return myID;
    }

    public static void setMyID(int MyID)
    {
        myID = MyID;
    }

    public static String getMyName()
    {
        return myName;
    }

    public static int getPort()
    {
        return port;
    }

    public static String getIP()
    {
        return address;
    }

    public static void setMyName(String MyName)
    {
        myName = MyName;
    }

    public static Socket getClient()
    {
        return client;
    }

    public static void setClient(Socket Client)
    {
        client = Client;
    }

    public static String getTime()
    {
        return time;
    }

    public static void setTime(String Time)
    {
        time = Time;
    }

    public static JFrame getFrame()
    {
        return frame;
    }

    public static void setFrame(JFrame Frame)
    {
        frame = Frame;
    }
}

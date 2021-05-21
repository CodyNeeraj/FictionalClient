package function;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neeraj
 */
public class FontLoader
{
    private static Font khmerFont;
    private static Font khmerUIFont;
    private static Font ConsolasFont;
    private static Font SegoeUIFont;
    private static Font SegoeUI_SBFont;
    private static Font MicrosoftSansSerifFont;
    private Boolean isExecuted = false;

    private FontLoader()
    {
        checker();
    }

    private void checker()
    {
        //will load the external fonts for using later with components
        if(isExecuted == false)
        {
            Loader();
        }
        else if(isExecuted == true)
        {
            System.out.println("Class already loaded before by some variable");
        }
    }

    private void Loader()
    {
        try
        {
//            load a custom font in your project folder
            khmerFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Font/Khmer_SBBIC_Serif.ttf"));
//            Can also be used as an alternative to the above code
//            InputStream fileStream = getClass().getResourceAsStream("/Font/Khmer_SBBIC_Serif.ttf");
//            khmerFont = Font.createFont(Font.TRUETYPE_FONT, fileStream);
//            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("/Font/Khmer_SBBIC_Serif.ttf")));

            khmerUIFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Font/KhmerUI.ttf"));
            ConsolasFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Font/Consolas.ttf"));
            SegoeUIFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Font/SegoeUI.ttf"));
            SegoeUI_SBFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Font/SegoeUI_SB.ttf"));
            MicrosoftSansSerifFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Font/MicrosoftSansSerif.ttf"));
            isExecuted = true;
        }
        catch(FontFormatException | IOException e)
        {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static Font getKhmer_Font()
    {
        if(khmerFont == null)
        {
            new FontLoader().checker();
        }
        return khmerFont.deriveFont(0, 12f);
    }

    public static Font getKhmer_UIFont()
    {
        if(khmerUIFont == null)
        {
            new FontLoader().checker();
        }
        return khmerUIFont;
    }

    public static Font getConsolasFont()
    {
        if(ConsolasFont == null)
        {
            new FontLoader().checker();
        }
        return ConsolasFont;
    }

    public static Font getSegoe_UIFont()
    {
        if(SegoeUIFont == null)
        {
            new FontLoader().checker();
        }
        return SegoeUIFont;
    }

    public static Font getSegoe_UI_SBFont()
    {
        if(SegoeUI_SBFont == null)
        {
            new FontLoader().checker();
        }
        return SegoeUI_SBFont;
    }

    public static Font getMicrosoft_Sans_serifFont()
    {
        if(MicrosoftSansSerifFont == null)
        {
            new FontLoader().checker();
        }
        return MicrosoftSansSerifFont;
    }

    public static Font getFont()
    {
        if(khmerFont == null)
        {
            new FontLoader().checker();
        }
        return khmerFont;
    }

    public static Font getFontBold()
    {
        if(khmerFont == null)
        {
            new FontLoader().checker();
        }
        return khmerFont.deriveFont(Font.BOLD);
    }
}

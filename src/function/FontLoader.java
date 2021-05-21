package function;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.Arrays;
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
    private static String installedFonts;

    private FontLoader()
    {
        checker();
    }

    private void checker()
    {
        SystemFontLoader();
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

    private void SystemFontLoader()
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fonts[] = ge.getAvailableFontFamilyNames();
        installedFonts = Arrays.toString(fonts);
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
//        if(khmerUIFont == null)
//        {
//            new FontLoader().checker();
//        }
//        return khmerUIFont;
        if(khmerUIFont == null)
        {
            new FontLoader().checker();
        }
        if(installedFonts.contains("Khmer UI"))
        {
            return new Font("Khmer UI", 0, 0);
        }
        if(!installedFonts.contains("Khmer UI"))
        {
            return khmerUIFont;
        }
        return null;
    }

    public static Font getConsolasFont()
    {
        if(ConsolasFont == null)
        {
            new FontLoader().checker();
        }
        if(installedFonts.contains("Consolas"))
        {
            return new Font("Consolas", 0, 0);
        }
        if(!installedFonts.contains("Consolas"))
        {
            return ConsolasFont;
        }
        return null;
    }

    public static Font getSegoe_UIFont()
    {
        if(SegoeUIFont == null)
        {
            new FontLoader().checker();
        }
        if(installedFonts.contains("Segoe UI"))
        {
            return new Font("Segoe UI", 0, 0);
        }
        if(!installedFonts.contains("Segoe UI"))
        {
            return SegoeUIFont;
        }
        return null;
    }

    public static Font getSegoe_UI_SBFont()
    {
        if(SegoeUI_SBFont == null)
        {
            new FontLoader().checker();
        }
        if(installedFonts.contains("Segoe UI Semibold"))
        {
            return new Font("Segoe UI Semibold", 0, 0);
        }
        if(!installedFonts.contains("Segoe UI Semibold"))
        {
            return SegoeUI_SBFont;
        }
        return null;
    }

    public static Font getMicrosoft_Sans_serifFont()
    {
        if(MicrosoftSansSerifFont == null)
        {
            new FontLoader().checker();
        }
        if(installedFonts.contains("Microsoft Sans Serif"))
        {
            return new Font("Microsoft Sans Serif", 0, 0);
        }
        if(!installedFonts.contains("Microsoft Sans Serif"))
        {
            return MicrosoftSansSerifFont;
        }
        return null;
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

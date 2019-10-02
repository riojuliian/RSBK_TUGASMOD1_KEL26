/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colors2;

 
import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 
 
public class Colors2 extends Canvas implements Serializable{
    private Color color;   private boolean rect;     public Colors2()
    {         
        rect=false; setSize(200,100);         change();
    }     
    public boolean getRect()
    {         
        return rect;
    }     
    public void setRect(boolean flag)
    {            
        this.rect=flag; repaint();
    }     
    public void change()
    {          
        color = randomColor();  
        repaint();
    }     
    private Color randomColor()
    {         
        int r=(int)(255*Math.random());
        int g =(int)(255*Math.random());
        int b=(int)(255*Math.random());
        return new Color(r,g,b);
    }    
    public void paint(Graphics g)
    {            
        Dimension d = getSize();
        int h=d.height;
        int w=d.width;
        g.setColor(color);
        
        int x[] = {125, 25, 125};
        int y[] = {25, 75, 125};
    
        if(rect){             
        g.fillRect(0,0,w-1,h-1);
        }        
        else
        {
            g.fillPolygon(x, y, x.length);
        }     
    } 
} 
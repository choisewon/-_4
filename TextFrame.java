import javax.swing.*;

/**
 * 여기에 TextFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class TextFrame extends JFrame
{
   private JPanel mp;
   public TextFrame()
   {
       setTitle("실습_4");
       setSize(250,350);
       
       mp = new JPanel();
       
       this.add(mp);
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       setVisible(true);
   }
}

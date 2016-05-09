/**
   @version 1.11 2004-08-30
   @author Cay Horstmann
*/

package com.corejava7.javabean;

import java.beans.*;

/**
   A custom editor for the titlePosition property of the 
   ChartBean. The editor lets the user choose between
   Left, Center, and Right
*/
public class TitlePositionEditor
   extends PropertyEditorSupport
{  
   //�����п�ѡ��г���
   public String[] getTags() { return options; }
   private String[] options = { "Left", "Center", "Right" };
   public String getJavaInitializationString() { return "" + getValue(); }
   //������ѡ��������ʾ
   public String getAsText()
   {  
      int value = (Integer) getValue();
      return options[value];
   }
 //������ѡ����������ֵ
   public void setAsText(String s)
   {  
      for (int i = 0; i < options.length; i++)
      {  
         if (options[i].equals(s))
         {  
            setValue(i);
            return;
         }
      }
   }
}


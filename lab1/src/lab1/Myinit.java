package lab1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Myinit extends JFrame{

	//�˴�Ϊ�˷��㣬ֱ�����ó���20
	
	public JTextField[] blocks = new JTextField[20];
	 public JTextField originField;
	 public JTextField goalField;
	 public JTextField resultField;
	 public JTextField dataField1;
	 public JTextField dataField2;
	 public JTextField dataField3;
	 public JButton confirm;
	 public JButton test;
	    
	  Myinit(int m) {	  
		  super(m*m-1+"���������");
	        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	        int temp1=dimension.width;
			 int temp2=dimension.height;
			 
			
	        dimension.width = (int) (dimension.width * 0.4);
	        dimension.height = (int) (dimension.height*0.8);

	     
	        Box box = Box.createVerticalBox();
	    
	        this.setLocation((int) ((temp1-dimension.width)/2),(int)((temp2-dimension.height)/2));
	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(m, m));
	        
	        for(int i = 0;  i < m*m; i++) {
	            blocks[i] = new JTextField();
	            blocks[i].setHorizontalAlignment(JTextField.CENTER);
	            blocks[i].setPreferredSize(new Dimension(200,200));
	            blocks[i].setFont(new Font("����", Font.PLAIN, 50));
	            panel.add(blocks[i]);
	        }

	        Box tip = Box.createVerticalBox();
	        JLabel label = new JLabel("���뿪ʼ���к�Ŀ�����У��ո���0��ʾ�������м��ÿո�ֿ���");
	        tip.add(label);
	        JLabel originLabel = new JLabel("��ʼ����:");
	        
	        tip.add(originLabel);
	        originField = new JTextField();
	        originField.setFont(new Font("����", Font.PLAIN, 30));	        
	        tip.add(originField);
	        
	        JLabel goalLabel = new JLabel("Ŀ������:");
	        tip.add(goalLabel);
	        
	        goalField = new JTextField();        
	        goalField.setFont(new Font("����", Font.PLAIN, 30));
	        tip.add(goalField);
	        
	        JLabel outLabel = new JLabel("������ʾ:");
	        tip.add(outLabel);
	        
	        Box but = Box.createVerticalBox();

	        confirm = new JButton("��ʼ���У�");
            test = new JButton("���԰�����");
            test.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
            //������8-31���õ����������
            	int ci1=(int)(8+Math.random()*(24));
            	System.out.println(ci1+"��");
            	int ci2=(int)(8+Math.random()*(24));
            	System.out.println(ci2+"��");
            	System.out.println("�����������:");
//            	System.out.println(ci+"��");
            	int[][]temp1= {{1,2,3},{8,0,4},{7,6,5}};
            	int[][]temp2= {{1,2,3,4},{12,0,14,5},{11,15,13,6},{10,9,8,7}};
            	int [][]start1 = new int[m][m];
            	int [][]start2 = new int[m][m];
            	if(m==3) {
            		
            		for(int i=0;i<m;i++) {
                		for(int j=0;j<m;j++) {
                			start1[i][j]=temp1[i][j];
                			start2[i][j]=temp1[i][j];
                		}
              
                	}
                	
            	}
            	else {
            			
            		for(int i=0;i<m;i++) {
                		for(int j=0;j<m;j++) {
                			start1[i][j]=temp2[i][j];
                			start2[i][j]=temp2[i][j];
                		}
              
                	}
            	}
            	
            
            	int x=1,y=1;
              	for(int i=0;i<ci1;i++) {
            		int fang=(int)(1+Math.random()*(4)); 		
            		switch(fang){
            	//��
            		case 1:{
            			if(y-1>=0) 
            		{int temp=start1[x][y];
            		start1[x][y]=start1[x][y-1];
            		start1[x][y-1]=temp;
            		y=y-1;
            		//System.out.println(fang);
            		} 
            	
            		else i=i-1;
            		break;}
            		//��
            		case 2:{if(x-1>=0) 
            		{int temp=start1[x][y];
            		start1[x][y]=start1[x-1][y];
            		start1[x-1][y]=temp;
            		x=x-1;
            		//System.out.println(fang);
            		} 
            		else i=i-1;
            		break;}
            		//��
            		case 3:
            		{if(y+1<=m-1) 
            		{int temp=start1[x][y];
            		start1[x][y]=start1[x][y+1];
            		start1[x][y+1]=temp;
            		y=y+1;
            		//System.out.println(fang);
            		} 
            		else i=i-1;
            		break;}
            		case 4:{if(x+1<=m-1) 
            		{int temp=start1[x][y];
            		start1[x][y]=start1[x+1][y];
            		start1[x+1][y]=temp;
            		x=x+1;
            		//System.out.println(fang);
            		} 
            		else i=i-1;
            		break;}
            		
            		}	
            	}
              System.out.println(x);
              System.out.println(y);
              	 x=1; y=1;
            	for(int i=0;i<ci2;i++) {
            		int fang=(int)(1+Math.random()*(4)); 		
            		switch(fang){
            	//��
            		case 1:{if(y-1>=0) 
            		{int temp=start2[x][y];
            		start2[x][y]=start2[x][y-1];
            		start2[x][y-1]=temp;
            		y=y-1;
            		//System.out.println(fang);
            		} 
            	
            		else i=i-1;
            		break;}
            		//��
            		case 2:{if(x-1>=0) 
            		{int temp=start2[x][y];
            		start2[x][y]=start2[x-1][y];
            		start2[x-1][y]=temp;
            		x=x-1;
            		//System.out.println(fang);
            		} 
            		else i=i-1;
            		break;}
            		//��
            		case 3:
            		{if(y+1<=m-1) 
            		{int temp=start2[x][y];
            		start2[x][y]=start2[x][y+1];
            		start2[x][y+1]=temp;
            		y=y+1;
            		//System.out.println(fang);
            		} 
            		else i=i-1;
            		break;}
            		case 4:{if(x+1<=m-1) 
            		{int temp=start2[x][y];
            		start2[x][y]=start2[x+1][y];
            		start2[x+1][y]=temp;
            		x=x+1;
            		//System.out.println(fang);
            		} 
            		else i=i-1;
            		break;}
            		
            		}	
            	}
            	 System.out.println(x);
                 System.out.println(y);
            	System.out.print("��ʼ����");
            	for(int i=0;i<m;i++) {
            		for(int j=0;j<m;j++) {
            			System.out.print(start1[i][j]+" ");
            		}
          
            	}
            	System.out.println();
            	System.out.print("Ŀ������");    	
            	for(int i=0;i<m;i++) {
            		for(int j=0;j<m;j++) {
            			System.out.print(start2[i][j]+" ");
            		}
          
            	}
            	System.out.println();
            
                }
            });
	        
	        but.add(confirm);
	        
	        but.add(test);
	        
	        //���ݿ��ӻ�
	        Box out=Box.createVerticalBox();
	        
	        JLabel dataLabel = new JLabel("��������:");
	        out.add(dataLabel);
	        dataField1 = new JTextField();
	        dataField2 = new JTextField(); 
	        dataField3 = new JTextField(); 
	        dataField1.setFont(new Font("����", Font.PLAIN, 20));
	        dataField2.setFont(new Font("����", Font.PLAIN, 20));
	        dataField3.setFont(new Font("����", Font.PLAIN, 20));

	        out.add(dataField1);
	        out.add(dataField2);
	        out.add(dataField3);
	        
	        resultField = new JTextField();   
	        out.add(resultField);
	        
	        
	        box.add(tip);
            box.add(panel);
	        box.add(but);
	        box.add(out);

	        this.add(box);
	        this.setSize(dimension);
	        this.setVisible(true);
	      
		  
	  }  
}

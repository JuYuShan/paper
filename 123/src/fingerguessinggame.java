import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Random;
import javax.swing.*;
public class fingerguessinggame  extends JApplet{
	static boolean st=false;
	static JFrame frm = new JFrame("paper!scissors!stone!");
	static Label Players=new Label("Player ",Label.CENTER);
	static Label computer=new Label("Computer ",Label.CENTER);
	static JButton Playersres = new JButton();
	static JButton computerres= new JButton();
	static Label judgeres = new Label("",Label.CENTER);	
	static Label NumberofBoard = new Label("Inning�G",Label.CENTER);
	static Label drawn = new Label("Tie�G",Label.CENTER);
	static Label Lose = new Label("You Lose�G",Label.CENTER);
	static Label Win = new Label("You win�G",Label.CENTER);
	static Button end = new Button("Exit");
	static Button con = new Button("Continue");
	static URL urlscissor,urlpaper,urlrock ;
	static ImageIcon Scissor,paper,rock,PScissor,Ppaper,Prock;
	static URL Purlscissor,Purlpaper,Purlrock ;
	public static void main(String[] args) {
		
		int C=1;
		int b=0;
		Label NumberofBoard1 = new Label(""+C,Label.CENTER);
		Label drawn1 = new Label(""+b,Label.CENTER);
		Label Lose1 = new Label(""+b,Label.CENTER);
		Label Win1 = new Label(""+b,Label.CENTER);
		computerres.setEnabled(false);
		Playersres.setEnabled(false);
		//�����]�m�j�p���C��
		frm.setSize(900,650);
		frm.getContentPane().setBackground(Color.cyan);
		frm.setLayout(null);
		try {
			//�q��
			 urlscissor= fingerguessinggame.class.getResource("�ŤM.png");
			 urlpaper = fingerguessinggame.class.getResource("��.png");
			 urlrock = fingerguessinggame.class.getResource("���Y.png");
			 Scissor= new ImageIcon(urlscissor);
			 paper= new ImageIcon(urlpaper);
			 rock= new ImageIcon(urlrock );
			//���a 
			 Purlscissor= fingerguessinggame.class.getResource("�ŤM.jpg");
			 Purlpaper = fingerguessinggame.class.getResource("��.jpg");
			 Purlrock = fingerguessinggame.class.getResource("���Y.jpg");
			 PScissor= new ImageIcon(Purlscissor);
			 Ppaper= new ImageIcon(Purlpaper);
			 Prock= new ImageIcon(Purlrock);	 
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Random rdm;
		rdm=new Random();
		//���a�]�m
         Players.setBounds(150, 80, 200, 35);
         Players.setBackground(Color.BLACK);
         Font fontplayer = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
         Players.setFont(fontplayer);
         Players.setForeground(Color.white);
         //�q���]�m
         computer.setBounds(550, 80, 200,35);
         computer.setBackground(Color.BLACK);
         Font fontcomputer = new Font(Font.DIALOG_INPUT, Font.BOLD,20);
         computer.setFont(fontcomputer);
         computer.setForeground(Color.white);
         Font fontres = new Font(Font.DIALOG, Font.BOLD, 30);
         judgeres.setFont(fontres);
	    //���s(�ŤM)
	    JButton Scissorjbutton1 = new JButton();
	    Scissorjbutton1.setSize(89,83);
	    Scissorjbutton1.setLocation(200, 135);
	    Scissorjbutton1.setIcon(PScissor);
	    frm.add(Scissorjbutton1);
	    //���s(���Y)
	    frm.setLayout(null);
	    JButton rockjbutton2 = new JButton( );
	    rockjbutton2.setSize(89,83);
	    rockjbutton2.setLocation(305,135);
	    rockjbutton2.setIcon(Prock);
	    frm.add(rockjbutton2);
	    //���s(��)
	    JButton paperjbutton = new JButton( );
	    paperjbutton.setSize(82,83);
	    paperjbutton.setLocation(100, 135);
	    paperjbutton.setIcon(Ppaper);
	    frm.add(paperjbutton);
	    //���a���G��ܰϳ]�m
	    Playersres.setBounds(140, 240, 226, 210);
	    Playersres.setBackground(Color.white);	
	  	//�q�����G��ܰϳ]�m	
	    computerres.setBounds(535, 240, 226, 210);
	    computerres.setBackground(Color.white);	
	  	//��Ĺ��ܰ�
	    judgeres.setBounds(205, 470,500, 50);
	    judgeres.setBackground(Color.white);
	    Font fontNumberofBoard7 = new Font(Font.DIALOG_INPUT, Font.BOLD, 30);
	    judgeres.setFont(fontNumberofBoard7);
	  	//�������s
	  	end.setBounds(250, 550, 150, 30);
	  	end.setBackground(Color.BLACK);	
	  	end.setForeground(Color.white);
	  	Font fontNumberofBoard4 = new Font(Font.DIALOG_INPUT, Font.BOLD, 20 );
	  	end.setFont(fontNumberofBoard4);
	  	//�~����s
	  	con.setBounds(500, 550, 150, 30);
	  	con.setBackground(Color.BLACK);	
	  	con.setForeground(Color.white);
	  	Font fontNumberofBoard6 = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
	  	con.setFont(fontNumberofBoard6);
	  	//����
	  	NumberofBoard.setBounds(80, 0, 90, 30);
	  	NumberofBoard.setBackground(Color.cyan);	
	  	NumberofBoard.setForeground(Color.BLACK);
	  	Font fontNumberofBoard = new Font(Font.DIALOG_INPUT, Font.BOLD, 20 );
	  	NumberofBoard.setFont(fontNumberofBoard);
	  	NumberofBoard1.setBounds(170, 0, 35, 30);
	  	NumberofBoard1.setBackground(Color.cyan);	
	  	NumberofBoard1.setForeground(Color.BLACK);
	  	Font fontNumberofBoard1 = new Font(Font.DIALOG, Font.BOLD, 20);
	  	NumberofBoard1.setFont(fontNumberofBoard1);	  	
	  	//Ĺ������	  	
	  	Win.setBounds(260, 0, 115, 30);
		Win.setBackground(Color.cyan);	
		Win.setForeground(Color.BLUE);
	  	Font fontWin = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
	  	Win.setFont(fontWin);
	  	Win1.setBounds(375,0, 35, 30);
		Win1.setBackground(Color.cyan);	
		Win1.setForeground(Color.BLUE);
	  	Font fontWin1 = new Font(Font.DIALOG, Font.BOLD, 20);
	  	Win1.setFont(fontWin1);
	  	
	  	//�骺����		
		Lose.setBounds(480, 0, 120, 30);
		Lose.setBackground(Color.cyan);	
		Lose.setForeground(Color.RED);
	  	Font fontLose = new Font(Font.DIALOG_INPUT, Font.BOLD, 20);
	  	Lose.setFont(fontLose); 
	  	Lose1.setBounds(605,0, 35, 30);
	  	Lose1.setBackground(Color.cyan);	
	  	Lose1.setForeground(Color.RED);
	  	Font fontLose1 = new Font(Font.DIALOG, Font.BOLD, 20);
	  	Lose1.setFont(fontLose1);
		
		//�M������
		drawn.setBounds(700, 0, 55, 30);
		drawn.setBackground(Color.cyan);	
		drawn.setForeground(Color.black);
	  	Font fontdrawn = new Font(Font.DIALOG_INPUT, Font.BOLD,20);
	  	drawn.setFont(fontdrawn); 
	  	drawn1.setBounds(760, 0, 35, 30);
		drawn1.setBackground(Color.cyan);	
		drawn1.setForeground(Color.BLACK);
	  	Font fontdrawn1 = new Font(Font.DIALOG, Font.BOLD,20);
	  	drawn1.setFont(fontdrawn1); 
		
	  	
		
	  	rockjbutton2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Playersres.setIcon(rock);
				st=true;
				int com;
				com=rdm.nextInt(3);
				showres(judgment(2,comturn(com)));
				
				//System.out.println(""+comturn(com));
				paperjbutton.setEnabled(false);
				Scissorjbutton1.setEnabled(false);
				rockjbutton2.setEnabled(false);
				if(comturn(com)==1)
				{
					int b=Integer.parseInt(Win1.getText());
					b++;
					Win1.setText(""+b);
				}
				else if(comturn(com)==2)
				{
					int b=Integer.parseInt(drawn1.getText());
					b++;
					drawn1.setText(""+b);
				}
				else
				{
					int b=Integer.parseInt(Lose1.getText());
					b++;
					Lose1.setText(""+b);
				}
				
			}});
	  	Scissorjbutton1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				Playersres.setIcon(Scissor);
				st=true;
				int com;
				com=rdm.nextInt(3);
				showres(judgment(1,comturn(com)));
				//System.out.println(""+comturn(com));
				paperjbutton.setEnabled(false);
				Scissorjbutton1.setEnabled(false);
				rockjbutton2.setEnabled(false);
				if(comturn(com)==0)
				{
					int b=Integer.parseInt(Win1.getText());
					b++;
					Win1.setText(""+b);
				}
				else if(comturn(com)==1)
				{
					int b=Integer.parseInt(drawn1.getText());
					b++;
					drawn1.setText(""+b);
				}
				else
				{
					int b=Integer.parseInt(Lose1.getText());
					b++;
					Lose1.setText(""+b);
				}
			}});
	  	paperjbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Playersres.setIcon( paper);
				st=true;
				int com;
				com=rdm.nextInt(3);
				showres(judgment(0,comturn(com)));
				//System.out.println(""+comturn(com));
				paperjbutton.setEnabled(false);
				Scissorjbutton1.setEnabled(false);
				rockjbutton2.setEnabled(false);
				if(comturn(com)==2)
				{
					int b=Integer.parseInt(Win1.getText());
					b++;
					Win1.setText(""+b);
				}
				else if(comturn(com)==0)
				{
					int b=Integer.parseInt(drawn1.getText());
					b++;
					drawn1.setText(""+b);
				}
				else
				{
					int b=Integer.parseInt(Lose1.getText());
					b++;
					Lose1.setText(""+b);
				}
			}});
	  
	  	
		frm.add(Players);
		frm.add(computer);
		frm.add(Playersres);
		frm.add(computerres);
		frm.add(judgeres);
		frm.add(end);
		frm.add(Win);
		frm.add(drawn);		
		frm.add(Lose);
		frm.add(Win1);
		frm.add(drawn1);	
		frm.add(Lose1);
		frm.add(con);
		frm.add(NumberofBoard);
		frm.add(NumberofBoard1);
		
		
		frm.setVisible(true);
		//���������}
		end.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}			
		});
		  //���������ƥ�
	    frm.addWindowListener(new WindowAdapter()
	    {
	      public void windowClosing(WindowEvent e)
	      {
	        System.exit(0);
	      }
	    });
	    con.addActionListener(new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub			
				Playersres.setIcon(null);
				computerres.setIcon(null);
				judgeres.setText(null);
				paperjbutton.setEnabled(true);
				Scissorjbutton1.setEnabled(true);
				rockjbutton2.setEnabled(true);
				st=false;
				int C=Integer.parseInt(NumberofBoard1.getText());
				C++;
				NumberofBoard1.setText(""+C);
				
			}});
		animate();
		
		
	}
	//�q���X�P
	public static int comturn(int i)
	{
		switch(i)
		{
			case 0:
				computerres.setIcon(paper);
			break;
			case 1:
				computerres.setIcon(Scissor);
			break;
			case 2:
				computerres.setIcon(rock);
			break;
		}
		return i;
	}
	//�q���ʵe
	public static void animate()
	{
		  int i=0;
		    
		    while(true)
		    {
		    	if(i<3)
		    		i++;
		    	else
		    		i=0;
		    	try {
		    		if(!st)
		    		switch(i)
		    		{
		    		case 0:
		    			computerres.setIcon(paper);
		    			break;
		    		case 1:
		    			computerres.setIcon(Scissor);
		    			break;
		    		case 2:
		    			computerres.setIcon(rock);
		    			break;
		    		}		    				    		
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
	}
	//�P�_�ӭt
	public static int judgment(int player,int computer)
	{
		int is=-1;
		//0�� 1�ŤM 2���Y 
		//0=���aĹ 1���� 2���a��
		if(player==0)//��
		{
			switch(computer)
			{
				case 0://0��
					is=1;
					break;
				case 1:
					is=2;//1�ŤM
					break;
				case 2://2���Y
					is=0;
					break;
			}
		}
		else if(player==1)//�ŤM
		{
			switch(computer)
			{
				case 0:
					is=0;
					break;
				case 1:
					is=1;
					break;
				case 2:
					is=2;
					break;
			}
		}
		else //���Y
		{
			switch(computer)
			{
				case 0:
					is=2;
					break;
				case 1:
					is=0;
					break;
				case 2:
					is=1;
					break;
			}
		}
		return is;
	}

	public static void showres(int i)
	{
		//0=���aĹ 1���� 2���a��
		switch(i)
		{
			case 0:
				judgeres.setText("You Win ! ! ! !");
				
				break;
			case 1:
				judgeres.setText("The game has tie ! ! ! !");
				break;
			case 2:
				judgeres.setText("You Lose ! ! ! !");
				break;
		}
	}
	
	

}

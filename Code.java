import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mfrm=new MainFrame();
		mfrm.setVisible(true);
			    }
			}
	
		class MainFrame extends Frame{
			Random rnd=new Random();
			private Button btnExit=new Button("Exit");
			private Button play=new Button("player");
			private Button com=new Button("computer");
			private Button pap=new Button("paper");
			private Button sci=new Button("scissor");
			private Button sto=new Button("stone");
			private TextArea ta=new TextArea();
			public MainFrame(){
			initComp();	
		}
		private void initComp(){
			this.setBounds(100,100,500, 500);
			this.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					System.exit(0);
				}
			});
			
			this.setLayout(null);
			this.add(btnExit);
			this.add(com);
			this.add(play);
			this.add(sci);
			this.add(pap);
			this.add(sto);
			this.add(ta);
			btnExit.setBounds(400,400,100,100);
			com.setBounds(10,50,100,50);
			play.setBounds(210,50,100,50);
			sci.setBounds(10,200,100,50);
			pap.setBounds(150,200,100,50);
			sto.setBounds(280,200,100,50);
			ta.setBounds(30,300,350,150);
			btnExit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					System.exit(0);}
			
				});
			pap.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					int a=rnd.nextInt(3)+1;
					int b;
					b=3;
					switch (a){
					case 1:
						switch(b){
						case 1:
							ta.append("平手"+"\n");
							break;
						case 2:
							ta.append("u win"+"\n");
							break;
						case 3:
							ta.append("u lose"+"\n");
							break;
						}break;
					case 2:
						switch(b){
					case 1:
						ta.append("u lose"+"\n");
						break;
					case 2:
						ta.append("平手"+"\n");
						break;
					case 3:
						ta.append("u win"+"\n");
						break;
						}break;
					case 3:
						switch(b){
						case 1:
							ta.append("u win"+"\n");
							break;
						case 2:
							ta.append("u lose"+"\n");
							break;
						case 3:
							ta.append("平手"+"\n");
							break;
					}break;
					}
				}
			});
			sci.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					int a=rnd.nextInt(3)+1;
					int b;
					 b=1;
					 switch (a){
					 case 1:
					 	switch(b){
					 	case 1:
					 		ta.append("平手"+"\n");
					 		break;
					 	case 2:
					 		ta.append("u win"+"\n");
					 		break;
					 	case 3:
					 		ta.append("u lose"+"\n");
					 		break;
					 	}break;
					 case 2:
					 	switch(b){
					 case 1:
						 ta.append("u lose"+"\n");
					 	break;
					 case 2:
						 ta.append("平手"+"\n");
					 	break;
					 case 3:
						 ta.append("u win"+"\n");
					 	break;
					 	}break;
					 case 3:
					 	switch(b){
					 	case 1:
					 		ta.append("u win"+"\n");
					 		break;
					 	case 2:
					 		ta.append("u lose"+"\n");
					 		break;
					 	case 3:
					 		ta.append("平手"+"\n");
					 		break;
					 }break;
					 }
				}
			});
			sto.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					int a=rnd.nextInt(3+1);
					int b;
					b=2;
					switch (a){
					case 1:
						switch(b){
						case 1:
							ta.append("平手"+"\n");
							break;
						case 2:
							ta.append("u win"+"\n");
							break;
						case 3:
							ta.append("u lose"+"\n");
							break;
						}break;
					case 2:
						switch(b){
					case 1:
						ta.append("u lose"+"\n");
						break;
					case 2:
						ta.append("平手"+"\n");
						break;
					case 3:
						ta.append("u win"+"\n");
						break;
						}break;
					case 3:
						switch(b){
						case 1:
							ta.append("u win"+"\n");
							break;
						case 2:
							ta.append("u lose"+"\n");
							break;
						case 3:
							ta.append("平手"+"\n");
							break;
					}break;
					}
				}
			});
			}
		}
	



package ttt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class TicTacToe {

	private JFrame frmTictactoe;

	/**
	 * Launch the application.
	 */
	boolean turn = false;
	int bu[] = {0,0,0,0,0,0,0,0,0};
	 int p1[] = {0,0,0,0,0,0,0,0,0};
	int p2[] = {0,0,0,0,0,0,0,0,0};
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frmTictactoe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	int pw1() {
		if(p1[0]==1 && p1[1]==1 && p1[2]==1)
			return 1;
		if(p1[3]==1 && p1[4]==1 && p1[5]==1)
			return 1;
		if(p1[6]==1 && p1[7]==1 && p1[8]==1)
			return 1;
		if(p1[0]==1 && p1[4]==1 && p1[8]==1)
			return 1;
		if(p1[2]==1 && p1[4]==1 && p1[6]==1)
			return 1;
		if(p1[0]==1 && p1[3]==1 && p1[6]==1)
			return 1;
		if(p1[1]==1 && p1[4]==1 && p1[7]==1)
			return 1;
		if(p1[2]==1 && p1[5]==1 && p1[8]==1)
			return 1;
		if(p1[0]==1 && p1[4]==1 && p1[8]==1)
			return 1;
		return 0;
	}
	int pw2() {
		if(p2[0]==1 && p2[1]==1 && p2[2]==1)
			return 1;
		if(p2[3]==1 && p2[4]==1 && p2[5]==1)
			return 1;
		if(p2[6]==1 && p2[7]==1 && p2[8]==1)
			return 1;
		if(p2[0]==1 && p2[4]==1 && p2[8]==1)
			return 1;
		if(p2[2]==1 && p2[4]==1 && p2[6]==1)
			return 1;
		if(p2[0]==1 && p2[3]==1 && p2[6]==1)
			return 1;
		if(p2[1]==1 && p2[4]==1 && p2[7]==1)
			return 1;
		if(p2[2]==1 && p2[5]==1 && p2[8]==1)
			return 1;
		if(p2[0]==1 && p2[4]==1 && p2[8]==1)
			return 1;
		return 0;
	}
	public TicTacToe() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 void initialize() {
		frmTictactoe = new JFrame();
		frmTictactoe.setTitle("TicTacToe");
		frmTictactoe.getContentPane().setBackground(Color.BLACK);
		frmTictactoe.setBounds(100, 100, 300, 300);
		frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTictactoe.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn1.setForeground(Color.BLUE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bu[0]==0) {
				if(turn==false) {
					turn =true;
				btn1.setText("X");
				bu[0]=1;
				p1[0]=1;
			
				}
				else {
					turn =false;
					btn1.setText("0");
					bu[0]=1;
					
					p2[0]=1;
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "Already marked button","Error",JOptionPane.WARNING_MESSAGE);
				}
				int r1 = pw1();
				int r2 = pw2();
				if(r1==1)
					JOptionPane.showMessageDialog(null, "Player 1 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				else if(r2==1)
					JOptionPane.showMessageDialog(null, "Player 2 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				
	
			}
		});
		btn1.setBounds(34, 39, 51, 43);
		frmTictactoe.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2.setForeground(Color.BLUE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bu[1]==0) {
				if(turn==false) {
					turn =true;
					bu[1]=1;
					p1[1]=1;
					
				btn2.setText("X");}
				else {
					turn = false;
					btn2.setText("0");
					bu[1]=1;
					p2[1]=1;
				}
			}
				
			else {
				JOptionPane.showMessageDialog(null, "Already marked button","Error",JOptionPane.WARNING_MESSAGE);
			}
				int r1 = pw1();
				int r2=pw2();
				if(r1==1)
					JOptionPane.showMessageDialog(null, "Player 1 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				else if(r2==1)
					JOptionPane.showMessageDialog(null, "Player 2 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				
	

		}
		});
		btn2.setBounds(88, 39, 51, 43);
		frmTictactoe.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn3.setForeground(Color.BLUE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bu[2]==0) {
				if(turn==false) {
					turn =true;
					bu[2]=1;
					p1[2]=1;
					
				btn3.setText("X");}
				else {
					turn =false;
					btn3.setText("0");
					bu[2]=1;
					p2[2]=1;
					
				}}
				else {
					JOptionPane.showMessageDialog(null, "Already marked button","Error",JOptionPane.WARNING_MESSAGE);
				}
				int r1 = pw1();
				int r2 =pw2();
				if(r1==1)
					JOptionPane.showMessageDialog(null, "Player 1 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				else if(r2==1)
					JOptionPane.showMessageDialog(null, "Player 2 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				
	

			}
		});
		btn3.setBounds(143, 39, 51, 43);
		frmTictactoe.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn4.setForeground(Color.BLUE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bu[3]==0) {
				if(turn==false) {
					turn =true;
					bu[3]=1;
					p1[3]=1;
				btn4.setText("X");}
				else {
					turn =false;
					bu[3]=1;
					p2[3]=1;
					btn4.setText("0");
					
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Already marked button","Error",JOptionPane.WARNING_MESSAGE);
			}
				int r1 = pw1();
				int r2 = pw2();
				if(r1==1)
					JOptionPane.showMessageDialog(null, "Player 1 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				else if(r2==1)
					JOptionPane.showMessageDialog(null, "Player 2 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				
	

			}
		});
		btn4.setBounds(34, 84, 51, 43);
		frmTictactoe.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn5.setForeground(Color.BLUE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bu[4]==0) {
				if(turn==false) {
					turn =true;
					bu[4]=1;
					p1[4]=1;
				btn5.setText("X");}
				else {
					turn =false;
					bu[4]=1;
					p2[4]=1;
					btn5.setText("0");
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "Already marked button","Error",JOptionPane.WARNING_MESSAGE);
				}
				int r1 = pw1();
				int r2 = pw2();
				if(r1==1)
					JOptionPane.showMessageDialog(null, "Player 1 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				else if(r2==1)
					JOptionPane.showMessageDialog(null, "Player 2 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				
	

			}
		});
		btn5.setBounds(88, 84, 51, 43);
		frmTictactoe.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn6.setForeground(Color.BLUE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bu[5]==0) {
				if(turn==false) {
					turn =true;
					bu[5]=1;
					p1[5]=1;
				btn6.setText("X");}
				else {
					turn =false;
					bu[5]=1;
					p2[5]=1;
					btn6.setText("0");
				}}
				else {
					JOptionPane.showMessageDialog(null, "Already marked button","Error",JOptionPane.WARNING_MESSAGE);
				}
				int r1 = pw1();
				int r2 = pw2();
				if(r1==1)
					JOptionPane.showMessageDialog(null, "Player 1 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				else if(r2==1)
					JOptionPane.showMessageDialog(null, "Player 2 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				
	

			}
		});
		btn6.setBounds(143, 84, 51, 43);
		frmTictactoe.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn7.setForeground(Color.BLUE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bu[6]==0) {
				if(turn==false) {
					turn =true;
					bu[6]=1;
					p1[6]=1;
				btn7.setText("X");}
				else {
					turn =false;
					bu[6]=1;
					p2[6]=1;
					btn7.setText("0");
					
				}}
				else {
					JOptionPane.showMessageDialog(null, "Already marked button","Error",JOptionPane.WARNING_MESSAGE);
				}
				int r1 = pw1();
				int r2 = pw2();
				if(r1==1)
					JOptionPane.showMessageDialog(null, "Player 1 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				else if(r2==1)
					JOptionPane.showMessageDialog(null, "Player 2 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				
	

			}
		});
		btn7.setBounds(34, 129, 51, 43);
		frmTictactoe.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn8.setForeground(Color.BLUE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bu[7]==0) {
				if(turn==false) {
					turn =true;
					bu[7]=1;
					p1[7]=1;
				btn8.setText("X");}
				else {
					turn =false;
					bu[7]=1;
					p2[7]=1;
					btn8.setText("0");
				}}
				else {
					JOptionPane.showMessageDialog(null, "Already marked button","Error",JOptionPane.WARNING_MESSAGE);
				}
				int r1 = pw1();
				int r2  = pw2();
				if(r1==1)
					JOptionPane.showMessageDialog(null, "Player 1 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				else if(r2==1)
					JOptionPane.showMessageDialog(null, "Player 2 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				
	

			}
		});
		btn8.setBounds(88, 129, 51, 43);
		frmTictactoe.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn9.setForeground(Color.BLUE);
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bu[8]==0) {
				if(turn==false) {
					turn =true;
					bu[8]=1;
					p1[8]=1;
				btn9.setText("X");}
				else {
					turn =false;
					bu[8]=1;
					p2[8]=1;
					btn9.setText("0");
				}}
				else {
					JOptionPane.showMessageDialog(null, "Already marked button","Error",JOptionPane.WARNING_MESSAGE);
				}
				int r1= pw1();
				int r2 = pw2();
				if(r1==1)
					JOptionPane.showMessageDialog(null, "Player 1 won", "Winner", JOptionPane.DEFAULT_OPTION);
				else if(r2==1)
					JOptionPane.showMessageDialog(null, "Player 2 won", "Winner", JOptionPane.DEFAULT_OPTION);				
				
	

				
			}
		});
		btn9.setBounds(143, 129, 51, 43);
		frmTictactoe.getContentPane().add(btn9);
		
		JButton btnStart = new JButton("New game");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turn = false;
			//	p1[] = {0,0,0,0,0,0,0,0,0};
				btn1.setText(null);
				bu[0]=0;
				p1[0]=0;
				p2[0]=0;
				btn2.setText(null);
				bu[1]=0;
				p1[1]=0;
				p2[1]=0;
				btn3.setText(null);
				bu[2]=0;
				p1[2]=0;
				p2[2]=0;
				btn4.setText(null);
				bu[3]=0;
				p1[3]=0;
				p2[3]=0;
				btn5.setText(null);
				bu[4]=0;
				p1[4]=0;
				p2[4]=0;
				btn6.setText(null);
				bu[5]=0;
				p1[5]=0;
				p2[5]=0;
				btn7.setText(null);
				bu[6]=0;
				p1[6]=0;
				p2[6]=0;
				btn8.setText(null);
				bu[7]=0;
				p1[7]=0;
				p2[7]=0;
				btn9.setText(null);
				bu[8]=0;
				p1[8]=0;
				p2[8]=0;
			
			}
		});
		btnStart.setBounds(23, 207, 98, 23);
		frmTictactoe.getContentPane().add(btnStart);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you want to exit?","Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
					System.exit(0);
			}
		});
		btnExit.setBounds(143, 207, 98, 23);
		frmTictactoe.getContentPane().add(btnExit);
		
		JLabel lblplayer = new JLabel("X: Player 1");
		lblplayer.setForeground(Color.WHITE);
		lblplayer.setBounds(204, 39, 70, 14);
		frmTictactoe.getContentPane().add(lblplayer);
		
		JLabel lblX = new JLabel("0: Player 2");
		lblX.setForeground(Color.WHITE);
		lblX.setBounds(204, 68, 70, 14);
		frmTictactoe.getContentPane().add(lblX);
		
		
	}
	 
	
}

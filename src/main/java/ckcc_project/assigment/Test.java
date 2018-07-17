package ckcc_project.assigment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Test extends JFrame implements ActionListener {
	private static final JPanel JPanel = null;
	JMenuBar menuBar;
	JMenu mFile, mProduct,mCheckOut,mHelp, mCheckIn;
	//  menu for Fiel
	JMenuItem itemNew , itemsave,itemexit;
	// Menu For Product
	JMenuItem itemNewProduct , itemListProduct;
	// Menu For Check IN
	JMenuItem itemshopping ;
	// Menu for Check Out
	JMenuItem itemReport;
	
	JMenuItem itemWelcome,itemHelpConents,itemCheckUpdate,itemAboutProduct;
	
	

	public Test() {
		// create menu file
	
		itemNew = new JMenuItem("New");
		itemsave = new JMenuItem("Save");
		itemexit = new JMenuItem("Exit");
		
		//create Object for Menu add item
		mFile = new  JMenu("File") ;
		mFile.add(itemNew);
		mFile.add(itemsave);
		mFile.add(itemexit);
//=======================================end JMenu file
		// Create Menu For Product
		
		itemNewProduct  = new JMenuItem( "New Product");
		itemListProduct = new JMenuItem("List Product");	
	
		//create Object For Product
		mProduct = new JMenu("Product");
		mProduct.add(itemNewProduct);
		mProduct.add(itemListProduct);
//============================================End Jmenu Product 
		// create menu checkIN
		itemshopping = new JMenuItem("Go to Shopping ");
		//create Object  for Check  In
		mCheckIn = new JMenu("Check IN");
		mCheckIn.add(itemshopping);
//=================================================End For Menu Check IN
		// create menu Check Out
		itemReport = new JMenuItem("Report");
		// create Object  for Jmeun Check Out
		mCheckOut =new JMenu("Check Out");
		mCheckOut.add(itemReport);
//=================================================End For Menu Check Out
		// create Object For Help
		itemWelcome = new JMenuItem("Welcome");
		itemHelpConents = new  JMenuItem("Help Conents");
		itemCheckUpdate = new JMenuItem("Check Update");
		itemAboutProduct = new  JMenuItem("About Product");
		mHelp =new JMenu("Help");
         mHelp.add(itemWelcome);
         mHelp.add(itemHelpConents);
         mHelp.add(itemCheckUpdate);
         mHelp.add(itemAboutProduct);
		
		//Add JMenuBar For Menu 
		menuBar = new   JMenuBar();
		menuBar .add(mFile );
		menuBar.add(mProduct);
		menuBar .add(mCheckIn);
		menuBar.add(mCheckOut);
		menuBar.add(mHelp);
		
//===========================================End of Menu 
		
		//Add For Frame JMenu 
		add(menuBar);
		setTitle("Shopping Cart .....");
		setJMenuBar(menuBar);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
 public static void main(String[] args) {
	 new Test();
}

}

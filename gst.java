import javax.swing.* ; 
import java.awt.event.*;
import java.awt.*;
public class gst extends JFrame
{
    int a,b,c,d,e,f,g,h,i,j,k,l;
	JLabel ln,lc,lq,lp,lsgst,lcgst,ld,lcp,lti,bv1,bsgst1,bcgst1,bd1,bta1,bb1;
	JTextField tn,tc,tq,tp,tsgst,tcgst,td,tcp;
	JButton bv,bsgst,bcgst,bd,bta,bb;
    public gst()
	{
	}
	public gst(String a)
	{
		super(a);
	}
	void setComponents()
	{
	ln=new JLabel("Enter the Name of Product");
	tn=new JTextField();
	lc=new JLabel("Enter the Code Of Product");
	tc=new JTextField();
	lq=new JLabel("Enter the Quantity of Product");
    tq=new JTextField();
	lp=new JLabel("Enter the Price of Product");
    tp=new JTextField();
	lsgst=new JLabel("Enter the SGST");
	tsgst=new JTextField();
	lcgst=new JLabel("Enter the CGST");
	tcgst=new JTextField();
	ld=new JLabel("DISCOUNT %");
	td=new JTextField();
    lcp=new JLabel("CASH PAID");
    tcp=new JTextField();
    lti=new JLabel("GOODS AND SERVICE TAX INVOICE (GSTIN NO.07APAFD824)");
    bv=new JButton("VALUE");
    bsgst=new JButton("SGST");
    bcgst=new JButton("CGST");
    bd=new JButton("DISCOUNT");
    bta=new JButton("TOTAL AMOUNT");
    bb=new JButton("BILL");
    bd1=new JLabel("");
    bta1=new JLabel("");
    bb1=new JLabel("");
    bv1=new JLabel("");
    bcgst1=new JLabel("");
    bsgst1=new JLabel("");
    setLayout(null);
	setSize(600,800);
    ln.setBounds(40,40,150,20);
    tn.setBounds(220,40,100,20);
    lc.setBounds(40,80,150,20);
    tc.setBounds(220,80,100,20);
    lq.setBounds(40,120,180,20);
    tq.setBounds(220,120,100,20);
    lp.setBounds(40,160,150,20);
    tp.setBounds(220,160,100,20);
    lsgst.setBounds(80,240,100,20);
    tsgst.setBounds(220,240,100,20);
    lcgst.setBounds(80,280,150,20);
    tcgst.setBounds(220,280,100,20);
    ld.setBounds(80,400,150,20);
    td.setBounds(220,400,100,20);
    lcp.setBounds(80,480,100,20);
    tcp.setBounds(220,480,100,20);
    bv.setBounds(40,200,140,20);
    bsgst.setBounds(40,320,140,20);
    bcgst.setBounds(40,360,140,20);
    bd.setBounds(40,440,140,20);
    bta.setBounds(40,520,140,20);
    bb.setBounds(40,560,140,20);
    lti.setBounds(50,0,350,40);
    bv1.setBounds(220,200,200,20);
    bsgst1.setBounds(220,320,200,20);
    bcgst1.setBounds(220,360,200,20);
    bd1.setBounds(220,440,250,20);
    bta1.setBounds(220,520,200,20);
    bb1.setBounds(220,560,200,20);
    add(tq);
    add(lq);
	add(ln);
	add(tn);
	add(lc);
	add(tc);
	add(lp);
	add(tp);
	add(lsgst);
	add(tsgst);
	add(lcgst);
	add(tcgst);
	add(ld);
	add(td);
	add(lcp);
	add(tcp);
	add(bv);
	add(bsgst);
	add(bcgst);
	add(bd);
	add(bta);
	add(bb);
	add(lti);
	add(bv1);
	add(bsgst1);
	add(bcgst1);
	add(bd1);
	add(bta1);
	add(bb1);
	bv.addActionListener(new Myhandler1());
	bsgst.addActionListener(new Myhandler2());
	bcgst.addActionListener(new Myhandler3());
    bd.addActionListener(new Myhandler4());
    bta.addActionListener(new Myhandler5());
    bb.addActionListener(new Myhandler6());
}

class Myhandler1 implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
	    a=Integer.parseInt(tp.getText());
        b=Integer.parseInt(tq.getText());
        c=a*b;
        bv1.setText("The value is="+c);
    }
}
class Myhandler2 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		d=Integer.parseInt(tsgst.getText());
		e=(c*d)/100;
		bsgst1.setText("The SGST applied is="+e);
    }
}
class Myhandler3 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		f=Integer.parseInt(tcgst.getText());
		g=(c*f)/100;
		bcgst1.setText("The CGST applied is="+g);
    }
}
class Myhandler4 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		h=Integer.parseInt(td.getText());
		i=(c*h)/100;
		bd1.setText("Great,You have a discount=Rs."+i);
    }
}
class Myhandler5 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{  
		j=(c+e+g-i);
		bta1.setText("Your total amount is =Rs."+j);
    }
}
class Myhandler6 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{  
		k=Integer.parseInt(tcp.getText());
		l=(k-j);
		bb1.setText("Balance amount is =Rs."+l);
    }
}
public static void main(String arg[])
{
	gst g=new gst();
	g.setComponents();
	g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    g.setVisible(true);
}
}
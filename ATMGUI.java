import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class ATMGUI{
    public static void main(String[] args) {
        fun();
    }
    public static void fun(){
        Page1 obj=new Page1();
    }
}
class AccountType{
    AccountType(){
        Frame f=new Frame("ACCOUNT TYPE");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);

        Label selectAccTypeLabel=new Label("Select your account type");
        selectAccTypeLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        selectAccTypeLabel.setBounds(100,100,200,30);
        f.add(selectAccTypeLabel);

        JRadioButton savingAccR=new JRadioButton("Savings"); 
        savingAccR.setFont(new Font("Times new Roman",Font.BOLD,15));
        savingAccR.setBackground(Color.gray);
        savingAccR.setBounds(100,150,90,30);
        f.add(savingAccR);

        JRadioButton checkingAccR=new JRadioButton("Checking"); 
        checkingAccR.setFont(new Font("Times new Roman",Font.BOLD,15));
        checkingAccR.setBackground(Color.gray);
        checkingAccR.setBounds(200,150,90,30);
        f.add(checkingAccR);

        ButtonGroup bg=new ButtonGroup();
        bg.add(savingAccR);
        bg.add(checkingAccR);

        Button click=new Button("Submit");
        click.setFont(new Font("Times new Roman",Font.BOLD,15));
        click.setBounds(150,200,100,30);
        click.setBackground(Color.gray);
        f.add(click);

        click.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    if(savingAccR.isSelected() || checkingAccR.isSelected()){
                        CreateOrLoginPage obj=new CreateOrLoginPage();
                    }
                    else{
                        JOptionPane.showMessageDialog(f,"Please select account type");
                    }
                }
            }
        );

        Button back=new Button("<Back");
        back.setBackground(Color.gray);
        back.setFont(new Font("Times new Roman",Font.BOLD,12));
        back.setBounds(10,360,50,30);
        f.add(back);

        back.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();
                }
            }
        );

        f.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    f.dispose();
                }
            }
        );
    }
}
class Page1{
    Page1(){
        Frame f=new Frame("ATM MACHINE");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);

        Button back=new Button("<Exit");
        back.setBackground(Color.gray);
        back.setFont(new Font("Times new Roman",Font.BOLD,12));
        back.setBounds(10,360,50,30);
        f.add(back);

        back.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    System.exit(1);
                }
            }
        );

        Label titleLabel=new Label("WELCOME TO MVGR ATM");
        titleLabel.setFont(new Font("Times new Roman",Font.BOLD,20));
        titleLabel.setBounds(70,50,270,30);
        f.add(titleLabel);

        Label maintainLabel=new Label("THIS ATM IS MAINTAINED BY MANASAS");
        maintainLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        maintainLabel.setBounds(50,100,300,30);
        f.add(maintainLabel);

        Label addressLabel=new Label("THIS ATM IS AT NEAR CSE DEPT");
        addressLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        addressLabel.setBounds(70,150,300,30);
        f.add(addressLabel);

        Label suggessionLabel=new Label("Don't remove the card until notified");
        suggessionLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        suggessionLabel.setBounds(60,200,300,30);
        f.add(suggessionLabel);

        Label startLabel=new Label("Start your procedure");
        startLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        startLabel.setBounds(90,250,300,30);
        f.add(startLabel);

        Label intro=new Label("Please insert your card..");
        intro.setBounds(70,360,190,30);
        intro.setFont(new Font("Times new Roman",Font.BOLD,15));
        intro.setBackground(Color.gray);
        f.add(intro);

        Button ok=new Button("Confirm ");
        ok.setBounds(270,360,100,30);
        ok.setFont(new Font("Times new Roman",Font.BOLD,15));
        ok.setBackground(Color.gray);
        f.add(ok);

        ok.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    AccountType obj=new AccountType();
                }
            }
        );

        f.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    f.dispose();
                }
            }
        );
    }
    public static void main(String[] args) {
        Page1 objpage=new Page1();
    }
}

class CreateOrLoginPage{
    public Label createAccPin,loginAcc;
    public Button createAccPinButton,loginAccButton;
    CreateOrLoginPage(){
        Frame f=new Frame("Create or Login Page");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);

        createAccPin=new Label("Change pin");
        createAccPin.setFont(new Font("Times new Roman",Font.BOLD,15));
        createAccPin.setBackground(Color.pink);
        createAccPin.setBounds(100,100,200,30);

        createAccPinButton=new Button("Click Here");
        createAccPinButton.setFont(new Font("Times new Roman",Font.BOLD,15));
        createAccPinButton.setBackground(Color.gray);
        createAccPinButton.setBounds(150,150,100,30);

        loginAcc=new Label("Login to your Account");
        loginAcc.setFont(new Font("Times new Roman",Font.BOLD,15));
        loginAcc.setBackground(Color.pink);
        loginAcc.setBounds(100,200,200,30);

        loginAccButton=new Button("Click Here");
        loginAccButton.setFont(new Font("Times new Roman",Font.BOLD,15));
        loginAccButton.setBackground(Color.gray);
        loginAccButton.setBounds(150,250,100,30);

        f.add(createAccPin);
        f.add(loginAcc);
        f.add(createAccPinButton);
        f.add(loginAccButton);

        createAccPinButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    CreatePinButton log=new CreatePinButton();
                }
            }
        );

        loginAccButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    LoginPage log=new LoginPage();
                }
            }
        );

        f.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    f.dispose();
                }
            }
        );

        Button back=new Button("<Back");
        back.setFont(new Font("Times new Roman",Font.BOLD,15));
        back.setBackground(Color.gray);
        back.setBounds(10,360,50,30);
        f.add(back);

        back.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();
                }
            }
        );
    }
}

class CreatePinButton extends Record{
    public Label cardNoLabel,oldPinLabel,newPinLabel,pinStatusLabel;
    public static TextField cardNo,oldPinNo ,newPinNo;
    public Button submit;
    CreatePinButton(){
        Frame fpin=new Frame("CHANGE YOUR PIN CAREFULLY");
        fpin.setSize(400,400);
        fpin.setVisible(true);
        fpin.setLayout(null);
        fpin.setResizable(false);

        cardNoLabel=new Label("Enter card number ");
        cardNoLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        cardNoLabel.setBounds(100,50,150,30);
        cardNoLabel.setBackground(Color.gray);

        cardNo=new TextField(20);
        cardNo.setFont(new Font("Times new Roman",Font.BOLD,15));
        cardNo.setBounds(100,100,150,30);

        oldPinLabel=new Label("Enter your old pin");
        oldPinLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        oldPinLabel.setBounds(100,150,150,30);
        oldPinLabel.setBackground(Color.gray);

        oldPinNo=new TextField(20);
        oldPinNo.setFont(new Font("Times new Roman",Font.BOLD,15));
        oldPinNo.setEchoChar('*');
        oldPinNo.setBounds(100,200,150,30);

        newPinLabel=new Label("Enter your new pin");
        newPinLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        newPinLabel.setBounds(100,250,150,30);
        newPinLabel.setBackground(Color.gray);

        newPinNo=new TextField(20);
        newPinNo.setFont(new Font("Times new Roman",Font.BOLD,15));
        newPinNo.setEchoChar('*');
        newPinNo.setBounds(100,300,150,30);

        submit=new Button("Submit");
        submit.setFont(new Font("Times new Roman",Font.BOLD,15));
        submit.setBounds(100,350,100,30);
        submit.setBackground(Color.gray);

        fpin.add(cardNoLabel);
        fpin.add(cardNo);
        fpin.add(oldPinLabel);
        fpin.add(oldPinNo);
        fpin.add(newPinLabel);
        fpin.add(newPinNo);
        fpin.add(submit);

        submit.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String s1=cardNo.getText();
                    String s2=oldPinNo.getText();
                    String s3=newPinNo.getText();
                    try{
                        if(s1.equals(accountnumber)&&s2.equals(PinNumber)){
                            if(!s2.equals(s3)){
                                JOptionPane.showMessageDialog(fpin,"Succussfully updated");
                                changePin(s3);
                            }else{
                                JOptionPane.showMessageDialog(fpin,"old and new pins must be different");    
                            }
                        }else{
                            JOptionPane.showMessageDialog(fpin,"Invalid details");    
                        }
                    }catch(Exception e){
                        fpin.dispose();
                    }
                }
            }
        );

        fpin.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    fpin.dispose();
                }
            }
        );
        
        Button back=new Button("<Back");
        back.setFont(new Font("Times new Roman",Font.BOLD,15));
        back.setBackground(Color.gray);
        back.setBounds(10,360,50,30);
        fpin.add(back);

        back.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    fpin.dispose();
                }
            }
        );
    }
}
class LoginPage extends Record{
    LoginPage(){
        Frame fOk=new Frame("Login Page");
        fOk.setSize(400,400);
        fOk.setVisible(true);
        fOk.setLayout(null);
        fOk.setResizable(false);

        Label cardNoLabel=new Label("Enter card number ");
        cardNoLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        cardNoLabel.setBounds(100,100,200,30);
        cardNoLabel.setBackground(Color.gray);

        TextField cardNo=new TextField(20);
        cardNo.setFont(new Font("Times new Roman",Font.BOLD,15));
        cardNo.setBounds(100,150,150,30);

        Label pinLabel=new Label("Enter Pin number ");
        pinLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        pinLabel.setBounds(100,200,200,30);
        pinLabel.setBackground(Color.gray);

        TextField pinNo=new TextField(20);
        pinNo.setFont(new Font("Times new Roman",Font.BOLD,15));
        pinNo.setBounds(100,250,150,30);
        pinNo.setEchoChar('*');

        Button submit=new Button("Submit");
        submit.setFont(new Font("Times new Roman",Font.BOLD,15));
        submit.setBounds(100,300,100,30);
        submit.setBackground(Color.gray);

        Label statusLabel=new Label("");
        statusLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        statusLabel.setBounds(100,350,120,30);

        fOk.add(cardNoLabel);
        fOk.add(cardNo);
        fOk.add(pinLabel);
        fOk.add(pinNo);
        fOk.add(submit);
        fOk.add(statusLabel);

        submit.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e1){
                    String accNo=cardNo.getText();
                    String pin=pinNo.getText();
                    try{
                        if(accNo.equals(accountnumber)&&pin.equals(PinNumber)){
                            Page2Options p=new Page2Options();
                            statusLabel.setBackground(null);
                            statusLabel.setText("");
                        }
                        else{
                            statusLabel.setText("Invalid details");
                            statusLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
                            statusLabel.setBackground(Color.red);
                        }
                    }catch(Exception e){
                        fOk.dispose();
                    }
                    }
                }
            );
        fOk.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    fOk.dispose();
                }
            }
        );

        Button back=new Button("<Back");
        back.setFont(new Font("Times new Roman",Font.BOLD,15));
        back.setBackground(Color.gray);
        back.setBounds(10,360,50,30);
        fOk.add(back);

        back.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    fOk.dispose();
                }
            }
        );
    }
}
class Record{
    public static String accountnumber="1234567890";
    public static String PinNumber="3333";
    public static double balance=0.0;
    void changePin(String pin){
        PinNumber=pin;
    }
    void updateBalance(double Balance){
        this.balance=Balance;
    }
}
class Page2Options{
    public Label optionMenu;
    public Button deposit,withdraw,checkBalance,exitButton;
    Page2Options(){
        Frame f=new Frame("Option menu");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);

        optionMenu=new Label("Click on your option");
        optionMenu.setFont(new Font("Times new Roman",Font.BOLD,15));
        optionMenu.setBounds(100,100,150,30);
        optionMenu.setBackground(Color.PINK);

        deposit=new Button("Deposit");
        deposit.setFont(new Font("Times new Roman",Font.BOLD,15));
        deposit.setBackground(Color.gray);
        deposit.setBounds(120,150,110,30);

        withdraw=new Button("WithDraw");
        withdraw.setFont(new Font("Times new Roman",Font.BOLD,15));
        withdraw.setBackground(Color.gray);
        withdraw.setBounds(120,200,110,30);

        checkBalance=new Button("Balance Check");
        checkBalance.setFont(new Font("Times new Roman",Font.BOLD,15));
        checkBalance.setBackground(Color.gray);
        checkBalance.setBounds(120,250,110,30);

        exitButton=new Button("Logout");
        exitButton.setFont(new Font("Times new Roman",Font.BOLD,15));
        exitButton.setBackground(Color.gray);
        exitButton.setBounds(120,300,110,30);


        f.add(optionMenu);
        f.add(deposit);
        f.add(withdraw);
        f.add(checkBalance);
        f.add(exitButton);

        deposit.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    new Deposit(); 
                }
            }
        );

        withdraw.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    new WithDraw(); 
                }
            }
        );
        
        checkBalance.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    new CheckBalance(); 
                }
            }
        );

        exitButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    System.exit(1);
                }
            }
        );

        f.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    f.dispose();
                }
            }
        );

        Button back=new Button("<Back");
        back.setFont(new Font("Times new Roman",Font.BOLD,15));
        back.setBackground(Color.gray);
        back.setBounds(10,360,50,30);
        f.add(back);

        back.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();
                }
            }
        );
        
    }
}
class CheckBalance extends Record{
    CheckBalance(){
        Frame f=new Frame("Balance checking page");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);

        Label accLabel=new Label("Your account number is : "+accountnumber);
        accLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        accLabel.setBounds(50,100,300,30);
        accLabel.setBackground(Color.gray);
        f.add(accLabel);

        Label pinLabel=new Label("Your PIN number is : "+PinNumber);
        pinLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        pinLabel.setBounds(100,150,200,30);
        pinLabel.setBackground(Color.gray);
        f.add(pinLabel);

        Label bankDetails=new Label("Your Account is belongs to MVGR BANK");
        bankDetails.setFont(new Font("Times new Roman",Font.BOLD,15));
        bankDetails.setBounds(50,200,300,30);
        bankDetails.setBackground(Color.gray);
        f.add(bankDetails);

        Label bankPinCode=new Label("MVGR BANK PIN CODE IS 33");
        bankPinCode.setFont(new Font("Times new Roman",Font.BOLD,15));
        bankPinCode.setBounds(100,250,200,30);
        bankPinCode.setBackground(Color.gray);
        f.add(bankPinCode);

        Label moneyLabel=new Label("Your current bank balance : "+balance);
        moneyLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        moneyLabel.setBounds(50,300,300,30);
        moneyLabel.setBackground(Color.green);
        f.add(moneyLabel);

        Button back=new Button("Back");
        back.setFont(new Font("Times new Roman",Font.BOLD,15));
        back.setBounds(150,350,100,30);
        back.setBackground(Color.pink);
        f.add(back);

        back.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();   
                }
            }
        );

        f.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    f.dispose();
                }
            }
        );

    }
}
class Deposit extends Record{
    Deposit(){
        Frame f=new Frame("Deposit Page");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);

        Label depositLabel=new Label("Enter money to deposit :");
        depositLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        depositLabel.setBounds(50,100,300,30);
        depositLabel.setBackground(Color.gray);
        f.add(depositLabel);

        TextField moneyText=new TextField();
        moneyText.setFont(new Font("Times new Roman",Font.BOLD,15));
        moneyText.setBounds(100,150,200,30);
        f.add(moneyText);

        Button click=new Button("Deposit");
        click.setFont(new Font("Times new Roman",Font.BOLD,15));
        click.setBounds(100,200,200,30);
        click.setBackground(Color.pink);
        f.add(click);

        click.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Label status;
                    Button done;
                    try{
                        String s=moneyText.getText();
                        double d=Double.parseDouble(s);
                        balance=balance+d;
                        updateBalance(balance);

                    Label miniStmt=new Label("Total money in your account:"+balance);
                    miniStmt.setFont(new Font("Times new Roman",Font.BOLD,15));
                    miniStmt.setBackground(Color.pink);
                    miniStmt.setBounds(50,300,300,30);
                    f.add(miniStmt);

                    done=new Button("DONE");
                    done.setFont(new Font("Times new Roman",Font.BOLD,15));
                    done.setBackground(Color.gray);
                    done.setBounds(150,350,100,30);
                    f.add(done);

                    done.addActionListener(
                        new ActionListener(){
                            public void actionPerformed(ActionEvent adone) {
                                f.dispose();                               
                            }
                        }
                    );
                    status=new Label("Deposited "+s+"RS successfully");
                    status.setFont(new Font("Times new Roman",Font.BOLD,15));
                    status.setBackground(Color.green);
                    status.setBounds(100,250,200,30);
                    f.add(status);

                    }catch(Exception e1){
                        status=new Label("Invalid Details Try again");
                        status.setFont(new Font("Times new Roman",Font.BOLD,15));
                        status.setBackground(Color.red);
                        status.setBounds(100,250,200,30);
                        f.add(status);  
                    }

                }
            }
        );

        f.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    f.dispose();
                }
            }
        );

        Button back=new Button("<Back");
        back.setFont(new Font("Times new Roman",Font.BOLD,15));
        back.setBackground(Color.gray);
        back.setBounds(10,360,50,30);
        f.add(back);

        back.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();
                }
            }
        );
    }
}
class WithDraw extends Record{
    WithDraw(){
        Frame f=new Frame("Withdraw Page");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);

        Label withdrawLabel=new Label("Enter money to withdraw :");
        withdrawLabel.setFont(new Font("Times new Roman",Font.BOLD,15));
        withdrawLabel.setBounds(50,100,300,30);
        withdrawLabel.setBackground(Color.gray);
        f.add(withdrawLabel);

        TextField moneyText=new TextField();
        moneyText.setFont(new Font("Times new Roman",Font.BOLD,15));
        moneyText.setBounds(100,150,200,30);
        f.add(moneyText);

        Button click=new Button("Withdraw");
        click.setFont(new Font("Times new Roman",Font.BOLD,15));
        click.setBounds(100,200,200,30);
        click.setBackground(Color.pink);
        f.add(click);

        click.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Button done;
                    String s=moneyText.getText();
                    double d=Double.parseDouble(s);
                    if(balance<d){
                        Label status=new Label("Insufficiant Balance");
                        status.setFont(new Font("Times new Roman",Font.BOLD,15));
                        status.setBackground(Color.red);
                        status.setBounds(100,250,200,30);
                        f.add(status);

                        Label miniStmt=new Label("Total money in tour account:"+balance);
                        miniStmt.setFont(new Font("Times new Roman",Font.BOLD,15));
                        miniStmt.setBackground(Color.pink);
                        miniStmt.setBounds(50,300,300,30);
                        f.add(miniStmt);
                    }
                    else{
                        balance=balance-d;
                        updateBalance(balance);
                        Label status=new Label("Withdrawed "+s+"RS successfully");
                        status.setFont(new Font("Times new Roman",Font.BOLD,15));
                        status.setBackground(Color.green);
                        status.setBounds(100,250,200,30);
                        f.add(status);

                        Label miniStmt=new Label("Total money in tour account:"+balance);
                        miniStmt.setFont(new Font("Times new Roman",Font.BOLD,15));
                        miniStmt.setBackground(Color.pink);
                        miniStmt.setBounds(50,300,300,30);
                        f.add(miniStmt);
                    }
                    done=new Button("DONE");
                    done.setFont(new Font("Times new Roman",Font.BOLD,15));
                    done.setBackground(Color.gray);
                    done.setBounds(150,350,100,30);
                    f.add(done);

                    done.addActionListener(
                        new ActionListener(){
                            public void actionPerformed(ActionEvent adone) {
                                f.dispose();                               
                            }
                        }
                    );
                }
            }
        );

        f.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    f.dispose();
                }
            }
        );

        Button back=new Button("<Back");
        back.setFont(new Font("Times new Roman",Font.BOLD,15));
        back.setBackground(Color.gray);
        back.setBounds(10,360,50,30);
        f.add(back);

        back.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();
                }
            }
        );
    }
}
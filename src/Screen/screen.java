package Screen;
import Item.ItemDto;import ItemBao.ItemBao;
import ItemBao.ItemBaoFactory;
import employee.Bao.EmployeeBao;
import employee.Bao.EmployeeFactory;
import employee.EmployeeDto;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
public class screen extends javax.swing.JFrame {
         EmployeeBao employee=new EmployeeFactory().returnobject();
         ItemBao item=new ItemBaoFactory().newobject();  
         boolean done=false;
         double TotalPrice=0;
         String chooseoperation=null;
         int FristPrintingTable=0;
         int FristPrintingTable1=0;
         int FristPrintingTable2=0;
         int CountSizeTable=0;
         int CountSizeTable1=0;
         int CountSizeTable2=0;
         DefaultTableModel bill; 
         DefaultTableModel bill1 ;
public screen() {
initComponents();
this.setResizable(false);
this.setLocation(300,40);
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("33.png")));
        this.bill = (DefaultTableModel) billtable.getModel();
        this.bill1=(DefaultTableModel) billtable1.getModel();
MainScreen.setVisible(false);
PreScreen.setVisible(false);
Add_Edit_Employee.setVisible(false);
ShowAll.setVisible(false);  
Addition_Item_Panel.setVisible(false);
Modification_Item_Panel.setVisible(false);
ShowAll_Item_Panel.setVisible(false);
Show_Item_Panel.setVisible(false);
modification_Category_Panel.setVisible(false);
Addition_Category_Panel.setVisible(false);
Removal_Catagory_Panel.setVisible(false);
  CategoryList.addItem("food");
     CatagoryList2.addItem("food");
     CategoryList1.addItem("food");
     CategoryList3.addItem("food");
     billcatagory.addItem("food");
     billcatagory1.addItem("food");
     CategoryList.addItem("clean");
     CatagoryList2.addItem("clean");
     CategoryList1.addItem("clean");
     CategoryList3.addItem("clean");
     billcatagory.addItem("clean");
     billcatagory1.addItem("clean");
employee= Storing.user();
item=Storing.items();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogIn = new javax.swing.JPanel();
        EmployeeIcon = new javax.swing.JRadioButton();
        EmployeerIcon = new javax.swing.JRadioButton();
        LogInIcon = new javax.swing.JButton();
        PasswordIcon = new javax.swing.JPasswordField();
        namelog = new javax.swing.JLabel();
        passwordlog = new javax.swing.JLabel();
        joblog = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        MainScreen = new javax.swing.JTabbedPane();
        Profile = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        nameemp = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        idemp = new javax.swing.JLabel();
        ageemp = new javax.swing.JLabel();
        genderemp = new javax.swing.JLabel();
        passwordemp = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        Catagory = new javax.swing.JPanel();
        Modification_Catagory_Button = new javax.swing.JButton();
        Delete_Catagory_Button = new javax.swing.JButton();
        Add_Catagory_Button = new javax.swing.JButton();
        Operations_Panel = new javax.swing.JLayeredPane();
        Removal_Catagory_Panel = new javax.swing.JPanel();
        NameCatagory2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        OkRemovalButton = new javax.swing.JButton();
        modification_Category_Panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NameCatagory = new javax.swing.JTextField();
        NewNameCatagory = new javax.swing.JTextField();
        OkModificatioButton = new javax.swing.JButton();
        Addition_Category_Panel = new javax.swing.JPanel();
        NameCatagory1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        OkAdditionButton = new javax.swing.JButton();
        Items = new javax.swing.JPanel();
        Addition_Item_Button = new javax.swing.JButton();
        Edit_Item_Button = new javax.swing.JButton();
        Delete_Item_Button = new javax.swing.JButton();
        Show_Item_Button = new javax.swing.JButton();
        ShowAll_Item_Button = new javax.swing.JButton();
        Operation_Item_panel = new javax.swing.JLayeredPane();
        Addition_Item_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Item_Name = new javax.swing.JTextField();
        CategoryList = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Item_Barcood = new javax.swing.JTextField();
        ITem_Quntity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        OK_Addition = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Item_Price = new javax.swing.JTextField();
        Modification_Item_Panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CategoryList1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Name_Modification = new javax.swing.JTextField();
        Barcood_Modification = new javax.swing.JTextField();
        Quntity_Modification = new javax.swing.JTextField();
        Price_Modification = new javax.swing.JTextField();
        OkModificationItem = new javax.swing.JButton();
        Show_Item_Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowItem = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        CatagoryList2 = new javax.swing.JComboBox<>();
        OkShowButton = new javax.swing.JButton();
        ShowAll_Item_Panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShowAllItem = new javax.swing.JTable();
        Delete_Item_Panel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        DeleteBarcood = new javax.swing.JTextField();
        CategoryList3 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        OkRemovalCategoryButton = new javax.swing.JButton();
        Bill = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        billtable = new javax.swing.JTable();
        billcatagory = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        billbarcood = new javax.swing.JTextField();
        billquntity = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        bill_ok = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        totalprice_icon = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        Employees = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        Add_Employee_Icon = new javax.swing.JButton();
        Delete_Employee_Icon = new javax.swing.JButton();
        Edit_Employee_Icon = new javax.swing.JButton();
        Show_All_Employees_Icon = new javax.swing.JButton();
        oper_emp = new javax.swing.JLayeredPane();
        empty = new javax.swing.JPanel();
        Add_Edit_Employee = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        Male_Icon = new javax.swing.JRadioButton();
        Female_Icon = new javax.swing.JRadioButton();
        gender = new javax.swing.JLabel();
        job = new javax.swing.JLabel();
        Emp_Name_Icon = new javax.swing.JTextField();
        Emp_Age_Icon = new javax.swing.JTextField();
        Emp_Id_Icon = new javax.swing.JTextField();
        Emp_Icon = new javax.swing.JRadioButton();
        Empr_Icon = new javax.swing.JRadioButton();
        Emp_PassWord_Icon = new javax.swing.JPasswordField();
        Ok_Emp_Add = new javax.swing.JButton();
        ShowAll = new javax.swing.JPanel();
        Employees_Icon = new javax.swing.JScrollPane();
        Data_Employees = new javax.swing.JTable();
        delete_emp = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        id_removel_emp = new javax.swing.JTextField();
        removel_ok = new javax.swing.JButton();
        PreScreen = new javax.swing.JTabbedPane();
        Profile1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        nameemp1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        idemp1 = new javax.swing.JLabel();
        ageemp1 = new javax.swing.JLabel();
        genderemp1 = new javax.swing.JLabel();
        passwordemp1 = new javax.swing.JLabel();
        logout1 = new javax.swing.JButton();
        Bill1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        billtable1 = new javax.swing.JTable();
        billcatagory1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        billbarcood1 = new javax.swing.JTextField();
        billquntity1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bill_ok1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        totalprice1 = new javax.swing.JLabel();
        printbill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmployeeIcon.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        EmployeeIcon.setText("Employee");
        EmployeeIcon.setContentAreaFilled(false);
        EmployeeIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeIconActionPerformed(evt);
            }
        });
        LogIn.add(EmployeeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, -1));

        EmployeerIcon.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        EmployeerIcon.setText("Employeer");
        EmployeerIcon.setContentAreaFilled(false);
        EmployeerIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeerIconActionPerformed(evt);
            }
        });
        LogIn.add(EmployeerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 160, -1));

        LogInIcon.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        LogInIcon.setText("Log In");
        LogInIcon.setPreferredSize(new java.awt.Dimension(85, 30));
        LogInIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInIconActionPerformed(evt);
            }
        });
        LogIn.add(LogInIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 250, 40));

        PasswordIcon.setMinimumSize(new java.awt.Dimension(200, 20));
        PasswordIcon.setName(""); // NOI18N
        LogIn.add(PasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 200, 30));

        namelog.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        namelog.setText("Id");
        LogIn.add(namelog, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 70, -1));
        namelog.getAccessibleContext().setAccessibleName("");

        passwordlog.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        passwordlog.setForeground(namelog.getForeground());
        passwordlog.setText("password");
        LogIn.add(passwordlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 120, -1));
        passwordlog.getAccessibleContext().setAccessibleName("Password");

        joblog.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "JOB", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 255))); // NOI18N
        LogIn.add(joblog, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 380, 60));

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        LogIn.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 200, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screen/screen3.png"))); // NOI18N
        LogIn.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 800, 550));

        getContentPane().add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        MainScreen.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        MainScreen.setMinimumSize(new java.awt.Dimension(795, 550));
        MainScreen.setName(""); // NOI18N
        MainScreen.setPreferredSize(new java.awt.Dimension(200, 800));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel24.setText("name");

        nameemp.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel26.setText("id");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel27.setText("age");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel28.setText("gender");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel29.setText("password");

        idemp.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        ageemp.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        genderemp.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        passwordemp.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        logout.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        logout.setText("log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
        Profile.setLayout(ProfileLayout);
        ProfileLayout.setHorizontalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addComponent(passwordemp, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                        .addGap(125, 125, 125))
                    .addComponent(genderemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ageemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfileLayout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ProfileLayout.setVerticalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(nameemp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idemp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ageemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(genderemp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(passwordemp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel29)))
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        MainScreen.addTab("profile", new javax.swing.ImageIcon(getClass().getResource("/Screen/LOG-OUT_.png")), Profile); // NOI18N

        Catagory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Modification_Catagory_Button.setFont(Add_Employee_Icon.getFont());
        Modification_Catagory_Button.setText("Edit Category");
        Modification_Catagory_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modification_Catagory_ButtonActionPerformed(evt);
            }
        });
        Catagory.add(Modification_Catagory_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 205, -1));

        Delete_Catagory_Button.setFont(Add_Employee_Icon.getFont());
        Delete_Catagory_Button.setText("Delete Category");
        Delete_Catagory_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Catagory_ButtonActionPerformed(evt);
            }
        });
        Catagory.add(Delete_Catagory_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, -1));

        Add_Catagory_Button.setFont(Add_Employee_Icon.getFont());
        Add_Catagory_Button.setText("Add Category");
        Add_Catagory_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Catagory_ButtonActionPerformed(evt);
            }
        });
        Catagory.add(Add_Catagory_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 205, -1));

        Operations_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(name.getFont());
        jLabel30.setText("Name");

        OkRemovalButton.setFont(name.getFont());
        OkRemovalButton.setText("ok");
        OkRemovalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkRemovalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Removal_Catagory_PanelLayout = new javax.swing.GroupLayout(Removal_Catagory_Panel);
        Removal_Catagory_Panel.setLayout(Removal_Catagory_PanelLayout);
        Removal_Catagory_PanelLayout.setHorizontalGroup(
            Removal_Catagory_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Removal_Catagory_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NameCatagory2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Removal_Catagory_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkRemovalButton)
                .addContainerGap())
        );
        Removal_Catagory_PanelLayout.setVerticalGroup(
            Removal_Catagory_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Removal_Catagory_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Removal_Catagory_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameCatagory2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(OkRemovalButton)
                .addGap(26, 26, 26))
        );

        Operations_Panel.add(Removal_Catagory_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        Removal_Catagory_Panel.getAccessibleContext().setAccessibleName("");

        modification_Category_Panel.setAlignmentX(1.0F);
        modification_Category_Panel.setAlignmentY(1.0F);
        modification_Category_Panel.setMinimumSize(new java.awt.Dimension(20, 20));

        jLabel11.setFont(name.getFont());
        jLabel11.setText("Name");

        jLabel12.setFont(name.getFont());
        jLabel12.setText("New Name");

        NewNameCatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNameCatagoryActionPerformed(evt);
            }
        });

        OkModificatioButton.setFont(name.getFont());
        OkModificatioButton.setText("ok");
        OkModificatioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkModificatioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modification_Category_PanelLayout = new javax.swing.GroupLayout(modification_Category_Panel);
        modification_Category_Panel.setLayout(modification_Category_PanelLayout);
        modification_Category_PanelLayout.setHorizontalGroup(
            modification_Category_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modification_Category_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modification_Category_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modification_Category_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(NameCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(modification_Category_PanelLayout.createSequentialGroup()
                        .addGroup(modification_Category_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OkModificatioButton)
                            .addGroup(modification_Category_PanelLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NewNameCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        modification_Category_PanelLayout.setVerticalGroup(
            modification_Category_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modification_Category_PanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(modification_Category_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modification_Category_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewNameCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OkModificatioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Operations_Panel.add(modification_Category_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 170));

        jLabel25.setFont(name.getFont());
        jLabel25.setText("Name");

        OkAdditionButton.setFont(name.getFont());
        OkAdditionButton.setText("ok");
        OkAdditionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkAdditionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Addition_Category_PanelLayout = new javax.swing.GroupLayout(Addition_Category_Panel);
        Addition_Category_Panel.setLayout(Addition_Category_PanelLayout);
        Addition_Category_PanelLayout.setHorizontalGroup(
            Addition_Category_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Addition_Category_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NameCatagory1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Addition_Category_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkAdditionButton)
                .addContainerGap())
        );
        Addition_Category_PanelLayout.setVerticalGroup(
            Addition_Category_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Addition_Category_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Addition_Category_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameCatagory1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(OkAdditionButton)
                .addGap(26, 26, 26))
        );

        Operations_Panel.add(Addition_Category_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 170));

        Catagory.add(Operations_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 430, 260));

        MainScreen.addTab("CATEGORY", new javax.swing.ImageIcon(getClass().getResource("/Screen/CATAGORY.png")), Catagory); // NOI18N

        Addition_Item_Button.setFont(name.getFont());
        Addition_Item_Button.setText("Add Items");
        Addition_Item_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addition_Item_ButtonActionPerformed(evt);
            }
        });

        Edit_Item_Button.setFont(name.getFont());
        Edit_Item_Button.setText("Edit Item");
        Edit_Item_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Item_ButtonActionPerformed(evt);
            }
        });

        Delete_Item_Button.setFont(name.getFont());
        Delete_Item_Button.setLabel("Delete Item");
        Delete_Item_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Item_ButtonActionPerformed(evt);
            }
        });

        Show_Item_Button.setFont(name.getFont());
        Show_Item_Button.setText("Show Item");
        Show_Item_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_Item_ButtonActionPerformed(evt);
            }
        });

        ShowAll_Item_Button.setFont(name.getFont());
        ShowAll_Item_Button.setText("Show All Items");
        ShowAll_Item_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAll_Item_ButtonActionPerformed(evt);
            }
        });

        Operation_Item_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(name.getFont());
        jLabel1.setText("Catagory");

        CategoryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryListActionPerformed(evt);
            }
        });

        jLabel2.setFont(name.getFont());
        jLabel2.setText("Name");

        jLabel3.setFont(name.getFont());
        jLabel3.setText("Barcood");

        jLabel4.setFont(name.getFont());
        jLabel4.setText("Quntity");

        OK_Addition.setFont(name.getFont());
        OK_Addition.setText("ok");
        OK_Addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_AdditionActionPerformed(evt);
            }
        });

        jLabel5.setFont(name.getFont());
        jLabel5.setText("Price");

        javax.swing.GroupLayout Addition_Item_PanelLayout = new javax.swing.GroupLayout(Addition_Item_Panel);
        Addition_Item_Panel.setLayout(Addition_Item_PanelLayout);
        Addition_Item_PanelLayout.setHorizontalGroup(
            Addition_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Addition_Item_PanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(Addition_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(Addition_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ITem_Quntity)
                    .addComponent(CategoryList, 0, 182, Short.MAX_VALUE)
                    .addComponent(Item_Name)
                    .addComponent(Item_Barcood)
                    .addComponent(Item_Price))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Addition_Item_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OK_Addition)
                .addGap(56, 56, 56))
        );
        Addition_Item_PanelLayout.setVerticalGroup(
            Addition_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Addition_Item_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Addition_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CategoryList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(Addition_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Item_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(Addition_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Item_Barcood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Addition_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ITem_Quntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(Addition_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Item_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(OK_Addition)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Operation_Item_panel.add(Addition_Item_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 470, 370));

        jLabel6.setFont(name.getFont());
        jLabel6.setText("Catagory");

        jLabel7.setFont(name.getFont());
        jLabel7.setText("New Name");

        jLabel8.setFont(name.getFont());
        jLabel8.setText("Barcood");

        CategoryList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryList1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(name.getFont());
        jLabel9.setText("New Quntity");

        jLabel10.setFont(name.getFont());
        jLabel10.setText("New Price");

        OkModificationItem.setFont(name.getFont());
        OkModificationItem.setText("OK");
        OkModificationItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkModificationItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Modification_Item_PanelLayout = new javax.swing.GroupLayout(Modification_Item_Panel);
        Modification_Item_Panel.setLayout(Modification_Item_PanelLayout);
        Modification_Item_PanelLayout.setHorizontalGroup(
            Modification_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modification_Item_PanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(Modification_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Modification_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CategoryList1, 0, 217, Short.MAX_VALUE)
                    .addComponent(Name_Modification)
                    .addComponent(Barcood_Modification)
                    .addComponent(Quntity_Modification)
                    .addComponent(Price_Modification))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modification_Item_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkModificationItem)
                .addGap(84, 84, 84))
        );
        Modification_Item_PanelLayout.setVerticalGroup(
            Modification_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modification_Item_PanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(Modification_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(Modification_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Name_Modification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(Modification_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Barcood_Modification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(Modification_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Quntity_Modification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(Modification_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Price_Modification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(OkModificationItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Operation_Item_panel.add(Modification_Item_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 520, 350));

        ShowItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "catagory", "name", "barcood", "quntity", "price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ShowItem);

        jLabel13.setText("catagory");

        CatagoryList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatagoryList2ActionPerformed(evt);
            }
        });

        OkShowButton.setText("ok");
        OkShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkShowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Show_Item_PanelLayout = new javax.swing.GroupLayout(Show_Item_Panel);
        Show_Item_Panel.setLayout(Show_Item_PanelLayout);
        Show_Item_PanelLayout.setHorizontalGroup(
            Show_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Show_Item_PanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel13)
                .addGap(78, 78, 78)
                .addComponent(CatagoryList2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkShowButton)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Show_Item_PanelLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        Show_Item_PanelLayout.setVerticalGroup(
            Show_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Show_Item_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Show_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CatagoryList2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkShowButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        Operation_Item_panel.add(Show_Item_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 370));

        ShowAllItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "catagory", "name", "barcood", "price", "quntity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ShowAllItem);

        javax.swing.GroupLayout ShowAll_Item_PanelLayout = new javax.swing.GroupLayout(ShowAll_Item_Panel);
        ShowAll_Item_Panel.setLayout(ShowAll_Item_PanelLayout);
        ShowAll_Item_PanelLayout.setHorizontalGroup(
            ShowAll_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowAll_Item_PanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        ShowAll_Item_PanelLayout.setVerticalGroup(
            ShowAll_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAll_Item_PanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Operation_Item_panel.add(ShowAll_Item_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 540, 360));

        jLabel14.setText("barcood");

        jLabel15.setText("Catagory");

        OkRemovalCategoryButton.setText("ok");
        OkRemovalCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkRemovalCategoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Delete_Item_PanelLayout = new javax.swing.GroupLayout(Delete_Item_Panel);
        Delete_Item_Panel.setLayout(Delete_Item_PanelLayout);
        Delete_Item_PanelLayout.setHorizontalGroup(
            Delete_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Delete_Item_PanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Delete_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(52, 52, 52)
                .addGroup(Delete_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CategoryList3, 0, 175, Short.MAX_VALUE)
                    .addComponent(DeleteBarcood))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Delete_Item_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkRemovalCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        Delete_Item_PanelLayout.setVerticalGroup(
            Delete_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Delete_Item_PanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(Delete_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryList3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(Delete_Item_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(DeleteBarcood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(OkRemovalCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Operation_Item_panel.add(Delete_Item_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 480, 300));

        javax.swing.GroupLayout ItemsLayout = new javax.swing.GroupLayout(Items);
        Items.setLayout(ItemsLayout);
        ItemsLayout.setHorizontalGroup(
            ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowAll_Item_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Addition_Item_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edit_Item_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete_Item_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Show_Item_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Operation_Item_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ItemsLayout.setVerticalGroup(
            ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsLayout.createSequentialGroup()
                .addGroup(ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItemsLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Addition_Item_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Edit_Item_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete_Item_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Show_Item_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ShowAll_Item_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ItemsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Operation_Item_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainScreen.addTab("ITEMS", new javax.swing.ImageIcon(getClass().getResource("/Screen/ITEMS.png")), Items); // NOI18N

        billtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "category", "barcood", "price", "quntity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(billtable);

        billcatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billcatagoryActionPerformed(evt);
            }
        });

        jLabel16.setText("category");

        billbarcood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billbarcoodActionPerformed(evt);
            }
        });

        jLabel17.setText("barcood");

        jLabel19.setText("quntity");

        bill_ok.setText("ok");
        bill_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_okActionPerformed(evt);
            }
        });

        jLabel20.setText("total price = ");

        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BillLayout = new javax.swing.GroupLayout(Bill);
        Bill.setLayout(BillLayout);
        BillLayout.setHorizontalGroup(
            BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillLayout.createSequentialGroup()
                        .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(billquntity, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billbarcood, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billcatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bill_ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(BillLayout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalprice_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print)
                .addGap(60, 60, 60))
        );
        BillLayout.setVerticalGroup(
            BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillLayout.createSequentialGroup()
                .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billcatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(53, 53, 53)
                        .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billbarcood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(47, 47, 47)
                        .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(billquntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(bill_ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillLayout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalprice_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        MainScreen.addTab("BILL", new javax.swing.ImageIcon(getClass().getResource("/Screen/BILL_.png")), Bill); // NOI18N

        Employees.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(204, 204, 255));
        menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 3, true));
        menu.setOpaque(false);

        Add_Employee_Icon.setFont(new java.awt.Font("Tekton Pro Cond", 2, 24)); // NOI18N
        Add_Employee_Icon.setText("add employee");
        Add_Employee_Icon.setMaximumSize(new java.awt.Dimension(181, 33));
        Add_Employee_Icon.setMinimumSize(new java.awt.Dimension(181, 33));
        Add_Employee_Icon.setPreferredSize(new java.awt.Dimension(181, 33));
        Add_Employee_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Employee_IconActionPerformed(evt);
            }
        });

        Delete_Employee_Icon.setFont(new java.awt.Font("Tekton Pro Cond", 2, 24)); // NOI18N
        Delete_Employee_Icon.setText("delete employee");
        Delete_Employee_Icon.setMaximumSize(new java.awt.Dimension(181, 33));
        Delete_Employee_Icon.setMinimumSize(new java.awt.Dimension(181, 33));
        Delete_Employee_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Employee_IconActionPerformed(evt);
            }
        });

        Edit_Employee_Icon.setFont(new java.awt.Font("Tekton Pro Cond", 2, 24)); // NOI18N
        Edit_Employee_Icon.setText("edit employee");
        Edit_Employee_Icon.setMaximumSize(new java.awt.Dimension(181, 33));
        Edit_Employee_Icon.setMinimumSize(new java.awt.Dimension(181, 33));
        Edit_Employee_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Employee_IconActionPerformed(evt);
            }
        });

        Show_All_Employees_Icon.setFont(new java.awt.Font("Tekton Pro Cond", 2, 24)); // NOI18N
        Show_All_Employees_Icon.setText("show all employees");
        Show_All_Employees_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_All_Employees_IconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Show_All_Employees_Icon)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Edit_Employee_Icon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete_Employee_Icon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addComponent(Add_Employee_Icon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Add_Employee_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(Delete_Employee_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Edit_Employee_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Show_All_Employees_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Employees.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 430));

        oper_emp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empty.setPreferredSize(new java.awt.Dimension(500, 400));

        javax.swing.GroupLayout emptyLayout = new javax.swing.GroupLayout(empty);
        empty.setLayout(emptyLayout);
        emptyLayout.setHorizontalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        emptyLayout.setVerticalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        oper_emp.add(empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 490, 440));

        name.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        name.setText("name");

        age.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        age.setText("age");

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setText("id");

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.setText("password");

        Male_Icon.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        Male_Icon.setText("male");
        Male_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Male_IconActionPerformed(evt);
            }
        });

        Female_Icon.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        Female_Icon.setText("female");
        Female_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Female_IconActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gender.setText("gender");

        job.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        job.setText("job");

        Emp_Icon.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        Emp_Icon.setText("Employee");
        Emp_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_IconActionPerformed(evt);
            }
        });

        Empr_Icon.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        Empr_Icon.setText("Employeer");
        Empr_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Empr_IconActionPerformed(evt);
            }
        });

        Emp_PassWord_Icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_PassWord_IconActionPerformed(evt);
            }
        });

        Ok_Emp_Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ok_Emp_Add.setText("OK");
        Ok_Emp_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ok_Emp_AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Add_Edit_EmployeeLayout = new javax.swing.GroupLayout(Add_Edit_Employee);
        Add_Edit_Employee.setLayout(Add_Edit_EmployeeLayout);
        Add_Edit_EmployeeLayout.setHorizontalGroup(
            Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Edit_EmployeeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_Edit_EmployeeLayout.createSequentialGroup()
                        .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password))
                        .addGap(15, 15, 15)
                        .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Emp_Name_Icon)
                            .addComponent(Emp_Age_Icon)
                            .addComponent(Emp_Id_Icon)
                            .addComponent(Emp_PassWord_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Add_Edit_EmployeeLayout.createSequentialGroup()
                        .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender))
                        .addGap(29, 29, 29)
                        .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Male_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Emp_Icon))
                        .addGap(34, 34, 34)
                        .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Empr_Icon)
                            .addComponent(Female_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_Edit_EmployeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ok_Emp_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        Add_Edit_EmployeeLayout.setVerticalGroup(
            Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_Edit_EmployeeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(Emp_Name_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Emp_Age_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(Emp_Id_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(Emp_PassWord_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(job)
                    .addComponent(Emp_Icon)
                    .addComponent(Empr_Icon))
                .addGap(23, 23, 23)
                .addGroup(Add_Edit_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(Male_Icon)
                    .addComponent(Female_Icon))
                .addGap(18, 18, 18)
                .addComponent(Ok_Emp_Add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        oper_emp.add(Add_Edit_Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 480, 430));

        ShowAll.setAlignmentX(0.0F);

        Data_Employees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "age", "id", "password", "job", "gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Byte.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Employees_Icon.setViewportView(Data_Employees);

        javax.swing.GroupLayout ShowAllLayout = new javax.swing.GroupLayout(ShowAll);
        ShowAll.setLayout(ShowAllLayout);
        ShowAllLayout.setHorizontalGroup(
            ShowAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Employees_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        ShowAllLayout.setVerticalGroup(
            ShowAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAllLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Employees_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        oper_emp.add(ShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 500, 440));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setText("Id");

        removel_ok.setText("ok");
        removel_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removel_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delete_empLayout = new javax.swing.GroupLayout(delete_emp);
        delete_emp.setLayout(delete_empLayout);
        delete_empLayout.setHorizontalGroup(
            delete_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_empLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(id_removel_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(removel_ok)
                .addGap(38, 38, 38))
        );
        delete_empLayout.setVerticalGroup(
            delete_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_empLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(delete_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(id_removel_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_empLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removel_ok)
                .addGap(19, 19, 19))
        );

        oper_emp.add(delete_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Employees.add(oper_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 500, 440));

        MainScreen.addTab("EMPLOYEES", new javax.swing.ImageIcon(getClass().getResource("/Screen/EMPLOYEE_.png")), Employees); // NOI18N

        getContentPane().add(MainScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        PreScreen.setFont(MainScreen.getFont());

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel34.setText("name");

        nameemp1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel35.setText("id");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel36.setText("age");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel37.setText("gender");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel38.setText("password");

        idemp1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        ageemp1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        genderemp1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        passwordemp1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N

        logout1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        logout1.setText("log out");
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Profile1Layout = new javax.swing.GroupLayout(Profile1);
        Profile1.setLayout(Profile1Layout);
        Profile1Layout.setHorizontalGroup(
            Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addGroup(Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordemp1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(genderemp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ageemp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Profile1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        Profile1Layout.setVerticalGroup(
            Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Profile1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameemp1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idemp1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ageemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(Profile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordemp1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        PreScreen.addTab("profile", new javax.swing.ImageIcon(getClass().getResource("/Screen/LOG-OUT_.png")), Profile1); // NOI18N

        billtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "category", "barcood", "price", "quntity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(billtable1);

        jLabel18.setText("category");

        jLabel21.setText("barcood");

        jLabel22.setText("quntity");

        bill_ok1.setText("ok");
        bill_ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_ok1ActionPerformed(evt);
            }
        });

        jLabel23.setText("total price = ");

        printbill.setText("print");
        printbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bill1Layout = new javax.swing.GroupLayout(Bill1);
        Bill1.setLayout(Bill1Layout);
        Bill1Layout.setHorizontalGroup(
            Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bill1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(47, 47, 47)
                .addComponent(totalprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(printbill)
                .addGap(28, 28, 28))
            .addGroup(Bill1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bill1Layout.createSequentialGroup()
                        .addComponent(bill_ok1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bill1Layout.createSequentialGroup()
                        .addGroup(Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(billbarcood1)
                            .addComponent(billcatagory1, 0, 169, Short.MAX_VALUE)
                            .addComponent(billquntity1))
                        .addGap(51, 51, 51)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Bill1Layout.setVerticalGroup(
            Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bill1Layout.createSequentialGroup()
                .addGroup(Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Bill1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billcatagory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(53, 53, 53)
                        .addGroup(Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billbarcood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(47, 47, 47)
                        .addGroup(Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(billquntity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(bill_ok1))
                    .addGroup(Bill1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(Bill1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(printbill)
                    .addComponent(totalprice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        PreScreen.addTab("BILL", new javax.swing.ImageIcon(getClass().getResource("/Screen/BILL_.png")), Bill1); // NOI18N

        getContentPane().add(PreScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInIconActionPerformed
int id=0;String Password=null;String Job=null;
if(ID.getText().equals("")||PasswordIcon.getText().equals("")||!(EmployeeIcon.isSelected()||EmployeerIcon.isSelected())){
JOptionPane.showMessageDialog(null,"please,enter all data");}
else {
id=Integer.parseInt(ID.getText());
Password=PasswordIcon.getText();
if(EmployeeIcon.isSelected()){
      Job="employee";}
else{Job="employeer";}
if (employee.login(id, Password, Job)&&Job.equals("employee")){
    ID.setText("");
    PasswordIcon.setText("");
    EmployeeIcon.setSelected(false);
       PreScreen.setVisible(true);
       LogIn.setVisible(false);
    EmployeeDto emp1=new EmployeeDto();
       emp1=employee.profile(id, Job);
       nameemp1.setText(emp1.getName());
       idemp1.setText(String.valueOf(emp1.getId()));
       ageemp1.setText(String.valueOf(emp1.getAge()));
       genderemp1.setText(emp1.getGender());
       passwordemp1.setText(emp1.getPassword());}
else if (employee.login(id, Password, Job)&&Job.equals("employeer")){
       MainScreen.setVisible(true);
       LogIn.setVisible(false);
       ID.setText("");
    PasswordIcon.setText("");
    EmployeerIcon.setSelected(false);
       EmployeeDto emp2=new EmployeeDto();
    emp2=employee.profile(id, Job);
       nameemp.setText(emp2.getName());
       idemp.setText(String.valueOf(emp2.getId()));
       ageemp.setText(String.valueOf(emp2.getAge()));
       genderemp.setText(emp2.getGender());
       passwordemp.setText(emp2.getPassword());}
else{JOptionPane.showMessageDialog(null,"there are error in data");}  }
    }//GEN-LAST:event_LogInIconActionPerformed

    private void Show_All_Employees_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_All_Employees_IconActionPerformed
Add_Edit_Employee.setVisible(false);
ShowAll.setVisible(true);
empty.setVisible(false);
    DefaultTableModel tblModel=(DefaultTableModel) Data_Employees.getModel();

if(FristPrintingTable==0){
ArrayList<EmployeeDto>list=employee.printall();
for(EmployeeDto n:list){
   String data[]={n.getName(),String.valueOf(n.getAge()),String.valueOf(n.getId()),n.getPassword(),n.getJob(),n.getGender()};
    tblModel.addRow(data);
    CountSizeTable2++;
}
FristPrintingTable=1;}
else{
for(int j=0;j<CountSizeTable2;j++){
    tblModel.removeRow(0);}
ArrayList<EmployeeDto>list1=employee.printall();
CountSizeTable2=0;
for(EmployeeDto n:list1){
   String data[]={n.getName(),String.valueOf(n.getAge()),String.valueOf(n.getId()),n.getPassword(),n.getJob(),n.getGender()};
    tblModel.addRow(data);
    CountSizeTable2++;
}
}

    }//GEN-LAST:event_Show_All_Employees_IconActionPerformed

    private void Add_Employee_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Employee_IconActionPerformed
Show_All_Employees_Icon.setEnabled(true);
Add_Edit_Employee.setVisible(true);
ShowAll.setVisible(false);
empty.setVisible(false);
    }//GEN-LAST:event_Add_Employee_IconActionPerformed

    private void Edit_Employee_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Employee_IconActionPerformed
Show_All_Employees_Icon.setEnabled(true);
Add_Edit_Employee.setVisible(true);
ShowAll.setVisible(false);
empty.setVisible(false);
chooseoperation="edit";
    }//GEN-LAST:event_Edit_Employee_IconActionPerformed

    private void Emp_PassWord_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_PassWord_IconActionPerformed
    }//GEN-LAST:event_Emp_PassWord_IconActionPerformed

    private void EmployeeIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeIconActionPerformed
EmployeeIcon.setSelected(true);
EmployeerIcon.setSelected(false);
    }//GEN-LAST:event_EmployeeIconActionPerformed

    private void EmployeerIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeerIconActionPerformed
EmployeerIcon.setSelected(true);
EmployeeIcon.setSelected(false);    }//GEN-LAST:event_EmployeerIconActionPerformed

    private void Emp_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_IconActionPerformed
Emp_Icon.setSelected(true);
Empr_Icon.setSelected(false);
    }//GEN-LAST:event_Emp_IconActionPerformed

    private void Empr_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Empr_IconActionPerformed
Empr_Icon.setSelected(true);
Emp_Icon.setSelected(false);
    }//GEN-LAST:event_Empr_IconActionPerformed

    private void Male_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Male_IconActionPerformed
Male_Icon.setSelected(true);
Female_Icon.setSelected(false);
    }//GEN-LAST:event_Male_IconActionPerformed

    private void Female_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Female_IconActionPerformed
Female_Icon.setSelected(true);
Male_Icon.setSelected(false);
    }//GEN-LAST:event_Female_IconActionPerformed

    private void Ok_Emp_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ok_Emp_AddActionPerformed
EmployeeDto emp=new EmployeeDto();
        if(Emp_Name_Icon.getText().equals("")||Emp_Age_Icon.getText().equals("")||Emp_Id_Icon.getText().equals("")||
           Emp_PassWord_Icon.getText().equals("")||(Emp_Icon.isSelected()&&Empr_Icon.isSelected())||(Male_Icon.isSelected()&&Female_Icon.isSelected())){
           JOptionPane.showMessageDialog(null,"please enter all data");
        }
        else if(Integer.parseInt((Emp_Age_Icon.getText()))<0){
                   JOptionPane.showMessageDialog(null,"please age must be greater than zero");
        }
        else{
        emp.setName(Emp_Name_Icon.getText());
        emp.setId(Integer.parseInt(Emp_Id_Icon.getText()));
        emp.setAge(Integer.parseInt((Emp_Age_Icon.getText())));
        emp.setPassword( Emp_PassWord_Icon.getText());
        if(Emp_Icon.isSelected()){emp.setJob("employee");}else{emp.setJob("employeer");}
        if(Male_Icon.isSelected()){emp.setGender("male");}else{emp.setGender("female");}
        if(chooseoperation.equals("add")){
        employee.add(emp);
        }
        else{employee.edit(emp,Integer.parseInt(Emp_Id_Icon.getText()));}
        }
        
    }//GEN-LAST:event_Ok_Emp_AddActionPerformed

    private void Delete_Employee_IconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Employee_IconActionPerformed
 Show_All_Employees_Icon.setEnabled(true);
 Add_Edit_Employee.setVisible(false);
 ShowAll.setVisible(false);
 empty.setVisible(true);
    }//GEN-LAST:event_Delete_Employee_IconActionPerformed

    private void Add_Catagory_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Catagory_ButtonActionPerformed
modification_Category_Panel.setVisible(false);
Addition_Category_Panel.setVisible(true);
Removal_Catagory_Panel.setVisible(false);        
    }//GEN-LAST:event_Add_Catagory_ButtonActionPerformed
    private void Delete_Catagory_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Catagory_ButtonActionPerformed
modification_Category_Panel.setVisible(false);
Addition_Category_Panel.setVisible(false);
Removal_Catagory_Panel.setVisible(true);
    }//GEN-LAST:event_Delete_Catagory_ButtonActionPerformed

    private void Modification_Catagory_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modification_Catagory_ButtonActionPerformed
modification_Category_Panel.setVisible(true);
Addition_Category_Panel.setVisible(false);
Removal_Catagory_Panel.setVisible(false);
    }//GEN-LAST:event_Modification_Catagory_ButtonActionPerformed

    private void Addition_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addition_Item_ButtonActionPerformed
Addition_Item_Panel.setVisible(true);
Modification_Item_Panel.setVisible(false);
Delete_Item_Panel.setVisible(false);
ShowAll_Item_Panel.setVisible(false);
Show_Item_Panel.setVisible(false);
chooseoperation="add";
    }//GEN-LAST:event_Addition_Item_ButtonActionPerformed

    private void Edit_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Item_ButtonActionPerformed
Addition_Item_Panel.setVisible(false);
Modification_Item_Panel.setVisible(true);
ShowAll_Item_Panel.setVisible(false);
Show_Item_Panel.setVisible(false);
Delete_Item_Panel.setVisible(false);
chooseoperation="edit";
    }//GEN-LAST:event_Edit_Item_ButtonActionPerformed

    private void Delete_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Item_ButtonActionPerformed
Addition_Item_Panel.setVisible(false);
Modification_Item_Panel.setVisible(false);
Delete_Item_Panel.setVisible(true);
ShowAll_Item_Panel.setVisible(false);
Show_Item_Panel.setVisible(false);
    }//GEN-LAST:event_Delete_Item_ButtonActionPerformed

    private void Show_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_Item_ButtonActionPerformed
Addition_Item_Panel.setVisible(false);
Modification_Item_Panel.setVisible(false);
ShowAll_Item_Panel.setVisible(false);
Delete_Item_Panel.setVisible(false);

Show_Item_Panel.setVisible(true);

    }//GEN-LAST:event_Show_Item_ButtonActionPerformed

    private void ShowAll_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAll_Item_ButtonActionPerformed
Addition_Item_Panel.setVisible(false);
Modification_Item_Panel.setVisible(false);
ShowAll_Item_Panel.setVisible(true);
Delete_Item_Panel.setVisible(false);
Show_Item_Panel.setVisible(false);

DefaultTableModel tblModel=(DefaultTableModel) ShowAllItem.getModel();
if(FristPrintingTable2==0){
ArrayList <ItemDto> list=item.printall();
for(ItemDto n:list){
   String data[]={n.getCatagory(),n.getName(),String.valueOf(n.getBarcood()),String.valueOf(n.getPrice()),String.valueOf(n.getQuntity())};
    tblModel.addRow(data);
    CountSizeTable1++;
}FristPrintingTable2=1;}
else{
 for(int j=0;j<CountSizeTable1;j++){
tblModel.removeRow(0);}
 CountSizeTable1=0;
ArrayList <ItemDto> list=item.printall();
for(ItemDto n:list){
   String data[]={n.getCatagory(),n.getName(),String.valueOf(n.getBarcood()),String.valueOf(n.getQuntity()),String.valueOf(n.getPrice())};
    tblModel.addRow(data);
    CountSizeTable1++;   
}}
    }//GEN-LAST:event_ShowAll_Item_ButtonActionPerformed

    private void OK_AdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_AdditionActionPerformed
if(Item_Name.getText().equals("")||Item_Barcood.getText().equals("")||Item_Price.getText().equals("")||ITem_Quntity.getText().equals("")){
JOptionPane.showMessageDialog(null,"please,enter all data");
}
else if(Integer.parseInt(Item_Price.getText())<0){
    JOptionPane.showMessageDialog(null,"price shouldn't be less than zero");
}
else if(Integer.parseInt(ITem_Quntity.getText())<0){
    JOptionPane.showMessageDialog(null,"quntity shouldn't be less than zero");
}
else{
ItemDto item1 =new ItemDto();
item1.setName(Item_Name.getText());
item1.setCatagory(CategoryList.getSelectedItem().toString());
item1.setBarcood(Integer.parseInt(Item_Barcood.getText()));
item1.setPrice(Integer.parseInt(Item_Price.getText()));
item1.setQuntity(Integer.parseInt(ITem_Quntity.getText()));
item.add(item1);
Item_Name.setText("");
Item_Barcood.setText("");
Item_Price.setText("");
ITem_Quntity.setText("");    }
    }//GEN-LAST:event_OK_AdditionActionPerformed

    private void OkModificationItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkModificationItemActionPerformed
if(Name_Modification.getText().equals("")||Barcood_Modification.getText().equals("")||Price_Modification.getText().equals("")||Quntity_Modification.getText().equals("")){
JOptionPane.showMessageDialog(null,"please,enter all data");
}
else if(Integer.parseInt(Price_Modification.getText())<0){
    JOptionPane.showMessageDialog(null,"price shouldn't be less than zero");
}
else if(Integer.parseInt(Quntity_Modification.getText())<0){
    JOptionPane.showMessageDialog(null,"quntity shouldn't be less than zero");
}
else{
ItemDto item1 =new ItemDto();
item1.setName(Name_Modification.getText());
item1.setCatagory(CategoryList1.getSelectedItem().toString());
item1.setBarcood(Integer.parseInt(Barcood_Modification.getText()));
item1.setPrice(Integer.parseInt(Price_Modification.getText()));
item1.setQuntity(Integer.parseInt(Quntity_Modification.getText()));
item.edit_Item(Integer.parseInt(Barcood_Modification.getText()),item1);
Name_Modification.setText("");
Barcood_Modification.setText("");
Price_Modification.setText("");
Quntity_Modification.setText("");
Barcood_Modification.setText("");
}
    }//GEN-LAST:event_OkModificationItemActionPerformed

    private void CatagoryList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatagoryList2ActionPerformed
    }//GEN-LAST:event_CatagoryList2ActionPerformed

    private void OkShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkShowButtonActionPerformed
    DefaultTableModel tblModel=(DefaultTableModel) ShowItem.getModel();
if(FristPrintingTable1==0){
ArrayList<ItemDto>list=new ArrayList();
list=item.print(CatagoryList2.getSelectedItem().toString());
for(ItemDto n:list){
   String data[]={n.getCatagory(),n.getName(),String.valueOf(n.getBarcood()),String.valueOf(n.getQuntity()),String.valueOf(n.getPrice())};
    tblModel.addRow(data);
    CountSizeTable++;
}FristPrintingTable1=1;}
else{
 for(int j=0;j<CountSizeTable;j++){
tblModel.removeRow(0);}
 CountSizeTable=0;
ArrayList<ItemDto>list=new ArrayList();
list=item.print(CatagoryList2.getSelectedItem().toString());
for(ItemDto n:list){
   String data[]={n.getCatagory(),n.getName(),String.valueOf(n.getBarcood()),String.valueOf(n.getQuntity()),String.valueOf(n.getPrice())};
    tblModel.addRow(data);
    CountSizeTable++;   
}}
    }//GEN-LAST:event_OkShowButtonActionPerformed

    private void OkRemovalCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkRemovalCategoryButtonActionPerformed
item.delete_Item(Integer.parseInt(DeleteBarcood.getText()),CategoryList3.getSelectedItem().toString());
DeleteBarcood.setText("");
    }//GEN-LAST:event_OkRemovalCategoryButtonActionPerformed

    private void bill_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_okActionPerformed
if(billquntity.getText().equals("")||billbarcood.getText().equals("")){
JOptionPane.showMessageDialog(null,"please enter all data");
}
else{
int q=Integer.parseInt(billquntity.getText());
int p=Integer.parseInt(billbarcood.getText());
String price=String.valueOf(item.Bill(q,billcatagory.getSelectedItem().toString(), p));
String[]data={billcatagory.getSelectedItem().toString(),billbarcood.getText(),price,billquntity.getText()};
bill.addRow(data);
TotalPrice=TotalPrice+Double.parseDouble(price);
totalprice_icon.setText(String.valueOf(TotalPrice));
billbarcood.setText("");
billquntity.setText("");}
    }//GEN-LAST:event_bill_okActionPerformed

    private void bill_ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_ok1ActionPerformed
if(billquntity1.getText().equals("")||billbarcood1.getText().equals("")){
JOptionPane.showMessageDialog(null,"please enter all data");
}
else{
int q=Integer.parseInt(billquntity1.getText());
int p=Integer.parseInt(billbarcood1.getText());
String price=String.valueOf(item.Bill(q,billcatagory1.getSelectedItem().toString(), p));
String[]data={billcatagory1.getSelectedItem().toString(),billbarcood1.getText(),price,billquntity1.getText()};
bill1.addRow(data);
TotalPrice=TotalPrice+Double.parseDouble(price);
totalprice1.setText(String.valueOf(TotalPrice));
billbarcood1.setText("");
billquntity1.setText("");}
    }//GEN-LAST:event_bill_ok1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
LogIn.setVisible(true);
MainScreen.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
LogIn.setVisible(true);
PreScreen.setVisible(false);
    }//GEN-LAST:event_logout1ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
    }//GEN-LAST:event_IDActionPerformed

    private void NewNameCatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewNameCatagoryActionPerformed
    }//GEN-LAST:event_NewNameCatagoryActionPerformed

    private void OkModificatioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkModificatioButtonActionPerformed
        for(int i=0;i<CategoryList.getItemCount();i++){
     if(NameCatagory.getText().equals(CategoryList.getItemAt(i))){
     CategoryList.removeItemAt(i);
     CatagoryList2.removeItemAt(i);
     CategoryList1.removeItemAt(i);
     CategoryList3.removeItemAt(i);
     billcatagory.removeItemAt(i);
     CategoryList.insertItemAt(NewNameCatagory.getText(),i);
     CatagoryList2.insertItemAt(NewNameCatagory.getText(),i);
     CategoryList1.insertItemAt(NewNameCatagory.getText(),i);
     CategoryList3.insertItemAt(NewNameCatagory.getText(),i);
     billcatagory.insertItemAt(NewNameCatagory.getText(),i);
     done=true;
     }}
 if (done==true){
 item.edit_Catagory(NameCatagory.getText(),NewNameCatagory.getText());
 NameCatagory.setText("");
 NewNameCatagory.setText("");
       done=false;
 }
 else{
 JOptionPane.showMessageDialog(null,"please enter correct name");
 }
    }//GEN-LAST:event_OkModificatioButtonActionPerformed

    private void OkAdditionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkAdditionButtonActionPerformed
CategoryList.addItem(NameCatagory1.getText());
CatagoryList2.addItem(NameCatagory1.getText());
CategoryList1.addItem(NameCatagory1.getText());
CategoryList3.addItem(NameCatagory1.getText());
billcatagory.addItem(NameCatagory1.getText());
NameCatagory1.setText("");
    }//GEN-LAST:event_OkAdditionButtonActionPerformed

    private void OkRemovalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkRemovalButtonActionPerformed
        for(int m=0;m<=CategoryList.getItemCount();m++){
     if(NameCatagory2.getText().equals(CategoryList.getItemAt(m))){
     CategoryList.removeItemAt(m);
     CatagoryList2.removeItemAt(m);
     CategoryList1.removeItemAt(m);
     CategoryList3.removeItemAt(m);
     billcatagory.removeItemAt(m);
     done=true;
     }}
 if(done){
 item.delete_Catagory(NameCatagory2.getText());
 NameCatagory2.setText("");
      done=false;
 }
 else{ JOptionPane.showMessageDialog(null,"please enter correct name");}
    }//GEN-LAST:event_OkRemovalButtonActionPerformed

    private void CategoryList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryList1ActionPerformed
    }//GEN-LAST:event_CategoryList1ActionPerformed

    private void billcatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billcatagoryActionPerformed
    }//GEN-LAST:event_billcatagoryActionPerformed

    private void CategoryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryListActionPerformed

    private void billbarcoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billbarcoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billbarcoodActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
for(int i=0;i<bill.getRowCount();i++){
bill.removeRow(0);}
totalprice_icon.setText("");
    }//GEN-LAST:event_printActionPerformed

    private void removel_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removel_okActionPerformed
if(id_removel_emp.getText().equals("")){
JOptionPane.showMessageDialog(null,"please enter id");
}
else{
employee.delete(Integer.parseInt(id_removel_emp.getText()));
}
    }//GEN-LAST:event_removel_okActionPerformed

    private void printbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbillActionPerformed
for(int i=0;i<bill1.getRowCount();i++){
bill1.removeRow(0);}
totalprice1.setText("");
    }//GEN-LAST:event_printbillActionPerformed
    public static void main(String args[]) {
        try {
          com.jtattoo.plaf.texture.TextureLookAndFeel.setTheme("Green", "INSERT YOUR LICENSE KEY HERE", "my company");
          UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");     
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new screen().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Catagory_Button;
    private javax.swing.JPanel Add_Edit_Employee;
    private javax.swing.JButton Add_Employee_Icon;
    private javax.swing.JPanel Addition_Category_Panel;
    private javax.swing.JButton Addition_Item_Button;
    private javax.swing.JPanel Addition_Item_Panel;
    private javax.swing.JTextField Barcood_Modification;
    private javax.swing.JPanel Bill;
    private javax.swing.JPanel Bill1;
    private javax.swing.JPanel Catagory;
    private javax.swing.JComboBox<String> CatagoryList2;
    private javax.swing.JComboBox<String> CategoryList;
    private javax.swing.JComboBox<String> CategoryList1;
    private javax.swing.JComboBox<String> CategoryList3;
    private javax.swing.JTable Data_Employees;
    private javax.swing.JTextField DeleteBarcood;
    private javax.swing.JButton Delete_Catagory_Button;
    private javax.swing.JButton Delete_Employee_Icon;
    private javax.swing.JButton Delete_Item_Button;
    private javax.swing.JPanel Delete_Item_Panel;
    private javax.swing.JButton Edit_Employee_Icon;
    private javax.swing.JButton Edit_Item_Button;
    private javax.swing.JTextField Emp_Age_Icon;
    private javax.swing.JRadioButton Emp_Icon;
    private javax.swing.JTextField Emp_Id_Icon;
    private javax.swing.JTextField Emp_Name_Icon;
    private javax.swing.JPasswordField Emp_PassWord_Icon;
    private javax.swing.JRadioButton EmployeeIcon;
    private javax.swing.JRadioButton EmployeerIcon;
    private javax.swing.JPanel Employees;
    private javax.swing.JScrollPane Employees_Icon;
    private javax.swing.JRadioButton Empr_Icon;
    private javax.swing.JRadioButton Female_Icon;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField ITem_Quntity;
    private javax.swing.JTextField Item_Barcood;
    private javax.swing.JTextField Item_Name;
    private javax.swing.JTextField Item_Price;
    private javax.swing.JPanel Items;
    private javax.swing.JPanel LogIn;
    private javax.swing.JButton LogInIcon;
    private javax.swing.JTabbedPane MainScreen;
    private javax.swing.JRadioButton Male_Icon;
    private javax.swing.JButton Modification_Catagory_Button;
    private javax.swing.JPanel Modification_Item_Panel;
    private javax.swing.JTextField NameCatagory;
    private javax.swing.JTextField NameCatagory1;
    private javax.swing.JTextField NameCatagory2;
    private javax.swing.JTextField Name_Modification;
    private javax.swing.JTextField NewNameCatagory;
    private javax.swing.JButton OK_Addition;
    private javax.swing.JButton OkAdditionButton;
    private javax.swing.JButton OkModificatioButton;
    private javax.swing.JButton OkModificationItem;
    private javax.swing.JButton OkRemovalButton;
    private javax.swing.JButton OkRemovalCategoryButton;
    private javax.swing.JButton OkShowButton;
    private javax.swing.JButton Ok_Emp_Add;
    private javax.swing.JLayeredPane Operation_Item_panel;
    private javax.swing.JLayeredPane Operations_Panel;
    private javax.swing.JPasswordField PasswordIcon;
    private javax.swing.JTabbedPane PreScreen;
    private javax.swing.JTextField Price_Modification;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Profile1;
    private javax.swing.JTextField Quntity_Modification;
    private javax.swing.JPanel Removal_Catagory_Panel;
    private javax.swing.JPanel ShowAll;
    private javax.swing.JTable ShowAllItem;
    private javax.swing.JButton ShowAll_Item_Button;
    private javax.swing.JPanel ShowAll_Item_Panel;
    private javax.swing.JTable ShowItem;
    private javax.swing.JButton Show_All_Employees_Icon;
    private javax.swing.JButton Show_Item_Button;
    private javax.swing.JPanel Show_Item_Panel;
    private javax.swing.JLabel age;
    private javax.swing.JLabel ageemp;
    private javax.swing.JLabel ageemp1;
    private javax.swing.JLabel background;
    private javax.swing.JButton bill_ok;
    private javax.swing.JButton bill_ok1;
    private javax.swing.JTextField billbarcood;
    private javax.swing.JTextField billbarcood1;
    private javax.swing.JComboBox<String> billcatagory;
    private javax.swing.JComboBox<String> billcatagory1;
    private javax.swing.JTextField billquntity;
    private javax.swing.JTextField billquntity1;
    private javax.swing.JTable billtable;
    private javax.swing.JTable billtable1;
    private javax.swing.JPanel delete_emp;
    private javax.swing.JPanel empty;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel genderemp;
    private javax.swing.JLabel genderemp1;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id_removel_emp;
    private javax.swing.JLabel idemp;
    private javax.swing.JLabel idemp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel job;
    private javax.swing.JLabel joblog;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel modification_Category_Panel;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameemp;
    private javax.swing.JLabel nameemp1;
    private javax.swing.JLabel namelog;
    private javax.swing.JLayeredPane oper_emp;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordemp;
    private javax.swing.JLabel passwordemp1;
    private javax.swing.JLabel passwordlog;
    private javax.swing.JButton print;
    private javax.swing.JButton printbill;
    private javax.swing.JButton removel_ok;
    private javax.swing.JLabel totalprice1;
    private javax.swing.JLabel totalprice_icon;
    // End of variables declaration//GEN-END:variables
}

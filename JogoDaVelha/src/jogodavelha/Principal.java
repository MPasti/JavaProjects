/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.Scanner;


/**
 *
 * @author Windows 10
 */
public class Principal extends javax.swing.JFrame {
        
        URL som = Principal.class.getResource("Victory Fanfare.wav");
        AudioClip Som = Applet.newAudioClip(som);
        
            Scanner ent = new Scanner (System.in);
    int quantidade;
    int jogador;
    int mat[][] = new int [3][3];
    JButton b[] = new JButton[9];
    String ganhador;
    String jogador1;
    String jogador2;
    String fonte;
    String j1Cor;
    String j2Cor;
    
    
        
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        quantidade = 1;
        jogador = 1;
        b[0] = bt_1;
        b[1] = bt_2;
        b[2] = bt_3;
        b[3] = bt_4;
        b[4] = bt_5;
        b[5] = bt_6;
        b[6] = bt_7;
        b[7] = bt_8;
        b[8] = bt_9;
    }
    
    public void Fontesss(){
        
        Menu men = new Menu();
        fonte = men.getFonte();
        System.out.println("Fonte: " + fonte);
        
                       
        if("Arial".equals(fonte)){
            
        bt_1.setFont(new Font("Arial", Font.BOLD, 18));
        bt_2.setFont(new Font("Arial", Font.BOLD, 18));
        bt_3.setFont(new Font("Arial", Font.BOLD, 18));
        bt_4.setFont(new Font("Arial", Font.BOLD, 18));
        bt_5.setFont(new Font("Arial", Font.BOLD, 18));
        bt_6.setFont(new Font("Arial", Font.BOLD, 18));
        bt_7.setFont(new Font("Arial", Font.BOLD, 18));
        bt_8.setFont(new Font("Arial", Font.BOLD, 18));
        bt_9.setFont(new Font("Arial", Font.BOLD, 18));
       
        }
                if("Times New Roman".equals(fonte)){
            
        bt_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bt_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bt_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bt_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bt_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bt_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bt_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bt_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        bt_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
       
        }
                if("Blackadder ITC".equals(fonte)){
            
        bt_1.setFont(new Font("Blackadder ITC", Font.BOLD, 18));
        bt_2.setFont(new Font("Blackadder ITC", Font.BOLD, 18));
        bt_3.setFont(new Font("Blackadder ITC", Font.BOLD, 18));
        bt_4.setFont(new Font("Blackadder ITC", Font.BOLD, 18));
        bt_5.setFont(new Font("Blackadder ITC", Font.BOLD, 18));
        bt_6.setFont(new Font("Blackadder ITC", Font.BOLD, 18));
        bt_7.setFont(new Font("Blackadder ITC", Font.BOLD, 18));
        bt_8.setFont(new Font("Blackadder ITC", Font.BOLD, 18));
        bt_9.setFont(new Font("Blackadder ITC", Font.BOLD, 18));
       
        }                
    }
    
    public void jogada(JButton b, int x, int y)
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        
    
        b.setEnabled(false);
        if(jogador == 1){
            mat[x][y] = 1;
            b.setText("X");
            b.setForeground(Color.blue);
            jogador = 2;
            ganhador = jogador1;
            checarjogada(1);
            Fontesss();
        }else{
            mat[x][y] = 2;
            b.setText("0");
            b.setForeground(Color.red);
            jogador = 1;
            ganhador = jogador2;
            checarjogada(2);
            Fontesss();
        }
        quantidade++;
    }


    
    public void checarjogada(int x)
    {
        if(vitoria(x)==true){
           JOptionPane.showMessageDialog(null, "Jogador: " + ganhador + " " + "Venceu!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
        Principal tocar = new Principal();
        tocar.Som.play();
           fimjogo();
           
        }
    }
    
  
    public boolean vitoria(int x){
        for(int i = 0; i < mat.length; i++)
        {
            if(mat[i][0] == x && mat[i][1] == x && mat[i][2] == x)
            {
            return true;
            }
            if(mat[0][1]== x && mat[1][i] == x && mat[2][i] == x)
            {
                return false;
            }
        }
        if(mat[0][0]== x && mat[1][1] == x && mat[2][2] == x)
            {
                return true;
            }
        if(mat[0][2]== x && mat[1][1] == x && mat[2][0] == x)
            {
                return true;
            }
        return false;
    }
    
    
    public void fimjogo(){
        for(int i = 0; i<9; i++){
            b[i].setEnabled(false);
       Principal tocar = new Principal();
        tocar.Som.play();
        }
    }
    
    public void limpar(){
        for(int i = 0; i < 9; i++){
            b[i].setEnabled(true);
            b[i].setText("");
        }
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                mat[x][y] = 0;
            }
        }
        jogador = 1;
        jogador1 = "";
        jogador2 = "";
        ganhador = "";
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Da Velha");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        bt_2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        bt_3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });

        bt_4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });

        bt_1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });

        bt_6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });

        bt_5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });

        bt_8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });

        bt_7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });

        bt_9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });

        jMenu1.setMnemonic('N');
        jMenu1.setText("Opção");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Novo Jogo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Menu");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("affff");
        jMenuItem5.setToolTipText("");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                limpar();
        jogador1 = JOptionPane.showInputDialog("Digite o nome do primeiro Jogador:");
        jogador2 = JOptionPane.showInputDialog("Digite o nome do segundo jogador:");                 // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        jogada(bt_1, 0, 0);
        
    
// TODO add your handling code here:
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        jogada(bt_2, 0, 1);
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        jogada(bt_3, 0, 2);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        jogada(bt_4, 1, 0);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        jogada(bt_5, 1, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        jogada(bt_6, 1, 2);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        jogada(bt_7, 2, 0);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        jogada(bt_8, 2, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        jogada(bt_9, 2, 2);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_9ActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    new Menu().setVisible(true);
    

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.out.println("Font name: ");
        fonte = ent.nextLine(); 
                Menu men = new Menu();
        men.setFonte(fonte);

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
                Principal tocar = new Principal();
        tocar.Som.loop();
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}

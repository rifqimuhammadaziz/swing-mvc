/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifqimuhammadaziz.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import rifqimuhammadaziz.helper.DummyData;

/**
 *
 * @author Lenovo
 */
public class SearchController implements ActionListener{
    
    private JTextField searchTem = new JTextField();
    private DefaultTableModel model;
    
    public SearchController(JTextField searchTerm, DefaultTableModel model) {
        this.searchTem = searchTerm;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String searchTermString = this.searchTem.getText();
        if(searchTermString != null && !searchTermString.equals("")) {
            if (searchTermString.trim().equals("*")) {
                model.setDataVector(DummyData.DATA, DummyData.TABLE_HEADER);
                return;
            }
            Object[][] newData = new Object[DummyData.DATA.length][];
            int index = 0;
            for (Object[] obj : DummyData.DATA) {
                if (String.valueOf(obj[1]).toUpperCase().contains(searchTermString.toUpperCase().trim())) {
                    newData[index++] = obj;
                }
            }
            model.setDataVector(newData, DummyData.TABLE_HEADER);
        } else {
            JOptionPane.showMessageDialog(null, "Search term is empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}

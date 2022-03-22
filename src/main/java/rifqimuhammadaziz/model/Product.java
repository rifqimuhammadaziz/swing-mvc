/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifqimuhammadaziz.model;

import javax.swing.table.DefaultTableModel;
import rifqimuhammadaziz.helper.DummyData;

/**
 *
 * @author Lenovo
 */
public class Product extends DefaultTableModel{
    public Product() {
        super(DummyData.DATA, DummyData.TABLE_HEADER);
    }
}

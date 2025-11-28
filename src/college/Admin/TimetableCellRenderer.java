/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.Admin;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author shubh
 */
public class TimetableCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        String cellValue = (value == null) ? "" : value.toString();

        setHorizontalAlignment(CENTER);

        if (col == 0) {
            c.setBackground(new Color(253, 255, 206));
            c.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));

        } else if (cellValue != null) {
            c.setForeground(Color.BLACK);
            switch (cellValue) {
                case "T E A   B R E A K" -> {
                    c.setBackground(new Color(242, 242, 242)); // Light Yellow
                    c.setFont(c.getFont().deriveFont(Font.BOLD));
                    break;
                }
                case "L U N C H   B R E A K" -> {
                    c.setBackground(new Color(242, 242, 242)); // Light Red/Pink
                    c.setFont(c.getFont().deriveFont(Font.BOLD));
                    break;
                }
                case "Free" -> {
                    c.setBackground(new Color(192, 255, 192)); // Light Green
                    break;
                }
                default -> {
                    c.setBackground(new Color(255, 255, 255));
                    String shortCode = cellValue.split(" ")[0];
                    c.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
                    c.setForeground(getSubjectColor(shortCode));
                }
            }
        } else {
        }
        return c;
    }

    private Color getSubjectColor(String code) {
        return switch (code.toUpperCase()) {
            case "DS" ->
                new Color(218, 165, 32);
            case "CN" ->
                Color.BLACK;
            case "OS" ->
                new Color(60, 179, 113);
            case "DBMS" ->
                new Color(139, 69, 19);
            case "JAVA", "OOPS" ->
                new Color(0, 0, 139);
            default ->
                Color.DARK_GRAY;
        }; // Gold
        // Green
        // Brown
        // Blue
    }
}

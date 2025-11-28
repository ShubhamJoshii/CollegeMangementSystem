package college.Admin;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Map; // Import Map
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TimetableCellRenderer extends DefaultTableCellRenderer {
    private Map<String, Color> subjectColorMap;

    public TimetableCellRenderer(Map<String, Color> map) {
        this.subjectColorMap = map;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        String cellValue = (value == null) ? "" : value.toString();

        setHorizontalAlignment(CENTER);

        // 1. Column 0 (Days) - Keep your existing logic
        if (col == 0) {
            c.setBackground(new Color(253, 255, 206));
            c.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
            c.setForeground(Color.BLACK);
        } 
        // 2. Data Cells
        else if (!cellValue.isEmpty()) {
            // Default text color
            c.setForeground(Color.BLACK); 

            // Handle Standard Breaks
            if (cellValue.contains("T E A")) {
                c.setBackground(new Color(242, 242, 242));
                c.setFont(c.getFont().deriveFont(Font.BOLD));
            } else if (cellValue.contains("L U N C H")) {
                c.setBackground(new Color(242, 242, 242));
                c.setFont(c.getFont().deriveFont(Font.BOLD));
            } else if (cellValue.equalsIgnoreCase("Free")) {
                c.setBackground(new Color(192, 255, 192));
            } else if (cellValue.contains("H O L I D A Y")) {
                 c.setBackground(new Color(255, 200, 200));
            }
            // 3. Handle Subjects using the MAP
            else {
                c.setBackground(Color.WHITE);
                c.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
                
                // Extract the short code (e.g. "JAVA" from "JAVA (Class)")
                String shortCode = cellValue.split(" ")[0].toUpperCase(); 

                // Check if our map contains this subject
                if (subjectColorMap != null && subjectColorMap.containsKey(shortCode)) {
                    // Apply the color found in the map
                    c.setForeground(subjectColorMap.get(shortCode));
                } else {
                    c.setForeground(Color.DARK_GRAY);
                }
            }
        } else {
            // Empty cells
            c.setBackground(Color.WHITE);
        }
        
        // Handle Selection
        if (isSelected) {
            c.setBackground(table.getSelectionBackground());
            c.setForeground(table.getSelectionForeground());
        }
        
        return c;
    }
}
package dependencias;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class MainFrame extends JFrame {

    private Map<String, Operation> operations = new HashMap<>();
    
    public MainFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setTitle("Dep");
        this.setLocationRelativeTo(null);
        add(toolbar(), BorderLayout.NORTH);
        this.setVisible(true);
    }
    
    public void add(Operation operation) {
        operations.put(operation.name(), operation);
    }

    private JToolBar toolbar() {
        JToolBar toolbar = new JToolBar();
        toolbar.setBorderPainted(false);
        toolbar.setFloatable(false);
        toolbar.add(button("back"));
        toolbar.add(button("forward"));
        return toolbar;
    }

    private JButton button(String name) {
        JButton button = new JButton(icon(name));
        button.addActionListener(operation(name));
        return button;
    }

    private Icon icon(String name) {
        return new ImageIcon("res/"+name+".png");
    }

    private ActionListener operation(final String name) {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations.get(name).execute();
            }
        };
    }
}

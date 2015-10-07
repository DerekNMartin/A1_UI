import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.FocusTraversalPolicy;
import java.awt.KeyboardFocusManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FindFocus {
  public static void main(String[] argv) {
    JFrame frame = new JFrame();
    JButton component1 = new JButton("1");
    JButton component2 = new JButton("2");
    JButton component3 = new JButton("3");

    frame.setLayout(new FlowLayout());
    frame.add(component1);
    frame.add(component2);
    frame.add(component3);

    frame.pack();
    frame.setVisible(true);

    System.out.println(findNextFocus().getName());
  }

  public static Component findNextFocus() {
    Component c = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
    Container root = c.getFocusCycleRootAncestor();

    FocusTraversalPolicy policy = root.getFocusTraversalPolicy();
    Component nextFocus = policy.getComponentAfter(root, c);
    if (nextFocus == null) {
      nextFocus = policy.getDefaultComponent(root);
    }
    return nextFocus;
  }
}
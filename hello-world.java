public class hello-world{
  public static void hello-world(String[] args) {
    JFrame frame = new JFram("Hello World");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
    System.out.println("Hello World");
  }
}  

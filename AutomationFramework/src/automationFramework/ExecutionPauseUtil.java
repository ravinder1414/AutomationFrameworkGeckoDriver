package automationFramework;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExecutionPauseUtil {

	private static boolean isPaused = false;
	
	private static boolean isStopped=false;
	public static JFrame frame = null;
	
	public static final void closeExecutionFrame() {
		if (frame != null) {
			frame.dispose();
		}
	}
	public static boolean isExecutionStopped()
	{
		return isStopped;
	}

	public static boolean isExecutionPaused() {
		return isPaused;
	}

	public static void createExecutionPauseGUI() {
		frame = new JFrame("Execution Controller");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JButton play = new JButton();
		play.setText("PLAY");
		play.setEnabled(false);

		JButton pause = new JButton();
		pause.setText("PAUSE");

		JButton stop = new JButton();
		stop.setText("STOP");

		play.addActionListener((ActionEvent e) -> {
			System.out.println("Play Has been clicked!");
			final Object obj = LockableObject.getLockableObject();
			synchronized (obj) {
				isPaused = false;
				obj.notifyAll();
			}
			play.setEnabled(false);
			pause.setEnabled(true);
			stop.setEnabled(true);
		});

		pause.addActionListener((ActionEvent e) -> {
			System.out.println("pause Has been clicked!");
			isPaused = true;
			play.setEnabled(true);
			pause.setEnabled(false);
			stop.setEnabled(false);
		});

		stop.addActionListener((ActionEvent e) -> {
			System.out.println("stop Has been clicked!");
			isStopped=true;
			play.setEnabled(false);
			pause.setEnabled(false);
			stop.setEnabled(false);
			frame.dispose();
		});

		panel.add(play);
		panel.add(pause);
		panel.add(stop);

		frame.add(panel);
		frame.setMinimumSize(new Dimension(300,100));
		frame.setMaximumSize(new Dimension(300,100));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setLocation((int) (dimension.getWidth() - 400),
                (int) (dimension.getHeight() - 200));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}

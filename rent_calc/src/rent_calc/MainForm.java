package rent_calc;
 
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MainForm {

	protected Shell shell;
	private Text results;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainForm window = new MainForm();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	//Перевод числа в строку вида "N руб. M коп."
	public static String TextResults (double total)
	{
		String rslt;
		Integer a,b;
		
		a = (int)total;
		total = (total - a) * 100;
		b = (int)total;
		
		rslt = Integer.toString(a) + " руб. " + Integer.toString(b) + " коп.";
		return rslt;
	}
	
	protected void createContents() {
		shell = new Shell();
		shell.setSize(603, 339);
		shell.setText("\u041A\u0430\u043B\u044C\u043A\u0443\u043B\u044F\u0442\u043E\u0440 \u043A\u0432\u0430\u0440\u043F\u043B\u0430\u0442\u044B");
		
		Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Times New Roman", 9, SWT.BOLD));
		label.setBounds(21, 10, 130, 15);
		label.setText("\u041E\u0431\u044A\u0435\u043C\u044B \u043F\u043E\u0442\u0440\u0435\u0431\u043B\u0435\u043D\u0438\u044F:");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setFont(SWTResourceManager.getFont("Times New Roman", 9, SWT.BOLD));
		label_1.setBounds(64, 163, 55, 15);
		label_1.setText("\u0422\u0430\u0440\u0438\u0444\u044B:");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 33, 97, 15);
		lblNewLabel.setText("\u042D\u043B\u0435\u043A\u0442\u0440\u043E\u044D\u043D\u0435\u0440\u0433\u0438\u044F:");
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBounds(10, 56, 70, 15);
		label_2.setText("\u041E\u0442\u043E\u043F\u043B\u0435\u043D\u0438\u0435:");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 79, 55, 15);
		lblNewLabel_1.setText("\u0413\u0430\u0437:");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 102, 85, 15);
		lblNewLabel_2.setText("\u0425\u043E\u043B\u043E\u0434\u043D\u0430\u044F \u0432\u043E\u0434\u0430:");
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setBounds(10, 125, 85, 15);
		label_3.setText("\u0413\u043E\u0440\u044F\u0447\u0430\u044F \u0432\u043E\u0434\u0430:");
		
		Spinner spinVHeat = new Spinner(shell, SWT.BORDER);
		spinVHeat.setMaximum(1000000);
		spinVHeat.setDigits(2);
		spinVHeat.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinVHeat.setBounds(111, 54, 62, 22);
		
		Spinner spinVElectr = new Spinner(shell, SWT.BORDER);
		spinVElectr.setMaximum(1000000);
		spinVElectr.setDigits(2);
		spinVElectr.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinVElectr.setBounds(111, 31, 62, 22);
		
		Spinner spinVHotWater = new Spinner(shell, SWT.BORDER);
		spinVHotWater.setMaximum(1000000);
		spinVHotWater.setDigits(2);
		spinVHotWater.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinVHotWater.setBounds(111, 123, 62, 22);
		
		Spinner spinVColdWater = new Spinner(shell, SWT.BORDER);
		spinVColdWater.setMaximum(1000000);
		spinVColdWater.setDigits(2);
		spinVColdWater.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinVColdWater.setBounds(111, 100, 62, 22);
		
		Spinner spinVGas = new Spinner(shell, SWT.BORDER);
		spinVGas.setMaximum(1000000);
		spinVGas.setDigits(2);
		spinVGas.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinVGas.setBounds(111, 77, 62, 22);
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setText("\u0413\u043E\u0440\u044F\u0447\u0430\u044F \u0432\u043E\u0434\u0430:");
		label_4.setBounds(10, 276, 85, 15);
		
		Spinner spinHotWater = new Spinner(shell, SWT.BORDER);
		spinHotWater.setMaximum(1000000);
		spinHotWater.setDigits(2);
		spinHotWater.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinHotWater.setBounds(111, 274, 62, 22);
		
		Spinner spinColdWater = new Spinner(shell, SWT.BORDER);
		spinColdWater.setMaximum(1000000);
		spinColdWater.setDigits(2);
		spinColdWater.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinColdWater.setBounds(111, 251, 62, 22);
		
		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setText("\u0425\u043E\u043B\u043E\u0434\u043D\u0430\u044F \u0432\u043E\u0434\u0430:");
		label_5.setBounds(10, 253, 85, 15);
		
		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setText("\u0413\u0430\u0437:");
		label_6.setBounds(10, 230, 55, 15);
		
		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setText("\u041E\u0442\u043E\u043F\u043B\u0435\u043D\u0438\u0435:");
		label_7.setBounds(10, 207, 70, 15);
		
		Label label_8 = new Label(shell, SWT.NONE);
		label_8.setText("\u042D\u043B\u0435\u043A\u0442\u0440\u043E\u044D\u043D\u0435\u0440\u0433\u0438\u044F:");
		label_8.setBounds(10, 184, 97, 15);
		
		Spinner spinElectr = new Spinner(shell, SWT.BORDER);
		spinElectr.setMaximum(1000000);
		spinElectr.setDigits(2);
		spinElectr.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinElectr.setBounds(111, 182, 62, 22);
		
		Spinner spinHeat = new Spinner(shell, SWT.BORDER);
		spinHeat.setMaximum(1000000);
		spinHeat.setDigits(2);
		spinHeat.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinHeat.setBounds(111, 205, 62, 22);
		
		Spinner spinGas = new Spinner(shell, SWT.BORDER);
		spinGas.setMaximum(1000000);
		spinGas.setDigits(2);
		spinGas.setFont(SWTResourceManager.getFont("Times New Roman", 8, SWT.NORMAL));
		spinGas.setBounds(111, 228, 62, 22);
		
		Label label_9 = new Label(shell, SWT.NONE);
		label_9.setText("\u0418\u0442\u043E\u0433\u0438:");
		label_9.setFont(SWTResourceManager.getFont("Times New Roman", 9, SWT.BOLD));
		label_9.setBounds(235, 10, 55, 15);
		
		results = new Text(shell, SWT.BORDER | SWT.READ_ONLY | SWT.MULTI);
		results.setBounds(229, 30, 352, 235);
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				RentCalc ob = new RentCalc(
									Double.parseDouble(spinGas.getText().replace(',','.')),
									Double.parseDouble(spinHeat.getText().replace(',','.')),
									Double.parseDouble(spinHotWater.getText().replace(',','.')),
									Double.parseDouble(spinColdWater.getText().replace(',','.')),
									Double.parseDouble(spinElectr.getText().replace(',','.')),
									Double.parseDouble(spinVGas.getText().replace(',','.')),
									Double.parseDouble(spinVHeat.getText().replace(',','.')),
									Double.parseDouble(spinVHotWater.getText().replace(',','.')),
									Double.parseDouble(spinVColdWater.getText().replace(',','.')),
									Double.parseDouble(spinVElectr.getText().replace(',','.'))
								);
			
				//Вывод результата
				results.setText(
						"1. Электроэнергия: " + TextResults(ob.total_houseElectricity) +"\n"+
						"2. Отопление: " + TextResults(ob.total_houseHeating) +"\n"+
						"3. Газ: " + TextResults(ob.total_houseGas) +"\n"+
						"4. Холодная вода: " + TextResults(ob.total_coldWater) +"\n"+
						"5. Горячая вода: " + TextResults(ob.total_hotWater) +"\n\n"+			
						"Общая сумма: " + TextResults(ob.total_sum));
			}
		});
				
		button.setBounds(506, 271, 75, 25);
		button.setText("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		
		Label lblsup = new Label(shell, SWT.NONE);
		lblsup.setText("\u041A\u0443\u0431.\u043C.");
		lblsup.setBounds(179, 276, 47, 15);
		
		Label label_10 = new Label(shell, SWT.NONE);
		label_10.setText("\u041A\u0443\u0431.\u043C.");
		label_10.setBounds(179, 253, 47, 15);
		
		Label label_11 = new Label(shell, SWT.NONE);
		label_11.setText("\u041A\u0443\u0431.\u043C.");
		label_11.setBounds(179, 230, 47, 15);
		
		Label label_12 = new Label(shell, SWT.NONE);
		label_12.setText("\u041A\u0443\u0431.\u043C.");
		label_12.setBounds(179, 125, 47, 15);
		
		Label label_13 = new Label(shell, SWT.NONE);
		label_13.setText("\u041A\u0443\u0431.\u043C.");
		label_13.setBounds(179, 102, 47, 15);
		
		Label label_14 = new Label(shell, SWT.NONE);
		label_14.setText("\u041A\u0443\u0431.\u043C.");
		label_14.setBounds(179, 79, 47, 15);
		
		Label label_15 = new Label(shell, SWT.NONE);
		label_15.setText("\u043A\u0412\u0442*\u0447\u0430\u0441");
		label_15.setBounds(179, 33, 47, 15);
		
		Label label_16 = new Label(shell, SWT.NONE);
		label_16.setText("\u0413\u043A\u0430\u043B");
		label_16.setBounds(179, 56, 47, 15);
		
		Label label_17 = new Label(shell, SWT.NONE);
		label_17.setText("\u043A\u0412\u0442*\u0447\u0430\u0441");
		label_17.setBounds(179, 184, 47, 15);
		
		Label label_18 = new Label(shell, SWT.NONE);
		label_18.setText("\u0413\u043A\u0430\u043B");
		label_18.setBounds(179, 207, 47, 15);

	}
}

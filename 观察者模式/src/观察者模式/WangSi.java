package �۲���ģʽ;

public class WangSi implements Observer{



	//private final static String TAG = WangSi.class.getSimpleName();

	

	@Override

	public void update(String context) {

		// TODO Auto-generated method stub

		System.out.println("��˼�۲쵽�������б仯");

		report(context);

	}

	

	private void report(String context) {

		System.out.println("���溫���ӵ�״̬:"+context);

	}

}
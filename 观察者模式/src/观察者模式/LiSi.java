package �۲���ģʽ;

public class LiSi implements Observer{



	@Override

	public void update(String context) {

		System.out.println("��˹:�۲쵽�����ӻ����ʼ���ϰ�㱨");

		this.reportToQinShihuang(context);

	}

	

	private void reportToQinShihuang(String reportcontent) {

		System.out.println("����,�������л:"+reportcontent);

	}

}
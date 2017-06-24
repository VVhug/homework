package �۲���ģʽ;

import java.util.ArrayList;



public class HanFeiZi implements Observable,IHanFeiZi{



	private ArrayList<Observer> observableList = new ArrayList<>();

	

	@Override

	public void addObserver(Observer observable) {

		this.observableList.add(observable);

	}

	

	@Override

	public void deleteObserver(Observer observable) {

		this.observableList.remove(observable);

	}

	

	@Override

	public void notifyObserviers(String context) {

		for(Observer observer : observableList) {

			observer.update(context);

		}

	}

	

	@Override

	public void haveBreakfast() {

		System.out.println("������:��ʼ�Է�");

		this.notifyObserviers("�������ڳԷ�");

	}

	

	@Override

	public void haveFun() {

		System.out.println("������:��ʼ����");

		this.notifyObserviers("������������");

	}

}
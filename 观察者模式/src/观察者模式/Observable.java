package �۲���ģʽ;

/**

 * ���۲��߽ӿ�

 * @author qiaojy

 *

 */

public interface Observable {



	/**

	 * ����һ���۲���

	 * @param observable

	 */

	public void addObserver(Observer observable);

	

	/**

	 * ɾ��һ���۲���

	 * @param observable

	 */

	public void deleteObserver(Observer observable);

	

	/**

	 * ֪ͨ�۲���

	 * @param context

	 */

	public void notifyObserviers(String context);

}
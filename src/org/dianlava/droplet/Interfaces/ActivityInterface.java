package org.dianlava.droplet.Interfaces;

public interface ActivityInterface {
	
	/**
	 * ��ʼ��ҳ���View
	 * */
	public void init();
	
	/**
	 * �ж�ҳ������
	 * */
	public void judgeEntry();

	/**
	 * ����View��Ҫ������
	 * */
	public void processData();
	
	/**
	 * ����View��Ҫ������
	 * */
	public void loadData();
}

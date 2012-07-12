package org.dianlava.droplet.Interfaces;

/**
 * ����Activity��Ҫʵ�ֵĽӿ�
 * 
 * @author FreeTymeKiyan
 * @date 2012-07-12
 * @version 1.0
 * */
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
	
	/**
	 * ���ݱ��۲��߷�������ʾˢ��ҳ��
	 * */
	public void refeshView();
}
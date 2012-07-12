package org.dianlava.droplet.Utils;

import android.provider.BaseColumns;

/**
 * ���еĳ����ӿ�
 * 
 * @author FreeTymeKiyan
 * @date 2012-07-11
 * @version 1.0 
 * */
public interface ConstantUtil extends BaseColumns{
	/**������֤�õ�sharedpreferences������*/
	public static final String AUTHORIZATION_INFO = "authorize_info";
	
	/**������֤URL*/
	public static final String RENREN_AUTH_URL = 
			"http://graph.renren.com/oauth/authorize?" +
					"client_id=a27cd23f525c4d88b9f083df79be4cb9" +
					"&response_type=token" +
					"&display=touch" +
					"&redirect_uri=http://graph.renren.com/oauth/login_success.html" +
					"&scope=";
	public static final String RENREN_PERMISSIONS = "status_update read_user_status publish_comment";
	/**����ACCESS TOKEN*/
	public static final String RENREN_ACCESS_TOKEN = "renren_acces_token";
	/**����access token����ʱ��*/
	public static final String RENREN_EXPIRE_TIME = "renren_expires_time";
	
	/**����΢����֤URL*/
	public static final String WEIBO_AUTH_URL =
			"https://api.weibo.com/oauth2/authorize?" +
			"client_id=318866733&" +
			"response_type=token&" +
			"redirect_uri=http://www.sina.com&" + 
			"display=mobile";
	/**����΢��access token */
	public static final String WEIBO_ACCESS_TOKEN = "weibo_access_token";
	/**����΢��access token����ʱ��*/
	public static final String WEIBO_EXPIRE_TIME = "weibo_expires_time";
	/**����΢���û�id*/
	public static final String WEIBO_UID = "weibo_uid";
	
	/**������֤URLs*/
	public static final String DOUBAN_AUTH_URL1 = "http://www.douban.com/service/auth/request_token";
	public static final String DOUBAN_AUTH_URL2 = "http://www.douban.com/service/auth/authorize";
	public static final String DOUBAN_AUTH_URL3 = "http://www.douban.com/service/auth/access_token";
	/**����access token*/
	public static final String DOUBAN_ACCESS_TOKEN = "douban_access_token";
	/**������֤access token secret*/
	public static final String DOUBAN_ACCESS_TOKEN_SECRET = "douban_access_token_secret";
	/**�����û�id*/
	public static final String DOUBAN_UID = "douban_uid";
	/**����api key��secret*/
	public static final String DOUBAN_API_KEY = "06ac89d0237be6ba14059d706a73b42e";
	public static final String DOUBAN_API_KEY_SECRET = "8bbda19ee8c63edd";
}
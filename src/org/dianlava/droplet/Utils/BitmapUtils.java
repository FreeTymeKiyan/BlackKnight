package org.dianlava.droplet.Utils;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;

/**
 * ͼƬ��صĹ��߷�����
 * */
public class BitmapUtils {
	
	/**���ݿ����Ƶ�ͼƬ��С*/
	private static int REQUERED_SIZE = 65000;
	
	/**
	 * ͼƬѹ������Bitmap���浽�ļ���
	 * 
	 * @param Bitmap
	 * */
	public byte[] saveBitmap(Bitmap beforeCompress) throws IOException {
		/*�õ�ͼƬ�Ĵ�С*/
		Config config = beforeCompress.getConfig();
		int factor = 0;
		if(config.compareTo(Config.ALPHA_8) == 0) {
			factor = 1;
		} else if(config.compareTo(Config.ARGB_4444) == 0) {
			factor = 2;
		} else if (config.compareTo(Config.ARGB_8888) == 0) {
			factor = 4;
		} else if (config.compareTo(Config.RGB_565) == 0) {
			factor = 2;
		}
		int byteSize = beforeCompress.getHeight() * 
				beforeCompress.getWidth() * factor;
		/*����quality��ֵ*/
		int quality;
		if (byteSize <= REQUERED_SIZE) {
			quality = 100;
		} else {
			quality = REQUERED_SIZE * 100 / byteSize;
		}
		/*ѹ�����ͼƬת��Ϊbyte����*/
		byte[] compressedBmp = null;
        try{
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            if(beforeCompress.compress(CompressFormat.JPEG, 
            		quality, out)) {
            	compressedBmp = out.toByteArray();
            	out.flush();
                out.close();
            }
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace(); 
        }
        return compressedBmp;
    }
	
	/**
	 * ��byte�õ�bitmap�ķ���
	 * */
	public static Bitmap getPicFromBytes(byte[] bytes, 
			BitmapFactory.Options opts ) {
		if (bytes != null)
			if (opts != null)
				return BitmapFactory.decodeByteArray(bytes, 
						0, bytes.length, opts);
			else
				return BitmapFactory.decodeByteArray(bytes, 
						0, bytes.length);
		return null;
	}
	
	/**
	 * ��������ת��Ϊbyte�ķ���
	 * */
	public static byte[] readStream(InputStream inStream) 
			throws Exception {
		byte[] buffer = new byte[1024];
		int len = -1;
		ByteArrayOutputStream outStream = new 
				ByteArrayOutputStream();
		while ((len = inStream.read(buffer)) != -1) {
			outStream.write(buffer, 0, len);
		}
		byte[] data = outStream.toByteArray();
		outStream.close();
		inStream.close();
		return data;
	}
}

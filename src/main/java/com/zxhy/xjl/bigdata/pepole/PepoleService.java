package com.zxhy.xjl.bigdata.pepole;

/**
 * 人口库服务
 * @author leasonlive
 *
 */
public interface PepoleService {
	/**
	 * 验证身份证信息
	 * @param idCode 身份证号码
	 * @param idName 身份证姓名
	 * @return
	 */
    public boolean checkID(String idCode, String idName);
    /**
     * 获取身份证信息
     * @param idCode
     * @param idName
     * @return
     */
    public IDInfo getIDInfo(String idCode, String idName);
    /**
     * 获取身份证照片
     * @param idCode
     * @param idName
     * @return
     */
    public byte[] getIDPhoto(String idCode, String idName);
    
}

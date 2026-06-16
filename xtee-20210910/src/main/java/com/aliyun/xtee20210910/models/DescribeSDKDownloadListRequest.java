// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSDKDownloadListRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The device type.</p>
     * 
     * <strong>example:</strong>
     * <p>ANDROID</p>
     */
    @NameInMap("deviceType")
    public String deviceType;

    /**
     * <p>The download type.</p>
     * 
     * <strong>example:</strong>
     * <p>OLD</p>
     */
    @NameInMap("listType")
    public String listType;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeSDKDownloadListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKDownloadListRequest self = new DescribeSDKDownloadListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDKDownloadListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSDKDownloadListRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public DescribeSDKDownloadListRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public DescribeSDKDownloadListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}

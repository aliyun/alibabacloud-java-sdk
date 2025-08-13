// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafStartStepsRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Whether the server is an Alibaba Cloud server</p>
     * <p>true or false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("aliyunServer")
    public Boolean aliyunServer;

    /**
     * <p>Used to receive a collection of strings from the frontend that POP cannot accept</p>
     * <p>Device type</p>
     * 
     * <strong>example:</strong>
     * <p>ios</p>
     */
    @NameInMap("deviceTypesStr")
    public String deviceTypesStr;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_ahqido8038</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>Language, parameters can be passed</p>
     * <ul>
     * <li>zh-CN: Chinese (default)</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Server region</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("serverRegion")
    public String serverRegion;

    public static DescribeSafStartStepsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafStartStepsRequest self = new DescribeSafStartStepsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSafStartStepsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSafStartStepsRequest setAliyunServer(Boolean aliyunServer) {
        this.aliyunServer = aliyunServer;
        return this;
    }
    public Boolean getAliyunServer() {
        return this.aliyunServer;
    }

    public DescribeSafStartStepsRequest setDeviceTypesStr(String deviceTypesStr) {
        this.deviceTypesStr = deviceTypesStr;
        return this;
    }
    public String getDeviceTypesStr() {
        return this.deviceTypesStr;
    }

    public DescribeSafStartStepsRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeSafStartStepsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeSafStartStepsRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSafStartStepsRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

}

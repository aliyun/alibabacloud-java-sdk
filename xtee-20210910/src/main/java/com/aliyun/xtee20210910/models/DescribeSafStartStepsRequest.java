// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafStartStepsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("aliyunServer")
    public Boolean aliyunServer;

    @NameInMap("deviceTypesStr")
    public String deviceTypesStr;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("language")
    public String language;

    @NameInMap("regId")
    public String regId;

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

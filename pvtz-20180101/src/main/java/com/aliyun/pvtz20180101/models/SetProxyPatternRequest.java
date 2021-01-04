// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetProxyPatternRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ProxyPattern")
    public String proxyPattern;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SetProxyPatternRequest build(java.util.Map<String, ?> map) throws Exception {
        SetProxyPatternRequest self = new SetProxyPatternRequest();
        return TeaModel.build(map, self);
    }

    public SetProxyPatternRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetProxyPatternRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public SetProxyPatternRequest setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
        return this;
    }
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    public SetProxyPatternRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}

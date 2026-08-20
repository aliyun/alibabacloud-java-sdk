// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetProxyPatternRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request. The token must be unique for each request. It can contain only ASCII characters and must be no more than 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * <p>Default value: en</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The proxy mode for recursive resolution of subdomains. Valid values:</p>
     * <ul>
     * <li><p><strong>ZONE</strong>: Disables the proxy. If a subdomain does not exist, an NXDOMAIN response is returned.</p>
     * </li>
     * <li><p><strong>RECORD</strong>: Enables the proxy. If a subdomain does not exist, the system queries the forwarding and recursion modules and returns the final result.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZONE</p>
     */
    @NameInMap("ProxyPattern")
    public String proxyPattern;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>10.61.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The unique ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df2d03865266bd9842306db586d3****</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static SetProxyPatternRequest build(java.util.Map<String, ?> map) throws Exception {
        SetProxyPatternRequest self = new SetProxyPatternRequest();
        return TeaModel.build(map, self);
    }

    public SetProxyPatternRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetProxyPatternRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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

    public SetProxyPatternRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

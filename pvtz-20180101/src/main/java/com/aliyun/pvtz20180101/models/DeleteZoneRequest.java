// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteZoneRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique value from your client for this parameter. The token must contain only ASCII characters and be no more than 64 characters in length.</p>
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
     * <p>Default: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The unique ID of the zone.</p>
     * <blockquote>
     * <p>You must dissociate a built-in authoritative domain name from its scope before you delete it.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0e41496f12da01311d314f17b801****</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DeleteZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteZoneRequest self = new DeleteZoneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteZoneRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteZoneRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DeleteZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

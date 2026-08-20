// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetZoneRecordStatusRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. The client generates this value. The value must be unique among different requests and can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6447728c8578e66aacf062d2df4446dc</p>
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
     * <p>The default value is en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the DNS record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>207541****</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The status of the DNS record. Valid values:</p>
     * <ul>
     * <li><p>ENABLE: Enables DNS resolution.</p>
     * </li>
     * <li><p>DISABLE: Pauses DNS resolution.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SetZoneRecordStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetZoneRecordStatusRequest self = new SetZoneRecordStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetZoneRecordStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetZoneRecordStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetZoneRecordStatusRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public SetZoneRecordStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SetZoneRecordStatusRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}

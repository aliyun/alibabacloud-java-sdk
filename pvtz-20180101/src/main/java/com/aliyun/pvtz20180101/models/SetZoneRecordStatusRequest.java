// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetZoneRecordStatusRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6447728c8578e66aacf062d2df4446dc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language.</p>
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
     * <p>5809</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The state of the DNS record. Valid values:</p>
     * <ul>
     * <li>ENABLE: enables the DNS record.</li>
     * <li>DISABLE: suspends the DNS record.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DISABLE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
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

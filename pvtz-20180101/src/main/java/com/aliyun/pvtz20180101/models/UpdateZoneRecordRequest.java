// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordRequest extends TeaModel {
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
     * <p>The resolution line.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The priority of the mail exchanger (MX) record. Valid values: <strong>1 to 99</strong>.</p>
     * <p>This parameter is required if the type of the DNS record is MX.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Priority")
    public Integer priority;

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
     * <p>The hostname.</p>
     * <p>For example, you must set this parameter to @ if you want to resolve @.example.com.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The time-to-live (TTL) of the DNS record.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The type of the DNS record. Valid values: <strong>A</strong>, <strong>AAAA</strong>, <strong>CNAME</strong>, <strong>TXT</strong>, <strong>MX</strong>, <strong>PTR</strong>, and <strong>SRV</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>2.2.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The record value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>The weight of the address. Valid values: <strong>1 to 100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static UpdateZoneRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRecordRequest self = new UpdateZoneRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateZoneRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateZoneRecordRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public UpdateZoneRecordRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateZoneRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateZoneRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public UpdateZoneRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public UpdateZoneRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateZoneRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public UpdateZoneRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UpdateZoneRecordRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}

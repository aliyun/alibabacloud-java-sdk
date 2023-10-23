// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Line")
    public String line;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RecordId")
    public Long recordId;

    @NameInMap("Rr")
    public String rr;

    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Value")
    public String value;

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

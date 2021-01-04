// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneRecordRequest extends TeaModel {
    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Rr")
    public String rr;

    @NameInMap("Type")
    public String type;

    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("Value")
    public String value;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static AddZoneRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddZoneRecordRequest self = new AddZoneRecordRequest();
        return TeaModel.build(map, self);
    }

    public AddZoneRecordRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public AddZoneRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddZoneRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public AddZoneRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddZoneRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public AddZoneRecordRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AddZoneRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AddZoneRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}

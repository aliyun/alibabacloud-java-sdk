// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class AppGroup extends TeaModel {
    @NameInMap("chargeType")
    public String chargeType;

    @NameInMap("chargingWay")
    public String chargingWay;

    @NameInMap("description")
    public String description;

    @NameInMap("domain")
    public String domain;

    @NameInMap("name")
    public String name;

    @NameInMap("quota")
    public Quota quota;

    @NameInMap("type")
    public String type;

    public static AppGroup build(java.util.Map<String, ?> map) throws Exception {
        AppGroup self = new AppGroup();
        return TeaModel.build(map, self);
    }

    public AppGroup setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public AppGroup setChargingWay(String chargingWay) {
        this.chargingWay = chargingWay;
        return this;
    }
    public String getChargingWay() {
        return this.chargingWay;
    }

    public AppGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppGroup setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AppGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppGroup setQuota(Quota quota) {
        this.quota = quota;
        return this;
    }
    public Quota getQuota() {
        return this.quota;
    }

    public AppGroup setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

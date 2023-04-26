// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BenefitPkgDeliveryInfo extends TeaModel {
    @NameInMap("amount")
    public Long amount;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("expire_time")
    public String expireTime;

    @NameInMap("is_permanent")
    public Boolean isPermanent;

    public static BenefitPkgDeliveryInfo build(java.util.Map<String, ?> map) throws Exception {
        BenefitPkgDeliveryInfo self = new BenefitPkgDeliveryInfo();
        return TeaModel.build(map, self);
    }

    public BenefitPkgDeliveryInfo setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public BenefitPkgDeliveryInfo setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public BenefitPkgDeliveryInfo setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public BenefitPkgDeliveryInfo setIsPermanent(Boolean isPermanent) {
        this.isPermanent = isPermanent;
        return this;
    }
    public Boolean getIsPermanent() {
        return this.isPermanent;
    }

}

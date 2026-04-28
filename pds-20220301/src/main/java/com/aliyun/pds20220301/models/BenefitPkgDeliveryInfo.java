// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BenefitPkgDeliveryInfo extends TeaModel {
    /**
     * <p>Number of benefit packages delivered.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("amount")
    public Long amount;

    /**
     * <p>The creation time of the benefit package delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The expiration time of the benefit package delivery.</p>
     * <p>If is_permit is set to false, a valid value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("expire_time")
    public String expireTime;

    /**
     * <p>Whether it is permanently valid.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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

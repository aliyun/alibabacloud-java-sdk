// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class RenewInstanceRequest extends TeaModel {
    /**
     * <p>A comma-separated list of billing instance IDs to renew. Billing instances include clusters and compute groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-dd8933281e46****</p>
     */
    @NameInMap("BillingInstanceIds")
    public String billingInstanceIds;

    /**
     * <p>The subscription duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Duration unit:</p>
     * <ul>
     * <li><p>Month</p>
     * </li>
     * <li><p>Year</p>
     * </li>
     * </ul>
     * <p>Valid only when payType is PrePaid.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_12378dfj6</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    public static RenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceRequest self = new RenewInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewInstanceRequest setBillingInstanceIds(String billingInstanceIds) {
        this.billingInstanceIds = billingInstanceIds;
        return this;
    }
    public String getBillingInstanceIds() {
        return this.billingInstanceIds;
    }

    public RenewInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public RenewInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public RenewInstanceRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

}

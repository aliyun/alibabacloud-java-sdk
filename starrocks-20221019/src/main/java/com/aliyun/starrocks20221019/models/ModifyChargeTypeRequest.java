// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyChargeTypeRequest extends TeaModel {
    /**
     * <p>Whether to enable auto-renewal. This parameter takes effect only when payType is PrePaid. Default: disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>List of billing instance IDs that require renewal. Separate multiple IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>c-3d6dc31ba67b1839</p>
     */
    @NameInMap("BillingInstanceIds")
    public String billingInstanceIds;

    /**
     * <p>Subscription duration. This parameter takes effect only when payType is PrePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>Cluster ID</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Subscription duration unit:</p>
     * <ul>
     * <li><p>Month</p>
     * </li>
     * <li><p>Year</p>
     * </li>
     * </ul>
     * <p>This parameter takes effect only when payType is PrePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>Coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2345</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    public static ModifyChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyChargeTypeRequest self = new ModifyChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyChargeTypeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyChargeTypeRequest setBillingInstanceIds(String billingInstanceIds) {
        this.billingInstanceIds = billingInstanceIds;
        return this;
    }
    public String getBillingInstanceIds() {
        return this.billingInstanceIds;
    }

    public ModifyChargeTypeRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public ModifyChargeTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyChargeTypeRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public ModifyChargeTypeRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

}

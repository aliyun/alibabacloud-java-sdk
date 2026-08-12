// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyChargeTypePriceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. This parameter is valid only when \<code>payType\\</code> is set to \<code>PrePaid\\</code>. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>A list of billing instance IDs to modify. Separate multiple IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>c-3d6dc31ba67b1839</p>
     */
    @NameInMap("BillingInstanceIds")
    public String billingInstanceIds;

    /**
     * <p>The subscription duration. This parameter is valid only when \<code>payType\\</code> is set to \<code>PrePaid\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The unit of the subscription duration:</p>
     * <ul>
     * <li><p>Month</p>
     * </li>
     * <li><p>Year</p>
     * </li>
     * </ul>
     * <p>This parameter is valid only when \<code>payType\\</code> is set to \<code>PrePaid\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    public static QueryModifyChargeTypePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyChargeTypePriceRequest self = new QueryModifyChargeTypePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryModifyChargeTypePriceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public QueryModifyChargeTypePriceRequest setBillingInstanceIds(String billingInstanceIds) {
        this.billingInstanceIds = billingInstanceIds;
        return this;
    }
    public String getBillingInstanceIds() {
        return this.billingInstanceIds;
    }

    public QueryModifyChargeTypePriceRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public QueryModifyChargeTypePriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryModifyChargeTypePriceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public QueryModifyChargeTypePriceRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

}

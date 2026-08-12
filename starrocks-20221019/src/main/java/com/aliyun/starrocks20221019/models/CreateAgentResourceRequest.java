// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class CreateAgentResourceRequest extends TeaModel {
    /**
     * <p>Enable auto-renewal. This parameter is valid only when payType is set to PrePaid. Auto-renewal is disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Number of CUs. A CU (Compute Unit) is the basic unit of service measurement. 1 CU = 1 CPU core + 4 GiB memory. For memory-enhanced instance family, 1 CU = 1 CPU core + 8 GiB memory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cu")
    public Integer cu;

    /**
     * <p>Duration. This parameter is valid only when payType is set to PrePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Payment type:</p>
     * <ol>
     * <li><p>Subscription (prePaid).</p>
     * </li>
     * <li><p>Pay-as-you-go (postPaid).</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prePay</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Unit of subscription duration:</p>
     * <ul>
     * <li><p>Month</p>
     * </li>
     * <li><p>Year</p>
     * </li>
     * </ul>
     * <p>This parameter is valid only when payType is set to PrePaid.</p>
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

    /**
     * <p>Compute group specification type.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("SpecType")
    public String specType;

    public static CreateAgentResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentResourceRequest self = new CreateAgentResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentResourceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateAgentResourceRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public CreateAgentResourceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateAgentResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAgentResourceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateAgentResourceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateAgentResourceRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public CreateAgentResourceRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

}

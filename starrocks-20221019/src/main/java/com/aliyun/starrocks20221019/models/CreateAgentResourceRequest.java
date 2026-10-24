// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class CreateAgentResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. This parameter is valid only when PayType is set to prePaid. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The number of compute units (CUs). A CU is the basic metering unit of the service. One CU equals one vCPU and 4 GiB of memory. If SpecType is set to the memory-enhanced instance family, one CU equals one vCPU and 8 GiB of memory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cu")
    public Integer cu;

    /**
     * <p>The subscription duration. This parameter is valid only when PayType is set to prePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
     * <p>The billing method. Valid values:<ol><li>prePaid: subscription.</li><li>postPaid: pay-as-you-go.</li></ol></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prePay</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. Valid values:<ul><li>Month</li><li>Year</li></ul>This parameter is valid only when PayType is set to prePaid.</p>
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
     * <p>2345</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The specification type of the compute group.</p>
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

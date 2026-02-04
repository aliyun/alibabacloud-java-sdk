// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RenewAppInstanceRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250718165839000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Ensures idempotence of requests. Generate a unique value from your client to ensure it is unique across different requests. ClientToken only supports ASCII characters and cannot exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>fdfjafdfadfenjeora</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Required. The number of subscription periods.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>Extended information</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;deliveryNodeName\&quot;:\&quot;交付质检\&quot;,\&quot;deliveryNodeStatus\&quot;:\&quot;Finish\&quot;,\&quot;deliveryOperatorRole\&quot;:\&quot;Provider\&quot;}</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>Payment type</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>Required. The unit of the subscription period, Year: Year, Month: Month, Day: Day, Hour: Hour.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static RenewAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAppInstanceRequest self = new RenewAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewAppInstanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RenewAppInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewAppInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public RenewAppInstanceRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public RenewAppInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public RenewAppInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ConfirmAppInstanceRequest extends TeaModel {
    /**
     * <p>The application type.</p>
     * 
     * <strong>example:</strong>
     * <p>PC_WebSite</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>Specifies whether to enable auto-renewal upon expiration.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a unique value from your client. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The deployment region.</p>
     * 
     * <strong>example:</strong>
     * <p>HongKong</p>
     */
    @NameInMap("DeployArea")
    public String deployArea;

    /**
     * <p>Required. The number of subscription periods.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The extended information.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;deliveryNodeName\&quot;:\&quot;视觉设计确认\&quot;,\&quot;deliveryNodeStatus\&quot;:\&quot;Reject\&quot;,\&quot;deliveryOperatorRole\&quot;:\&quot;Customer\&quot;}</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The payment type.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO_PAY</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>Required. The unit of the subscription period. Valid values:</p>
     * <ul>
     * <li>Year: year</li>
     * <li>Month: month</li>
     * <li>Day: day</li>
     * <li>Hour: hour.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>Required. The number of instances to purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The website version.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic_Edition</p>
     */
    @NameInMap("SiteVersion")
    public String siteVersion;

    /**
     * <p>The business ID of the trial instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WS123456</p>
     */
    @NameInMap("TrialBizId")
    public String trialBizId;

    @NameInMap("Version")
    public String version;

    public static ConfirmAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAppInstanceRequest self = new ConfirmAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAppInstanceRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public ConfirmAppInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ConfirmAppInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConfirmAppInstanceRequest setDeployArea(String deployArea) {
        this.deployArea = deployArea;
        return this;
    }
    public String getDeployArea() {
        return this.deployArea;
    }

    public ConfirmAppInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ConfirmAppInstanceRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public ConfirmAppInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ConfirmAppInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public ConfirmAppInstanceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public ConfirmAppInstanceRequest setSiteVersion(String siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public String getSiteVersion() {
        return this.siteVersion;
    }

    public ConfirmAppInstanceRequest setTrialBizId(String trialBizId) {
        this.trialBizId = trialBizId;
        return this;
    }
    public String getTrialBizId() {
        return this.trialBizId;
    }

    public ConfirmAppInstanceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}

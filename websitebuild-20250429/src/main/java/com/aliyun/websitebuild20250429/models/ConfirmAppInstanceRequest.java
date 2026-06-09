// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ConfirmAppInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PC_WebSite</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>HongKong</p>
     */
    @NameInMap("DeployArea")
    public String deployArea;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("Extend")
    public String extend;

    /**
     * <strong>example:</strong>
     * <p>AUTO_PAY</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <strong>example:</strong>
     * <p>Basic_Edition</p>
     */
    @NameInMap("SiteVersion")
    public String siteVersion;

    /**
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PC_WEBSITE</p>
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
     * <p>210713a117660695309606626a</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>ChineseMainland</p>
     */
    @NameInMap("DeployArea")
    public String deployArea;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
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
     * <p>Year</p>
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
     * <p>7</p>
     */
    @NameInMap("SiteVersion")
    public String siteVersion;

    public static CreateAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceRequest self = new CreateAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreateAppInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateAppInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppInstanceRequest setDeployArea(String deployArea) {
        this.deployArea = deployArea;
        return this;
    }
    public String getDeployArea() {
        return this.deployArea;
    }

    public CreateAppInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateAppInstanceRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public CreateAppInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateAppInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateAppInstanceRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public CreateAppInstanceRequest setSiteVersion(String siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public String getSiteVersion() {
        return this.siteVersion;
    }

}

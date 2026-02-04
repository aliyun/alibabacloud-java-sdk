// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceSpecRequest extends TeaModel {
    /**
     * <p>Application type</p>
     * 
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Ensures idempotence of requests. Generate a unique value from your client to ensure it is unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>2108341e17661121129745384e79f9</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Deployment area</p>
     * 
     * <strong>example:</strong>
     * <p>HongKong</p>
     */
    @NameInMap("DeployArea")
    public String deployArea;

    /**
     * <p>Extended information</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;deliveryNodeName\&quot;:\&quot;网站验收\&quot;,\&quot;deliveryNodeStatus\&quot;:\&quot;Reject\&quot;,\&quot;deliveryOperatorRole\&quot;:\&quot;Customer\&quot;}</p>
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
     * <p>Site version</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public String siteVersion;

    public static ModifyAppInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceSpecRequest self = new ModifyAppInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceSpecRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public ModifyAppInstanceSpecRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyAppInstanceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAppInstanceSpecRequest setDeployArea(String deployArea) {
        this.deployArea = deployArea;
        return this;
    }
    public String getDeployArea() {
        return this.deployArea;
    }

    public ModifyAppInstanceSpecRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public ModifyAppInstanceSpecRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ModifyAppInstanceSpecRequest setSiteVersion(String siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public String getSiteVersion() {
        return this.siteVersion;
    }

}

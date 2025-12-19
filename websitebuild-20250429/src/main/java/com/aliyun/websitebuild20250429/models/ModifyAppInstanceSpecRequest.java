// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceSpecRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>2108341e17661121129745384e79f9</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>HongKong</p>
     */
    @NameInMap("DeployArea")
    public String deployArea;

    @NameInMap("Extend")
    public String extend;

    /**
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
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

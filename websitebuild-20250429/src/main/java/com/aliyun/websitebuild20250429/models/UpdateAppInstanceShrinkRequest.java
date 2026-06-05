// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppInstanceShrinkRequest extends TeaModel {
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
     * <p>123</p>
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
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;user_device_id\&quot;:\&quot;6bef45cb0c76de284d24de074c088b73\&quot;}\n</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <strong>example:</strong>
     * <p><a href="https://app-center-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/1864953777494693/1753841032702_WX20250729-171155%402x.png">https://app-center-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/tenant/1864953777494693/1753841032702_WX20250729-171155%402x.png</a></p>
     */
    @NameInMap("IconUrl")
    public String iconUrl;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>AUTO_PAY</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>rg-aek3cqkrqibqkby</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>Basic_Edition</p>
     */
    @NameInMap("SiteVersion")
    public String siteVersion;

    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("ThumbnailUrl")
    public String thumbnailUrl;

    public static UpdateAppInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInstanceShrinkRequest self = new UpdateAppInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppInstanceShrinkRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public UpdateAppInstanceShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateAppInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAppInstanceShrinkRequest setDeployArea(String deployArea) {
        this.deployArea = deployArea;
        return this;
    }
    public String getDeployArea() {
        return this.deployArea;
    }

    public UpdateAppInstanceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppInstanceShrinkRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public UpdateAppInstanceShrinkRequest setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public UpdateAppInstanceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAppInstanceShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public UpdateAppInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateAppInstanceShrinkRequest setSiteVersion(String siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public String getSiteVersion() {
        return this.siteVersion;
    }

    public UpdateAppInstanceShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public UpdateAppInstanceShrinkRequest setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

}

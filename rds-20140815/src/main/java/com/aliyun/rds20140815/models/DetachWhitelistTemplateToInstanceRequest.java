// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachWhitelistTemplateToInstanceRequest extends TeaModel {
    /**
     * <p>The instance name.</p>
     */
    @NameInMap("InsName")
    public String insName;

    /**
     * <p>资源组ID。 关于资源组的更多信息，请参见什么是资源组。</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the whitelist template. You can call the DescribeAllWhitelistTemplate operation to obtain the ID of the whitelist template.</p>
     */
    @NameInMap("TemplateId")
    public Integer templateId;

    public static DetachWhitelistTemplateToInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachWhitelistTemplateToInstanceRequest self = new DetachWhitelistTemplateToInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DetachWhitelistTemplateToInstanceRequest setInsName(String insName) {
        this.insName = insName;
        return this;
    }
    public String getInsName() {
        return this.insName;
    }

    public DetachWhitelistTemplateToInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DetachWhitelistTemplateToInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachWhitelistTemplateToInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DetachWhitelistTemplateToInstanceRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

}

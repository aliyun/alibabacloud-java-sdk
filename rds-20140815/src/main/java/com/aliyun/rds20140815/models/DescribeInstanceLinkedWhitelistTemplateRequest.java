// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceLinkedWhitelistTemplateRequest extends TeaModel {
    /**
     * <p>The instance name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InsName")
    public String insName;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. You can leave this parameter empty.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeInstanceLinkedWhitelistTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLinkedWhitelistTemplateRequest self = new DescribeInstanceLinkedWhitelistTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLinkedWhitelistTemplateRequest setInsName(String insName) {
        this.insName = insName;
        return this;
    }
    public String getInsName() {
        return this.insName;
    }

    public DescribeInstanceLinkedWhitelistTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceLinkedWhitelistTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstanceLinkedWhitelistTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstanceLinkedWhitelistTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

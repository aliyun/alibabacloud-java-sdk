// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class TagResourceGroupRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("NotifyRmc")
    public Boolean notifyRmc;

    // 地域Id
    @NameInMap("RegionId")
    public String regionId;

    // 目标资源组
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // 资源Id
    @NameInMap("ResourceId")
    public String resourceId;

    // 资源类型
    @NameInMap("ResourceType")
    public String resourceType;

    // 云产品服务Code
    @NameInMap("Service")
    public String service;

    @NameInMap("UpdateFollowerResourceGroup")
    public Boolean updateFollowerResourceGroup;

    public static TagResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourceGroupRequest self = new TagResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public TagResourceGroupRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public TagResourceGroupRequest setNotifyRmc(Boolean notifyRmc) {
        this.notifyRmc = notifyRmc;
        return this;
    }
    public Boolean getNotifyRmc() {
        return this.notifyRmc;
    }

    public TagResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public TagResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public TagResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourceGroupRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public TagResourceGroupRequest setUpdateFollowerResourceGroup(Boolean updateFollowerResourceGroup) {
        this.updateFollowerResourceGroup = updateFollowerResourceGroup;
        return this;
    }
    public Boolean getUpdateFollowerResourceGroup() {
        return this.updateFollowerResourceGroup;
    }

}

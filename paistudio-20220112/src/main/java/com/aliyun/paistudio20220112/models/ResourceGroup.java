// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceGroup extends TeaModel {
    // CreatorID
    @NameInMap("CreatorID")
    public String creatorID;

    // pai resource created time
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    // GmtModified
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // pai resource group name
    @NameInMap("Name")
    public String name;

    // pai resource group id
    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    // UserVpc
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    // pworkspace id
    @NameInMap("WorkspaceID")
    public String workspaceID;

    public static ResourceGroup build(java.util.Map<String, ?> map) throws Exception {
        ResourceGroup self = new ResourceGroup();
        return TeaModel.build(map, self);
    }

    public ResourceGroup setCreatorID(String creatorID) {
        this.creatorID = creatorID;
        return this;
    }
    public String getCreatorID() {
        return this.creatorID;
    }

    public ResourceGroup setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public ResourceGroup setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public ResourceGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResourceGroup setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public ResourceGroup setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public ResourceGroup setWorkspaceID(String workspaceID) {
        this.workspaceID = workspaceID;
        return this;
    }
    public String getWorkspaceID() {
        return this.workspaceID;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceGroup extends TeaModel {
    @NameInMap("CreatorID")
    public String creatorID;

    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("NodeCount")
    public Integer nodeCount;

    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    @NameInMap("UserVpc")
    public UserVpc userVpc;

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

    public ResourceGroup setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
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

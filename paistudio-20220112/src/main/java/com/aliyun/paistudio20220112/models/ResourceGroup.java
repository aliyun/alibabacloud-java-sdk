// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceGroup extends TeaModel {
    /**
     * <p>CreatorID</p>
     * 
     * <strong>example:</strong>
     * <p>1612285282502324</p>
     */
    @NameInMap("CreatorID")
    public String creatorID;

    /**
     * <p>pai resource created time</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    /**
     * <p>GmtModified</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>pai resource group name</p>
     * 
     * <strong>example:</strong>
     * <p>RG1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>NodeCount</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>pai resource group id</p>
     * 
     * <strong>example:</strong>
     * <p>rg17tmvwiokhzaxg</p>
     */
    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    /**
     * <p>UserVpc</p>
     */
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    @NameInMap("Version")
    public String version;

    /**
     * <p>pworkspace id</p>
     * 
     * <strong>example:</strong>
     * <p>23000</p>
     */
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

    public ResourceGroup setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ResourceGroup setWorkspaceID(String workspaceID) {
        this.workspaceID = workspaceID;
        return this;
    }
    public String getWorkspaceID() {
        return this.workspaceID;
    }

}

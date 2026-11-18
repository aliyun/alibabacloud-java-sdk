// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class OpenAITaskRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The node type. DLNode indicates an AI node. SearchNode is available only if search AI nodes are already created in the target cluster. Otherwise, the InvalidParameter.NodeType error (HTTP 400) may be returned. You can call DescribeAIDBClusters to check the node types of the cluster before the call. SearchNode is available only if search AI nodes are already created in the cluster. Otherwise, the InvalidParameter.NodeType error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>DLNode</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the database account for which you want to enable the PolarDB for AI feature.</p>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The database account for which you want to enable the PolarDB for AI feature.</p>
     * 
     * <strong>example:</strong>
     * <p>testAccountName</p>
     */
    @NameInMap("Username")
    public String username;

    public static OpenAITaskRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAITaskRequest self = new OpenAITaskRequest();
        return TeaModel.build(map, self);
    }

    public OpenAITaskRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public OpenAITaskRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public OpenAITaskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public OpenAITaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OpenAITaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public OpenAITaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OpenAITaskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public OpenAITaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public OpenAITaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public OpenAITaskRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}

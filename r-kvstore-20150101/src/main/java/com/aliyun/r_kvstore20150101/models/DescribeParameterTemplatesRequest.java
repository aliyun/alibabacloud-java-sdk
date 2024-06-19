// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesRequest extends TeaModel {
    /**
     * <p>The architecture of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/86132.html">Overview</a>. Valid values:</p>
     * <ul>
     * <li><strong>logic</strong>: The instance is a cluster master-replica instance or a read/write splitting instance.</li>
     * <li><strong>normal</strong>: The instance is a standard master-replica instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logic</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The database engine that is run on the instance. Set the value to <strong>Redis</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The major version that is run on the instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The ID of the instance. You can call the <a href="~~DescribeInstances~~">DescribeInstances</a> operation to query the IDs of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group to which the instance belongs. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the IDs of resource groups.</p>
     * <blockquote>
     * <p> You can also query the ID of a resource group in the Resource Management console. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information of a resource group</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeParameterTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesRequest self = new DescribeParameterTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTemplatesRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public DescribeParameterTemplatesRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeParameterTemplatesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParameterTemplatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeParameterTemplatesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeParameterTemplatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeParameterTemplatesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeParameterTemplatesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeParameterTemplatesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeParameterTemplatesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

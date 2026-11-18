// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupSupportParamRequest extends TeaModel {
    /**
     * <p>The product category. Valid values:</p>
     * <ul>
     * <li><strong>standard</strong>: Open-source Redis.</li>
     * <li><strong>enterprise</strong>: Tair (Redis Enterprise Edition).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The engine type. Valid values:</p>
     * <ul>
     * <li><strong>redis</strong>: Open-source Redis or memory-optimized Tair.</li>
     * <li><strong>tair_pena</strong>: Persistent memory-optimized Tair.</li>
     * <li><strong>tair_pdb</strong>: Disk-optimized Tair (ESSD/SSD).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>redis</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The compatible engine version. Valid values:</p>
     * <ul>
     * <li>Open-source Redis supports <strong>5.0</strong>, <strong>6.0</strong>, and <strong>7.0</strong>.</li>
     * <li>Memory-optimized Tair is compatible with the Redis 5.0 and Redis 6.0 protocols. Set the value to <strong>5.0</strong> or <strong>6.0</strong>.</li>
     * <li>Persistent memory-optimized Tair is compatible with the Redis 6.0 protocol. Set the value to <strong>1.0</strong>.</li>
     * <li>Disk-optimized Tair (ESSD/SSD) is compatible with the Redis 6.0 protocol. Set the value to <strong>1.0</strong> for ESSD-based parameter templates or <strong>2.0</strong> for SSD-based parameter templates.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeParameterGroupSupportParamRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupSupportParamRequest self = new DescribeParameterGroupSupportParamRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupSupportParamRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeParameterGroupSupportParamRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeParameterGroupSupportParamRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParameterGroupSupportParamRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeParameterGroupSupportParamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeParameterGroupSupportParamRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeParameterGroupSupportParamRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeParameterGroupSupportParamRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

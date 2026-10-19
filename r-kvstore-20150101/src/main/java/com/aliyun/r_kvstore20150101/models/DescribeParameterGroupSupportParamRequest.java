// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupSupportParamRequest extends TeaModel {
    /**
     * <p>The product category. Valid values:</p>
     * <ul>
     * <li><strong>standard</strong>: ApsaraDB for Redis Community Edition.</li>
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
     * <li><strong>redis</strong>: ApsaraDB for Redis Community Edition or Tair memory-optimized instances.</li>
     * <li><strong>tair_pena</strong>: Tair persistent memory-optimized instances.</li>
     * <li><strong>tair_pdb</strong>: Tair cloud-native (ESSD/SSD) instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>redis</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The compatible version. Valid values:</p>
     * <ul>
     * <li>ApsaraDB for Redis Community Edition supports <strong>5.0</strong>, <strong>6.0</strong>, and <strong>7.0</strong>.</li>
     * <li>Tair memory-optimized instances are compatible with Redis 5.0 and Redis 6.0 protocols. Set this parameter to <strong>5.0</strong> or <strong>6.0</strong>.</li>
     * <li>Tair persistent memory-optimized instances are compatible with the Redis 6.0 protocol. Set this parameter to <strong>1.0</strong>.</li>
     * <li>Tair cloud-native (ESSD/SSD) instances are compatible with the Redis 6.0 protocol. To create a parameter template for ESSD-based instances, set this parameter to <strong>1.0</strong>. To create a parameter template for SSD-based instances, set this parameter to <strong>2.0</strong>.</li>
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

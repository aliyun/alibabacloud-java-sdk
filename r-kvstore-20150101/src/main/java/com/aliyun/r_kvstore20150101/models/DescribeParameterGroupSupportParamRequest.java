// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupSupportParamRequest extends TeaModel {
    /**
     * <p>The service category. Valid values:</p>
     * <ul>
     * <li><strong>standard</strong>: ApsaraDB for Redis Community Edition</li>
     * <li><strong>enterprise</strong>: ApsaraDB for Redis Enhanced Edition (Tair)</li>
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
     * <li><strong>redis</strong>: ApsaraDB for Redis Community Edition instance or Tair DRAM-based instance</li>
     * <li><strong>tair_pena</strong>: Tair persistent memory-optimized instance</li>
     * <li><strong>tair_pdb</strong>: Tair ESSD/SSD-based instance</li>
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
     * <li>For ApsaraDB for Redis Community Edition instances, set the parameter to <strong>5.0</strong>, <strong>6.0</strong>, or <strong>7.0</strong>.</li>
     * <li>For Tair DRAM-based instances that are compatible with Redis 5.0 or Redis 6.0, set the parameter to <strong>5.0</strong> or <strong>6.0</strong>.</li>
     * <li>For Tair persistent memory-optimized instances that are compatible with Redis 6.0, set the parameter to <strong>1.0</strong>.</li>
     * <li>For Tair ESSD-based instances that are compatible with Redis 6.0, set the parameter to <strong>1.0</strong>. For Tair SSD-based instances that are compatible with Redis 6.0, set the parameter to <strong>2.0</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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

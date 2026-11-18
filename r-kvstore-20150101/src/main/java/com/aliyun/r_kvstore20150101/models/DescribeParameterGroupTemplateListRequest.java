// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupTemplateListRequest extends TeaModel {
    /**
     * <p>The product category. Valid values:</p>
     * <ul>
     * <li><strong>standard</strong>: Open-source Redis.</li>
     * <li><strong>enterprise</strong>: Tair (Enterprise Edition).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The role type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>logic</strong>: Cluster logical instance.</li>
     * <li><strong>db</strong>: Cluster DB instance.</li>
     * <li><strong>proxy</strong>: Cluster proxy instance.</li>
     * <li><strong>cs</strong>: Cluster CS instance.</li>
     * <li><strong>normal</strong>: Primary/secondary DB instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The engine type. Valid values:</p>
     * <ul>
     * <li><strong>redis</strong>: Open-source Redis or memory-optimized Tair.</li>
     * <li><strong>tair_pena</strong>: Persistent memory-optimized Tair.</li>
     * <li><strong>tair_pdb</strong>: Disk-based Tair (ESSD/SSD).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>redis</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The compatible version. Valid values:</p>
     * <ul>
     * <li>Open-source Redis supports <strong>5.0</strong>, <strong>6.0</strong>, and <strong>7.0</strong>.</li>
     * <li>Memory-optimized Tair is compatible with Redis 5.0, 6.0, and 7.0 protocols. Set the value to <strong>5.0</strong>, <strong>6.0</strong>, or <strong>7.0</strong>.</li>
     * <li>Persistent memory-optimized Tair is compatible with the Redis 6.0 protocol. Set the value to <strong>1.0</strong>.</li>
     * <li>Disk-based Tair (ESSD/SSD) is compatible with the Redis 6.0 protocol. To create a parameter template for ESSD-based instances, set the value to <strong>1.0</strong>. To create a parameter template for SSD-based instances, set the value to <strong>2.0</strong>.</li>
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

    public static DescribeParameterGroupTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupTemplateListRequest self = new DescribeParameterGroupTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupTemplateListRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeParameterGroupTemplateListRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public DescribeParameterGroupTemplateListRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeParameterGroupTemplateListRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParameterGroupTemplateListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeParameterGroupTemplateListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeParameterGroupTemplateListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeParameterGroupTemplateListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeParameterGroupTemplateListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

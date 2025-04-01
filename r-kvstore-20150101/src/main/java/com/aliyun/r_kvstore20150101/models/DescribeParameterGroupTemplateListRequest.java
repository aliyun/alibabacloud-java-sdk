// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupTemplateListRequest extends TeaModel {
    /**
     * <p>The service category. Valid values:</p>
     * <ul>
     * <li><strong>standard</strong>: Redis Open-Source Edition</li>
     * <li><strong>enterprise</strong>: Tair (Enterprise Edition)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The role of the instance. Valid values: logic: logical instance. db: database instance. proxy: proxy node. cs: ConfigServer node. normal: master-replica database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The engine type. Valid values:</p>
     * <ul>
     * <li><strong>redis</strong>: Redis Open-Source Edition or Tair (In-Memory)</li>
     * <li><strong>tair_pena</strong>: Tair (On NVM)</li>
     * <li><strong>tair_pdb</strong>: Tair (On Disk)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>redis</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The compatible engine version. Valid values:</p>
     * <ul>
     * <li>For Redis Open-Source Edition instances, set the parameter to <strong>5.0</strong>, <strong>6.0</strong>, or <strong>7.0</strong>.</li>
     * <li>For Tair DRAM-based instances that are compatible with Redis 5.0, 6.0, or 7.0, set the parameter to <strong>5.0</strong>, <strong>6.0</strong>, or <strong>7.0</strong>.</li>
     * <li>For Tair persistent memory-optimized instances that are compatible with Redis 6.0, set the parameter to <strong>1.0</strong>.</li>
     * <li>For Tair ESSD-based instances that are compatible with Redis 6.0, set the parameter to <strong>1.0</strong>. For Tair SSD-based instances that are compatible with Redis 6.0, set the parameter to <strong>2.0</strong>.</li>
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

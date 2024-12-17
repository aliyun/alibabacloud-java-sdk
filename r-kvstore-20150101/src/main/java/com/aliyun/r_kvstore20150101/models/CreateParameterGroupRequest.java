// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateParameterGroupRequest extends TeaModel {
    /**
     * <p>The service category. Valid values:</p>
     * <ul>
     * <li><strong>standard</strong>: Community Edition</li>
     * <li><strong>enterprise</strong>: Enhanced Edition (Tair)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
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
     * <li>For ApsaraDB for Redis Community Edition instances, set the parameter to <strong>5.0</strong>, <strong>6.0</strong>, or <strong>7.0</strong>.</li>
     * <li>For Tair DRAM-based instances that are compatible with Redis 5.0, 6.0, or 7.0, set the parameter to <strong>5.0</strong>, <strong>6.0</strong>, or <strong>7.0</strong>.</li>
     * <li>For Tair persistent memory-optimized instances that are compatible with Redis 6.0, set the parameter to <strong>1.0</strong>.</li>
     * <li>For Tair ESSD-based instances that are compatible with Redis 6.0, set the parameter to <strong>1.0</strong>. For Tair SSD-based instances that are compatible with Redis 6.0, set the parameter to <strong>2.0</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the parameter template. The description must be 0 to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ParameterGroupDesc")
    public String parameterGroupDesc;

    /**
     * <p>The new name of the parameter template. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name can contain letters, digits, and underscores (_). It must start with a letter and cannot contain Chinese characters.</li>
     * <li>The name can be 8 to 64 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tw_test1</p>
     */
    @NameInMap("ParameterGroupName")
    public String parameterGroupName;

    /**
     * <p>A JSON-formatted object that specifies the parameter-value pairs. Format: {&quot;Parameter 1&quot;:&quot;Value 1&quot;,&quot;Parameter 2&quot;:&quot;Value 2&quot;...}. The specified value overwrites the original content.</p>
     * <blockquote>
     * <p> The parameters that can be added for different editions are displayed in the console.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;hz&quot;:&quot;15&quot;,&quot;#no_loose_disabled-commands&quot;:&quot;flushall&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateParameterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterGroupRequest self = new CreateParameterGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateParameterGroupRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateParameterGroupRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateParameterGroupRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateParameterGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateParameterGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateParameterGroupRequest setParameterGroupDesc(String parameterGroupDesc) {
        this.parameterGroupDesc = parameterGroupDesc;
        return this;
    }
    public String getParameterGroupDesc() {
        return this.parameterGroupDesc;
    }

    public CreateParameterGroupRequest setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    public CreateParameterGroupRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateParameterGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateParameterGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateParameterGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateParameterGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

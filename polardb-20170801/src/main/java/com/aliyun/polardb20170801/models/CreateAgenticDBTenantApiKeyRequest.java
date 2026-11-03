// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBTenantApiKeyRequest extends TeaModel {
    /**
     * <p>The AgenticDB cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The usage description.</p>
     * 
     * <strong>example:</strong>
     * <p>Dedicated key for MCP server</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expiration time in ISO 8601 format. If this parameter is not specified, the API key never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-01-01T00:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

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
     * <p>Specifies the ID of an existing tenant. If you specify this parameter, an API key is created only for the existing tenant in the current cluster. If the tenant does not exist, an error is returned and no tenant is created. If TenantName is also specified, the name must match the name of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The name of the tenant. The name must be unique within the cluster and must be 2 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>my-tenant</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    public static CreateAgenticDBTenantApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBTenantApiKeyRequest self = new CreateAgenticDBTenantApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBTenantApiKeyRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAgenticDBTenantApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgenticDBTenantApiKeyRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateAgenticDBTenantApiKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAgenticDBTenantApiKeyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateAgenticDBTenantApiKeyRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}

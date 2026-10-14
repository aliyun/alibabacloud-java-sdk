// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetAgenticDBTenantApiKeyRequest extends TeaModel {
    /**
     * <p>The ID of the target API key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ak-71304e39c7e841a1</p>
     */
    @NameInMap("ApiKeyId")
    public String apiKeyId;

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
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the target tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static ResetAgenticDBTenantApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAgenticDBTenantApiKeyRequest self = new ResetAgenticDBTenantApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public ResetAgenticDBTenantApiKeyRequest setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public String getApiKeyId() {
        return this.apiKeyId;
    }

    public ResetAgenticDBTenantApiKeyRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ResetAgenticDBTenantApiKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetAgenticDBTenantApiKeyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

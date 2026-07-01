// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetAgenticDBTenantApiKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pagc_key_cGFnYy1icDFh...newSignature22ch</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>ak-71304e39c7e841a1</p>
     */
    @NameInMap("ApiKeyId")
    public String apiKeyId;

    /**
     * <strong>example:</strong>
     * <p>2026-06-10T14:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>2027-01-01T00:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>B2C3D4E5-F6A7-8901-BCDE-F12345678901</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>my-saas-app</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    public static ResetAgenticDBTenantApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAgenticDBTenantApiKeyResponseBody self = new ResetAgenticDBTenantApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAgenticDBTenantApiKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public ResetAgenticDBTenantApiKeyResponseBody setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public String getApiKeyId() {
        return this.apiKeyId;
    }

    public ResetAgenticDBTenantApiKeyResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ResetAgenticDBTenantApiKeyResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ResetAgenticDBTenantApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetAgenticDBTenantApiKeyResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ResetAgenticDBTenantApiKeyResponseBody setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}

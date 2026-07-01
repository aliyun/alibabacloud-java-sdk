// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBTenantApiKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pagc_key_xxxx.yyyy</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>ak-xxxxxxxxxxxx</p>
     */
    @NameInMap("ApiKeyId")
    public String apiKeyId;

    /**
     * <strong>example:</strong>
     * <p>2026-06-10T08:00:00Z</p>
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
     * <p>F45FFACC-1B2C-3D4E-5F6A-7B8C9D0E1F2A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>t-aaaa111122223333</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>my-tenant</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    public static CreateAgenticDBTenantApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBTenantApiKeyResponseBody self = new CreateAgenticDBTenantApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBTenantApiKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateAgenticDBTenantApiKeyResponseBody setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public String getApiKeyId() {
        return this.apiKeyId;
    }

    public CreateAgenticDBTenantApiKeyResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateAgenticDBTenantApiKeyResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateAgenticDBTenantApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgenticDBTenantApiKeyResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateAgenticDBTenantApiKeyResponseBody setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}

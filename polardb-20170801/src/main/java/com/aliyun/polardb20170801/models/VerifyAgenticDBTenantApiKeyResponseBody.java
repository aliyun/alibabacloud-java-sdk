// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class VerifyAgenticDBTenantApiKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ak-71304e39c7e841a1</p>
     */
    @NameInMap("ApiKeyId")
    public String apiKeyId;

    /**
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>2027-01-01T00:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("Reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>D4E5F6A7-B8C9-0123-DEFA-234567890123</p>
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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Valid")
    public Boolean valid;

    public static VerifyAgenticDBTenantApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyAgenticDBTenantApiKeyResponseBody self = new VerifyAgenticDBTenantApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyAgenticDBTenantApiKeyResponseBody setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public String getApiKeyId() {
        return this.apiKeyId;
    }

    public VerifyAgenticDBTenantApiKeyResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public VerifyAgenticDBTenantApiKeyResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public VerifyAgenticDBTenantApiKeyResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public VerifyAgenticDBTenantApiKeyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VerifyAgenticDBTenantApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyAgenticDBTenantApiKeyResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public VerifyAgenticDBTenantApiKeyResponseBody setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public VerifyAgenticDBTenantApiKeyResponseBody setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

}

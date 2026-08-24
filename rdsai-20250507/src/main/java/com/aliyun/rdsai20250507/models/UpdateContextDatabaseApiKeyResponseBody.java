// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseApiKeyResponseBody extends TeaModel {
    /**
     * <p>The time when the API key was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-28T17:59:55Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The API key description.</p>
     * 
     * <strong>example:</strong>
     * <p>for nightly cron</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>A reserved field. This field is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>(null)</p>
     */
    @NameInMap("ExpiresAt")
    public String expiresAt;

    /**
     * <p>The suffix of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>33631c</p>
     */
    @NameInMap("KeyDisplaySuffix")
    public String keyDisplaySuffix;

    /**
     * <p>The key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("KeyId")
    public Long keyId;

    /**
     * <p>The prefix of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>ctxdb-</p>
     */
    @NameInMap("KeyPrefix")
    public String keyPrefix;

    /**
     * <p>The time when the API key was last used.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-01T08:30:12Z</p>
     */
    @NameInMap("LastUsedAt")
    public String lastUsedAt;

    /**
     * <p>The API key name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-key</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the API key was revoked.</p>
     * 
     * <strong>example:</strong>
     * <p>(null)</p>
     */
    @NameInMap("RevokedAt")
    public String revokedAt;

    /**
     * <p>The API key status.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateContextDatabaseApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseApiKeyResponseBody self = new UpdateContextDatabaseApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseApiKeyResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateContextDatabaseApiKeyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateContextDatabaseApiKeyResponseBody setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public UpdateContextDatabaseApiKeyResponseBody setKeyDisplaySuffix(String keyDisplaySuffix) {
        this.keyDisplaySuffix = keyDisplaySuffix;
        return this;
    }
    public String getKeyDisplaySuffix() {
        return this.keyDisplaySuffix;
    }

    public UpdateContextDatabaseApiKeyResponseBody setKeyId(Long keyId) {
        this.keyId = keyId;
        return this;
    }
    public Long getKeyId() {
        return this.keyId;
    }

    public UpdateContextDatabaseApiKeyResponseBody setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
        return this;
    }
    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    public UpdateContextDatabaseApiKeyResponseBody setLastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }
    public String getLastUsedAt() {
        return this.lastUsedAt;
    }

    public UpdateContextDatabaseApiKeyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContextDatabaseApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContextDatabaseApiKeyResponseBody setRevokedAt(String revokedAt) {
        this.revokedAt = revokedAt;
        return this;
    }
    public String getRevokedAt() {
        return this.revokedAt;
    }

    public UpdateContextDatabaseApiKeyResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

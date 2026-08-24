// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseApiKeyResponseBody extends TeaModel {
    /**
     * <p>Api Key</p>
     * 
     * <strong>example:</strong>
     * <p>ctxdb-*****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The API key details.</p>
     */
    @NameInMap("Key")
    public CreateContextDatabaseApiKeyResponseBodyKey key;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateContextDatabaseApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseApiKeyResponseBody self = new CreateContextDatabaseApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseApiKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateContextDatabaseApiKeyResponseBody setKey(CreateContextDatabaseApiKeyResponseBodyKey key) {
        this.key = key;
        return this;
    }
    public CreateContextDatabaseApiKeyResponseBodyKey getKey() {
        return this.key;
    }

    public CreateContextDatabaseApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateContextDatabaseApiKeyResponseBodyKey extends TeaModel {
        /**
         * <p>The time when the API key was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The API key description. This field is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This field is empty.</p>
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
         * <p>1</p>
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
         * <p>This field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>(null)</p>
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
         * <p>This field is empty.</p>
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

        public static CreateContextDatabaseApiKeyResponseBodyKey build(java.util.Map<String, ?> map) throws Exception {
            CreateContextDatabaseApiKeyResponseBodyKey self = new CreateContextDatabaseApiKeyResponseBodyKey();
            return TeaModel.build(map, self);
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setKeyDisplaySuffix(String keyDisplaySuffix) {
            this.keyDisplaySuffix = keyDisplaySuffix;
            return this;
        }
        public String getKeyDisplaySuffix() {
            return this.keyDisplaySuffix;
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setKeyId(Long keyId) {
            this.keyId = keyId;
            return this;
        }
        public Long getKeyId() {
            return this.keyId;
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setLastUsedAt(String lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }
        public String getLastUsedAt() {
            return this.lastUsedAt;
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setRevokedAt(String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }
        public String getRevokedAt() {
            return this.revokedAt;
        }

        public CreateContextDatabaseApiKeyResponseBodyKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

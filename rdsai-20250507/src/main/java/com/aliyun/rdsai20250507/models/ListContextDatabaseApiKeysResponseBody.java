// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseApiKeysResponseBody extends TeaModel {
    @NameInMap("Keys")
    public java.util.List<ListContextDatabaseApiKeysResponseBodyKeys> keys;

    /**
     * <strong>example:</strong>
     * <p>(null)</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>(null)</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListContextDatabaseApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseApiKeysResponseBody self = new ListContextDatabaseApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseApiKeysResponseBody setKeys(java.util.List<ListContextDatabaseApiKeysResponseBodyKeys> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<ListContextDatabaseApiKeysResponseBodyKeys> getKeys() {
        return this.keys;
    }

    public ListContextDatabaseApiKeysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContextDatabaseApiKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListContextDatabaseApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListContextDatabaseApiKeysResponseBodyKeys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>for nightly cron</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>(null)</p>
         */
        @NameInMap("ExpiresAt")
        public String expiresAt;

        /**
         * <strong>example:</strong>
         * <p>33631c</p>
         */
        @NameInMap("KeyDisplaySuffix")
        public String keyDisplaySuffix;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("KeyId")
        public Long keyId;

        /**
         * <strong>example:</strong>
         * <p>ctxdb-</p>
         */
        @NameInMap("KeyPrefix")
        public String keyPrefix;

        /**
         * <strong>example:</strong>
         * <p>2026-06-01T08:30:12Z</p>
         */
        @NameInMap("LastUsedAt")
        public String lastUsedAt;

        /**
         * <strong>example:</strong>
         * <p>my-key</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>(null)</p>
         */
        @NameInMap("RevokedAt")
        public String revokedAt;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListContextDatabaseApiKeysResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseApiKeysResponseBodyKeys self = new ListContextDatabaseApiKeysResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setKeyDisplaySuffix(String keyDisplaySuffix) {
            this.keyDisplaySuffix = keyDisplaySuffix;
            return this;
        }
        public String getKeyDisplaySuffix() {
            return this.keyDisplaySuffix;
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setKeyId(Long keyId) {
            this.keyId = keyId;
            return this;
        }
        public Long getKeyId() {
            return this.keyId;
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setLastUsedAt(String lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }
        public String getLastUsedAt() {
            return this.lastUsedAt;
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setRevokedAt(String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }
        public String getRevokedAt() {
            return this.revokedAt;
        }

        public ListContextDatabaseApiKeysResponseBodyKeys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

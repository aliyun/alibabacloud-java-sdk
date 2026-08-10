// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-05-28T17:59:55Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Keys")
    public java.util.List<UpdateContextDatabaseMemberResponseBodyKeys> keys;

    /**
     * <strong>example:</strong>
     * <p>mb-cz51tnnp8****</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("MemberName")
    public String memberName;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateContextDatabaseMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseMemberResponseBody self = new UpdateContextDatabaseMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseMemberResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateContextDatabaseMemberResponseBody setKeys(java.util.List<UpdateContextDatabaseMemberResponseBodyKeys> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<UpdateContextDatabaseMemberResponseBodyKeys> getKeys() {
        return this.keys;
    }

    public UpdateContextDatabaseMemberResponseBody setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public UpdateContextDatabaseMemberResponseBody setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public UpdateContextDatabaseMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContextDatabaseMemberResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateContextDatabaseMemberResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class UpdateContextDatabaseMemberResponseBodyKeys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>data pipeline key</p>
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
         * <p>1</p>
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
         * <p>2026-07-15T08:30:00Z</p>
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

        public static UpdateContextDatabaseMemberResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextDatabaseMemberResponseBodyKeys self = new UpdateContextDatabaseMemberResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setKeyDisplaySuffix(String keyDisplaySuffix) {
            this.keyDisplaySuffix = keyDisplaySuffix;
            return this;
        }
        public String getKeyDisplaySuffix() {
            return this.keyDisplaySuffix;
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setKeyId(Long keyId) {
            this.keyId = keyId;
            return this;
        }
        public Long getKeyId() {
            return this.keyId;
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setLastUsedAt(String lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }
        public String getLastUsedAt() {
            return this.lastUsedAt;
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setRevokedAt(String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }
        public String getRevokedAt() {
            return this.revokedAt;
        }

        public UpdateContextDatabaseMemberResponseBodyKeys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

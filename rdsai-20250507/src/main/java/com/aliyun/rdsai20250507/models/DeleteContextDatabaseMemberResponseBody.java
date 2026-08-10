// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteContextDatabaseMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-05-28T17:59:55Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Keys")
    public java.util.List<DeleteContextDatabaseMemberResponseBodyKeys> keys;

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
     * <p>deleted</p>
     */
    @NameInMap("Status")
    public String status;

    public static DeleteContextDatabaseMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextDatabaseMemberResponseBody self = new DeleteContextDatabaseMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContextDatabaseMemberResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DeleteContextDatabaseMemberResponseBody setKeys(java.util.List<DeleteContextDatabaseMemberResponseBodyKeys> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<DeleteContextDatabaseMemberResponseBodyKeys> getKeys() {
        return this.keys;
    }

    public DeleteContextDatabaseMemberResponseBody setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public DeleteContextDatabaseMemberResponseBody setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public DeleteContextDatabaseMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteContextDatabaseMemberResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DeleteContextDatabaseMemberResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DeleteContextDatabaseMemberResponseBodyKeys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>(null)</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>(null)</p>
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
         * <p>(null)</p>
         */
        @NameInMap("KeyDisplaySuffix")
        public String keyDisplaySuffix;

        /**
         * <strong>example:</strong>
         * <p>(null)</p>
         */
        @NameInMap("KeyId")
        public Long keyId;

        /**
         * <strong>example:</strong>
         * <p>(null)</p>
         */
        @NameInMap("KeyPrefix")
        public String keyPrefix;

        /**
         * <strong>example:</strong>
         * <p>(null)</p>
         */
        @NameInMap("LastUsedAt")
        public String lastUsedAt;

        /**
         * <strong>example:</strong>
         * <p>(null)</p>
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
         * <p>(null)</p>
         */
        @NameInMap("Status")
        public String status;

        public static DeleteContextDatabaseMemberResponseBodyKeys build(java.util.Map<String, ?> map) throws Exception {
            DeleteContextDatabaseMemberResponseBodyKeys self = new DeleteContextDatabaseMemberResponseBodyKeys();
            return TeaModel.build(map, self);
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setKeyDisplaySuffix(String keyDisplaySuffix) {
            this.keyDisplaySuffix = keyDisplaySuffix;
            return this;
        }
        public String getKeyDisplaySuffix() {
            return this.keyDisplaySuffix;
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setKeyId(Long keyId) {
            this.keyId = keyId;
            return this;
        }
        public Long getKeyId() {
            return this.keyId;
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setLastUsedAt(String lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }
        public String getLastUsedAt() {
            return this.lastUsedAt;
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setRevokedAt(String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }
        public String getRevokedAt() {
            return this.revokedAt;
        }

        public DeleteContextDatabaseMemberResponseBodyKeys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseMembersResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page. This field is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>(null)</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The list of members.</p>
     */
    @NameInMap("Members")
    public java.util.List<ListContextDatabaseMembersResponseBodyMembers> members;

    /**
     * <p>The pagination token for the next page. This field is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>(null)</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListContextDatabaseMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseMembersResponseBody self = new ListContextDatabaseMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseMembersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContextDatabaseMembersResponseBody setMembers(java.util.List<ListContextDatabaseMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ListContextDatabaseMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public ListContextDatabaseMembersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListContextDatabaseMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListContextDatabaseMembersResponseBodyMembersKeys extends TeaModel {
        /**
         * <p>The time when the member was created.</p>
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
         * <p>data pipeline key</p>
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
         * <p>The time when the key was last used. This field is populated after the key has been authenticated and used. This field is empty for keys that have never been used.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-15T08:30:00Z</p>
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

        public static ListContextDatabaseMembersResponseBodyMembersKeys build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseMembersResponseBodyMembersKeys self = new ListContextDatabaseMembersResponseBodyMembersKeys();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setKeyDisplaySuffix(String keyDisplaySuffix) {
            this.keyDisplaySuffix = keyDisplaySuffix;
            return this;
        }
        public String getKeyDisplaySuffix() {
            return this.keyDisplaySuffix;
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setKeyId(Long keyId) {
            this.keyId = keyId;
            return this;
        }
        public Long getKeyId() {
            return this.keyId;
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setLastUsedAt(String lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }
        public String getLastUsedAt() {
            return this.lastUsedAt;
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setRevokedAt(String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }
        public String getRevokedAt() {
            return this.revokedAt;
        }

        public ListContextDatabaseMembersResponseBodyMembersKeys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListContextDatabaseMembersResponseBodyMembers extends TeaModel {
        /**
         * <p>The time when the member was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The list of API keys.</p>
         */
        @NameInMap("Keys")
        public java.util.List<ListContextDatabaseMembersResponseBodyMembersKeys> keys;

        /**
         * <p>The member ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mb-cz51tnnp8****</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>The member name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("MemberName")
        public String memberName;

        /**
         * <p>The member role.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The member status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListContextDatabaseMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseMembersResponseBodyMembers self = new ListContextDatabaseMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseMembersResponseBodyMembers setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListContextDatabaseMembersResponseBodyMembers setKeys(java.util.List<ListContextDatabaseMembersResponseBodyMembersKeys> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<ListContextDatabaseMembersResponseBodyMembersKeys> getKeys() {
            return this.keys;
        }

        public ListContextDatabaseMembersResponseBodyMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListContextDatabaseMembersResponseBodyMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListContextDatabaseMembersResponseBodyMembers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListContextDatabaseMembersResponseBodyMembers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

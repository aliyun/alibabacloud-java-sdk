// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListPolarClawDevicePairsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Paired")
    public java.util.List<ListPolarClawDevicePairsResponseBodyPaired> paired;

    @NameInMap("Pending")
    public java.util.List<ListPolarClawDevicePairsResponseBodyPending> pending;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPolarClawDevicePairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolarClawDevicePairsResponseBody self = new ListPolarClawDevicePairsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolarClawDevicePairsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListPolarClawDevicePairsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPolarClawDevicePairsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPolarClawDevicePairsResponseBody setPaired(java.util.List<ListPolarClawDevicePairsResponseBodyPaired> paired) {
        this.paired = paired;
        return this;
    }
    public java.util.List<ListPolarClawDevicePairsResponseBodyPaired> getPaired() {
        return this.paired;
    }

    public ListPolarClawDevicePairsResponseBody setPending(java.util.List<ListPolarClawDevicePairsResponseBodyPending> pending) {
        this.pending = pending;
        return this;
    }
    public java.util.List<ListPolarClawDevicePairsResponseBodyPending> getPending() {
        return this.pending;
    }

    public ListPolarClawDevicePairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPolarClawDevicePairsResponseBodyPaired extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cli</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>cli</p>
         */
        @NameInMap("ClientMode")
        public String clientMode;

        /**
         * <strong>example:</strong>
         * <p>1778659807727</p>
         */
        @NameInMap("CreatedAtMs")
        public Long createdAtMs;

        /**
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("DeviceFamily")
        public String deviceFamily;

        /**
         * <strong>example:</strong>
         * <p>f92620d6bea04f65d48cf603c57b367c97e837c1ab9f6d78f741f477e99d857c</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>1778659807727</p>
         */
        @NameInMap("LastSeenAtMs")
        public Long lastSeenAtMs;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>operator</p>
         */
        @NameInMap("Role")
        public String role;

        @NameInMap("Scopes")
        public java.util.List<String> scopes;

        public static ListPolarClawDevicePairsResponseBodyPaired build(java.util.Map<String, ?> map) throws Exception {
            ListPolarClawDevicePairsResponseBodyPaired self = new ListPolarClawDevicePairsResponseBodyPaired();
            return TeaModel.build(map, self);
        }

        public ListPolarClawDevicePairsResponseBodyPaired setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListPolarClawDevicePairsResponseBodyPaired setClientMode(String clientMode) {
            this.clientMode = clientMode;
            return this;
        }
        public String getClientMode() {
            return this.clientMode;
        }

        public ListPolarClawDevicePairsResponseBodyPaired setCreatedAtMs(Long createdAtMs) {
            this.createdAtMs = createdAtMs;
            return this;
        }
        public Long getCreatedAtMs() {
            return this.createdAtMs;
        }

        public ListPolarClawDevicePairsResponseBodyPaired setDeviceFamily(String deviceFamily) {
            this.deviceFamily = deviceFamily;
            return this;
        }
        public String getDeviceFamily() {
            return this.deviceFamily;
        }

        public ListPolarClawDevicePairsResponseBodyPaired setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListPolarClawDevicePairsResponseBodyPaired setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListPolarClawDevicePairsResponseBodyPaired setLastSeenAtMs(Long lastSeenAtMs) {
            this.lastSeenAtMs = lastSeenAtMs;
            return this;
        }
        public Long getLastSeenAtMs() {
            return this.lastSeenAtMs;
        }

        public ListPolarClawDevicePairsResponseBodyPaired setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListPolarClawDevicePairsResponseBodyPaired setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListPolarClawDevicePairsResponseBodyPaired setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

    }

    public static class ListPolarClawDevicePairsResponseBodyPending extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cli</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>cli</p>
         */
        @NameInMap("ClientMode")
        public String clientMode;

        /**
         * <strong>example:</strong>
         * <p>server</p>
         */
        @NameInMap("DeviceFamily")
        public String deviceFamily;

        /**
         * <strong>example:</strong>
         * <p>device-784x37k0vko734fk</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsRepair")
        public Boolean isRepair;

        /**
         * <strong>example:</strong>
         * <p>test-1778647932986</p>
         */
        @NameInMap("PairRequestId")
        public String pairRequestId;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>test-pubkey-base64url</p>
         */
        @NameInMap("PublicKey")
        public String publicKey;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("RemoteIp")
        public String remoteIp;

        /**
         * <strong>example:</strong>
         * <p>operator</p>
         */
        @NameInMap("Role")
        public String role;

        @NameInMap("Roles")
        public java.util.List<String> roles;

        @NameInMap("Scopes")
        public java.util.List<String> scopes;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Silent")
        public Boolean silent;

        /**
         * <strong>example:</strong>
         * <p>1778660347550</p>
         */
        @NameInMap("Ts")
        public Long ts;

        public static ListPolarClawDevicePairsResponseBodyPending build(java.util.Map<String, ?> map) throws Exception {
            ListPolarClawDevicePairsResponseBodyPending self = new ListPolarClawDevicePairsResponseBodyPending();
            return TeaModel.build(map, self);
        }

        public ListPolarClawDevicePairsResponseBodyPending setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListPolarClawDevicePairsResponseBodyPending setClientMode(String clientMode) {
            this.clientMode = clientMode;
            return this;
        }
        public String getClientMode() {
            return this.clientMode;
        }

        public ListPolarClawDevicePairsResponseBodyPending setDeviceFamily(String deviceFamily) {
            this.deviceFamily = deviceFamily;
            return this;
        }
        public String getDeviceFamily() {
            return this.deviceFamily;
        }

        public ListPolarClawDevicePairsResponseBodyPending setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListPolarClawDevicePairsResponseBodyPending setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListPolarClawDevicePairsResponseBodyPending setIsRepair(Boolean isRepair) {
            this.isRepair = isRepair;
            return this;
        }
        public Boolean getIsRepair() {
            return this.isRepair;
        }

        public ListPolarClawDevicePairsResponseBodyPending setPairRequestId(String pairRequestId) {
            this.pairRequestId = pairRequestId;
            return this;
        }
        public String getPairRequestId() {
            return this.pairRequestId;
        }

        public ListPolarClawDevicePairsResponseBodyPending setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListPolarClawDevicePairsResponseBodyPending setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public ListPolarClawDevicePairsResponseBodyPending setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }
        public String getRemoteIp() {
            return this.remoteIp;
        }

        public ListPolarClawDevicePairsResponseBodyPending setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListPolarClawDevicePairsResponseBodyPending setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public ListPolarClawDevicePairsResponseBodyPending setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public ListPolarClawDevicePairsResponseBodyPending setSilent(Boolean silent) {
            this.silent = silent;
            return this;
        }
        public Boolean getSilent() {
            return this.silent;
        }

        public ListPolarClawDevicePairsResponseBodyPending setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddRoomPlanResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public AddRoomPlanResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public AddRoomPlanResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4F882EA7-3A1D-0113-94E4-70162C4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddRoomPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRoomPlanResponseBody self = new AddRoomPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRoomPlanResponseBody setAccessDeniedDetail(AddRoomPlanResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public AddRoomPlanResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddRoomPlanResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddRoomPlanResponseBody setData(AddRoomPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddRoomPlanResponseBodyData getData() {
        return this.data;
    }

    public AddRoomPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddRoomPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRoomPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddRoomPlanResponseBodyAccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        public String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        public String noPermissionType;

        @NameInMap("PolicyType")
        public String policyType;

        public static AddRoomPlanResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            AddRoomPlanResponseBodyAccessDeniedDetail self = new AddRoomPlanResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public AddRoomPlanResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public AddRoomPlanResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public AddRoomPlanResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public AddRoomPlanResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public AddRoomPlanResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public AddRoomPlanResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public AddRoomPlanResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class AddRoomPlanResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LTAI5t9kjkiudsnsu****</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <strong>example:</strong>
         * <p>123/</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <strong>example:</strong>
         * <p>1640315897</p>
         */
        @NameInMap("Expire")
        public String expire;

        /**
         * <strong>example:</strong>
         * <p>oss.aliyun.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAy****</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>ngEWGzttc3v2gJWCxEEt****</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static AddRoomPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddRoomPlanResponseBodyData self = new AddRoomPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddRoomPlanResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public AddRoomPlanResponseBodyData setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public AddRoomPlanResponseBodyData setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public AddRoomPlanResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public AddRoomPlanResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddRoomPlanResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public AddRoomPlanResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}

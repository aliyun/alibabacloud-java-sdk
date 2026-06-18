// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ResetMem0AccountPasswordResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public ResetMem0AccountPasswordResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public ResetMem0AccountPasswordResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetMem0AccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetMem0AccountPasswordResponseBody self = new ResetMem0AccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetMem0AccountPasswordResponseBody setAccessDeniedDetail(ResetMem0AccountPasswordResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ResetMem0AccountPasswordResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ResetMem0AccountPasswordResponseBody setData(ResetMem0AccountPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetMem0AccountPasswordResponseBodyData getData() {
        return this.data;
    }

    public ResetMem0AccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetMem0AccountPasswordResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static ResetMem0AccountPasswordResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ResetMem0AccountPasswordResponseBodyAccessDeniedDetail self = new ResetMem0AccountPasswordResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ResetMem0AccountPasswordResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ResetMem0AccountPasswordResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ResetMem0AccountPasswordResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ResetMem0AccountPasswordResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ResetMem0AccountPasswordResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ResetMem0AccountPasswordResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ResetMem0AccountPasswordResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ResetMem0AccountPasswordResponseBodyData extends TeaModel {
        /**
         * <p>API KEY</p>
         * 
         * <strong>example:</strong>
         * <p>aafdf2e7d0988ef***</p>
         */
        @NameInMap("Mem0ApiKey")
        public String mem0ApiKey;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static ResetMem0AccountPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetMem0AccountPasswordResponseBodyData self = new ResetMem0AccountPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetMem0AccountPasswordResponseBodyData setMem0ApiKey(String mem0ApiKey) {
            this.mem0ApiKey = mem0ApiKey;
            return this;
        }
        public String getMem0ApiKey() {
            return this.mem0ApiKey;
        }

        public ResetMem0AccountPasswordResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

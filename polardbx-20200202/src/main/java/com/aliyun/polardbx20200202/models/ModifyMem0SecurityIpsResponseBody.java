// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyMem0SecurityIpsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public ModifyMem0SecurityIpsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B87E2AB3-B7C9-4394-9160-7F639F732031</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMem0SecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMem0SecurityIpsResponseBody self = new ModifyMem0SecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMem0SecurityIpsResponseBody setAccessDeniedDetail(ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyMem0SecurityIpsResponseBody setData(ModifyMem0SecurityIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyMem0SecurityIpsResponseBodyData getData() {
        return this.data;
    }

    public ModifyMem0SecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The API operation name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The identity used for authentication in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the identity used for authentication belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The type of identity used for authentication in the request. Valid values:</p>
         * <ul>
         * <li>SubUser: RAM user.</li>
         * <li>AssumedRoleUser: RAM role.</li>
         * <li>Federated: SSO federated identity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encrypted complete diagnostic information.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the permission denial. Valid values:</p>
         * <ul>
         * <li><strong>ImplicitDeny</strong>: The resource owner has not granted the required permissions to the current user. Unauthorized operations are denied by default.</li>
         * <li><strong>ExplicitDeny</strong>: The RAM policy configured by the resource owner explicitly denies the current user access to the corresponding resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail self = new ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ModifyMem0SecurityIpsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ModifyMem0SecurityIpsResponseBodyData extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static ModifyMem0SecurityIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyMem0SecurityIpsResponseBodyData self = new ModifyMem0SecurityIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyMem0SecurityIpsResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

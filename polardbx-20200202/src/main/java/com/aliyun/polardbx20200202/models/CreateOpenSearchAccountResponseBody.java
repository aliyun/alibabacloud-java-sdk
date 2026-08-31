// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateOpenSearchAccountResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public CreateOpenSearchAccountResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The details of the returned policy.</p>
     */
    @NameInMap("Data")
    public CreateOpenSearchAccountResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-****-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOpenSearchAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSearchAccountResponseBody self = new CreateOpenSearchAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOpenSearchAccountResponseBody setAccessDeniedDetail(CreateOpenSearchAccountResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public CreateOpenSearchAccountResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateOpenSearchAccountResponseBody setData(CreateOpenSearchAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOpenSearchAccountResponseBodyData getData() {
        return this.data;
    }

    public CreateOpenSearchAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOpenSearchAccountResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The description is as above.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The type of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the permission denial.</p>
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

        public static CreateOpenSearchAccountResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateOpenSearchAccountResponseBodyAccessDeniedDetail self = new CreateOpenSearchAccountResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public CreateOpenSearchAccountResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public CreateOpenSearchAccountResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public CreateOpenSearchAccountResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public CreateOpenSearchAccountResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public CreateOpenSearchAccountResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public CreateOpenSearchAccountResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public CreateOpenSearchAccountResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class CreateOpenSearchAccountResponseBodyData extends TeaModel {
        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>polardbx_meta_ro</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static CreateOpenSearchAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOpenSearchAccountResponseBodyData self = new CreateOpenSearchAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOpenSearchAccountResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateOpenSearchAccountResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteOpenSearchAccountResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DeleteOpenSearchAccountResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DeleteOpenSearchAccountResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOpenSearchAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSearchAccountResponseBody self = new DeleteOpenSearchAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSearchAccountResponseBody setAccessDeniedDetail(DeleteOpenSearchAccountResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DeleteOpenSearchAccountResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteOpenSearchAccountResponseBody setData(DeleteOpenSearchAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteOpenSearchAccountResponseBodyData getData() {
        return this.data;
    }

    public DeleteOpenSearchAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteOpenSearchAccountResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
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
         * <p>NoPermissionType</p>
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
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DeleteOpenSearchAccountResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DeleteOpenSearchAccountResponseBodyAccessDeniedDetail self = new DeleteOpenSearchAccountResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DeleteOpenSearchAccountResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DeleteOpenSearchAccountResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DeleteOpenSearchAccountResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DeleteOpenSearchAccountResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DeleteOpenSearchAccountResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DeleteOpenSearchAccountResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DeleteOpenSearchAccountResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DeleteOpenSearchAccountResponseBodyData extends TeaModel {
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

        public static DeleteOpenSearchAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteOpenSearchAccountResponseBodyData self = new DeleteOpenSearchAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteOpenSearchAccountResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DeleteOpenSearchAccountResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

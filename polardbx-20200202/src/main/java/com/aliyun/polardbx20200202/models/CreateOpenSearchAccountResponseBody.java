// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateOpenSearchAccountResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public CreateOpenSearchAccountResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Data")
    public CreateOpenSearchAccountResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
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
         * <strong>example:</strong>
         * <p>polardbx_meta_ro</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
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

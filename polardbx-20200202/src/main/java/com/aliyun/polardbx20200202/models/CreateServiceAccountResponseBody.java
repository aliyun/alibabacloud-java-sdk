// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateServiceAccountResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public CreateServiceAccountResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The returned policy details.</p>
     */
    @NameInMap("Data")
    public CreateServiceAccountResponseBodyData data;

    /**
     * <p>The additional information returned. If the request is successful, <strong>success</strong> is returned. If the request fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateServiceAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceAccountResponseBody self = new CreateServiceAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceAccountResponseBody setAccessDeniedDetail(CreateServiceAccountResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public CreateServiceAccountResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateServiceAccountResponseBody setData(CreateServiceAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceAccountResponseBodyData getData() {
        return this.data;
    }

    public CreateServiceAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateServiceAccountResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The authentication principal type.</p>
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
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static CreateServiceAccountResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceAccountResponseBodyAccessDeniedDetail self = new CreateServiceAccountResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public CreateServiceAccountResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public CreateServiceAccountResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public CreateServiceAccountResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public CreateServiceAccountResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public CreateServiceAccountResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class CreateServiceAccountResponseBodyData extends TeaModel {
        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>polardbx_meta_ro</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Indicates whether the account already exists.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("AlreadyExists")
        public Boolean alreadyExists;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1E5DCFFC-A00D-****-836E-73318F8CA577</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The type of the service account.</p>
         * 
         * <strong>example:</strong>
         * <p>服务账号类型</p>
         */
        @NameInMap("ServiceAccountType")
        public String serviceAccountType;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static CreateServiceAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceAccountResponseBodyData self = new CreateServiceAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceAccountResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateServiceAccountResponseBodyData setAlreadyExists(Boolean alreadyExists) {
            this.alreadyExists = alreadyExists;
            return this;
        }
        public Boolean getAlreadyExists() {
            return this.alreadyExists;
        }

        public CreateServiceAccountResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateServiceAccountResponseBodyData setServiceAccountType(String serviceAccountType) {
            this.serviceAccountType = serviceAccountType;
            return this;
        }
        public String getServiceAccountType() {
            return this.serviceAccountType;
        }

        public CreateServiceAccountResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateServiceAccountResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

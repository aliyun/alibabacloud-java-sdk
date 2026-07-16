// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeServiceAccountResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeServiceAccountResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The instance details.</p>
     */
    @NameInMap("Data")
    public DescribeServiceAccountResponseBodyData data;

    /**
     * <p>The response message. &quot;success&quot; is returned if the request was successful. Otherwise, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeServiceAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAccountResponseBody self = new DescribeServiceAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAccountResponseBody setAccessDeniedDetail(DescribeServiceAccountResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeServiceAccountResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeServiceAccountResponseBody setData(DescribeServiceAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeServiceAccountResponseBodyData getData() {
        return this.data;
    }

    public DescribeServiceAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeServiceAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeServiceAccountResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The diagnostic information.</p>
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

        public static DescribeServiceAccountResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceAccountResponseBodyAccessDeniedDetail self = new DescribeServiceAccountResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeServiceAccountResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeServiceAccountResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeServiceAccountResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeServiceAccountResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeServiceAccountResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeServiceAccountResponseBodyDataServiceAccounts extends TeaModel {
        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>polardbx_meta_ro</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The time when the account was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-21T14:17:25+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The service account type.</p>
         * 
         * <strong>example:</strong>
         * <p>METADATA_READONLY</p>
         */
        @NameInMap("ServiceAccountType")
        public String serviceAccountType;

        /**
         * <p>The status of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Backing up.</li>
         * <li><strong>1</strong>: Backup succeeded.</li>
         * <li><strong>2</strong>: Backup failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeServiceAccountResponseBodyDataServiceAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceAccountResponseBodyDataServiceAccounts self = new DescribeServiceAccountResponseBodyDataServiceAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeServiceAccountResponseBodyDataServiceAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeServiceAccountResponseBodyDataServiceAccounts setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeServiceAccountResponseBodyDataServiceAccounts setServiceAccountType(String serviceAccountType) {
            this.serviceAccountType = serviceAccountType;
            return this;
        }
        public String getServiceAccountType() {
            return this.serviceAccountType;
        }

        public DescribeServiceAccountResponseBodyDataServiceAccounts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeServiceAccountResponseBodyData extends TeaModel {
        /**
         * <p>The service account in the list.</p>
         */
        @NameInMap("ServiceAccounts")
        public java.util.List<DescribeServiceAccountResponseBodyDataServiceAccounts> serviceAccounts;

        public static DescribeServiceAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceAccountResponseBodyData self = new DescribeServiceAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeServiceAccountResponseBodyData setServiceAccounts(java.util.List<DescribeServiceAccountResponseBodyDataServiceAccounts> serviceAccounts) {
            this.serviceAccounts = serviceAccounts;
            return this;
        }
        public java.util.List<DescribeServiceAccountResponseBodyDataServiceAccounts> getServiceAccounts() {
            return this.serviceAccounts;
        }

    }

}

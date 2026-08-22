// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchAccountInfoResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DescribeOpenSearchAccountInfoResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenSearchAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchAccountInfoResponseBody self = new DescribeOpenSearchAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchAccountInfoResponseBody setAccessDeniedDetail(DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeOpenSearchAccountInfoResponseBody setData(DescribeOpenSearchAccountInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenSearchAccountInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenSearchAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail self = new DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeOpenSearchAccountInfoResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeOpenSearchAccountInfoResponseBodyDataAccounts extends TeaModel {
        /**
         * <p>The account status. Valid values: </p>
         * <ul>
         * <li><strong>Creating</strong>: The account is being created.</li>
         * <li><strong>Available</strong>: The account is available.</li>
         * <li><strong>Deleting</strong>: The account is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The account type.</p>
         * <ul>
         * <li>Before three-role mode is enabled: 0 indicates a standard account, and 1 indicates a privileged account.</li>
         * <li>After three-role mode is enabled: 0 indicates a standard account, 2 indicates a system administrator account, 3 indicates a security administrator account, and 4 indicates an audit administrator account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2,3,4</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The account name of the OpenSearch instance.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        @NameInMap("Username")
        public String username;

        public static DescribeOpenSearchAccountInfoResponseBodyDataAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchAccountInfoResponseBodyDataAccounts self = new DescribeOpenSearchAccountInfoResponseBodyDataAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchAccountInfoResponseBodyDataAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeOpenSearchAccountInfoResponseBodyDataAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeOpenSearchAccountInfoResponseBodyDataAccounts setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeOpenSearchAccountInfoResponseBodyData extends TeaModel {
        /**
         * <p>The list of accounts.</p>
         */
        @NameInMap("Accounts")
        public java.util.List<DescribeOpenSearchAccountInfoResponseBodyDataAccounts> accounts;

        /**
         * <p>The time when the password was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21T12:00:00Z</p>
         */
        @NameInMap("PasswordLastModified")
        public String passwordLastModified;

        /**
         * <p>The account name of the OpenSearch instance.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        @NameInMap("Username")
        public String username;

        public static DescribeOpenSearchAccountInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchAccountInfoResponseBodyData self = new DescribeOpenSearchAccountInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchAccountInfoResponseBodyData setAccounts(java.util.List<DescribeOpenSearchAccountInfoResponseBodyDataAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeOpenSearchAccountInfoResponseBodyDataAccounts> getAccounts() {
            return this.accounts;
        }

        public DescribeOpenSearchAccountInfoResponseBodyData setPasswordLastModified(String passwordLastModified) {
            this.passwordLastModified = passwordLastModified;
            return this;
        }
        public String getPasswordLastModified() {
            return this.passwordLastModified;
        }

        public DescribeOpenSearchAccountInfoResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}

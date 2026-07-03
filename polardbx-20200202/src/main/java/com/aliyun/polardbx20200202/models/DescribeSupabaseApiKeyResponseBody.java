// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSupabaseApiKeyResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The API key information.</p>
     */
    @NameInMap("Data")
    public DescribeSupabaseApiKeyResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSupabaseApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseApiKeyResponseBody self = new DescribeSupabaseApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseApiKeyResponseBody setAccessDeniedDetail(DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeSupabaseApiKeyResponseBody setData(DescribeSupabaseApiKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSupabaseApiKeyResponseBodyData getData() {
        return this.data;
    }

    public DescribeSupabaseApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail self = new DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeSupabaseApiKeyResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeSupabaseApiKeyResponseBodyData extends TeaModel {
        /**
         * <p>The anonymous access key.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AnonKey")
        public String anonKey;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxsp-*********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The service role key.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ServiceRoleKey")
        public String serviceRoleKey;

        public static DescribeSupabaseApiKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseApiKeyResponseBodyData self = new DescribeSupabaseApiKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseApiKeyResponseBodyData setAnonKey(String anonKey) {
            this.anonKey = anonKey;
            return this;
        }
        public String getAnonKey() {
            return this.anonKey;
        }

        public DescribeSupabaseApiKeyResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeSupabaseApiKeyResponseBodyData setServiceRoleKey(String serviceRoleKey) {
            this.serviceRoleKey = serviceRoleKey;
            return this;
        }
        public String getServiceRoleKey() {
            return this.serviceRoleKey;
        }

    }

}

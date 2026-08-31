// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContext0ConfigResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeContext0ConfigResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The paginated result of the instance list.</p>
     */
    @NameInMap("Data")
    public DescribeContext0ConfigResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContext0ConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContext0ConfigResponseBody self = new DescribeContext0ConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContext0ConfigResponseBody setAccessDeniedDetail(DescribeContext0ConfigResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeContext0ConfigResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeContext0ConfigResponseBody setData(DescribeContext0ConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeContext0ConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeContext0ConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContext0ConfigResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
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
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeContext0ConfigResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0ConfigResponseBodyAccessDeniedDetail self = new DescribeContext0ConfigResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeContext0ConfigResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeContext0ConfigResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeContext0ConfigResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeContext0ConfigResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeContext0ConfigResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeContext0ConfigResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeContext0ConfigResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeContext0ConfigResponseBodyData extends TeaModel {
        /**
         * <p>The administrator key of the context service.</p>
         * 
         * <strong>example:</strong>
         * <p>admin-key-example</p>
         */
        @NameInMap("Context0AdminKey")
        public String context0AdminKey;

        /**
         * <p>The name of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>context0-example</p>
         */
        @NameInMap("Context0InstanceName")
        public String context0InstanceName;

        /**
         * <p>The owner key of the context service.</p>
         * 
         * <strong>example:</strong>
         * <p>owner-key-example</p>
         */
        @NameInMap("Context0OwnerKey")
        public String context0OwnerKey;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxsp-*********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The name of the PolarDB-X Search instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxs-*********</p>
         */
        @NameInMap("OpenSearchInstanceName")
        public String openSearchInstanceName;

        public static DescribeContext0ConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0ConfigResponseBodyData self = new DescribeContext0ConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContext0ConfigResponseBodyData setContext0AdminKey(String context0AdminKey) {
            this.context0AdminKey = context0AdminKey;
            return this;
        }
        public String getContext0AdminKey() {
            return this.context0AdminKey;
        }

        public DescribeContext0ConfigResponseBodyData setContext0InstanceName(String context0InstanceName) {
            this.context0InstanceName = context0InstanceName;
            return this;
        }
        public String getContext0InstanceName() {
            return this.context0InstanceName;
        }

        public DescribeContext0ConfigResponseBodyData setContext0OwnerKey(String context0OwnerKey) {
            this.context0OwnerKey = context0OwnerKey;
            return this;
        }
        public String getContext0OwnerKey() {
            return this.context0OwnerKey;
        }

        public DescribeContext0ConfigResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeContext0ConfigResponseBodyData setOpenSearchInstanceName(String openSearchInstanceName) {
            this.openSearchInstanceName = openSearchInstanceName;
            return this;
        }
        public String getOpenSearchInstanceName() {
            return this.openSearchInstanceName;
        }

    }

}

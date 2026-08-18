// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContextDBConfigResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeContextDBConfigResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DescribeContextDBConfigResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContextDBConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContextDBConfigResponseBody self = new DescribeContextDBConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContextDBConfigResponseBody setAccessDeniedDetail(DescribeContextDBConfigResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeContextDBConfigResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeContextDBConfigResponseBody setData(DescribeContextDBConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeContextDBConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeContextDBConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContextDBConfigResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeContextDBConfigResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBConfigResponseBodyAccessDeniedDetail self = new DescribeContextDBConfigResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBConfigResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeContextDBConfigResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeContextDBConfigResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeContextDBConfigResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeContextDBConfigResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeContextDBConfigResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeContextDBConfigResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeContextDBConfigResponseBodyData extends TeaModel {
        /**
         * <p>The admin key of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ctx-admin-***</p>
         */
        @NameInMap("ContextDBAdminKey")
        public String contextDBAdminKey;

        /**
         * <p>The name of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxt-*********</p>
         */
        @NameInMap("ContextDBInstanceName")
        public String contextDBInstanceName;

        /**
         * <p>The owner key of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ctx-***</p>
         */
        @NameInMap("ContextDBOwnerKey")
        public String contextDBOwnerKey;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*********</p>
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

        public static DescribeContextDBConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBConfigResponseBodyData self = new DescribeContextDBConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBConfigResponseBodyData setContextDBAdminKey(String contextDBAdminKey) {
            this.contextDBAdminKey = contextDBAdminKey;
            return this;
        }
        public String getContextDBAdminKey() {
            return this.contextDBAdminKey;
        }

        public DescribeContextDBConfigResponseBodyData setContextDBInstanceName(String contextDBInstanceName) {
            this.contextDBInstanceName = contextDBInstanceName;
            return this;
        }
        public String getContextDBInstanceName() {
            return this.contextDBInstanceName;
        }

        public DescribeContextDBConfigResponseBodyData setContextDBOwnerKey(String contextDBOwnerKey) {
            this.contextDBOwnerKey = contextDBOwnerKey;
            return this;
        }
        public String getContextDBOwnerKey() {
            return this.contextDBOwnerKey;
        }

        public DescribeContextDBConfigResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeContextDBConfigResponseBodyData setOpenSearchInstanceName(String openSearchInstanceName) {
            this.openSearchInstanceName = openSearchInstanceName;
            return this;
        }
        public String getOpenSearchInstanceName() {
            return this.openSearchInstanceName;
        }

    }

}

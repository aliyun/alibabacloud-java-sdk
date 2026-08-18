// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContextDBSecurityIpsResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The paginated result of the instance list.</p>
     */
    @NameInMap("Data")
    public DescribeContextDBSecurityIpsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D6A4256F-7B83-5BD7-9AC0-72E1FAC05330</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContextDBSecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContextDBSecurityIpsResponseBody self = new DescribeContextDBSecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContextDBSecurityIpsResponseBody setAccessDeniedDetail(DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeContextDBSecurityIpsResponseBody setData(DescribeContextDBSecurityIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeContextDBSecurityIpsResponseBodyData getData() {
        return this.data;
    }

    public DescribeContextDBSecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail self = new DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeContextDBSecurityIpsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeContextDBSecurityIpsResponseBodyDataGroupItems extends TeaModel {
        /**
         * <p>The whitelist group name.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The group tag.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("GroupTag")
        public String groupTag;

        /**
         * <p>The details of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1,172.168.0.0</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static DescribeContextDBSecurityIpsResponseBodyDataGroupItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBSecurityIpsResponseBodyDataGroupItems self = new DescribeContextDBSecurityIpsResponseBodyDataGroupItems();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBSecurityIpsResponseBodyDataGroupItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeContextDBSecurityIpsResponseBodyDataGroupItems setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public DescribeContextDBSecurityIpsResponseBodyDataGroupItems setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

    public static class DescribeContextDBSecurityIpsResponseBodyData extends TeaModel {
        /**
         * <p>The context service instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxt-*********</p>
         */
        @NameInMap("ContextDBInstanceName")
        public String contextDBInstanceName;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The whitelist group list.</p>
         */
        @NameInMap("GroupItems")
        public java.util.List<DescribeContextDBSecurityIpsResponseBodyDataGroupItems> groupItems;

        public static DescribeContextDBSecurityIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBSecurityIpsResponseBodyData self = new DescribeContextDBSecurityIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBSecurityIpsResponseBodyData setContextDBInstanceName(String contextDBInstanceName) {
            this.contextDBInstanceName = contextDBInstanceName;
            return this;
        }
        public String getContextDBInstanceName() {
            return this.contextDBInstanceName;
        }

        public DescribeContextDBSecurityIpsResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeContextDBSecurityIpsResponseBodyData setGroupItems(java.util.List<DescribeContextDBSecurityIpsResponseBodyDataGroupItems> groupItems) {
            this.groupItems = groupItems;
            return this;
        }
        public java.util.List<DescribeContextDBSecurityIpsResponseBodyDataGroupItems> getGroupItems() {
            return this.groupItems;
        }

    }

}

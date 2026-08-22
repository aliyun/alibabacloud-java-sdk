// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContext0SecurityIpsResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The monitoring data.</p>
     */
    @NameInMap("Data")
    public DescribeContext0SecurityIpsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContext0SecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContext0SecurityIpsResponseBody self = new DescribeContext0SecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContext0SecurityIpsResponseBody setAccessDeniedDetail(DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeContext0SecurityIpsResponseBody setData(DescribeContext0SecurityIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeContext0SecurityIpsResponseBodyData getData() {
        return this.data;
    }

    public DescribeContext0SecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail self = new DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeContext0SecurityIpsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeContext0SecurityIpsResponseBodyDataGroupItems extends TeaModel {
        /**
         * <p>The name of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The tag of the group.</p>
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

        public static DescribeContext0SecurityIpsResponseBodyDataGroupItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0SecurityIpsResponseBodyDataGroupItems self = new DescribeContext0SecurityIpsResponseBodyDataGroupItems();
            return TeaModel.build(map, self);
        }

        public DescribeContext0SecurityIpsResponseBodyDataGroupItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeContext0SecurityIpsResponseBodyDataGroupItems setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public DescribeContext0SecurityIpsResponseBodyDataGroupItems setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

    public static class DescribeContext0SecurityIpsResponseBodyData extends TeaModel {
        /**
         * <p>The name of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>context0-example</p>
         */
        @NameInMap("Context0InstanceName")
        public String context0InstanceName;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The list of whitelist groups.</p>
         */
        @NameInMap("GroupItems")
        public java.util.List<DescribeContext0SecurityIpsResponseBodyDataGroupItems> groupItems;

        public static DescribeContext0SecurityIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0SecurityIpsResponseBodyData self = new DescribeContext0SecurityIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContext0SecurityIpsResponseBodyData setContext0InstanceName(String context0InstanceName) {
            this.context0InstanceName = context0InstanceName;
            return this;
        }
        public String getContext0InstanceName() {
            return this.context0InstanceName;
        }

        public DescribeContext0SecurityIpsResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeContext0SecurityIpsResponseBodyData setGroupItems(java.util.List<DescribeContext0SecurityIpsResponseBodyDataGroupItems> groupItems) {
            this.groupItems = groupItems;
            return this;
        }
        public java.util.List<DescribeContext0SecurityIpsResponseBodyDataGroupItems> getGroupItems() {
            return this.groupItems;
        }

    }

}

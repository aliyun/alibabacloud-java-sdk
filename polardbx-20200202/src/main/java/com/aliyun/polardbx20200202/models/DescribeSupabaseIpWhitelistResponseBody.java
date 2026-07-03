// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSupabaseIpWhitelistResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The whitelist information.</p>
     */
    @NameInMap("Data")
    public DescribeSupabaseIpWhitelistResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSupabaseIpWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseIpWhitelistResponseBody self = new DescribeSupabaseIpWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseIpWhitelistResponseBody setAccessDeniedDetail(DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeSupabaseIpWhitelistResponseBody setData(DescribeSupabaseIpWhitelistResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSupabaseIpWhitelistResponseBodyData getData() {
        return this.data;
    }

    public DescribeSupabaseIpWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail self = new DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeSupabaseIpWhitelistResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeSupabaseIpWhitelistResponseBodyDataGroupItems extends TeaModel {
        /**
         * <p>The group name.</p>
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
         * <p>The IP whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1,172.168.0.0</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static DescribeSupabaseIpWhitelistResponseBodyDataGroupItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseIpWhitelistResponseBodyDataGroupItems self = new DescribeSupabaseIpWhitelistResponseBodyDataGroupItems();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseIpWhitelistResponseBodyDataGroupItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeSupabaseIpWhitelistResponseBodyDataGroupItems setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public DescribeSupabaseIpWhitelistResponseBodyDataGroupItems setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

    public static class DescribeSupabaseIpWhitelistResponseBodyData extends TeaModel {
        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-unrf5ssig0ecg8</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The list of whitelist groups.</p>
         */
        @NameInMap("GroupItems")
        public java.util.List<DescribeSupabaseIpWhitelistResponseBodyDataGroupItems> groupItems;

        public static DescribeSupabaseIpWhitelistResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseIpWhitelistResponseBodyData self = new DescribeSupabaseIpWhitelistResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseIpWhitelistResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeSupabaseIpWhitelistResponseBodyData setGroupItems(java.util.List<DescribeSupabaseIpWhitelistResponseBodyDataGroupItems> groupItems) {
            this.groupItems = groupItems;
            return this;
        }
        public java.util.List<DescribeSupabaseIpWhitelistResponseBodyDataGroupItems> getGroupItems() {
            return this.groupItems;
        }

    }

}

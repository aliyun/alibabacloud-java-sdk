// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfuseSecurityIpsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The instance details.</p>
     */
    @NameInMap("Data")
    public DescribePxfuseSecurityIpsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePxfuseSecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfuseSecurityIpsResponseBody self = new DescribePxfuseSecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePxfuseSecurityIpsResponseBody setAccessDeniedDetail(DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePxfuseSecurityIpsResponseBody setData(DescribePxfuseSecurityIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePxfuseSecurityIpsResponseBodyData getData() {
        return this.data;
    }

    public DescribePxfuseSecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The description is the same as above.</p>
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
         * <p>The type of the no-permission error.</p>
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

        public static DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail self = new DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribePxfuseSecurityIpsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribePxfuseSecurityIpsResponseBodyDataGroups extends TeaModel {
        /**
         * <p>The name of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>bigdata</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The group tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupTag")
        public String groupTag;

        /**
         * <p>Specifies whether an IP address that is already used for a DNAT entry can also be used for an SNAT entry. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Destination IP address can also be used for an SNAT entry.</p>
         * </li>
         * <li><p><strong>false</strong>: Destination IP address cannot be used for an SNAT entry.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("IpLists")
        public String ipLists;

        public static DescribePxfuseSecurityIpsResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfuseSecurityIpsResponseBodyDataGroups self = new DescribePxfuseSecurityIpsResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public DescribePxfuseSecurityIpsResponseBodyDataGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePxfuseSecurityIpsResponseBodyDataGroups setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public DescribePxfuseSecurityIpsResponseBodyDataGroups setIpLists(String ipLists) {
            this.ipLists = ipLists;
            return this;
        }
        public String getIpLists() {
            return this.ipLists;
        }

    }

    public static class DescribePxfuseSecurityIpsResponseBodyData extends TeaModel {
        /**
         * <p>The name of the memory engine instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-***-mem</p>
         */
        @NameInMap("CustinsName")
        public String custinsName;

        /**
         * <p>The groups corresponding to the consumed service.</p>
         */
        @NameInMap("Groups")
        public java.util.List<DescribePxfuseSecurityIpsResponseBodyDataGroups> groups;

        public static DescribePxfuseSecurityIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfuseSecurityIpsResponseBodyData self = new DescribePxfuseSecurityIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePxfuseSecurityIpsResponseBodyData setCustinsName(String custinsName) {
            this.custinsName = custinsName;
            return this;
        }
        public String getCustinsName() {
            return this.custinsName;
        }

        public DescribePxfuseSecurityIpsResponseBodyData setGroups(java.util.List<DescribePxfuseSecurityIpsResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<DescribePxfuseSecurityIpsResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

    }

}

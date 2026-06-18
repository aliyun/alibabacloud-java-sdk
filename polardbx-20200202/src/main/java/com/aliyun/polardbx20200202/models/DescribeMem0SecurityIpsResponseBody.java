// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeMem0SecurityIpsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public DescribeMem0SecurityIpsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMem0SecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMem0SecurityIpsResponseBody self = new DescribeMem0SecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMem0SecurityIpsResponseBody setAccessDeniedDetail(DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeMem0SecurityIpsResponseBody setData(DescribeMem0SecurityIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMem0SecurityIpsResponseBodyData getData() {
        return this.data;
    }

    public DescribeMem0SecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>Same as above.</p>
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
         * <p>Same as above.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>Same as above.</p>
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
         * <p>AQEAAAAAacnceTlBNjlFODgyLTlBMDUtNUUyRC04MzE5LUQwMzZDRjJFQTM3NA==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of no-permission error.</p>
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

        public static DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail self = new DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeMem0SecurityIpsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeMem0SecurityIpsResponseBodyDataGroups extends TeaModel {
        /**
         * <p>The name of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>bigdata</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The tag of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupTag")
        public String groupTag;

        /**
         * <p>Indicates whether the IP addresses that are already used for DNAT entries can also be used for SNAT entries. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The IP addresses can also be used for SNAT entries.</p>
         * </li>
         * <li><p><strong>false</strong>: The IP addresses cannot be used for SNAT entries.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("IpLists")
        public String ipLists;

        public static DescribeMem0SecurityIpsResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeMem0SecurityIpsResponseBodyDataGroups self = new DescribeMem0SecurityIpsResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public DescribeMem0SecurityIpsResponseBodyDataGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeMem0SecurityIpsResponseBodyDataGroups setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public DescribeMem0SecurityIpsResponseBodyDataGroups setIpLists(String ipLists) {
            this.ipLists = ipLists;
            return this;
        }
        public String getIpLists() {
            return this.ipLists;
        }

    }

    public static class DescribeMem0SecurityIpsResponseBodyData extends TeaModel {
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
        public java.util.List<DescribeMem0SecurityIpsResponseBodyDataGroups> groups;

        public static DescribeMem0SecurityIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMem0SecurityIpsResponseBodyData self = new DescribeMem0SecurityIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMem0SecurityIpsResponseBodyData setCustinsName(String custinsName) {
            this.custinsName = custinsName;
            return this;
        }
        public String getCustinsName() {
            return this.custinsName;
        }

        public DescribeMem0SecurityIpsResponseBodyData setGroups(java.util.List<DescribeMem0SecurityIpsResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<DescribeMem0SecurityIpsResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

    }

}

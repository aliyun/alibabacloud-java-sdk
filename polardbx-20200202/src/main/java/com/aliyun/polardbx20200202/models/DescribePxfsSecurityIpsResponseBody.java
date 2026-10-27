// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsSecurityIpsResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribePxfsSecurityIpsResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePxfsSecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsSecurityIpsResponseBody self = new DescribePxfsSecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePxfsSecurityIpsResponseBody setAccessDeniedDetail(DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePxfsSecurityIpsResponseBody setData(DescribePxfsSecurityIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePxfsSecurityIpsResponseBodyData getData() {
        return this.data;
    }

    public DescribePxfsSecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The description is as described above.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The no-permission type.</p>
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

        public static DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail self = new DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribePxfsSecurityIpsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribePxfsSecurityIpsResponseBodyDataGroups extends TeaModel {
        /**
         * <p>The name of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The tag of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupTag")
        public String groupTag;

        /**
         * <p>The IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24,10.0.0.1</p>
         */
        @NameInMap("IpLists")
        public String ipLists;

        public static DescribePxfsSecurityIpsResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsSecurityIpsResponseBodyDataGroups self = new DescribePxfsSecurityIpsResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public DescribePxfsSecurityIpsResponseBodyDataGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePxfsSecurityIpsResponseBodyDataGroups setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public DescribePxfsSecurityIpsResponseBodyDataGroups setIpLists(String ipLists) {
            this.ipLists = ipLists;
            return this;
        }
        public String getIpLists() {
            return this.ipLists;
        }

    }

    public static class DescribePxfsSecurityIpsResponseBodyData extends TeaModel {
        /**
         * <p>The name of the managed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxfs-xxxxxxxx</p>
         */
        @NameInMap("CustinsName")
        public String custinsName;

        /**
         * <p>The whitelist groups.</p>
         */
        @NameInMap("Groups")
        public java.util.List<DescribePxfsSecurityIpsResponseBodyDataGroups> groups;

        public static DescribePxfsSecurityIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsSecurityIpsResponseBodyData self = new DescribePxfsSecurityIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePxfsSecurityIpsResponseBodyData setCustinsName(String custinsName) {
            this.custinsName = custinsName;
            return this;
        }
        public String getCustinsName() {
            return this.custinsName;
        }

        public DescribePxfsSecurityIpsResponseBodyData setGroups(java.util.List<DescribePxfsSecurityIpsResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<DescribePxfsSecurityIpsResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

    }

}

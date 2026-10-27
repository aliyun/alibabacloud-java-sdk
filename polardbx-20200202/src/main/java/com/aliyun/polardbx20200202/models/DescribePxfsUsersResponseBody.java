// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsUsersResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribePxfsUsersResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribePxfsUsersResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePxfsUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsUsersResponseBody self = new DescribePxfsUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePxfsUsersResponseBody setAccessDeniedDetail(DescribePxfsUsersResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribePxfsUsersResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePxfsUsersResponseBody setData(DescribePxfsUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePxfsUsersResponseBodyData getData() {
        return this.data;
    }

    public DescribePxfsUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePxfsUsersResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribePxfsUsersResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsUsersResponseBodyAccessDeniedDetail self = new DescribePxfsUsersResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribePxfsUsersResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribePxfsUsersResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribePxfsUsersResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribePxfsUsersResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribePxfsUsersResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribePxfsUsersResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribePxfsUsersResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribePxfsUsersResponseBodyDataUsers extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-03T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The identity name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-runtime</p>
         */
        @NameInMap("IdentityName")
        public String identityName;

        /**
         * <p>POSIX GID</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PosixGid")
        public Long posixGid;

        /**
         * <p>POSIX UID</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PosixUid")
        public Long posixUid;

        /**
         * <p>The identity role.</p>
         * 
         * <strong>example:</strong>
         * <p>MEMBER</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribePxfsUsersResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsUsersResponseBodyDataUsers self = new DescribePxfsUsersResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public DescribePxfsUsersResponseBodyDataUsers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePxfsUsersResponseBodyDataUsers setIdentityName(String identityName) {
            this.identityName = identityName;
            return this;
        }
        public String getIdentityName() {
            return this.identityName;
        }

        public DescribePxfsUsersResponseBodyDataUsers setPosixGid(Long posixGid) {
            this.posixGid = posixGid;
            return this;
        }
        public Long getPosixGid() {
            return this.posixGid;
        }

        public DescribePxfsUsersResponseBodyDataUsers setPosixUid(Long posixUid) {
            this.posixUid = posixUid;
            return this;
        }
        public Long getPosixUid() {
            return this.posixUid;
        }

        public DescribePxfsUsersResponseBodyDataUsers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribePxfsUsersResponseBodyDataUsers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribePxfsUsersResponseBodyData extends TeaModel {
        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-001</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The list of tenant identities.</p>
         */
        @NameInMap("Users")
        public java.util.List<DescribePxfsUsersResponseBodyDataUsers> users;

        public static DescribePxfsUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsUsersResponseBodyData self = new DescribePxfsUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePxfsUsersResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribePxfsUsersResponseBodyData setUsers(java.util.List<DescribePxfsUsersResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<DescribePxfsUsersResponseBodyDataUsers> getUsers() {
            return this.users;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeletePxfsUserResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DeletePxfsUserResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DeletePxfsUserResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePxfsUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePxfsUserResponseBody self = new DeletePxfsUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePxfsUserResponseBody setAccessDeniedDetail(DeletePxfsUserResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DeletePxfsUserResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeletePxfsUserResponseBody setData(DeletePxfsUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeletePxfsUserResponseBodyData getData() {
        return this.data;
    }

    public DeletePxfsUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeletePxfsUserResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authorization action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The description is the same as above.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The type of the authorization principal.</p>
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

        public static DeletePxfsUserResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DeletePxfsUserResponseBodyAccessDeniedDetail self = new DeletePxfsUserResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DeletePxfsUserResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DeletePxfsUserResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DeletePxfsUserResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DeletePxfsUserResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DeletePxfsUserResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DeletePxfsUserResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DeletePxfsUserResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DeletePxfsUserResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the identity is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <p>The identity name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-runtime</p>
         */
        @NameInMap("IdentityName")
        public String identityName;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-001</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static DeletePxfsUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeletePxfsUserResponseBodyData self = new DeletePxfsUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeletePxfsUserResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DeletePxfsUserResponseBodyData setIdentityName(String identityName) {
            this.identityName = identityName;
            return this;
        }
        public String getIdentityName() {
            return this.identityName;
        }

        public DeletePxfsUserResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}

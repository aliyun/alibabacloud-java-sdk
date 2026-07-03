// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifySupabaseDashboardPasswordResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The operation result.</p>
     */
    @NameInMap("Data")
    public ModifySupabaseDashboardPasswordResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySupabaseDashboardPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseDashboardPasswordResponseBody self = new ModifySupabaseDashboardPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseDashboardPasswordResponseBody setAccessDeniedDetail(ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifySupabaseDashboardPasswordResponseBody setData(ModifySupabaseDashboardPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifySupabaseDashboardPasswordResponseBodyData getData() {
        return this.data;
    }

    public ModifySupabaseDashboardPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The diagnostic information.</p>
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
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail self = new ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ModifySupabaseDashboardPasswordResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ModifySupabaseDashboardPasswordResponseBodyData extends TeaModel {
        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static ModifySupabaseDashboardPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifySupabaseDashboardPasswordResponseBodyData self = new ModifySupabaseDashboardPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifySupabaseDashboardPasswordResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ResetOpenSearchPasswordResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ResetOpenSearchPasswordResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The monitoring data.</p>
     */
    @NameInMap("Data")
    public ResetOpenSearchPasswordResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetOpenSearchPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetOpenSearchPasswordResponseBody self = new ResetOpenSearchPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetOpenSearchPasswordResponseBody setAccessDeniedDetail(ResetOpenSearchPasswordResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ResetOpenSearchPasswordResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ResetOpenSearchPasswordResponseBody setData(ResetOpenSearchPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetOpenSearchPasswordResponseBodyData getData() {
        return this.data;
    }

    public ResetOpenSearchPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetOpenSearchPasswordResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The type of the missing permission.</p>
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

        public static ResetOpenSearchPasswordResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ResetOpenSearchPasswordResponseBodyAccessDeniedDetail self = new ResetOpenSearchPasswordResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ResetOpenSearchPasswordResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ResetOpenSearchPasswordResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ResetOpenSearchPasswordResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ResetOpenSearchPasswordResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ResetOpenSearchPasswordResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ResetOpenSearchPasswordResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ResetOpenSearchPasswordResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ResetOpenSearchPasswordResponseBodyData extends TeaModel {
        /**
         * <p>The additional information returned by the operation. &quot;success&quot; is returned if the operation is successful. Otherwise, the corresponding error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>【环境：huanghe】\nhuanghe 503_UC_OUTBOUND告警超过阈值！\n\n详情请查看: <a href="https://grafana-cn-lbj34sreu03.grafana.aliyuncs.com/d/_rOiq2lNk/asm-status-code-monitor?var-datasource=DataSource-HUANGHE%5C%5Cn">https://grafana-cn-lbj34sreu03.grafana.aliyuncs.com/d/_rOiq2lNk/asm-status-code-monitor?var-datasource=DataSource-HUANGHE\\n</a></p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the password was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21T12:00:00Z</p>
         */
        @NameInMap("PasswordLastModified")
        public String passwordLastModified;

        public static ResetOpenSearchPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetOpenSearchPasswordResponseBodyData self = new ResetOpenSearchPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetOpenSearchPasswordResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ResetOpenSearchPasswordResponseBodyData setPasswordLastModified(String passwordLastModified) {
            this.passwordLastModified = passwordLastModified;
            return this;
        }
        public String getPasswordLastModified() {
            return this.passwordLastModified;
        }

    }

}

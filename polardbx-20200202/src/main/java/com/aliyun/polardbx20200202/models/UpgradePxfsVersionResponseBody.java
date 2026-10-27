// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradePxfsVersionResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public UpgradePxfsVersionResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public UpgradePxfsVersionResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradePxfsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradePxfsVersionResponseBody self = new UpgradePxfsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradePxfsVersionResponseBody setAccessDeniedDetail(UpgradePxfsVersionResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public UpgradePxfsVersionResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpgradePxfsVersionResponseBody setData(UpgradePxfsVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradePxfsVersionResponseBodyData getData() {
        return this.data;
    }

    public UpgradePxfsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpgradePxfsVersionResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authorization action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The identity used for authorization in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The authorization principal type.</p>
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
         * <p>The type of missing permission.</p>
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

        public static UpgradePxfsVersionResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            UpgradePxfsVersionResponseBodyAccessDeniedDetail self = new UpgradePxfsVersionResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public UpgradePxfsVersionResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public UpgradePxfsVersionResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public UpgradePxfsVersionResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public UpgradePxfsVersionResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public UpgradePxfsVersionResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public UpgradePxfsVersionResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public UpgradePxfsVersionResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class UpgradePxfsVersionResponseBodyData extends TeaModel {
        /**
         * <p>The PolarDB-X instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxxxxx</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The target minor version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.0</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The Agent file service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxfs-xxxxxxxx</p>
         */
        @NameInMap("PxfsInstanceId")
        public String pxfsInstanceId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static UpgradePxfsVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradePxfsVersionResponseBodyData self = new UpgradePxfsVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradePxfsVersionResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public UpgradePxfsVersionResponseBodyData setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public UpgradePxfsVersionResponseBodyData setPxfsInstanceId(String pxfsInstanceId) {
            this.pxfsInstanceId = pxfsInstanceId;
            return this;
        }
        public String getPxfsInstanceId() {
            return this.pxfsInstanceId;
        }

        public UpgradePxfsVersionResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

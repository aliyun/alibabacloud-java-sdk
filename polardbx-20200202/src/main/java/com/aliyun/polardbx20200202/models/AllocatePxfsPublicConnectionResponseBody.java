// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocatePxfsPublicConnectionResponseBody extends TeaModel {
    /**
     * <p>The access denial details.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public AllocatePxfsPublicConnectionResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocatePxfsPublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocatePxfsPublicConnectionResponseBody self = new AllocatePxfsPublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocatePxfsPublicConnectionResponseBody setAccessDeniedDetail(AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AllocatePxfsPublicConnectionResponseBody setData(AllocatePxfsPublicConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AllocatePxfsPublicConnectionResponseBodyData getData() {
        return this.data;
    }

    public AllocatePxfsPublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The type of the authentication principal.</p>
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

        public static AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail self = new AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public AllocatePxfsPublicConnectionResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class AllocatePxfsPublicConnectionResponseBodyData extends TeaModel {
        /**
         * <p>The PolarDB-X instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxxxxx</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

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

        public static AllocatePxfsPublicConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AllocatePxfsPublicConnectionResponseBodyData self = new AllocatePxfsPublicConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AllocatePxfsPublicConnectionResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public AllocatePxfsPublicConnectionResponseBodyData setPxfsInstanceId(String pxfsInstanceId) {
            this.pxfsInstanceId = pxfsInstanceId;
            return this;
        }
        public String getPxfsInstanceId() {
            return this.pxfsInstanceId;
        }

        public AllocatePxfsPublicConnectionResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

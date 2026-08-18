// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateContextDBResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public CreateContextDBResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CreateContextDBResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateContextDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDBResponseBody self = new CreateContextDBResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContextDBResponseBody setAccessDeniedDetail(CreateContextDBResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public CreateContextDBResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateContextDBResponseBody setData(CreateContextDBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateContextDBResponseBodyData getData() {
        return this.data;
    }

    public CreateContextDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateContextDBResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>As described above.</p>
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
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static CreateContextDBResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateContextDBResponseBodyAccessDeniedDetail self = new CreateContextDBResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public CreateContextDBResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public CreateContextDBResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public CreateContextDBResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public CreateContextDBResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public CreateContextDBResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public CreateContextDBResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public CreateContextDBResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class CreateContextDBResponseBodyData extends TeaModel {
        /**
         * <p>The administrator key of the context service.</p>
         * 
         * <strong>example:</strong>
         * <p>ctx-admin-***</p>
         */
        @NameInMap("ContextDBAdminKey")
        public String contextDBAdminKey;

        /**
         * <p>The name of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxt-*********</p>
         */
        @NameInMap("ContextDBInstanceName")
        public String contextDBInstanceName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The name of the context service dashboard instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxt-*********-d</p>
         */
        @NameInMap("DashboardReplicaSetName")
        public String dashboardReplicaSetName;

        /**
         * <p>The name of the PolarDB-X Search instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxs-*********</p>
         */
        @NameInMap("OpenSearchInstanceName")
        public String openSearchInstanceName;

        /**
         * <p>The name of the context service service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxt-*********-s</p>
         */
        @NameInMap("ServiceReplicaSetName")
        public String serviceReplicaSetName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static CreateContextDBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateContextDBResponseBodyData self = new CreateContextDBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateContextDBResponseBodyData setContextDBAdminKey(String contextDBAdminKey) {
            this.contextDBAdminKey = contextDBAdminKey;
            return this;
        }
        public String getContextDBAdminKey() {
            return this.contextDBAdminKey;
        }

        public CreateContextDBResponseBodyData setContextDBInstanceName(String contextDBInstanceName) {
            this.contextDBInstanceName = contextDBInstanceName;
            return this;
        }
        public String getContextDBInstanceName() {
            return this.contextDBInstanceName;
        }

        public CreateContextDBResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public CreateContextDBResponseBodyData setDashboardReplicaSetName(String dashboardReplicaSetName) {
            this.dashboardReplicaSetName = dashboardReplicaSetName;
            return this;
        }
        public String getDashboardReplicaSetName() {
            return this.dashboardReplicaSetName;
        }

        public CreateContextDBResponseBodyData setOpenSearchInstanceName(String openSearchInstanceName) {
            this.openSearchInstanceName = openSearchInstanceName;
            return this;
        }
        public String getOpenSearchInstanceName() {
            return this.openSearchInstanceName;
        }

        public CreateContextDBResponseBodyData setServiceReplicaSetName(String serviceReplicaSetName) {
            this.serviceReplicaSetName = serviceReplicaSetName;
            return this;
        }
        public String getServiceReplicaSetName() {
            return this.serviceReplicaSetName;
        }

        public CreateContextDBResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

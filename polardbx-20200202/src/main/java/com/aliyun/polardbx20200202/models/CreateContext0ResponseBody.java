// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateContext0ResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public CreateContext0ResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The instance data.</p>
     */
    @NameInMap("Data")
    public CreateContext0ResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateContext0ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContext0ResponseBody self = new CreateContext0ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContext0ResponseBody setAccessDeniedDetail(CreateContext0ResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public CreateContext0ResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateContext0ResponseBody setData(CreateContext0ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateContext0ResponseBodyData getData() {
        return this.data;
    }

    public CreateContext0ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateContext0ResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static CreateContext0ResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateContext0ResponseBodyAccessDeniedDetail self = new CreateContext0ResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public CreateContext0ResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public CreateContext0ResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public CreateContext0ResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public CreateContext0ResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public CreateContext0ResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public CreateContext0ResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public CreateContext0ResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class CreateContext0ResponseBodyData extends TeaModel {
        /**
         * <p>The administrator key of the context service.</p>
         * 
         * <strong>example:</strong>
         * <p>admin-key-example</p>
         */
        @NameInMap("Context0AdminKey")
        public String context0AdminKey;

        /**
         * <p>The name of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>context0-example</p>
         */
        @NameInMap("Context0InstanceName")
        public String context0InstanceName;

        /**
         * <p>The instance name.</p>
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
         * <p>The name of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxt-*********-s</p>
         */
        @NameInMap("ServiceReplicaSetName")
        public String serviceReplicaSetName;

        /**
         * <p>The backend task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static CreateContext0ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateContext0ResponseBodyData self = new CreateContext0ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateContext0ResponseBodyData setContext0AdminKey(String context0AdminKey) {
            this.context0AdminKey = context0AdminKey;
            return this;
        }
        public String getContext0AdminKey() {
            return this.context0AdminKey;
        }

        public CreateContext0ResponseBodyData setContext0InstanceName(String context0InstanceName) {
            this.context0InstanceName = context0InstanceName;
            return this;
        }
        public String getContext0InstanceName() {
            return this.context0InstanceName;
        }

        public CreateContext0ResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public CreateContext0ResponseBodyData setDashboardReplicaSetName(String dashboardReplicaSetName) {
            this.dashboardReplicaSetName = dashboardReplicaSetName;
            return this;
        }
        public String getDashboardReplicaSetName() {
            return this.dashboardReplicaSetName;
        }

        public CreateContext0ResponseBodyData setOpenSearchInstanceName(String openSearchInstanceName) {
            this.openSearchInstanceName = openSearchInstanceName;
            return this;
        }
        public String getOpenSearchInstanceName() {
            return this.openSearchInstanceName;
        }

        public CreateContext0ResponseBodyData setServiceReplicaSetName(String serviceReplicaSetName) {
            this.serviceReplicaSetName = serviceReplicaSetName;
            return this;
        }
        public String getServiceReplicaSetName() {
            return this.serviceReplicaSetName;
        }

        public CreateContext0ResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

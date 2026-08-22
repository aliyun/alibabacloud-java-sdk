// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteContext0ResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DeleteContext0ResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DeleteContext0ResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6352AC16-76BF-5135-B1EA-ED49293526E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContext0ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContext0ResponseBody self = new DeleteContext0ResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContext0ResponseBody setAccessDeniedDetail(DeleteContext0ResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DeleteContext0ResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteContext0ResponseBody setData(DeleteContext0ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteContext0ResponseBodyData getData() {
        return this.data;
    }

    public DeleteContext0ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteContext0ResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DeleteContext0ResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DeleteContext0ResponseBodyAccessDeniedDetail self = new DeleteContext0ResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DeleteContext0ResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DeleteContext0ResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DeleteContext0ResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DeleteContext0ResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DeleteContext0ResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DeleteContext0ResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DeleteContext0ResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DeleteContext0ResponseBodyData extends TeaModel {
        /**
         * <p>The name of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>context0-example</p>
         */
        @NameInMap("Context0InstanceName")
        public String context0InstanceName;

        /**
         * <p>The name of the instance.</p>
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
         * <p>The name of the context service instance.</p>
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
         * <hr>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static DeleteContext0ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteContext0ResponseBodyData self = new DeleteContext0ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteContext0ResponseBodyData setContext0InstanceName(String context0InstanceName) {
            this.context0InstanceName = context0InstanceName;
            return this;
        }
        public String getContext0InstanceName() {
            return this.context0InstanceName;
        }

        public DeleteContext0ResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DeleteContext0ResponseBodyData setDashboardReplicaSetName(String dashboardReplicaSetName) {
            this.dashboardReplicaSetName = dashboardReplicaSetName;
            return this;
        }
        public String getDashboardReplicaSetName() {
            return this.dashboardReplicaSetName;
        }

        public DeleteContext0ResponseBodyData setServiceReplicaSetName(String serviceReplicaSetName) {
            this.serviceReplicaSetName = serviceReplicaSetName;
            return this;
        }
        public String getServiceReplicaSetName() {
            return this.serviceReplicaSetName;
        }

        public DeleteContext0ResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

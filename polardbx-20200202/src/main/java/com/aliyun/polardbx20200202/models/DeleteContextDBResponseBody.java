// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteContextDBResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DeleteContextDBResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The parameter details.</p>
     */
    @NameInMap("Data")
    public DeleteContextDBResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6A4256F-7B83-5BD7-9AC0-72E1FAC05330</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContextDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextDBResponseBody self = new DeleteContextDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContextDBResponseBody setAccessDeniedDetail(DeleteContextDBResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DeleteContextDBResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteContextDBResponseBody setData(DeleteContextDBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteContextDBResponseBodyData getData() {
        return this.data;
    }

    public DeleteContextDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteContextDBResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DeleteContextDBResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DeleteContextDBResponseBodyAccessDeniedDetail self = new DeleteContextDBResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DeleteContextDBResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DeleteContextDBResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DeleteContextDBResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DeleteContextDBResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DeleteContextDBResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DeleteContextDBResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DeleteContextDBResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DeleteContextDBResponseBodyData extends TeaModel {
        /**
         * <p>The context service instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxt-*********</p>
         */
        @NameInMap("ContextDBInstanceName")
        public String contextDBInstanceName;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-unrf5ssig0ecg8</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The context service dashboard instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxt-*********-d</p>
         */
        @NameInMap("DashboardReplicaSetName")
        public String dashboardReplicaSetName;

        /**
         * <p>The context service service instance name.</p>
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

        public static DeleteContextDBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteContextDBResponseBodyData self = new DeleteContextDBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteContextDBResponseBodyData setContextDBInstanceName(String contextDBInstanceName) {
            this.contextDBInstanceName = contextDBInstanceName;
            return this;
        }
        public String getContextDBInstanceName() {
            return this.contextDBInstanceName;
        }

        public DeleteContextDBResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DeleteContextDBResponseBodyData setDashboardReplicaSetName(String dashboardReplicaSetName) {
            this.dashboardReplicaSetName = dashboardReplicaSetName;
            return this;
        }
        public String getDashboardReplicaSetName() {
            return this.dashboardReplicaSetName;
        }

        public DeleteContextDBResponseBodyData setServiceReplicaSetName(String serviceReplicaSetName) {
            this.serviceReplicaSetName = serviceReplicaSetName;
            return this;
        }
        public String getServiceReplicaSetName() {
            return this.serviceReplicaSetName;
        }

        public DeleteContextDBResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

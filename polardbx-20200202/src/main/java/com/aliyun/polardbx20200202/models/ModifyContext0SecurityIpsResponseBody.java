// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyContext0SecurityIpsResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ModifyContext0SecurityIpsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyContext0SecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyContext0SecurityIpsResponseBody self = new ModifyContext0SecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyContext0SecurityIpsResponseBody setAccessDeniedDetail(ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyContext0SecurityIpsResponseBody setData(ModifyContext0SecurityIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyContext0SecurityIpsResponseBodyData getData() {
        return this.data;
    }

    public ModifyContext0SecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The identity type used for authentication in the request. Valid values:</p>
         * <ul>
         * <li>SubUser: RAM user.</li>
         * <li>AssumedRoleUser: RAM role.</li>
         * <li>Federated: SSO federated identity.</li>
         * </ul>
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
         * <p>NoPermissionType</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>PolicyType</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail self = new ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ModifyContext0SecurityIpsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ModifyContext0SecurityIpsResponseBodyData extends TeaModel {
        /**
         * <p>The name of the context service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>context0-example</p>
         */
        @NameInMap("Context0InstanceName")
        public String context0InstanceName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxsp-xxxxxxxxxx</p>
         */
        @NameInMap("DBInstanceId")
        public Integer DBInstanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasd****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        /**
         * <p>The list of task IDs in the task group.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Integer> taskIds;

        public static ModifyContext0SecurityIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyContext0SecurityIpsResponseBodyData self = new ModifyContext0SecurityIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyContext0SecurityIpsResponseBodyData setContext0InstanceName(String context0InstanceName) {
            this.context0InstanceName = context0InstanceName;
            return this;
        }
        public String getContext0InstanceName() {
            return this.context0InstanceName;
        }

        public ModifyContext0SecurityIpsResponseBodyData setDBInstanceId(Integer DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public Integer getDBInstanceId() {
            return this.DBInstanceId;
        }

        public ModifyContext0SecurityIpsResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public ModifyContext0SecurityIpsResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public ModifyContext0SecurityIpsResponseBodyData setTaskIds(java.util.List<Integer> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Integer> getTaskIds() {
            return this.taskIds;
        }

    }

}

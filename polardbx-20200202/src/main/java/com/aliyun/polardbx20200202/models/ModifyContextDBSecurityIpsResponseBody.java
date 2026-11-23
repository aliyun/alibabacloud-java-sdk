// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyContextDBSecurityIpsResponseBody extends TeaModel {
    /**
     * <p>The access denial details.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public ModifyContextDBSecurityIpsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyContextDBSecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyContextDBSecurityIpsResponseBody self = new ModifyContextDBSecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyContextDBSecurityIpsResponseBody setAccessDeniedDetail(ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyContextDBSecurityIpsResponseBody setData(ModifyContextDBSecurityIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyContextDBSecurityIpsResponseBodyData getData() {
        return this.data;
    }

    public ModifyContextDBSecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>polardbx:ModifyContextDBSecurityIps</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The name of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample RAM user</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The Alibaba Cloud account ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The type of identity used for authentication in the request. Valid values:</p>
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
         * <p>The diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The no permission type.</p>
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

        public static ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail self = new ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ModifyContextDBSecurityIpsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ModifyContextDBSecurityIpsResponseBodyData extends TeaModel {
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
         * <p>123456</p>
         */
        @NameInMap("DBInstanceId")
        public Integer DBInstanceId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-supabase-001</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        /**
         * <p>The list of task IDs in the task group.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Integer> taskIds;

        public static ModifyContextDBSecurityIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyContextDBSecurityIpsResponseBodyData self = new ModifyContextDBSecurityIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyContextDBSecurityIpsResponseBodyData setContextDBInstanceName(String contextDBInstanceName) {
            this.contextDBInstanceName = contextDBInstanceName;
            return this;
        }
        public String getContextDBInstanceName() {
            return this.contextDBInstanceName;
        }

        public ModifyContextDBSecurityIpsResponseBodyData setDBInstanceId(Integer DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public Integer getDBInstanceId() {
            return this.DBInstanceId;
        }

        public ModifyContextDBSecurityIpsResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public ModifyContextDBSecurityIpsResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public ModifyContextDBSecurityIpsResponseBodyData setTaskIds(java.util.List<Integer> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Integer> getTaskIds() {
            return this.taskIds;
        }

    }

}

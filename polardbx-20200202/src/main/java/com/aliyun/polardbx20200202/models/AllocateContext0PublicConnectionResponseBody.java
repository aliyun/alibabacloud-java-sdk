// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocateContext0PublicConnectionResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("Data")
    public AllocateContext0PublicConnectionResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateContext0PublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateContext0PublicConnectionResponseBody self = new AllocateContext0PublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateContext0PublicConnectionResponseBody setAccessDeniedDetail(AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AllocateContext0PublicConnectionResponseBody setData(AllocateContext0PublicConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AllocateContext0PublicConnectionResponseBodyData getData() {
        return this.data;
    }

    public AllocateContext0PublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The description is the same as above.</p>
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
         * <p>The owner ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The description is the same as above.</p>
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

        public static AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail self = new AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public AllocateContext0PublicConnectionResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class AllocateContext0PublicConnectionResponseBodyData extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test2.polarx.huhehaote.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The context service instance name.</p>
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasd****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The network type of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBInstanceNetType")
        public Integer DBInstanceNetType;

        /**
         * <p>The target node type: service or dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The port of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>3300</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        /**
         * <p>The IP address of the Anti-DDoS Proxy instance protected by the policy.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://anchashi.aliyun-inc.coM">https://anchashi.aliyun-inc.coM</a></p>
         */
        @NameInMap("Vip")
        public String vip;

        public static AllocateContext0PublicConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AllocateContext0PublicConnectionResponseBodyData self = new AllocateContext0PublicConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AllocateContext0PublicConnectionResponseBodyData setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public AllocateContext0PublicConnectionResponseBodyData setContext0InstanceName(String context0InstanceName) {
            this.context0InstanceName = context0InstanceName;
            return this;
        }
        public String getContext0InstanceName() {
            return this.context0InstanceName;
        }

        public AllocateContext0PublicConnectionResponseBodyData setDBInstanceId(Integer DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public Integer getDBInstanceId() {
            return this.DBInstanceId;
        }

        public AllocateContext0PublicConnectionResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public AllocateContext0PublicConnectionResponseBodyData setDBInstanceNetType(Integer DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public Integer getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public AllocateContext0PublicConnectionResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public AllocateContext0PublicConnectionResponseBodyData setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public AllocateContext0PublicConnectionResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public AllocateContext0PublicConnectionResponseBodyData setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

    }

}

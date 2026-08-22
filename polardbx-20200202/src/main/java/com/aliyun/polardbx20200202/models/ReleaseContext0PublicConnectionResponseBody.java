// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseContext0PublicConnectionResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("Data")
    public ReleaseContext0PublicConnectionResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseContext0PublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseContext0PublicConnectionResponseBody self = new ReleaseContext0PublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseContext0PublicConnectionResponseBody setAccessDeniedDetail(ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ReleaseContext0PublicConnectionResponseBody setData(ReleaseContext0PublicConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReleaseContext0PublicConnectionResponseBodyData getData() {
        return this.data;
    }

    public ReleaseContext0PublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The description is as above.</p>
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
         * <p>The description is as above.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The description is as above.</p>
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
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail self = new ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ReleaseContext0PublicConnectionResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ReleaseContext0PublicConnectionResponseBodyData extends TeaModel {
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
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasd****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetType")
        public Integer netType;

        /**
         * <p>The query node type. Valid values:</p>
         * <ul>
         * <li>service</li>
         * <li>dashboard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The database endpoint before the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>***.polarxcontextdb.rds.aliyuncs.com</p>
         */
        @NameInMap("OldConnectionString")
        public String oldConnectionString;

        /**
         * <p>The previous port value.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("OldPort")
        public String oldPort;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static ReleaseContext0PublicConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReleaseContext0PublicConnectionResponseBodyData self = new ReleaseContext0PublicConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReleaseContext0PublicConnectionResponseBodyData setContext0InstanceName(String context0InstanceName) {
            this.context0InstanceName = context0InstanceName;
            return this;
        }
        public String getContext0InstanceName() {
            return this.context0InstanceName;
        }

        public ReleaseContext0PublicConnectionResponseBodyData setDBInstanceId(Integer DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public Integer getDBInstanceId() {
            return this.DBInstanceId;
        }

        public ReleaseContext0PublicConnectionResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public ReleaseContext0PublicConnectionResponseBodyData setNetType(Integer netType) {
            this.netType = netType;
            return this;
        }
        public Integer getNetType() {
            return this.netType;
        }

        public ReleaseContext0PublicConnectionResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ReleaseContext0PublicConnectionResponseBodyData setOldConnectionString(String oldConnectionString) {
            this.oldConnectionString = oldConnectionString;
            return this;
        }
        public String getOldConnectionString() {
            return this.oldConnectionString;
        }

        public ReleaseContext0PublicConnectionResponseBodyData setOldPort(String oldPort) {
            this.oldPort = oldPort;
            return this;
        }
        public String getOldPort() {
            return this.oldPort;
        }

        public ReleaseContext0PublicConnectionResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContext0InfoResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeContext0InfoResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The parameter details.</p>
     */
    @NameInMap("Data")
    public DescribeContext0InfoResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContext0InfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContext0InfoResponseBody self = new DescribeContext0InfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContext0InfoResponseBody setAccessDeniedDetail(DescribeContext0InfoResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeContext0InfoResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeContext0InfoResponseBody setData(DescribeContext0InfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeContext0InfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeContext0InfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContext0InfoResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The authentication principal type.</p>
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

        public static DescribeContext0InfoResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0InfoResponseBodyAccessDeniedDetail self = new DescribeContext0InfoResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeContext0InfoResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeContext0InfoResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeContext0InfoResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeContext0InfoResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeContext0InfoResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeContext0InfoResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeContext0InfoResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeContext0InfoResponseBodyDataInstanceConnAddrs extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-spsil01pww4hfz.polarx.singapore.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The target node type: service or dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The endpoint type.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4n4hf9xey7ea3lp4bwwx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-t4ny14pr37spmjsbv5dc2</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC-connected instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-spsil01pww4hfzjayd-cn-20251013180429</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeContext0InfoResponseBodyDataInstanceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0InfoResponseBodyDataInstanceConnAddrs self = new DescribeContext0InfoResponseBodyDataInstanceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeContext0InfoResponseBodyDataInstanceConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeContext0InfoResponseBodyDataInstanceConnAddrs setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeContext0InfoResponseBodyDataInstanceConnAddrs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeContext0InfoResponseBodyDataInstanceConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeContext0InfoResponseBodyDataInstanceConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeContext0InfoResponseBodyDataInstanceConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeContext0InfoResponseBodyDataInstanceConnAddrs setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzrlz8e3khuaoz.polarx.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The target node type: service or dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: Primary instance.</li>
         * <li><strong>ReadOnly</strong>: Read-only instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RemoveHeader</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1550umsomy2mw24vhwl</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zedp17pfss1133bvdizl</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC-connected instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbdw66evguopfcfvieoi</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs self = new DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeContext0InfoResponseBodyDataInstanceReplicaSets extends TeaModel {
        /**
         * <p>The instance specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>pg.x2.13large.2c</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("ConnAddrs")
        public java.util.List<DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs> connAddrs;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T02:01:13Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzrbqgiocrpu8a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>The target node type: service or dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Running.</li>
         * <li><strong>1</strong>: Creating.</li>
         * <li><strong>2</strong>: Abnormal.</li>
         * <li><strong>3</strong>: Expired.</li>
         * <li><strong>4</strong>: Releasing.</li>
         * <li><strong>5</strong>: Released.</li>
         * <li><strong>6</strong>: Locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeContext0InfoResponseBodyDataInstanceReplicaSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0InfoResponseBodyDataInstanceReplicaSets self = new DescribeContext0InfoResponseBodyDataInstanceReplicaSets();
            return TeaModel.build(map, self);
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSets setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSets setConnAddrs(java.util.List<DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeContext0InfoResponseBodyDataInstanceReplicaSetsConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSets setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSets setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSets setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSets setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeContext0InfoResponseBodyDataInstanceReplicaSets setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeContext0InfoResponseBodyDataInstance extends TeaModel {
        /**
         * <p>The instance specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.x2.large.2c</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The list of endpoints.</p>
         */
        @NameInMap("ConnAddrs")
        public java.util.List<DescribeContext0InfoResponseBodyDataInstanceConnAddrs> connAddrs;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-17T02:00:20Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The database instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzr9qzafkeury3</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-spsil01pww4hfz-mem</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>The PolarDB-X Search instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxs-********</p>
         */
        @NameInMap("OpenSearchInstanceName")
        public String openSearchInstanceName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The endpoints of the nodes.</p>
         */
        @NameInMap("ReplicaSets")
        public java.util.List<DescribeContext0InfoResponseBodyDataInstanceReplicaSets> replicaSets;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4n4hf9xey7ea3lp4bwwx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-t4ny14pr37spmjsbv5dc2</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeContext0InfoResponseBodyDataInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0InfoResponseBodyDataInstance self = new DescribeContext0InfoResponseBodyDataInstance();
            return TeaModel.build(map, self);
        }

        public DescribeContext0InfoResponseBodyDataInstance setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeContext0InfoResponseBodyDataInstance setConnAddrs(java.util.List<DescribeContext0InfoResponseBodyDataInstanceConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeContext0InfoResponseBodyDataInstanceConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeContext0InfoResponseBodyDataInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeContext0InfoResponseBodyDataInstance setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeContext0InfoResponseBodyDataInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeContext0InfoResponseBodyDataInstance setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeContext0InfoResponseBodyDataInstance setOpenSearchInstanceName(String openSearchInstanceName) {
            this.openSearchInstanceName = openSearchInstanceName;
            return this;
        }
        public String getOpenSearchInstanceName() {
            return this.openSearchInstanceName;
        }

        public DescribeContext0InfoResponseBodyDataInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeContext0InfoResponseBodyDataInstance setReplicaSets(java.util.List<DescribeContext0InfoResponseBodyDataInstanceReplicaSets> replicaSets) {
            this.replicaSets = replicaSets;
            return this;
        }
        public java.util.List<DescribeContext0InfoResponseBodyDataInstanceReplicaSets> getReplicaSets() {
            return this.replicaSets;
        }

        public DescribeContext0InfoResponseBodyDataInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeContext0InfoResponseBodyDataInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeContext0InfoResponseBodyDataInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeContext0InfoResponseBodyDataInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeContext0InfoResponseBodyDataInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeContext0InfoResponseBodyData extends TeaModel {
        /**
         * <p>The instance information.</p>
         */
        @NameInMap("Instance")
        public DescribeContext0InfoResponseBodyDataInstance instance;

        public static DescribeContext0InfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContext0InfoResponseBodyData self = new DescribeContext0InfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContext0InfoResponseBodyData setInstance(DescribeContext0InfoResponseBodyDataInstance instance) {
            this.instance = instance;
            return this;
        }
        public DescribeContext0InfoResponseBodyDataInstance getInstance() {
            return this.instance;
        }

    }

}

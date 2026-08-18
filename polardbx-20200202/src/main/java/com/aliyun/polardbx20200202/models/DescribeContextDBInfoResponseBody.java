// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContextDBInfoResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeContextDBInfoResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The instance data.</p>
     */
    @NameInMap("Data")
    public DescribeContextDBInfoResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1A586DCB-39A6-4050-81CC-C7BD4CCDB49F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContextDBInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContextDBInfoResponseBody self = new DescribeContextDBInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContextDBInfoResponseBody setAccessDeniedDetail(DescribeContextDBInfoResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeContextDBInfoResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeContextDBInfoResponseBody setData(DescribeContextDBInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeContextDBInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeContextDBInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContextDBInfoResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The diagnostic information.</p>
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

        public static DescribeContextDBInfoResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBInfoResponseBodyAccessDeniedDetail self = new DescribeContextDBInfoResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBInfoResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeContextDBInfoResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeContextDBInfoResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeContextDBInfoResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeContextDBInfoResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeContextDBInfoResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeContextDBInfoResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeContextDBInfoResponseBodyDataInstanceConnAddrs extends TeaModel {
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

        public static DescribeContextDBInfoResponseBodyDataInstanceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBInfoResponseBodyDataInstanceConnAddrs self = new DescribeContextDBInfoResponseBodyDataInstanceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBInfoResponseBodyDataInstanceConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceConnAddrs setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceConnAddrs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceConnAddrs setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs extends TeaModel {
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
         * <li><strong>ReadWrite</strong>: primary instance.</li>
         * <li><strong>ReadOnly</strong>: read-only instance.</li>
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

        public static DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs self = new DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeContextDBInfoResponseBodyDataInstanceReplicaSets extends TeaModel {
        /**
         * <p>The instance specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>pg.x2.13large.2c</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The endpoint type.</p>
         */
        @NameInMap("ConnAddrs")
        public java.util.List<DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs> connAddrs;

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

        public static DescribeContextDBInfoResponseBodyDataInstanceReplicaSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBInfoResponseBodyDataInstanceReplicaSets self = new DescribeContextDBInfoResponseBodyDataInstanceReplicaSets();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSets setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSets setConnAddrs(java.util.List<DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeContextDBInfoResponseBodyDataInstanceReplicaSetsConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSets setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSets setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSets setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSets setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeContextDBInfoResponseBodyDataInstanceReplicaSets setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeContextDBInfoResponseBodyDataInstance extends TeaModel {
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
        public java.util.List<DescribeContextDBInfoResponseBodyDataInstanceConnAddrs> connAddrs;

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
         * <p>The VPC instance ID of the replica set node.</p>
         * <blockquote>
         * <p>This parameter is returned only when the network type of the instance is VPC.</p>
         * </blockquote>
         */
        @NameInMap("ReplicaSets")
        public java.util.List<DescribeContextDBInfoResponseBodyDataInstanceReplicaSets> replicaSets;

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

        public static DescribeContextDBInfoResponseBodyDataInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBInfoResponseBodyDataInstance self = new DescribeContextDBInfoResponseBodyDataInstance();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBInfoResponseBodyDataInstance setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setConnAddrs(java.util.List<DescribeContextDBInfoResponseBodyDataInstanceConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeContextDBInfoResponseBodyDataInstanceConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setOpenSearchInstanceName(String openSearchInstanceName) {
            this.openSearchInstanceName = openSearchInstanceName;
            return this;
        }
        public String getOpenSearchInstanceName() {
            return this.openSearchInstanceName;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setReplicaSets(java.util.List<DescribeContextDBInfoResponseBodyDataInstanceReplicaSets> replicaSets) {
            this.replicaSets = replicaSets;
            return this;
        }
        public java.util.List<DescribeContextDBInfoResponseBodyDataInstanceReplicaSets> getReplicaSets() {
            return this.replicaSets;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeContextDBInfoResponseBodyDataInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeContextDBInfoResponseBodyData extends TeaModel {
        /**
         * <p>The instance information.</p>
         */
        @NameInMap("Instance")
        public DescribeContextDBInfoResponseBodyDataInstance instance;

        public static DescribeContextDBInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContextDBInfoResponseBodyData self = new DescribeContextDBInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContextDBInfoResponseBodyData setInstance(DescribeContextDBInfoResponseBodyDataInstance instance) {
            this.instance = instance;
            return this;
        }
        public DescribeContextDBInfoResponseBodyDataInstance getInstance() {
            return this.instance;
        }

    }

}

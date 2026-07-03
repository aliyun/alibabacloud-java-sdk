// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSupabaseInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The instance details.</p>
     */
    @NameInMap("Data")
    public DescribeSupabaseInstanceAttributeResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSupabaseInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseInstanceAttributeResponseBody self = new DescribeSupabaseInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseInstanceAttributeResponseBody setAccessDeniedDetail(DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeSupabaseInstanceAttributeResponseBody setData(DescribeSupabaseInstanceAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSupabaseInstanceAttributeResponseBodyData getData() {
        return this.data;
    }

    public DescribeSupabaseInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail self = new DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>pxsp-********.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-********</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs self = new DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeSupabaseInstanceAttributeResponseBodyDataNodes extends TeaModel {
        /**
         * <p>The class code.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.supabase.x2.small</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2005777</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxsp-********</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeSupabaseInstanceAttributeResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseInstanceAttributeResponseBodyDataNodes self = new DescribeSupabaseInstanceAttributeResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseInstanceAttributeResponseBodyDataNodes setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyDataNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeSupabaseInstanceAttributeResponseBodyData extends TeaModel {
        /**
         * <p>The list of endpoints.</p>
         */
        @NameInMap("ConnAddrs")
        public java.util.List<DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs> connAddrs;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-13 10:01:50 +0800</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-supabase-001</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>Indicates whether the instance has expired.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The lock mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The minor engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb-2.4.0_5.4.19-20250116_xcluster5.4.20-20241213</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.supabase.x2.small</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>The list of nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeSupabaseInstanceAttributeResponseBodyDataNodes> nodes;

        /**
         * <p>The name of the associated PolarDB-X instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        @NameInMap("PolarDBXDBInstanceName")
        public String polarDBXDBInstanceName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Supabase class code.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.supabase.x4.xlarge</p>
         */
        @NameInMap("SupabaseClassCode")
        public String supabaseClassCode;

        /**
         * <p>The multi-tenant mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TenantMode")
        public Boolean tenantMode;

        /**
         * <p>The topology type.</p>
         * 
         * <strong>example:</strong>
         * <p>1azone</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-********</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-********</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeSupabaseInstanceAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupabaseInstanceAttributeResponseBodyData self = new DescribeSupabaseInstanceAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setConnAddrs(java.util.List<DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeSupabaseInstanceAttributeResponseBodyDataConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setNodes(java.util.List<DescribeSupabaseInstanceAttributeResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeSupabaseInstanceAttributeResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setPolarDBXDBInstanceName(String polarDBXDBInstanceName) {
            this.polarDBXDBInstanceName = polarDBXDBInstanceName;
            return this;
        }
        public String getPolarDBXDBInstanceName() {
            return this.polarDBXDBInstanceName;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setSupabaseClassCode(String supabaseClassCode) {
            this.supabaseClassCode = supabaseClassCode;
            return this;
        }
        public String getSupabaseClassCode() {
            return this.supabaseClassCode;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setTenantMode(Boolean tenantMode) {
            this.tenantMode = tenantMode;
            return this;
        }
        public Boolean getTenantMode() {
            return this.tenantMode;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setTopologyType(String topologyType) {
            this.topologyType = topologyType;
            return this;
        }
        public String getTopologyType() {
            return this.topologyType;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeSupabaseInstanceAttributeResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The database instance information.</p>
     */
    @NameInMap("DBInstance")
    public DescribeDBInstanceAttributeResponseBodyDBInstance DBInstance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setDBInstance(DescribeDBInstanceAttributeResponseBodyDBInstance DBInstance) {
        this.DBInstance = DBInstance;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyDBInstance getDBInstance() {
        return this.DBInstance;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>polardbx-xxx.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The connection port number.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The connection type. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: internal network connection</li>
         * <li><strong>PUBLIC</strong>: public network connection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The internal CloudInstanceId in the VPC. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-zkralxpc5d****</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs self = new DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes extends TeaModel {
        /**
         * <p>The name of the compute node.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-i-********</p>
         */
        @NameInMap("ComputeNodeId")
        public String computeNodeId;

        /**
         * <p>The name of the storage node.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xdb-xxxxxx</p>
         */
        @NameInMap("DataNodeId")
        public String dataNodeId;

        /**
         * <p>The logical node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxi-*********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The region ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The zone name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes self = new DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setComputeNodeId(String computeNodeId) {
            this.computeNodeId = computeNodeId;
            return this;
        }
        public String getComputeNodeId() {
            return this.computeNodeId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setDataNodeId(String dataNodeId) {
            this.dataNodeId = dataNodeId;
            return this;
        }
        public String getDataNodeId() {
            return this.dataNodeId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList extends TeaModel {
        /**
         * <p>The member name, which is the PolarDB-X instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc</p>
         */
        @NameInMap("MemberName")
        public String memberName;

        /**
         * <p>The node role. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: primary node</li>
         * <li><strong>standby</strong>: secondary node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx_cn</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList self = new DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstanceSearchInstance extends TeaModel {
        /**
         * <p>The name of the Search engine instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxs-***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the Search engine.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDBInstanceAttributeResponseBodyDBInstanceSearchInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstanceSearchInstance self = new DescribeDBInstanceAttributeResponseBodyDBInstanceSearchInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceSearchInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceSearchInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key2</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value2</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet self = new DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstance extends TeaModel {
        /**
         * <p>Indicates whether the AI gateway is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AiGatewayEnabled")
        public String aiGatewayEnabled;

        /**
         * <p>Indicates whether the column store index feature is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanNotCreateColumnar")
        public Boolean canNotCreateColumnar;

        /**
         * <p>The CN node specifications. Valid values:</p>
         * <ul>
         * <li><strong>polarx.x4.medium.2e</strong>: 2 cores and 8 GB of memory</li>
         * <li><strong>polarx.x4.large.2e</strong>: 4 cores and 16 GB of memory</li>
         * <li><strong>polarx.x8.large.2e</strong>: 4 cores and 32 GB of memory</li>
         * <li><strong>polarx.x4.xlarge.2e</strong>: 8 cores and 32 GB of memory</li>
         * <li><strong>polarx.x8.xlarge.2e</strong>: 8 cores and 64 GB of memory</li>
         * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 cores and 64 GB of memory</li>
         * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 cores and 128 GB of memory</li>
         * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 cores and 128 GB of memory</li>
         * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 cores and 256 GB of memory</li>
         * <li><strong>polarx.st.8xlarge.2e</strong>: 60 cores and 470 GB of memory</li>
         * <li><strong>polarx.st.12xlarge.2e</strong>: 90 cores and 720 GB of memory</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.xlarge.2e</p>
         */
        @NameInMap("CnNodeClassCode")
        public String cnNodeClassCode;

        /**
         * <p>The number of CN nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CnNodeCount")
        public Integer cnNodeCount;

        /**
         * <p>The name of the column store engine instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ColumnarInstanceName")
        public String columnarInstanceName;

        /**
         * <p>The information about the column store read-only instances.</p>
         */
        @NameInMap("ColumnarReadDBInstances")
        public java.util.List<String> columnarReadDBInstances;

        /**
         * <p>The commodity type of the instance. The value is fixed to drds_polarxpost_public_cn.</p>
         * 
         * <strong>example:</strong>
         * <p>drds_polarxpost_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The endpoint information.</p>
         */
        @NameInMap("ConnAddrs")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs> connAddrs;

        /**
         * <p>The internal network connection information.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-sprpx766vo****.polarx.singapore.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The chip type. Default value: intel.</p>
         * 
         * <strong>example:</strong>
         * <p>intel | hygon</p>
         */
        @NameInMap("CpuType")
        public String cpuType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-31T08:56:25.000+0000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: primary instance</li>
         * <li><strong>ReadOnly</strong>: read-only instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The node specifications of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The number of nodes in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DBNodeCount")
        public Integer DBNodeCount;

        /**
         * <p>The database node information.</p>
         */
        @NameInMap("DBNodes")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes> DBNodes;

        /**
         * <p>The database type. The value is fixed to polarx.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The database version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.5</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>test instance</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the specifications of the DN nodes in the instance are different. Valid values:</p>
         * <ul>
         * <li>true: The specifications are different.</li>
         * <li>false: The specifications are the same.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DifferentDNSpec")
        public Boolean differentDNSpec;

        /**
         * <p>The DN node specifications. Valid values:</p>
         * <ul>
         * <li><strong>mysql.n2.medium.25</strong>: 2 cores and 4 GB of memory</li>
         * <li><strong>mysql.n4.medium.25</strong>: 2 cores and 8 GB of memory</li>
         * <li><strong>mysql.x8.medium.25</strong>: 2 cores and 16 GB of memory</li>
         * <li><strong>mysql.n2.large.25</strong>: 4 cores and 8 GB of memory</li>
         * <li><strong>mysql.n4.large.25</strong>: 4 cores and 16 GB of memory</li>
         * <li><strong>mysql.x8.large.25</strong>: 4 cores and 32 GB of memory</li>
         * <li><strong>mysql.n2.xlarge.25</strong>: 8 cores and 16 GB of memory</li>
         * <li><strong>mysql.n4.xlarge.25</strong>: 8 cores and 32 GB of memory</li>
         * <li><strong>mysql.x8.xlarge.25</strong>: 8 cores and 64 GB of memory</li>
         * <li><strong>mysql.n4.2xlarge.25</strong>: 16 cores and 64 GB of memory</li>
         * <li><strong>mysql.x8.2xlarge.25</strong>: 16 cores and 128 GB of memory</li>
         * <li><strong>mysql.x4.4xlarge.25</strong>: 32 cores and 128 GB of memory</li>
         * <li><strong>mysql.x8.4xlarge.25</strong>: 32 cores and 256 GB of memory</li>
         * <li><strong>mysql.st.8xlarge.25</strong>: 60 cores and 470 GB of memory</li>
         * <li><strong>mysql.st.12xlarge.25</strong>: 90 cores and 720 GB of memory</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mysql.x8.large.25</p>
         */
        @NameInMap("DnNodeClassCode")
        public String dnNodeClassCode;

        /**
         * <p>The number of DN nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DnNodeCount")
        public Integer dnNodeCount;

        /**
         * <p>The disk space size of the storage node, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DnStorageSpace")
        public String dnStorageSpace;

        /**
         * <p>The database type. The value is fixed to polarx.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The DPI engine version. Default value: 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0 | 3.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time. The format is yyyy-MM-ddTHH:mm:ss.sss+0000 (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31T16:00:00.000+0000</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>Indicates whether the instance has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: expired</li>
         * <li><strong>false</strong>: normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <p>The name of the GDN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-zkrkuykqglbizdhm</p>
         */
        @NameInMap("GdnInstanceName")
        public String gdnInstanceName;

        /**
         * <p>The GDN member list.</p>
         */
        @NameInMap("GdnMemberList")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList> gdnMemberList;

        /**
         * <p>The GDN role.</p>
         * 
         * <strong>example:</strong>
         * <p>master | standby</p>
         */
        @NameInMap("GdnRole")
        public String gdnRole;

        /**
         * <p>The ID of the primary instance. If this parameter is not returned, the instance is a primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-zkralxpc5d****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance DPI engine version. This is an internal parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("KindCode")
        public Integer kindCode;

        /**
         * <p>The instance versions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("LTSVersions")
        public java.util.List<String> LTSVersions;

        /**
         * <p>The latest Milvus version supported by the current instance.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-kernel_5.4.11-16301083_xcluster-20210805</p>
         */
        @NameInMap("LatestMinorVersion")
        public String latestMinorVersion;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: normal</li>
         * <li><strong>ManualLock</strong>: manually locked</li>
         * <li><strong>LockByExpiration</strong>: automatically locked due to expiration</li>
         * <li><strong>LockByRestoration</strong>: automatically locked before rollback</li>
         * <li><strong>LockByDiskQuota</strong>: automatically locked due to full disk space</li>
         * <li><strong>LockReadInstanceByDiskQuota</strong>: automatically locked due to full disk space of the read-only instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The end time of the maintenance window. The time is in UTC. Add 8 hours to obtain the maintenance window displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window. The time is in UTC. Add 8 hours to obtain the maintenance window displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The current Milvus version.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-kernel_5.4.11-16301083_xcluster-20210805</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The network type of the instance. Only VPC is supported, which indicates a virtual private cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The internal network connection port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The primary instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzrof9vitnu8uu</p>
         */
        @NameInMap("PrimaryInstanceId")
        public String primaryInstanceId;

        /**
         * <p>The primary zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <p>The list of read-only instance names.</p>
         */
        @NameInMap("ReadDBInstances")
        public java.util.List<String> readDBInstances;

        /**
         * <p>The region of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-*********</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the three-role mode. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: disabled</li>
         * <li><strong>true</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RightsSeparationEnabled")
        public Boolean rightsSeparationEnabled;

        /**
         * <p>The status of the three-role mode. Valid values:</p>
         * <ul>
         * <li><strong>disabled</strong>: disabled</li>
         * <li><strong>enabled</strong>: enabled</li>
         * <li><strong>processing</strong>: processing</li>
         * <li><strong>unknown</strong>: unknown, which may be caused by the inability to connect to the instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("RightsSeparationStatus")
        public String rightsSeparationStatus;

        /**
         * <p>Indicates whether an associated Search instance that is not deleted exists, including instances that are being created or deleted.</p>
         */
        @NameInMap("SearchEnabled")
        public Boolean searchEnabled;

        /**
         * <p>The unique Search instance associated with the current primary instance. This parameter is empty if the feature is not enabled.</p>
         */
        @NameInMap("SearchInstance")
        public DescribeDBInstanceAttributeResponseBodyDBInstanceSearchInstance searchInstance;

        /**
         * <p>The secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-a</p>
         */
        @NameInMap("SecondaryZone")
        public String secondaryZone;

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li><strong>enterprise</strong>: Enterprise Edition</li>
         * <li><strong>standard</strong>: Standard Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>exclusive: Exclusive.
         * general: General.</p>
         * 
         * <strong>example:</strong>
         * <p>exclusive | general</p>
         */
        @NameInMap("SpecCategory")
        public String specCategory;

        /**
         * <p>The instance status. For more information, see the following description.</p>
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
         * <p>custom_local_ssd | cloud_auto</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The used storage capacity, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>17042505728</p>
         */
        @NameInMap("StorageUsed")
        public Long storageUsed;

        /**
         * <p>The tag set.</p>
         */
        @NameInMap("TagSet")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet> tagSet;

        /**
         * <p>The third zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        @NameInMap("TertiaryZone")
        public String tertiaryZone;

        /**
         * <p>The topology type. Valid values:</p>
         * <ul>
         * <li><strong>3azones</strong>: Three-zone deployment.</li>
         * <li><strong>1azone</strong>: Single-zone deployment.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3azones</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: primary instance</li>
         * <li><strong>ReadOnly</strong>: read-only instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-********</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone where the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstance self = new DescribeDBInstanceAttributeResponseBodyDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setAiGatewayEnabled(String aiGatewayEnabled) {
            this.aiGatewayEnabled = aiGatewayEnabled;
            return this;
        }
        public String getAiGatewayEnabled() {
            return this.aiGatewayEnabled;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setCanNotCreateColumnar(Boolean canNotCreateColumnar) {
            this.canNotCreateColumnar = canNotCreateColumnar;
            return this;
        }
        public Boolean getCanNotCreateColumnar() {
            return this.canNotCreateColumnar;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setCnNodeClassCode(String cnNodeClassCode) {
            this.cnNodeClassCode = cnNodeClassCode;
            return this;
        }
        public String getCnNodeClassCode() {
            return this.cnNodeClassCode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setCnNodeCount(Integer cnNodeCount) {
            this.cnNodeCount = cnNodeCount;
            return this;
        }
        public Integer getCnNodeCount() {
            return this.cnNodeCount;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setColumnarInstanceName(String columnarInstanceName) {
            this.columnarInstanceName = columnarInstanceName;
            return this;
        }
        public String getColumnarInstanceName() {
            return this.columnarInstanceName;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setColumnarReadDBInstances(java.util.List<String> columnarReadDBInstances) {
            this.columnarReadDBInstances = columnarReadDBInstances;
            return this;
        }
        public java.util.List<String> getColumnarReadDBInstances() {
            return this.columnarReadDBInstances;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setConnAddrs(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setCpuType(String cpuType) {
            this.cpuType = cpuType;
            return this;
        }
        public String getCpuType() {
            return this.cpuType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBNodeCount(Integer DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Integer getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBNodes(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes> getDBNodes() {
            return this.DBNodes;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDifferentDNSpec(Boolean differentDNSpec) {
            this.differentDNSpec = differentDNSpec;
            return this;
        }
        public Boolean getDifferentDNSpec() {
            return this.differentDNSpec;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDnNodeClassCode(String dnNodeClassCode) {
            this.dnNodeClassCode = dnNodeClassCode;
            return this;
        }
        public String getDnNodeClassCode() {
            return this.dnNodeClassCode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDnNodeCount(Integer dnNodeCount) {
            this.dnNodeCount = dnNodeCount;
            return this;
        }
        public Integer getDnNodeCount() {
            return this.dnNodeCount;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDnStorageSpace(String dnStorageSpace) {
            this.dnStorageSpace = dnStorageSpace;
            return this;
        }
        public String getDnStorageSpace() {
            return this.dnStorageSpace;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setGdnInstanceName(String gdnInstanceName) {
            this.gdnInstanceName = gdnInstanceName;
            return this;
        }
        public String getGdnInstanceName() {
            return this.gdnInstanceName;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setGdnMemberList(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList> gdnMemberList) {
            this.gdnMemberList = gdnMemberList;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList> getGdnMemberList() {
            return this.gdnMemberList;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setGdnRole(String gdnRole) {
            this.gdnRole = gdnRole;
            return this;
        }
        public String getGdnRole() {
            return this.gdnRole;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setKindCode(Integer kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public Integer getKindCode() {
            return this.kindCode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setLTSVersions(java.util.List<String> LTSVersions) {
            this.LTSVersions = LTSVersions;
            return this;
        }
        public java.util.List<String> getLTSVersions() {
            return this.LTSVersions;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setLatestMinorVersion(String latestMinorVersion) {
            this.latestMinorVersion = latestMinorVersion;
            return this;
        }
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setPrimaryInstanceId(String primaryInstanceId) {
            this.primaryInstanceId = primaryInstanceId;
            return this;
        }
        public String getPrimaryInstanceId() {
            return this.primaryInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setPrimaryZone(String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setReadDBInstances(java.util.List<String> readDBInstances) {
            this.readDBInstances = readDBInstances;
            return this;
        }
        public java.util.List<String> getReadDBInstances() {
            return this.readDBInstances;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setRightsSeparationEnabled(Boolean rightsSeparationEnabled) {
            this.rightsSeparationEnabled = rightsSeparationEnabled;
            return this;
        }
        public Boolean getRightsSeparationEnabled() {
            return this.rightsSeparationEnabled;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setRightsSeparationStatus(String rightsSeparationStatus) {
            this.rightsSeparationStatus = rightsSeparationStatus;
            return this;
        }
        public String getRightsSeparationStatus() {
            return this.rightsSeparationStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setSearchEnabled(Boolean searchEnabled) {
            this.searchEnabled = searchEnabled;
            return this;
        }
        public Boolean getSearchEnabled() {
            return this.searchEnabled;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setSearchInstance(DescribeDBInstanceAttributeResponseBodyDBInstanceSearchInstance searchInstance) {
            this.searchInstance = searchInstance;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyDBInstanceSearchInstance getSearchInstance() {
            return this.searchInstance;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setSecondaryZone(String secondaryZone) {
            this.secondaryZone = secondaryZone;
            return this;
        }
        public String getSecondaryZone() {
            return this.secondaryZone;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setSpecCategory(String specCategory) {
            this.specCategory = specCategory;
            return this;
        }
        public String getSpecCategory() {
            return this.specCategory;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setTagSet(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet> tagSet) {
            this.tagSet = tagSet;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet> getTagSet() {
            return this.tagSet;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setTertiaryZone(String tertiaryZone) {
            this.tertiaryZone = tertiaryZone;
            return this;
        }
        public String getTertiaryZone() {
            return this.tertiaryZone;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setTopologyType(String topologyType) {
            this.topologyType = topologyType;
            return this;
        }
        public String getTopologyType() {
            return this.topologyType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}

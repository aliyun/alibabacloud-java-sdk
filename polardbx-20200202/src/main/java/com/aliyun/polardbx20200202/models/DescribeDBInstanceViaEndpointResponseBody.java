// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceViaEndpointResponseBody extends TeaModel {
    /**
     * <p>The instance information.</p>
     */
    @NameInMap("DBInstance")
    public DescribeDBInstanceViaEndpointResponseBodyDBInstance DBInstance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14036EBE-CF2E-44DB-ACE9-AC6157D3A6FC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceViaEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceViaEndpointResponseBody self = new DescribeDBInstanceViaEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceViaEndpointResponseBody setDBInstance(DescribeDBInstanceViaEndpointResponseBodyDBInstance DBInstance) {
        this.DBInstance = DBInstance;
        return this;
    }
    public DescribeDBInstanceViaEndpointResponseBodyDBInstance getDBInstance() {
        return this.DBInstance;
    }

    public DescribeDBInstanceViaEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs extends TeaModel {
        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>polardbx-xxx.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The connection type. <strong>VPC</strong> indicates an internal network connection. <strong>PUBLIC</strong> indicates a public network connection.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>VPC ID。</p>
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
         * <p>The internal cloud instance ID within the VPC. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-zkralxpc5d****</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs self = new DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes extends TeaModel {
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
         * <p>The zone where the node resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes self = new DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setComputeNodeId(String computeNodeId) {
            this.computeNodeId = computeNodeId;
            return this;
        }
        public String getComputeNodeId() {
            return this.computeNodeId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setDataNodeId(String dataNodeId) {
            this.dataNodeId = dataNodeId;
            return this;
        }
        public String getDataNodeId() {
            return this.dataNodeId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet extends TeaModel {
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

        public static DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet self = new DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceViaEndpointResponseBodyDBInstance extends TeaModel {
        /**
         * <p>The CN node specifications. Valid values:</p>
         * <ul>
         * <li><strong>polarx.x4.medium.2e</strong>: 2 cores, 8 GB</li>
         * <li><strong>polarx.x4.large.2e</strong>: 4 cores, 16 GB</li>
         * <li><strong>polarx.x8.large.2e</strong>: 4 cores, 32 GB</li>
         * <li><strong>polarx.x4.xlarge.2e</strong>: 8 cores, 32 GB</li>
         * <li><strong>polarx.x8.xlarge.2e</strong>: 8 cores, 64 GB</li>
         * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 cores, 64 GB</li>
         * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 cores, 128 GB</li>
         * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 cores, 128 GB</li>
         * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 cores, 256 GB</li>
         * <li><strong>polarx.st.8xlarge.2e</strong>: 60 cores, 470 GB</li>
         * <li><strong>polarx.st.12xlarge.2e</strong>: 90 cores, 720 GB.</li>
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
         * <p>The commodity code of the instance. The value is fixed as drds_polarxpost_public_cn.</p>
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
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs> connAddrs;

        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-sprpx766vo****.polarx.singapore.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

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
         * <li><strong>ReadWrite</strong>: primary instance.</li>
         * <li><strong>ReadOnly</strong>: read-only instance.</li>
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
         * <p>The number of instance nodes.</p>
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
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes> DBNodes;

        /**
         * <p>The database type. The value is fixed as polarx.</p>
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
         * <p>The DN node specifications. Valid values:</p>
         * <ul>
         * <li><strong>mysql.n2.medium.25</strong>: 2 cores, 4 GB</li>
         * <li><strong>mysql.n4.medium.25</strong>: 2 cores, 8 GB</li>
         * <li><strong>mysql.x8.medium.25</strong>: 2 cores, 16 GB</li>
         * <li><strong>mysql.n2.large.25</strong>: 4 cores, 8 GB</li>
         * <li><strong>mysql.n4.large.25</strong>: 4 cores, 16 GB</li>
         * <li><strong>mysql.x8.large.25</strong>: 4 cores, 32 GB</li>
         * <li><strong>mysql.n2.xlarge.25</strong>: 8 cores, 16 GB</li>
         * <li><strong>mysql.n4.xlarge.25</strong>: 8 cores, 32 GB</li>
         * <li><strong>mysql.x8.xlarge.25</strong>: 8 cores, 64 GB</li>
         * <li><strong>mysql.n4.2xlarge.25</strong>: 16 cores, 64 GB</li>
         * <li><strong>mysql.x8.2xlarge.25</strong>: 16 cores, 128 GB</li>
         * <li><strong>mysql.x4.4xlarge.25</strong>: 32 cores, 128 GB</li>
         * <li><strong>mysql.x8.4xlarge.25</strong>: 32 cores, 256 GB</li>
         * <li><strong>mysql.st.8xlarge.25</strong>: 60 cores, 470 GB</li>
         * <li><strong>mysql.st.12xlarge.25</strong>: 90 cores, 720 GB.</li>
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
         * <p>The database type. The value is fixed as MySQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The expiration time. The time is in the yyyy-MM-ddTHH:mm:ss.sss+0000 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31T16:00:00.000+0000</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>Indicates whether the instance has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance has expired.</li>
         * <li><strong>false</strong>: The instance is running normally.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <p>The ID of the primary instance. If this parameter is not returned, the instance is a primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-zkralxpc5d****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The DPI engine version of the instance. This is an internal parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("KindCode")
        public Integer kindCode;

        /**
         * <p>The Long-Term Support (LTS) version number.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("LTSVersions")
        public java.util.List<String> LTSVersions;

        /**
         * <p>The latest kernel version supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-kernel_5.4.11-16301083_xcluster-20210805</p>
         */
        @NameInMap("LatestMinorVersion")
        public String latestMinorVersion;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: Normal.</li>
         * <li><strong>ManualLock</strong>: Manually locked.</li>
         * <li><strong>LockByExpiration</strong>: Automatically locked due to instance expiration.</li>
         * <li><strong>LockByRestoration</strong>: Automatically locked before instance rollback.</li>
         * <li><strong>LockByDiskQuota</strong>: Automatically locked because the instance storage is full.</li>
         * <li><strong>LockReadInstanceByDiskQuota</strong>: Automatically locked because the read-only instance storage is full.</li>
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
         * <p>The current kernel version.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-kernel_5.4.11-16301083_xcluster-20210805</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The network type of the instance. Only VPC is supported, which indicates a virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port of the instance endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The names of the read-only instances.</p>
         */
        @NameInMap("ReadDBInstances")
        public java.util.List<String> readDBInstances;

        /**
         * <p>The region where the instance resides.</p>
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
         * <p>rg-xxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The three-role mode status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Disabled.</li>
         * <li><strong>true</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RightsSeparationEnabled")
        public Boolean rightsSeparationEnabled;

        /**
         * <p>The three-role mode status. Valid values:</p>
         * <ul>
         * <li><strong>disabled</strong>: Disabled.</li>
         * <li><strong>enabled</strong>: Enabled.</li>
         * <li><strong>processing</strong>: Being processed.</li>
         * <li><strong>unknown</strong>: Unknown. The instance may be disconnected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("RightsSeparationStatus")
        public String rightsSeparationStatus;

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li><strong>enterprise</strong>: Enterprise Edition.</li>
         * <li><strong>standard</strong>: Standard Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/339826.html">Instance status</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The used storage space, in bytes.</p>
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
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet> tagSet;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: primary instance.</li>
         * <li><strong>ReadOnly</strong>: read-only instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>VPC ID。</p>
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
         * <p>The zone where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceViaEndpointResponseBodyDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceViaEndpointResponseBodyDBInstance self = new DescribeDBInstanceViaEndpointResponseBodyDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setCnNodeClassCode(String cnNodeClassCode) {
            this.cnNodeClassCode = cnNodeClassCode;
            return this;
        }
        public String getCnNodeClassCode() {
            return this.cnNodeClassCode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setCnNodeCount(Integer cnNodeCount) {
            this.cnNodeCount = cnNodeCount;
            return this;
        }
        public Integer getCnNodeCount() {
            return this.cnNodeCount;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setConnAddrs(java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBNodeCount(Integer DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Integer getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBNodes(java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes> getDBNodes() {
            return this.DBNodes;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDnNodeClassCode(String dnNodeClassCode) {
            this.dnNodeClassCode = dnNodeClassCode;
            return this;
        }
        public String getDnNodeClassCode() {
            return this.dnNodeClassCode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDnNodeCount(Integer dnNodeCount) {
            this.dnNodeCount = dnNodeCount;
            return this;
        }
        public Integer getDnNodeCount() {
            return this.dnNodeCount;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setKindCode(Integer kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public Integer getKindCode() {
            return this.kindCode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setLTSVersions(java.util.List<String> LTSVersions) {
            this.LTSVersions = LTSVersions;
            return this;
        }
        public java.util.List<String> getLTSVersions() {
            return this.LTSVersions;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setLatestMinorVersion(String latestMinorVersion) {
            this.latestMinorVersion = latestMinorVersion;
            return this;
        }
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setReadDBInstances(java.util.List<String> readDBInstances) {
            this.readDBInstances = readDBInstances;
            return this;
        }
        public java.util.List<String> getReadDBInstances() {
            return this.readDBInstances;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setRightsSeparationEnabled(Boolean rightsSeparationEnabled) {
            this.rightsSeparationEnabled = rightsSeparationEnabled;
            return this;
        }
        public Boolean getRightsSeparationEnabled() {
            return this.rightsSeparationEnabled;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setRightsSeparationStatus(String rightsSeparationStatus) {
            this.rightsSeparationStatus = rightsSeparationStatus;
            return this;
        }
        public String getRightsSeparationStatus() {
            return this.rightsSeparationStatus;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setTagSet(java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet> tagSet) {
            this.tagSet = tagSet;
            return this;
        }
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet> getTagSet() {
            return this.tagSet;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}

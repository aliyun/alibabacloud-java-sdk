// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("DBInstances")
    public java.util.List<DescribeDBInstancesResponseBodyDBInstances> DBInstances;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalNumber")
    public Integer totalNumber;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setDBInstances(java.util.List<DescribeDBInstancesResponseBodyDBInstances> DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public java.util.List<DescribeDBInstancesResponseBodyDBInstances> getDBInstances() {
        return this.DBInstances;
    }

    public DescribeDBInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static class DescribeDBInstancesResponseBodyDBInstancesNodes extends TeaModel {
        /**
         * <p>The instance specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxi-zd89wrzqh******</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g-aliyun</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesResponseBodyDBInstancesNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesNodes self = new DescribeDBInstancesResponseBodyDBInstancesNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstancesTagSet extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesResponseBodyDBInstancesTagSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesTagSet self = new DescribeDBInstancesResponseBodyDBInstancesTagSet();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesTagSet setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesResponseBodyDBInstancesTagSet setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstances extends TeaModel {
        /**
         * <p>The name of the log node.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-c-dmlgit****</p>
         */
        @NameInMap("CdcInstanceName")
        public String cdcInstanceName;

        /**
         * <p>The CN node specifications. Valid values:</p>
         * <ul>
         * <li><strong>polarx.x4.medium.2e</strong>: 2 cores, 8 GB memory</li>
         * <li><strong>polarx.x4.large.2e</strong>: 4 cores, 16 GB memory</li>
         * <li><strong>polarx.x8.large.2e</strong>: 4 cores, 32 GB memory</li>
         * <li><strong>polarx.x4.xlarge.2e</strong>: 8 cores, 32 GB memory</li>
         * <li><strong>polarx.x8.xlarge.2e</strong>: 8 cores, 64 GB memory</li>
         * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 cores, 64 GB memory</li>
         * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 cores, 128 GB memory</li>
         * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 cores, 128 GB memory</li>
         * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 cores, 256 GB memory</li>
         * <li><strong>polarx.st.8xlarge.2e</strong>: 60 cores, 470 GB memory</li>
         * <li><strong>polarx.st.12xlarge.2e</strong>: 90 cores, 720 GB memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
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
         * <p>xxxxxxxx</p>
         */
        @NameInMap("ColumnarInstanceName")
        public String columnarInstanceName;

        /**
         * <p>The column store read-only instance information.</p>
         */
        @NameInMap("ColumnarReadDBInstances")
        public java.util.List<String> columnarReadDBInstances;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>drds_polarxpre_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>Indicates whether the instance contains the multi-stream log service. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance contains the multi-stream log service.</li>
         * <li><strong>false</strong>: The instance does not contain the multi-stream log service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContainBinlogX")
        public Boolean containBinlogX;

        @NameInMap("CpuType")
        public String cpuType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01T03:49:50.000+0000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxx</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The database type.</p>
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
         * <p>5.7</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The database description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The DN node specifications. Valid values:</p>
         * <ul>
         * <li><strong>mysql.n2.medium.25</strong>: 2 cores, 4 GB memory</li>
         * <li><strong>mysql.n4.medium.25</strong>: 2 cores, 8 GB memory</li>
         * <li><strong>mysql.x8.medium.25</strong>: 2 cores, 16 GB memory</li>
         * <li><strong>mysql.n2.large.25</strong>: 4 cores, 8 GB memory</li>
         * <li><strong>mysql.n4.large.25</strong>: 4 cores, 16 GB memory</li>
         * <li><strong>mysql.x8.large.25</strong>: 4 cores, 32 GB memory</li>
         * <li><strong>mysql.n2.xlarge.25</strong>: 8 cores, 16 GB memory</li>
         * <li><strong>mysql.n4.xlarge.25</strong>: 8 cores, 32 GB memory</li>
         * <li><strong>mysql.x8.xlarge.25</strong>: 8 cores, 64 GB memory</li>
         * <li><strong>mysql.n4.2xlarge.25</strong>: 16 cores, 64 GB memory</li>
         * <li><strong>mysql.x8.2xlarge.25</strong>: 16 cores, 128 GB memory</li>
         * <li><strong>mysql.x4.4xlarge.25</strong>: 32 cores, 128 GB memory</li>
         * <li><strong>mysql.x8.4xlarge.25</strong>: 32 cores, 256 GB memory</li>
         * <li><strong>mysql.st.8xlarge.25</strong>: 60 cores, 470 GB memory</li>
         * <li><strong>mysql.st.12xlarge.25</strong>: 90 cores, 720 GB memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mysql.n4.medium.25</p>
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
         * <p>The engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-01T16:00:00.000+0000</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the instance has expired.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzr2yeov******</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the instance is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason why the instance is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>欠费</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The current Milvus version.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-kernel_5.4.12-16349923_xcluster-20210926</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>The list of nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> nodes;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        @NameInMap("PrimaryInstanceId")
        public String primaryInstanceId;

        /**
         * <p>The primary zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <p>The list of read-only instances.</p>
         */
        @NameInMap("ReadDBInstances")
        public java.util.List<String> readDBInstances;

        /**
         * <p>The region ID.</p>
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
         * <p>rg-xxxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-l</p>
         */
        @NameInMap("SecondaryZone")
        public String secondaryZone;

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
         * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/339826.html">Instance status table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>40658534400</p>
         */
        @NameInMap("StorageUsed")
        public Long storageUsed;

        /**
         * <p>Indicates whether the instance supports multi-stream. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportBinlogX")
        public Boolean supportBinlogX;

        /**
         * <p>The set of tags.</p>
         */
        @NameInMap("TagSet")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesTagSet> tagSet;

        /**
         * <p>The third zone in the three-zone deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("TertiaryZone")
        public String tertiaryZone;

        /**
         * <p>The topology type. Valid values:</p>
         * <ul>
         * <li><strong>3azones</strong>: three-zone deployment.</li>
         * <li><strong>1azone</strong>: single-zone deployment.</li>
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
         * <p>VPCID</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("gdnRole")
        public String gdnRole;

        @NameInMap("isInGdn")
        public Boolean isInGdn;

        public static DescribeDBInstancesResponseBodyDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstances self = new DescribeDBInstancesResponseBodyDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstances setCdcInstanceName(String cdcInstanceName) {
            this.cdcInstanceName = cdcInstanceName;
            return this;
        }
        public String getCdcInstanceName() {
            return this.cdcInstanceName;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCnNodeClassCode(String cnNodeClassCode) {
            this.cnNodeClassCode = cnNodeClassCode;
            return this;
        }
        public String getCnNodeClassCode() {
            return this.cnNodeClassCode;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCnNodeCount(Integer cnNodeCount) {
            this.cnNodeCount = cnNodeCount;
            return this;
        }
        public Integer getCnNodeCount() {
            return this.cnNodeCount;
        }

        public DescribeDBInstancesResponseBodyDBInstances setColumnarInstanceName(String columnarInstanceName) {
            this.columnarInstanceName = columnarInstanceName;
            return this;
        }
        public String getColumnarInstanceName() {
            return this.columnarInstanceName;
        }

        public DescribeDBInstancesResponseBodyDBInstances setColumnarReadDBInstances(java.util.List<String> columnarReadDBInstances) {
            this.columnarReadDBInstances = columnarReadDBInstances;
            return this;
        }
        public java.util.List<String> getColumnarReadDBInstances() {
            return this.columnarReadDBInstances;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBInstancesResponseBodyDBInstances setContainBinlogX(Boolean containBinlogX) {
            this.containBinlogX = containBinlogX;
            return this;
        }
        public Boolean getContainBinlogX() {
            return this.containBinlogX;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCpuType(String cpuType) {
            this.cpuType = cpuType;
            return this;
        }
        public String getCpuType() {
            return this.cpuType;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDnNodeClassCode(String dnNodeClassCode) {
            this.dnNodeClassCode = dnNodeClassCode;
            return this;
        }
        public String getDnNodeClassCode() {
            return this.dnNodeClassCode;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDnNodeCount(Integer dnNodeCount) {
            this.dnNodeCount = dnNodeCount;
            return this;
        }
        public Integer getDnNodeCount() {
            return this.dnNodeCount;
        }

        public DescribeDBInstancesResponseBodyDBInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyDBInstances setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseBodyDBInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyDBInstances setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribeDBInstancesResponseBodyDBInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstancesResponseBodyDBInstances setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyDBInstances setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseBodyDBInstances setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNodes(java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> getNodes() {
            return this.nodes;
        }

        public DescribeDBInstancesResponseBodyDBInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesResponseBodyDBInstances setPrimaryInstanceId(String primaryInstanceId) {
            this.primaryInstanceId = primaryInstanceId;
            return this;
        }
        public String getPrimaryInstanceId() {
            return this.primaryInstanceId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setPrimaryZone(String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        public DescribeDBInstancesResponseBodyDBInstances setReadDBInstances(java.util.List<String> readDBInstances) {
            this.readDBInstances = readDBInstances;
            return this;
        }
        public java.util.List<String> getReadDBInstances() {
            return this.readDBInstances;
        }

        public DescribeDBInstancesResponseBodyDBInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setSecondaryZone(String secondaryZone) {
            this.secondaryZone = secondaryZone;
            return this;
        }
        public String getSecondaryZone() {
            return this.secondaryZone;
        }

        public DescribeDBInstancesResponseBodyDBInstances setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeDBInstancesResponseBodyDBInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstancesResponseBodyDBInstances setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstancesResponseBodyDBInstances setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBInstancesResponseBodyDBInstances setSupportBinlogX(Boolean supportBinlogX) {
            this.supportBinlogX = supportBinlogX;
            return this;
        }
        public Boolean getSupportBinlogX() {
            return this.supportBinlogX;
        }

        public DescribeDBInstancesResponseBodyDBInstances setTagSet(java.util.List<DescribeDBInstancesResponseBodyDBInstancesTagSet> tagSet) {
            this.tagSet = tagSet;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesTagSet> getTagSet() {
            return this.tagSet;
        }

        public DescribeDBInstancesResponseBodyDBInstances setTertiaryZone(String tertiaryZone) {
            this.tertiaryZone = tertiaryZone;
            return this;
        }
        public String getTertiaryZone() {
            return this.tertiaryZone;
        }

        public DescribeDBInstancesResponseBodyDBInstances setTopologyType(String topologyType) {
            this.topologyType = topologyType;
            return this;
        }
        public String getTopologyType() {
            return this.topologyType;
        }

        public DescribeDBInstancesResponseBodyDBInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstancesResponseBodyDBInstances setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setGdnRole(String gdnRole) {
            this.gdnRole = gdnRole;
            return this;
        }
        public String getGdnRole() {
            return this.gdnRole;
        }

        public DescribeDBInstancesResponseBodyDBInstances setIsInGdn(Boolean isInGdn) {
            this.isInGdn = isInGdn;
            return this;
        }
        public Boolean getIsInGdn() {
            return this.isInGdn;
        }

    }

}

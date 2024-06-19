// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("DBInstances")
    public java.util.List<DescribeDBInstancesResponseBodyDBInstances> DBInstances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-g-aliyun</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
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
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>pxc-c-dmlgit****</p>
         */
        @NameInMap("CdcInstanceName")
        public String cdcInstanceName;

        /**
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("CnNodeClassCode")
        public String cnNodeClassCode;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CnNodeCount")
        public Integer cnNodeCount;

        @NameInMap("ColumnarInstanceName")
        public String columnarInstanceName;

        @NameInMap("ColumnarReadDBInstances")
        public java.util.List<String> columnarReadDBInstances;

        /**
         * <strong>example:</strong>
         * <p>drds_polarxpre_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContainBinlogX")
        public Boolean containBinlogX;

        @NameInMap("CpuType")
        public String cpuType;

        /**
         * <strong>example:</strong>
         * <p>2021-11-01T03:49:50.000+0000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>pxc-xxxxx</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>mysql.n4.medium.25</p>
         */
        @NameInMap("DnNodeClassCode")
        public String dnNodeClassCode;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DnNodeCount")
        public Integer dnNodeCount;

        /**
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>2021-12-01T16:00:00.000+0000</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <strong>example:</strong>
         * <p>pxc-hzr2yeov9jmg3z</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <strong>example:</strong>
         * <p>polarx-kernel_5.4.12-16349923_xcluster-20210926</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("Nodes")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> nodes;

        /**
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>主可用区。</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        @NameInMap("ReadDBInstances")
        public java.util.List<String> readDBInstances;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-xxxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>次可用区。</p>
         */
        @NameInMap("SecondaryZone")
        public String secondaryZone;

        /**
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>40658534400</p>
         */
        @NameInMap("StorageUsed")
        public Long storageUsed;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportBinlogX")
        public Boolean supportBinlogX;

        @NameInMap("TagSet")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesTagSet> tagSet;

        /**
         * <p>第三可用区。</p>
         */
        @NameInMap("TertiaryZone")
        public String tertiaryZone;

        /**
         * <p>拓扑类型：</p>
         * <ul>
         * <li><strong>3azones</strong>：三可用区；</li>
         * <li><strong>1azone</strong>：单可用区。</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

        /**
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

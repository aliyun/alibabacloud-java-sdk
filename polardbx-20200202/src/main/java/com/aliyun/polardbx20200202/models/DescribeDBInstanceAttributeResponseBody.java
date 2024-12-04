// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("DBInstance")
    public DescribeDBInstanceAttributeResponseBodyDBInstance DBInstance;

    /**
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
         * <strong>example:</strong>
         * <p>polardbx-xxx.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
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

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
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
        @NameInMap("ComputeNodeId")
        public String computeNodeId;

        /**
         * <strong>example:</strong>
         * <p>pxc-xdb-xxxxxx</p>
         */
        @NameInMap("DataNodeId")
        public String dataNodeId;

        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
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
        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Role")
        public String role;

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

    public static class DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key2</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
        @NameInMap("CanNotCreateColumnar")
        public Boolean canNotCreateColumnar;

        /**
         * <strong>example:</strong>
         * <p>polarx.x4.xlarge.2e</p>
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
         * <p>drds_polarxpost_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ConnAddrs")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs> connAddrs;

        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>2021-08-31T08:56:25.000+0000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DBNodeCount")
        public Integer DBNodeCount;

        @NameInMap("DBNodes")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes> DBNodes;

        /**
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <strong>example:</strong>
         * <p>5.5</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <strong>example:</strong>
         * <p>test instance</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DifferentDNSpec")
        public Boolean differentDNSpec;

        /**
         * <strong>example:</strong>
         * <p>mysql.x8.large.25</p>
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
         * <p>2022-08-31T16:00:00.000+0000</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        @NameInMap("GdnInstanceName")
        public String gdnInstanceName;

        @NameInMap("GdnMemberList")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceGdnMemberList> gdnMemberList;

        @NameInMap("GdnRole")
        public String gdnRole;

        /**
         * <strong>example:</strong>
         * <p>pxc-zkralxpc5d****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("KindCode")
        public Integer kindCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("LTSVersions")
        public java.util.List<String> LTSVersions;

        /**
         * <strong>example:</strong>
         * <p>polarx-kernel_5.4.11-16301083_xcluster-20210805</p>
         */
        @NameInMap("LatestMinorVersion")
        public String latestMinorVersion;

        /**
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <strong>example:</strong>
         * <p>polarx-kernel_5.4.11-16301083_xcluster-20210805</p>
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
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

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
         * <p>rg-xxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RightsSeparationEnabled")
        public Boolean rightsSeparationEnabled;

        /**
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("RightsSeparationStatus")
        public String rightsSeparationStatus;

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

        @NameInMap("SpecCategory")
        public String specCategory;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>17042505728</p>
         */
        @NameInMap("StorageUsed")
        public Long storageUsed;

        @NameInMap("TagSet")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceTagSet> tagSet;

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
         * <p>vpc-xxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstance self = new DescribeDBInstanceAttributeResponseBodyDBInstance();
            return TeaModel.build(map, self);
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

        public DescribeDBInstanceAttributeResponseBodyDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
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

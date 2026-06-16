// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTopologyResponseBody extends TeaModel {
    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DescribeDBInstanceTopologyResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTopologyResponseBody self = new DescribeDBInstanceTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTopologyResponseBody setData(DescribeDBInstanceTopologyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceTopologyResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems extends TeaModel {
        /**
         * <p>Indicates whether the node is activated. For the compute layer, only the node in the primary zone is activated. After a primary/secondary switchover is performed on the instance, the standby compute node becomes the primary node. All storage layer nodes are activated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Activated")
        public Boolean activated;

        /**
         * <p>The zone of the node. If the node is an RDS node, the zones of multiple child nodes are separated with a delimiter (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("Azone")
        public String azone;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>polarx_cn</strong>: compute node.</li>
         * <li><strong>polarx_store</strong>: data node.</li>
         * <li><strong>polarx_gms</strong>: GMS node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>节点角色</p>
         */
        @NameInMap("CharacterType")
        public String characterType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>304726049</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-sprcym7g7w****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The physical instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-unrbk8oyz**********</p>
         */
        @NameInMap("PhyInstanceName")
        public String phyInstanceName;

        /**
         * <p>The region of the node. If the node is an RDS node, the regions of multiple child nodes are separated with a delimiter (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The role of the node. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: primary node</li>
         * <li><strong>standby</strong>: secondary node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setActivated(Boolean activated) {
            this.activated = activated;
            return this;
        }
        public Boolean getActivated() {
            return this.activated;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setAzone(String azone) {
            this.azone = azone;
            return this;
        }
        public String getAzone() {
            return this.azone;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setCharacterType(String characterType) {
            this.characterType = characterType;
            return this;
        }
        public String getCharacterType() {
            return this.characterType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setPhyInstanceName(String phyInstanceName) {
            this.phyInstanceName = phyInstanceName;
            return this;
        }
        public String getPhyInstanceName() {
            return this.phyInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList extends TeaModel {
        /**
         * <p>The zone of a node in the RDS three-node cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("Azone")
        public String azone;

        /**
         * <p>The role of a node in the RDS three-node cluster. Valid values:</p>
         * <ul>
         * <li><strong>leader</strong>: primary node</li>
         * <li><strong>follower</strong>: secondary node</li>
         * <li><strong>logger</strong>: logger node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>leader</p>
         */
        @NameInMap("Role")
        public String role;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList setAzone(String azone) {
            this.azone = azone;
            return this;
        }
        public String getAzone() {
            return this.azone;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp extends TeaModel {
        /**
         * <p>The connection information.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xdb-m-pxcdym7g7w********.mysql.singapore.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The internal connection type. The value is fixed to 1, which indicates the classic network.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBInstanceNetType")
        public Integer DBInstanceNetType;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp setDBInstanceNetType(Integer DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public Integer getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems extends TeaModel {
        /**
         * <p>Indicates whether the node is activated. For the compute layer, only the node in the primary zone is activated. After a primary/secondary switchover is performed on the instance, the standby compute node becomes the primary node. All storage layer nodes are activated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Activated")
        public Boolean activated;

        /**
         * <p>The zone of the node. If the node is an RDS node, the zones of multiple child nodes are separated with a delimiter (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("Azone")
        public String azone;

        /**
         * <p>The data information list of the RDS three-node cluster.</p>
         */
        @NameInMap("AzoneRoleList")
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList> azoneRoleList;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>polarx_cn</strong>: compute node.</li>
         * <li><strong>polarx_store</strong>: data node.</li>
         * <li><strong>polarx_gms</strong>: GMS node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>节点角色</p>
         */
        @NameInMap("CharacterType")
        public String characterType;

        /**
         * <p>The data struct.</p>
         */
        @NameInMap("ConnectionIp")
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp> connectionIp;

        /**
         * <p>The connection type.</p>
         * 
         * <strong>example:</strong>
         * <p>不展示</p>
         */
        @NameInMap("DBInstanceConnType")
        public Integer DBInstanceConnType;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-21T10:30:45Z</p>
         */
        @NameInMap("DBInstanceCreateTime")
        public String DBInstanceCreateTime;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>不展示</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>304726049</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-i-tk6t4z****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DBInstanceStatus")
        public Integer DBInstanceStatus;

        /**
         * <p>The description of the instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>不展示</p>
         */
        @NameInMap("DBInstanceStatusDescription")
        public String DBInstanceStatusDescription;

        /**
         * <p>The disk size.</p>
         * 
         * <strong>example:</strong>
         * <p>3145728</p>
         */
        @NameInMap("DiskSize")
        public Long diskSize;

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><strong>mysql</strong></li>
         * <li><strong>polarx_cdc</strong></li>
         * <li><strong>polarx_dn</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The engine version. Default value: 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InstanceClusterName")
        public String instanceClusterName;

        /**
         * <p>Indicates whether the node is locked. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not locked.</li>
         * <li><strong>1</strong>: Locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockMode")
        public Integer lockMode;

        /**
         * <p>The reason why the instance is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>不展示</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The end time of the O&amp;M window.</p>
         * 
         * <strong>example:</strong>
         * <p>不展示</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the O&amp;M window.</p>
         * 
         * <strong>example:</strong>
         * <p>不展示</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The maximum number of connections.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum IOPS.</p>
         * 
         * <strong>example:</strong>
         * <p>7000</p>
         */
        @NameInMap("MaxIops")
        public Integer maxIops;

        /**
         * <p>The node specifications. Valid values:</p>
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
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The physical instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-unrbk8oyz**********</p>
         */
        @NameInMap("PhyInstanceName")
        public String phyInstanceName;

        @NameInMap("ReadType")
        public String readType;

        /**
         * <p>The region of the node. If the node is an RDS node, the regions of multiple child nodes are separated with a delimiter (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The role of the node. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: primary node</li>
         * <li><strong>standby</strong>: secondary node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

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
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage usage, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>16681</p>
         */
        @NameInMap("StorageUsed")
        public String storageUsed;

        /**
         * <p>The logger node version.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-cdc-kernel-2.0.0-3985896</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setActivated(Boolean activated) {
            this.activated = activated;
            return this;
        }
        public Boolean getActivated() {
            return this.activated;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setAzone(String azone) {
            this.azone = azone;
            return this;
        }
        public String getAzone() {
            return this.azone;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setAzoneRoleList(java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList> azoneRoleList) {
            this.azoneRoleList = azoneRoleList;
            return this;
        }
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList> getAzoneRoleList() {
            return this.azoneRoleList;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setCharacterType(String characterType) {
            this.characterType = characterType;
            return this;
        }
        public String getCharacterType() {
            return this.characterType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setConnectionIp(java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp> connectionIp) {
            this.connectionIp = connectionIp;
            return this;
        }
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp> getConnectionIp() {
            return this.connectionIp;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceConnType(Integer DBInstanceConnType) {
            this.DBInstanceConnType = DBInstanceConnType;
            return this;
        }
        public Integer getDBInstanceConnType() {
            return this.DBInstanceConnType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceCreateTime(String DBInstanceCreateTime) {
            this.DBInstanceCreateTime = DBInstanceCreateTime;
            return this;
        }
        public String getDBInstanceCreateTime() {
            return this.DBInstanceCreateTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceStatusDescription(String DBInstanceStatusDescription) {
            this.DBInstanceStatusDescription = DBInstanceStatusDescription;
            return this;
        }
        public String getDBInstanceStatusDescription() {
            return this.DBInstanceStatusDescription;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDiskSize(Long diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Long getDiskSize() {
            return this.diskSize;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setInstanceClusterName(String instanceClusterName) {
            this.instanceClusterName = instanceClusterName;
            return this;
        }
        public String getInstanceClusterName() {
            return this.instanceClusterName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setLockMode(Integer lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public Integer getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setMaxIops(Integer maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Integer getMaxIops() {
            return this.maxIops;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setPhyInstanceName(String phyInstanceName) {
            this.phyInstanceName = phyInstanceName;
            return this;
        }
        public String getPhyInstanceName() {
            return this.phyInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setReadType(String readType) {
            this.readType = readType;
            return this;
        }
        public String getReadType() {
            return this.readType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setStorageUsed(String storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public String getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology extends TeaModel {
        /**
         * <p>Indicates that LVS is used for load balancing.</p>
         * 
         * <strong>example:</strong>
         * <p>lvs</p>
         */
        @NameInMap("DBInstanceConnType")
        public String DBInstanceConnType;

        /**
         * <p>The time when the instance was created. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-21T10:30:45Z 04:00:00</p>
         */
        @NameInMap("DBInstanceCreateTime")
        public String DBInstanceCreateTime;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-sprcym7******</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>304726047</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-sprcym7g7w****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DBInstanceStatus")
        public Integer DBInstanceStatus;

        /**
         * <p>The description of the instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>TDE_MODIFYING</p>
         */
        @NameInMap("DBInstanceStatusDescription")
        public String DBInstanceStatusDescription;

        /**
         * <p>The number of storage nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <p>The engine type. Default value: polarx.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The engine version. Default value: 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The list of historical nodes.</p>
         */
        @NameInMap("HistoryItems")
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems> historyItems;

        /**
         * <p>The list of nodes.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems> items;

        /**
         * <p>The lock status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not locked.</li>
         * <li><strong>1</strong>: Locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockMode")
        public Integer lockMode;

        /**
         * <p>The reason why the instance is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>欠费</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The end time of the O&amp;M window. Format: HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>05:00:00</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the O&amp;M window. Format: HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>04:00:00</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceConnType(String DBInstanceConnType) {
            this.DBInstanceConnType = DBInstanceConnType;
            return this;
        }
        public String getDBInstanceConnType() {
            return this.DBInstanceConnType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceCreateTime(String DBInstanceCreateTime) {
            this.DBInstanceCreateTime = DBInstanceCreateTime;
            return this;
        }
        public String getDBInstanceCreateTime() {
            return this.DBInstanceCreateTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceStatusDescription(String DBInstanceStatusDescription) {
            this.DBInstanceStatusDescription = DBInstanceStatusDescription;
            return this;
        }
        public String getDBInstanceStatusDescription() {
            return this.DBInstanceStatusDescription;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setHistoryItems(java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems> historyItems) {
            this.historyItems = historyItems;
            return this;
        }
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems> getHistoryItems() {
            return this.historyItems;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setItems(java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems> getItems() {
            return this.items;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setLockMode(Integer lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public Integer getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyData extends TeaModel {
        /**
         * <p>The topology information.</p>
         */
        @NameInMap("LogicInstanceTopology")
        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology logicInstanceTopology;

        public static DescribeDBInstanceTopologyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyData self = new DescribeDBInstanceTopologyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyData setLogicInstanceTopology(DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology logicInstanceTopology) {
            this.logicInstanceTopology = logicInstanceTopology;
            return this;
        }
        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology getLogicInstanceTopology() {
            return this.logicInstanceTopology;
        }

    }

}

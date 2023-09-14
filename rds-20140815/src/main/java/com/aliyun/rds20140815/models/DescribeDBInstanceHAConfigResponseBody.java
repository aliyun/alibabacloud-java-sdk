// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceHAConfigResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The high availability mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **RPO**: Data consistency is preferred. The instance ensures data reliability to minimize data losses. If you have high requirements on data consistency, select this mode.</p>
     * <p>*   **RTO**: Service availability is preferred. The instance restores the database service at the earliest opportunity to ensure service availability. If you have high requirements on instance availability, select this mode.</p>
     * <br>
     * <p>> This parameter is returned only for instances that run MySQL.</p>
     */
    @NameInMap("HAMode")
    public String HAMode;

    /**
     * <p>An array that consists of the information of the primary and secondary instances.</p>
     */
    @NameInMap("HostInstanceInfos")
    public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos hostInstanceInfos;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data replication mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **Sync**: the synchronous mode</p>
     * <p>*   **Semi-sync**: the semi-synchronous replication mode</p>
     * <p>*   **Async**: the asynchronous mode</p>
     * <br>
     * <p>> This parameter is returned only for instances that run MySQL.</p>
     */
    @NameInMap("SyncMode")
    public String syncMode;

    public static DescribeDBInstanceHAConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceHAConfigResponseBody self = new DescribeDBInstanceHAConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceHAConfigResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceHAConfigResponseBody setHAMode(String HAMode) {
        this.HAMode = HAMode;
        return this;
    }
    public String getHAMode() {
        return this.HAMode;
    }

    public DescribeDBInstanceHAConfigResponseBody setHostInstanceInfos(DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos hostInstanceInfos) {
        this.hostInstanceInfos = hostInstanceInfos;
        return this;
    }
    public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos getHostInstanceInfos() {
        return this.hostInstanceInfos;
    }

    public DescribeDBInstanceHAConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceHAConfigResponseBody setSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }
    public String getSyncMode() {
        return this.syncMode;
    }

    public static class DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo extends TeaModel {
        /**
         * <p>The time when the secondary instance completed the synchronization of data from the primary instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("DataSyncTime")
        public String dataSyncTime;

        /**
         * <p>The time when the secondary instance received logs from the primary instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("LogSyncTime")
        public String logSyncTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   **Master**: the primary node</p>
         * <p>*   **Slave**: the secondary node</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The synchronization status. Valid values:</p>
         * <br>
         * <p>*   **NotAvailable**: The synchronization fails. This means that faults occur.</p>
         * <p>*   **Syncing**: The synchronization is in process. In this case, a primary/secondary switchover may cause data losses.</p>
         * <p>*   **Synchronized**: The synchronization is completed.</p>
         * <p>*   **NotSupport**: The database engine or database engine version does not involve the synchronization between the primary and secondary instances.</p>
         */
        @NameInMap("SyncStatus")
        public String syncStatus;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo self = new DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setDataSyncTime(String dataSyncTime) {
            this.dataSyncTime = dataSyncTime;
            return this;
        }
        public String getDataSyncTime() {
            return this.dataSyncTime;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setLogSyncTime(String logSyncTime) {
            this.logSyncTime = logSyncTime;
            return this;
        }
        public String getLogSyncTime() {
            return this.logSyncTime;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos extends TeaModel {
        @NameInMap("NodeInfo")
        public java.util.List<DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo> nodeInfo;

        public static DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos self = new DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos setNodeInfo(java.util.List<DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

}

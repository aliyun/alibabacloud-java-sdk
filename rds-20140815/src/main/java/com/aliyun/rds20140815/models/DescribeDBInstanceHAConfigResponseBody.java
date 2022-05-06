// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceHAConfigResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("HAMode")
    public String HAMode;

    @NameInMap("HostInstanceInfos")
    public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos hostInstanceInfos;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DataSyncTime")
        public String dataSyncTime;

        @NameInMap("LogSyncTime")
        public String logSyncTime;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SyncStatus")
        public String syncStatus;

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

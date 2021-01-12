// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceHAConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("SyncMode")
    public String syncMode;

    @NameInMap("HAMode")
    public String HAMode;

    @NameInMap("HostInstanceInfos")
    public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfos hostInstanceInfos;

    public static DescribeDBInstanceHAConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceHAConfigResponseBody self = new DescribeDBInstanceHAConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceHAConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceHAConfigResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceHAConfigResponseBody setSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }
    public String getSyncMode() {
        return this.syncMode;
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

    public static class DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("LogSyncTime")
        public String logSyncTime;

        @NameInMap("DataSyncTime")
        public String dataSyncTime;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("SyncStatus")
        public String syncStatus;

        public static DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo self = new DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setLogSyncTime(String logSyncTime) {
            this.logSyncTime = logSyncTime;
            return this;
        }
        public String getLogSyncTime() {
            return this.logSyncTime;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setDataSyncTime(String dataSyncTime) {
            this.dataSyncTime = dataSyncTime;
            return this;
        }
        public String getDataSyncTime() {
            return this.dataSyncTime;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstanceHAConfigResponseBodyHostInstanceInfosNodeInfo setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
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

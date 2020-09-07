// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceHAConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("SyncMode")
    @Validation(required = true)
    public String syncMode;

    @NameInMap("HAMode")
    @Validation(required = true)
    public String HAMode;

    @NameInMap("HostInstanceInfos")
    @Validation(required = true)
    public DescribeDBInstanceHAConfigResponseHostInstanceInfos hostInstanceInfos;

    public static DescribeDBInstanceHAConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceHAConfigResponse self = new DescribeDBInstanceHAConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceHAConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceHAConfigResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceHAConfigResponse setSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }
    public String getSyncMode() {
        return this.syncMode;
    }

    public DescribeDBInstanceHAConfigResponse setHAMode(String HAMode) {
        this.HAMode = HAMode;
        return this;
    }
    public String getHAMode() {
        return this.HAMode;
    }

    public DescribeDBInstanceHAConfigResponse setHostInstanceInfos(DescribeDBInstanceHAConfigResponseHostInstanceInfos hostInstanceInfos) {
        this.hostInstanceInfos = hostInstanceInfos;
        return this;
    }
    public DescribeDBInstanceHAConfigResponseHostInstanceInfos getHostInstanceInfos() {
        return this.hostInstanceInfos;
    }

    public static class DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public String nodeId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("LogSyncTime")
        @Validation(required = true)
        public String logSyncTime;

        @NameInMap("DataSyncTime")
        @Validation(required = true)
        public String dataSyncTime;

        @NameInMap("NodeType")
        @Validation(required = true)
        public String nodeType;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("SyncStatus")
        @Validation(required = true)
        public String syncStatus;

        public static DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo self = new DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo setLogSyncTime(String logSyncTime) {
            this.logSyncTime = logSyncTime;
            return this;
        }
        public String getLogSyncTime() {
            return this.logSyncTime;
        }

        public DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo setDataSyncTime(String dataSyncTime) {
            this.dataSyncTime = dataSyncTime;
            return this;
        }
        public String getDataSyncTime() {
            return this.dataSyncTime;
        }

        public DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

    }

    public static class DescribeDBInstanceHAConfigResponseHostInstanceInfos extends TeaModel {
        @NameInMap("NodeInfo")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo> nodeInfo;

        public static DescribeDBInstanceHAConfigResponseHostInstanceInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceHAConfigResponseHostInstanceInfos self = new DescribeDBInstanceHAConfigResponseHostInstanceInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceHAConfigResponseHostInstanceInfos setNodeInfo(java.util.List<DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

    }

}

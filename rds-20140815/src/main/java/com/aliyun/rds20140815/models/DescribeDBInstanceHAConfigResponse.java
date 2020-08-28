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

    }

    public static class DescribeDBInstanceHAConfigResponseHostInstanceInfos extends TeaModel {
        @NameInMap("NodeInfo")
        @Validation(required = true)
        public java.util.List<DescribeDBInstanceHAConfigResponseHostInstanceInfosNodeInfo> nodeInfo;

        public static DescribeDBInstanceHAConfigResponseHostInstanceInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceHAConfigResponseHostInstanceInfos self = new DescribeDBInstanceHAConfigResponseHostInstanceInfos();
            return TeaModel.build(map, self);
        }

    }

}

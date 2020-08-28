// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("FlowLogs")
    @Validation(required = true)
    public DescribeFlowLogsResponseFlowLogs flowLogs;

    public static DescribeFlowLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogsResponse self = new DescribeFlowLogsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeFlowLogsResponseFlowLogsFlowLog extends TeaModel {
        @NameInMap("FlowLogId")
        @Validation(required = true)
        public String flowLogId;

        @NameInMap("FlowLogName")
        @Validation(required = true)
        public String flowLogName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("LogStoreName")
        @Validation(required = true)
        public String logStoreName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("TrafficType")
        @Validation(required = true)
        public String trafficType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static DescribeFlowLogsResponseFlowLogsFlowLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseFlowLogsFlowLog self = new DescribeFlowLogsResponseFlowLogsFlowLog();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeFlowLogsResponseFlowLogs extends TeaModel {
        @NameInMap("FlowLog")
        @Validation(required = true)
        public java.util.List<DescribeFlowLogsResponseFlowLogsFlowLog> flowLog;

        public static DescribeFlowLogsResponseFlowLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseFlowLogs self = new DescribeFlowLogsResponseFlowLogs();
            return TeaModel.build(map, self);
        }

    }

}

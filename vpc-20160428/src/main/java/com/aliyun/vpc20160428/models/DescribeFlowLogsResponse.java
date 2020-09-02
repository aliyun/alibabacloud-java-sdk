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

    public DescribeFlowLogsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowLogsResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeFlowLogsResponse setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeFlowLogsResponse setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFlowLogsResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowLogsResponse setFlowLogs(DescribeFlowLogsResponseFlowLogs flowLogs) {
        this.flowLogs = flowLogs;
        return this;
    }
    public DescribeFlowLogsResponseFlowLogs getFlowLogs() {
        return this.flowLogs;
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

        public DescribeFlowLogsResponseFlowLogsFlowLog setFlowLogId(String flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }
        public String getFlowLogId() {
            return this.flowLogId;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setFlowLogName(String flowLogName) {
            this.flowLogName = flowLogName;
            return this;
        }
        public String getFlowLogName() {
            return this.flowLogName;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setTrafficType(String trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public String getTrafficType() {
            return this.trafficType;
        }

        public DescribeFlowLogsResponseFlowLogsFlowLog setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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

        public DescribeFlowLogsResponseFlowLogs setFlowLog(java.util.List<DescribeFlowLogsResponseFlowLogsFlowLog> flowLog) {
            this.flowLog = flowLog;
            return this;
        }
        public java.util.List<DescribeFlowLogsResponseFlowLogsFlowLog> getFlowLog() {
            return this.flowLog;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("FlowLogs")
    public DescribeFlowLogsResponseBodyFlowLogs flowLogs;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeFlowLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogsResponseBody self = new DescribeFlowLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFlowLogsResponseBody setFlowLogs(DescribeFlowLogsResponseBodyFlowLogs flowLogs) {
        this.flowLogs = flowLogs;
        return this;
    }
    public DescribeFlowLogsResponseBodyFlowLogs getFlowLogs() {
        return this.flowLogs;
    }

    public DescribeFlowLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TotalSagNum")
        public Integer totalSagNum;

        @NameInMap("NetflowServerIp")
        public String netflowServerIp;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("SlsRegionId")
        public String slsRegionId;

        @NameInMap("ActiveAging")
        public Integer activeAging;

        @NameInMap("OutputType")
        public String outputType;

        @NameInMap("Description")
        public String description;

        @NameInMap("NetflowVersion")
        public String netflowVersion;

        @NameInMap("InactiveAging")
        public Integer inactiveAging;

        @NameInMap("NetflowServerPort")
        public String netflowServerPort;

        @NameInMap("Name")
        public String name;

        @NameInMap("FlowLogId")
        public String flowLogId;

        @NameInMap("LogstoreName")
        public String logstoreName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType self = new DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setTotalSagNum(Integer totalSagNum) {
            this.totalSagNum = totalSagNum;
            return this;
        }
        public Integer getTotalSagNum() {
            return this.totalSagNum;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setNetflowServerIp(String netflowServerIp) {
            this.netflowServerIp = netflowServerIp;
            return this;
        }
        public String getNetflowServerIp() {
            return this.netflowServerIp;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setSlsRegionId(String slsRegionId) {
            this.slsRegionId = slsRegionId;
            return this;
        }
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setActiveAging(Integer activeAging) {
            this.activeAging = activeAging;
            return this;
        }
        public Integer getActiveAging() {
            return this.activeAging;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setOutputType(String outputType) {
            this.outputType = outputType;
            return this;
        }
        public String getOutputType() {
            return this.outputType;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setNetflowVersion(String netflowVersion) {
            this.netflowVersion = netflowVersion;
            return this;
        }
        public String getNetflowVersion() {
            return this.netflowVersion;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setInactiveAging(Integer inactiveAging) {
            this.inactiveAging = inactiveAging;
            return this;
        }
        public Integer getInactiveAging() {
            return this.inactiveAging;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setNetflowServerPort(String netflowServerPort) {
            this.netflowServerPort = netflowServerPort;
            return this;
        }
        public String getNetflowServerPort() {
            return this.netflowServerPort;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setFlowLogId(String flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }
        public String getFlowLogId() {
            return this.flowLogId;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class DescribeFlowLogsResponseBodyFlowLogs extends TeaModel {
        @NameInMap("FlowLogSetType")
        public java.util.List<DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType> flowLogSetType;

        public static DescribeFlowLogsResponseBodyFlowLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseBodyFlowLogs self = new DescribeFlowLogsResponseBodyFlowLogs();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsResponseBodyFlowLogs setFlowLogSetType(java.util.List<DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType> flowLogSetType) {
            this.flowLogSetType = flowLogSetType;
            return this;
        }
        public java.util.List<DescribeFlowLogsResponseBodyFlowLogsFlowLogSetType> getFlowLogSetType() {
            return this.flowLogSetType;
        }

    }

}

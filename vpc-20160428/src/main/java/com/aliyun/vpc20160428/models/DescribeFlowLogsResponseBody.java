// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsResponseBody extends TeaModel {
    /**
     * <p>The information about the flow logs.</p>
     */
    @NameInMap("FlowLogs")
    public DescribeFlowLogsResponseBodyFlowLogs flowLogs;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The number of flow logs that are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeFlowLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogsResponseBody self = new DescribeFlowLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowLogsResponseBody setFlowLogs(DescribeFlowLogsResponseBodyFlowLogs flowLogs) {
        this.flowLogs = flowLogs;
        return this;
    }
    public DescribeFlowLogsResponseBodyFlowLogs getFlowLogs() {
        return this.flowLogs;
    }

    public DescribeFlowLogsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFlowLogsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowLogsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeFlowLogsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFlowLogsResponseBodyFlowLogsFlowLogTagsTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFlowLogsResponseBodyFlowLogsFlowLogTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseBodyFlowLogsFlowLogTagsTag self = new DescribeFlowLogsResponseBodyFlowLogsFlowLogTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeFlowLogsResponseBodyFlowLogsFlowLogTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeFlowLogsResponseBodyFlowLogsFlowLogTagsTag> tag;

        public static DescribeFlowLogsResponseBodyFlowLogsFlowLogTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseBodyFlowLogsFlowLogTags self = new DescribeFlowLogsResponseBodyFlowLogsFlowLogTags();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTags setTag(java.util.List<DescribeFlowLogsResponseBodyFlowLogsFlowLogTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeFlowLogsResponseBodyFlowLogsFlowLogTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeFlowLogsResponseBodyFlowLogsFlowLogTrafficPath extends TeaModel {
        @NameInMap("TrafficPathList")
        public java.util.List<String> trafficPathList;

        public static DescribeFlowLogsResponseBodyFlowLogsFlowLogTrafficPath build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseBodyFlowLogsFlowLogTrafficPath self = new DescribeFlowLogsResponseBodyFlowLogsFlowLogTrafficPath();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTrafficPath setTrafficPathList(java.util.List<String> trafficPathList) {
            this.trafficPathList = trafficPathList;
            return this;
        }
        public java.util.List<String> getTrafficPathList() {
            return this.trafficPathList;
        }

    }

    public static class DescribeFlowLogsResponseBodyFlowLogsFlowLog extends TeaModel {
        /**
         * <p>The sampling interval of the flow log. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AggregationInterval")
        public Integer aggregationInterval;

        /**
         * <p>The business status of the flow log. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The time when the flow log was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-21T03:08:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>If the flow log failed to be delivered, you can troubleshoot based on the following error messages that may be returned:</p>
         * <ul>
         * <li><strong>UnavaliableTarget</strong>: The Logstore of SLS is unavailable and cannot receive logs. Check whether the Logstore is available.</li>
         * <li><strong>ProjectNotExist</strong>: The project of SLS does not exist. We recommend that you delete the project and create a new one.</li>
         * <li><strong>UnknownError</strong>: An internal error occurred. Try again later.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UnavaliableTarget</p>
         */
        @NameInMap("FlowLogDeliverErrorMessage")
        public String flowLogDeliverErrorMessage;

        /**
         * <p>Indicates whether the flow log is delivered. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong> </li>
         * <li><strong>FAILED</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("FlowLogDeliverStatus")
        public String flowLogDeliverStatus;

        /**
         * <p>The ID of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>fl-bp1f6qqhsrc2c12ta****</p>
         */
        @NameInMap("FlowLogId")
        public String flowLogId;

        /**
         * <p>The name of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        @NameInMap("FlowLogName")
        public String flowLogName;

        /**
         * <p>The Logstore that stores the captured traffic data.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogStore</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The project that manages the captured traffic data.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogProject</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The region ID of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the flow log belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the resource from which traffic is captured.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-askldfas****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource from which traffic is captured. Valid values:</p>
         * <ul>
         * <li><strong>NetworkInterface</strong>: ENI</li>
         * <li><strong>VSwitch</strong>: all ENIs in a vSwitch</li>
         * <li><strong>VPC</strong>: all ENIs in a VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NetworkInterface</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The hosting type of the cloud service.</p>
         * <ul>
         * <li>This parameter can be empty, which indicates that the flow log is created by the user.</li>
         * <li>If this parameter is not empty, the value is set to <strong>sls</strong>. The value sls indicates that the flow log is created in the Simple Log Service (SLS) console.</li>
         * </ul>
         * <blockquote>
         * <p>A flow log that is created in the SLS console can be displayed in the VPC list. However, you cannot modify, start, stop, or delete the flow log in the VPC console. If you want to manage the flow log, you can log on to the <a href="https://sls.console.aliyun.com">SLS console</a> and perform required operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The status of the flow log. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong></li>
         * <li><strong>Activating</strong></li>
         * <li><strong>Inactive</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTags tags;

        /**
         * <p>The sampling scope of the traffic that is collected. Valid values:</p>
         * <ul>
         * <li><strong>all</strong> (default value): all traffic</li>
         * <li><strong>internetGateway</strong>: Internet traffic</li>
         * </ul>
         * <blockquote>
         * <p>By default, the traffic path feature is unavailable. To use this feature, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex">submit a ticket</a>.</p>
         * </blockquote>
         */
        @NameInMap("TrafficPath")
        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTrafficPath trafficPath;

        /**
         * <p>The type of traffic that is captured by the flow log. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: all traffic</li>
         * <li><strong>Allow</strong>: traffic that is allowed by access control</li>
         * <li><strong>Drop</strong>: traffic that is denied by access control</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("TrafficType")
        public String trafficType;

        public static DescribeFlowLogsResponseBodyFlowLogsFlowLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseBodyFlowLogsFlowLog self = new DescribeFlowLogsResponseBodyFlowLogsFlowLog();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setAggregationInterval(Integer aggregationInterval) {
            this.aggregationInterval = aggregationInterval;
            return this;
        }
        public Integer getAggregationInterval() {
            return this.aggregationInterval;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setFlowLogDeliverErrorMessage(String flowLogDeliverErrorMessage) {
            this.flowLogDeliverErrorMessage = flowLogDeliverErrorMessage;
            return this;
        }
        public String getFlowLogDeliverErrorMessage() {
            return this.flowLogDeliverErrorMessage;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setFlowLogDeliverStatus(String flowLogDeliverStatus) {
            this.flowLogDeliverStatus = flowLogDeliverStatus;
            return this;
        }
        public String getFlowLogDeliverStatus() {
            return this.flowLogDeliverStatus;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setFlowLogId(String flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }
        public String getFlowLogId() {
            return this.flowLogId;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setFlowLogName(String flowLogName) {
            this.flowLogName = flowLogName;
            return this;
        }
        public String getFlowLogName() {
            return this.flowLogName;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setTags(DescribeFlowLogsResponseBodyFlowLogsFlowLogTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTags getTags() {
            return this.tags;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setTrafficPath(DescribeFlowLogsResponseBodyFlowLogsFlowLogTrafficPath trafficPath) {
            this.trafficPath = trafficPath;
            return this;
        }
        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTrafficPath getTrafficPath() {
            return this.trafficPath;
        }

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setTrafficType(String trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public String getTrafficType() {
            return this.trafficType;
        }

    }

    public static class DescribeFlowLogsResponseBodyFlowLogs extends TeaModel {
        @NameInMap("FlowLog")
        public java.util.List<DescribeFlowLogsResponseBodyFlowLogsFlowLog> flowLog;

        public static DescribeFlowLogsResponseBodyFlowLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseBodyFlowLogs self = new DescribeFlowLogsResponseBodyFlowLogs();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsResponseBodyFlowLogs setFlowLog(java.util.List<DescribeFlowLogsResponseBodyFlowLogsFlowLog> flowLog) {
            this.flowLog = flowLog;
            return this;
        }
        public java.util.List<DescribeFlowLogsResponseBodyFlowLogsFlowLog> getFlowLog() {
            return this.flowLog;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsResponseBody extends TeaModel {
    /**
     * <p>List of flow logs.</p>
     */
    @NameInMap("FlowLogs")
    public DescribeFlowLogsResponseBodyFlowLogs flowLogs;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of items per page in a paginated query.</p>
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
     * <p>Indicates whether the call was successful. Values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The number of entries in the queried flow log list.</p>
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
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value.</p>
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
         * <p>The business status. Values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal status.</li>
         * <li><strong>FinancialLocked</strong>: Locked due to unpaid bills.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The creation time of the flow log.</p>
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
         * <p>When log delivery fails, you can troubleshoot based on the error messages. Possible error messages include:</p>
         * <ul>
         * <li><strong>UnavaliableTarget</strong>: The Logstore of the Log Service SLS is unavailable and cannot receive logs. It is recommended to check if the corresponding Logstore actually exists and is accessible. </li>
         * <li><strong>ProjectNotExist</strong>: The Project of the Log Service SLS does not exist. It is suggested to delete the original flow log and create a new one pointing to an existing Project. </li>
         * <li><strong>UnknownError</strong>: An internal error has occurred. Please try again later.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UnavaliableTarget</p>
         */
        @NameInMap("FlowLogDeliverErrorMessage")
        public String flowLogDeliverErrorMessage;

        /**
         * <p>The delivery status of the flow log, with values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong>: Delivery succeeded. </li>
         * <li><strong>FAILED</strong>: Delivery failed.</li>
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
         * <p>The type of IP address for collecting flow log traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The Logstore where the captured traffic is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogStore</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The Project that manages the captured traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogProject</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The region ID to which the flow log belongs.</p>
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
         * <p>The resource ID of the traffic captured by the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-askldfas****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type of the traffic captured by the flow log:</p>
         * <ul>
         * <li><strong>NetworkInterface</strong>: Elastic network interface.</li>
         * <li><strong>VSwitch</strong>: All elastic network interfaces within a VSwitch.</li>
         * <li><strong>VPC</strong>: All elastic network interfaces within a VPC.</li>
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
         * <li>It can be empty, indicating that the flow log was created by the user. </li>
         * <li>When not empty, the only supported value is: <strong>sls</strong>, indicating that the flow log was created through the Log Service console.<blockquote>
         * <p>Flow log instances created through the Log Service console can be displayed in the VPC list, but they cannot be modified, started, stopped, or deleted within the VPC. If you need to perform these operations on the flow log, you can log in to the <a href="https://sls.console.aliyun.com">Log Service console</a> to modify, start, stop, or delete it.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The status of the flow log. Values:</p>
         * <ul>
         * <li><p><strong>Active</strong>: The flow log is in an active state.</p>
         * </li>
         * <li><p><strong>Activating</strong>: The flow log is being created.</p>
         * </li>
         * <li><p><strong>Inactive</strong>: The flow log is in an inactive state.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>List of tags</p>
         */
        @NameInMap("Tags")
        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTags tags;

        /**
         * <p>The path of the captured traffic. Values:</p>
         * <ul>
         * <li><strong>all</strong>: Indicates full collection.</li>
         * <li><strong>internetGateway</strong>: Indicates public network traffic collection.</li>
         * </ul>
         */
        @NameInMap("TrafficPath")
        public DescribeFlowLogsResponseBodyFlowLogsFlowLogTrafficPath trafficPath;

        /**
         * <p>The type of traffic captured by the flow log. Values:</p>
         * <ul>
         * <li><strong>All</strong>: All traffic.</li>
         * <li><strong>Allow</strong>: Traffic allowed by access control.</li>
         * <li><strong>Drop</strong>: Traffic denied by access control.</li>
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

        public DescribeFlowLogsResponseBodyFlowLogsFlowLog setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
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

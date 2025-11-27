// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCCloudAssistantStatusResponseBody extends TeaModel {
    /**
     * <p>Details about the installation status of Cloud Assistant on the instances.</p>
     */
    @NameInMap("InstanceCloudAssistantStatusSet")
    public java.util.List<DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet> instanceCloudAssistantStatusSet;

    /**
     * <p>The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0688F1D2-CDA8-5617-A43C-ADAC61D80D43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRCCloudAssistantStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCCloudAssistantStatusResponseBody self = new DescribeRCCloudAssistantStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCCloudAssistantStatusResponseBody setInstanceCloudAssistantStatusSet(java.util.List<DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet> instanceCloudAssistantStatusSet) {
        this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
        return this;
    }
    public java.util.List<DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet> getInstanceCloudAssistantStatusSet() {
        return this.instanceCloudAssistantStatusSet;
    }

    public DescribeRCCloudAssistantStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRCCloudAssistantStatusResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCCloudAssistantStatusResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeRCCloudAssistantStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCCloudAssistantStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet extends TeaModel {
        /**
         * <p>The number of tasks that Cloud Assistant was running on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveTaskCount")
        public Integer activeTaskCount;

        /**
         * <p>Indicates whether Cloud Assistant is running on the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Heartbeats are detected in the last 2 minutes.</li>
         * <li><strong>false</strong>: No heartbeat is detected in the last 2 minutes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CloudAssistantStatus")
        public String cloudAssistantStatus;

        /**
         * <p>The version number of Cloud Assistant Agent. This parameter is empty if Cloud Assistant Agent is not installed or is not running on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.0.106</p>
         */
        @NameInMap("CloudAssistantVersion")
        public String cloudAssistantVersion;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-e2g521l55k038cr8****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of tasks that Cloud Assistant completed on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InvocationCount")
        public Integer invocationCount;

        /**
         * <p>The last heartbeat time of Cloud Assistant. The value is updated every minute on average. The interval can be 55, 60, or 65 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-15T09:00:00Z</p>
         */
        @NameInMap("LastHeartbeatTime")
        public String lastHeartbeatTime;

        /**
         * <p>The time when commands were last run.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-15T09:00:00Z</p>
         */
        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        /**
         * <p>The operating system type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>Indicates whether Cloud Assistant supports Session Manager on the instance. If Session Manager is not supported, the version of Cloud Assistant Agent is outdated. Update Cloud Assistant Agent to the latest version.</p>
         * <p>To support Session Manager, the version of Cloud Assistant Agent cannot be earlier than 2.2.3.189.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportSessionManager")
        public Boolean supportSessionManager;

        public static DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet self = new DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setActiveTaskCount(Integer activeTaskCount) {
            this.activeTaskCount = activeTaskCount;
            return this;
        }
        public Integer getActiveTaskCount() {
            return this.activeTaskCount;
        }

        public DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setCloudAssistantStatus(String cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        public DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setCloudAssistantVersion(String cloudAssistantVersion) {
            this.cloudAssistantVersion = cloudAssistantVersion;
            return this;
        }
        public String getCloudAssistantVersion() {
            return this.cloudAssistantVersion;
        }

        public DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setInvocationCount(Integer invocationCount) {
            this.invocationCount = invocationCount;
            return this;
        }
        public Integer getInvocationCount() {
            return this.invocationCount;
        }

        public DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setLastHeartbeatTime(String lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }
        public String getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        public DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setLastInvokedTime(String lastInvokedTime) {
            this.lastInvokedTime = lastInvokedTime;
            return this;
        }
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        public DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setSupportSessionManager(Boolean supportSessionManager) {
            this.supportSessionManager = supportSessionManager;
            return this;
        }
        public Boolean getSupportSessionManager() {
            return this.supportSessionManager;
        }

    }

}

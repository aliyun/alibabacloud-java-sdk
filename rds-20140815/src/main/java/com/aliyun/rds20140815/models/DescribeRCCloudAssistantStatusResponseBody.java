// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCCloudAssistantStatusResponseBody extends TeaModel {
    @NameInMap("InstanceCloudAssistantStatusSet")
    public java.util.List<DescribeRCCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet> instanceCloudAssistantStatusSet;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>0688F1D2-CDA8-5617-A43C-ADAC61D80D43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveTaskCount")
        public Integer activeTaskCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CloudAssistantStatus")
        public String cloudAssistantStatus;

        /**
         * <strong>example:</strong>
         * <p>2.2.0.106</p>
         */
        @NameInMap("CloudAssistantVersion")
        public String cloudAssistantVersion;

        /**
         * <strong>example:</strong>
         * <p>rc-e2g521l55k038cr8****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InvocationCount")
        public Integer invocationCount;

        /**
         * <strong>example:</strong>
         * <p>2025-03-15T09:00:00Z</p>
         */
        @NameInMap("LastHeartbeatTime")
        public String lastHeartbeatTime;

        /**
         * <strong>example:</strong>
         * <p>2025-03-15T09:00:00Z</p>
         */
        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        /**
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
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

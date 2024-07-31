// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantAttributesResponseBody extends TeaModel {
    /**
     * <p>The Command Assistant information.</p>
     */
    @NameInMap("CloudAssistant")
    public java.util.List<DescribeCloudAssistantAttributesResponseBodyCloudAssistant> cloudAssistant;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCloudAssistantAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantAttributesResponseBody self = new DescribeCloudAssistantAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantAttributesResponseBody setCloudAssistant(java.util.List<DescribeCloudAssistantAttributesResponseBodyCloudAssistant> cloudAssistant) {
        this.cloudAssistant = cloudAssistant;
        return this;
    }
    public java.util.List<DescribeCloudAssistantAttributesResponseBodyCloudAssistant> getCloudAssistant() {
        return this.cloudAssistant;
    }

    public DescribeCloudAssistantAttributesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudAssistantAttributesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudAssistantAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudAssistantAttributesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCloudAssistantAttributesResponseBodyCloudAssistant extends TeaModel {
        /**
         * <p>The number of active tasks in Command Assistant.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveTaskCount")
        public Long activeTaskCount;

        /**
         * <p>Indicates whether Command Assistant is running. Valid values:</p>
         * <p>true: Heartbeats are detected in the last 2 minutes.</p>
         * <p>false: Heartbeats are not detected in the last 2 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CloudAssistantStatus")
        public String cloudAssistantStatus;

        /**
         * <p>The version number of the Command Assistant agent. Null is returned if the Command Assistant agent is not installed or is not running.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.0.106</p>
         */
        @NameInMap("CloudAssistantVersion")
        public String cloudAssistantVersion;

        /**
         * <p>The ID of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>85dbe3e7cc7b49e1a3df4af3bfa4ebbf</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of completed tasks in Command Assistant.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("InvocationCount")
        public Long invocationCount;

        /**
         * <p>The time when the last heartbeat of Command Assistant was detected. The value is updated every minute on average. The interval can be 55, 60, or 65 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15T09:00:00Z</p>
         */
        @NameInMap("LastHeartbeatTime")
        public String lastHeartbeatTime;

        /**
         * <p>The time when commands were last run.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15T08:00:00Z</p>
         */
        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        /**
         * <p>The OS type of the simple application server. Valid values:</p>
         * <ul>
         * <li>Windows</li>
         * <li>Linux</li>
         * <li>FreeBSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>Indicates whether Command Assistant supports session management. If Command Assistant does not support session management, the version of the Command Assistant agent is too earlier. We recommend that you update your Command Assistant agent to the latest version.</p>
         * <p>To use the session management feature, you must make sure that the version of your Command Assistant agent meets one of the following requirements:</p>
         * <p>If your simple application server runs Linux, the version of the Command Assistant agent on the server must be 2.2.3.189 or later. If your simple application server runs Windows, the version of the Command Assistant agent on the server must be 2.1.3.189 or later.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportSessionManager")
        public Boolean supportSessionManager;

        public static DescribeCloudAssistantAttributesResponseBodyCloudAssistant build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantAttributesResponseBodyCloudAssistant self = new DescribeCloudAssistantAttributesResponseBodyCloudAssistant();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantAttributesResponseBodyCloudAssistant setActiveTaskCount(Long activeTaskCount) {
            this.activeTaskCount = activeTaskCount;
            return this;
        }
        public Long getActiveTaskCount() {
            return this.activeTaskCount;
        }

        public DescribeCloudAssistantAttributesResponseBodyCloudAssistant setCloudAssistantStatus(String cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        public DescribeCloudAssistantAttributesResponseBodyCloudAssistant setCloudAssistantVersion(String cloudAssistantVersion) {
            this.cloudAssistantVersion = cloudAssistantVersion;
            return this;
        }
        public String getCloudAssistantVersion() {
            return this.cloudAssistantVersion;
        }

        public DescribeCloudAssistantAttributesResponseBodyCloudAssistant setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudAssistantAttributesResponseBodyCloudAssistant setInvocationCount(Long invocationCount) {
            this.invocationCount = invocationCount;
            return this;
        }
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        public DescribeCloudAssistantAttributesResponseBodyCloudAssistant setLastHeartbeatTime(String lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }
        public String getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        public DescribeCloudAssistantAttributesResponseBodyCloudAssistant setLastInvokedTime(String lastInvokedTime) {
            this.lastInvokedTime = lastInvokedTime;
            return this;
        }
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        public DescribeCloudAssistantAttributesResponseBodyCloudAssistant setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeCloudAssistantAttributesResponseBodyCloudAssistant setSupportSessionManager(Boolean supportSessionManager) {
            this.supportSessionManager = supportSessionManager;
            return this;
        }
        public Boolean getSupportSessionManager() {
            return this.supportSessionManager;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListDisasterRecoveryCheckpointsResponseBody extends TeaModel {
    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response Data</p>
     */
    @NameInMap("data")
    public ListDisasterRecoveryCheckpointsResponseBodyData data;

    /**
     * <p>Dynamic error code</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>The instance cannot be found.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AF9A8B10-C426-530F-A0DD-96320B39****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListDisasterRecoveryCheckpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDisasterRecoveryCheckpointsResponseBody self = new ListDisasterRecoveryCheckpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDisasterRecoveryCheckpointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDisasterRecoveryCheckpointsResponseBody setData(ListDisasterRecoveryCheckpointsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDisasterRecoveryCheckpointsResponseBodyData getData() {
        return this.data;
    }

    public ListDisasterRecoveryCheckpointsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListDisasterRecoveryCheckpointsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListDisasterRecoveryCheckpointsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDisasterRecoveryCheckpointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDisasterRecoveryCheckpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDisasterRecoveryCheckpointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgressProgressData extends TeaModel {
        /**
         * <p>Latest consumption time</p>
         * 
         * <strong>example:</strong>
         * <p>1740724080343</p>
         */
        @NameInMap("consumeTimestamp")
        public Long consumeTimestamp;

        public static ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgressProgressData build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgressProgressData self = new ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgressProgressData();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgressProgressData setConsumeTimestamp(Long consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public Long getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

    }

    public static class ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress extends TeaModel {
        /**
         * <p>Consumer Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>GID_TEST</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-3mp3vblzxxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Instance type</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
         * <li>EXTERNAL_ROCKETMQ: External instance, open-source instance, open-source cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_ROCKETMQ</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>Last fetch time</p>
         * 
         * <strong>example:</strong>
         * <p>1740724080343</p>
         */
        @NameInMap("lastFetchTime")
        public Long lastFetchTime;

        /**
         * <p>Consumption progress data</p>
         */
        @NameInMap("progressData")
        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgressProgressData progressData;

        /**
         * <p>Region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>TOPIC_TEST</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress self = new ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress setLastFetchTime(Long lastFetchTime) {
            this.lastFetchTime = lastFetchTime;
            return this;
        }
        public Long getLastFetchTime() {
            return this.lastFetchTime;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress setProgressData(ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgressProgressData progressData) {
            this.progressData = progressData;
            return this;
        }
        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgressProgressData getProgressData() {
            return this.progressData;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgressProgressData extends TeaModel {
        /**
         * <p>Latest consumption time</p>
         * 
         * <strong>example:</strong>
         * <p>1740724080343</p>
         */
        @NameInMap("consumeTimestamp")
        public Long consumeTimestamp;

        public static ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgressProgressData build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgressProgressData self = new ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgressProgressData();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgressProgressData setConsumeTimestamp(Long consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public Long getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

    }

    public static class ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress extends TeaModel {
        /**
         * <p>Consumer group ID</p>
         * 
         * <strong>example:</strong>
         * <p>GID_TEST</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-nwy3i065xxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Instance type</p>
         * <ul>
         * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
         * <li>EXTERNAL_ROCKETMQ: External instance, open-source instance, open-source cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_ROCKETMQ</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>Latest fetch time</p>
         * 
         * <strong>example:</strong>
         * <p>1740724080343</p>
         */
        @NameInMap("lastFetchTime")
        public Long lastFetchTime;

        /**
         * <p>Consumption progress data</p>
         */
        @NameInMap("progressData")
        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgressProgressData progressData;

        /**
         * <p>Region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Topic name</p>
         * 
         * <strong>example:</strong>
         * <p>TOPIC_TEST</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress self = new ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress setLastFetchTime(Long lastFetchTime) {
            this.lastFetchTime = lastFetchTime;
            return this;
        }
        public Long getLastFetchTime() {
            return this.lastFetchTime;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress setProgressData(ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgressProgressData progressData) {
            this.progressData = progressData;
            return this;
        }
        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgressProgressData getProgressData() {
            return this.progressData;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class ListDisasterRecoveryCheckpointsResponseBodyDataList extends TeaModel {
        /**
         * <p>Consumption Progress ID</p>
         * 
         * <strong>example:</strong>
         * <p>10000000xx</p>
         */
        @NameInMap("checkpointId")
        public Long checkpointId;

        /**
         * <p>Backup Mapping ID</p>
         * 
         * <strong>example:</strong>
         * <p>10000000xx</p>
         */
        @NameInMap("itemId")
        public Long itemId;

        /**
         * <p>Last synchronization time</p>
         * 
         * <strong>example:</strong>
         * <p>1740724080343</p>
         */
        @NameInMap("lastSyncTime")
        public Long lastSyncTime;

        /**
         * <p>Backup Plan ID</p>
         * 
         * <strong>example:</strong>
         * <p>13000000xx</p>
         */
        @NameInMap("planId")
        public Long planId;

        /**
         * <p>Source consumption progress</p>
         */
        @NameInMap("sourceProgress")
        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress sourceProgress;

        /**
         * <p>Target consumption progress</p>
         */
        @NameInMap("targetProgress")
        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress targetProgress;

        public static ListDisasterRecoveryCheckpointsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryCheckpointsResponseBodyDataList self = new ListDisasterRecoveryCheckpointsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataList setCheckpointId(Long checkpointId) {
            this.checkpointId = checkpointId;
            return this;
        }
        public Long getCheckpointId() {
            return this.checkpointId;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataList setLastSyncTime(Long lastSyncTime) {
            this.lastSyncTime = lastSyncTime;
            return this;
        }
        public Long getLastSyncTime() {
            return this.lastSyncTime;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataList setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataList setSourceProgress(ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress sourceProgress) {
            this.sourceProgress = sourceProgress;
            return this;
        }
        public ListDisasterRecoveryCheckpointsResponseBodyDataListSourceProgress getSourceProgress() {
            return this.sourceProgress;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyDataList setTargetProgress(ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress targetProgress) {
            this.targetProgress = targetProgress;
            return this;
        }
        public ListDisasterRecoveryCheckpointsResponseBodyDataListTargetProgress getTargetProgress() {
            return this.targetProgress;
        }

    }

    public static class ListDisasterRecoveryCheckpointsResponseBodyData extends TeaModel {
        /**
         * <p>Paged data</p>
         */
        @NameInMap("list")
        public java.util.List<ListDisasterRecoveryCheckpointsResponseBodyDataList> list;

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>Total number of records</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListDisasterRecoveryCheckpointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryCheckpointsResponseBodyData self = new ListDisasterRecoveryCheckpointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryCheckpointsResponseBodyData setList(java.util.List<ListDisasterRecoveryCheckpointsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDisasterRecoveryCheckpointsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDisasterRecoveryCheckpointsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

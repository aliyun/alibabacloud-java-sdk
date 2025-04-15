// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListDisasterRecoveryItemsResponseBody extends TeaModel {
    /**
     * <p>Access denied details, provided only when access is denied due to lack of RAM permissions</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Return result</p>
     */
    @NameInMap("data")
    public ListDisasterRecoveryItemsResponseBodyData data;

    /**
     * <p>Dynamic error code</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message</p>
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
     * <p>xxx</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>C115601B-8736-5BBF-AC99-7FEAE12xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Whether the request was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListDisasterRecoveryItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDisasterRecoveryItemsResponseBody self = new ListDisasterRecoveryItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDisasterRecoveryItemsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListDisasterRecoveryItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDisasterRecoveryItemsResponseBody setData(ListDisasterRecoveryItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDisasterRecoveryItemsResponseBodyData getData() {
        return this.data;
    }

    public ListDisasterRecoveryItemsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListDisasterRecoveryItemsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListDisasterRecoveryItemsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDisasterRecoveryItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDisasterRecoveryItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDisasterRecoveryItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDisasterRecoveryItemsResponseBodyDataListTopics extends TeaModel {
        /**
         * <p>Consumer group ID</p>
         * 
         * <strong>example:</strong>
         * <p>group-test</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The order in which messages are delivered to the target instance.</p>
         * <p>Parameter values are as follows:</p>
         * <ul>
         * <li>Concurrently: concurrent delivery</li>
         * <li>Orderly: sequential delivery</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Concurrently</p>
         */
        @NameInMap("deliveryOrderType")
        public String deliveryOrderType;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-kh43w0olz0c</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Instance type</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_ROCKETMQ</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

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
         * <p>topic-test</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static ListDisasterRecoveryItemsResponseBodyDataListTopics build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryItemsResponseBodyDataListTopics self = new ListDisasterRecoveryItemsResponseBodyDataListTopics();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryItemsResponseBodyDataListTopics setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public ListDisasterRecoveryItemsResponseBodyDataListTopics setDeliveryOrderType(String deliveryOrderType) {
            this.deliveryOrderType = deliveryOrderType;
            return this;
        }
        public String getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        public ListDisasterRecoveryItemsResponseBodyDataListTopics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDisasterRecoveryItemsResponseBodyDataListTopics setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListDisasterRecoveryItemsResponseBodyDataListTopics setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDisasterRecoveryItemsResponseBodyDataListTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class ListDisasterRecoveryItemsResponseBodyDataList extends TeaModel {
        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-20 03:38:28</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Extended information</p>
         */
        @NameInMap("extInfo")
        public java.util.Map<String, String> extInfo;

        /**
         * <p>Backup plan ID</p>
         * 
         * <strong>example:</strong>
         * <p>100070284</p>
         */
        @NameInMap("itemId")
        public Long itemId;

        /**
         * <p>Backup mapping status:</p>
         * <ul>
         * <li>CREATING (Creating)</li>
         * <li>CHANGING (Changing)</li>
         * <li>RUNNING (Running)</li>
         * <li>MANUAL_STOPPED (Manually Stopped)</li>
         * <li>OVERDUE_STOPPED (Stopped Due to Overdue)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("itemStatus")
        public String itemStatus;

        /**
         * <p>Mapping ID</p>
         * 
         * <strong>example:</strong>
         * <p>1300000016</p>
         */
        @NameInMap("planId")
        public Long planId;

        /**
         * <p>Topics included in the backup mapping</p>
         */
        @NameInMap("topics")
        public java.util.List<ListDisasterRecoveryItemsResponseBodyDataListTopics> topics;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-04 02:19:44</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListDisasterRecoveryItemsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryItemsResponseBodyDataList self = new ListDisasterRecoveryItemsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryItemsResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDisasterRecoveryItemsResponseBodyDataList setExtInfo(java.util.Map<String, String> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        public ListDisasterRecoveryItemsResponseBodyDataList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ListDisasterRecoveryItemsResponseBodyDataList setItemStatus(String itemStatus) {
            this.itemStatus = itemStatus;
            return this;
        }
        public String getItemStatus() {
            return this.itemStatus;
        }

        public ListDisasterRecoveryItemsResponseBodyDataList setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public ListDisasterRecoveryItemsResponseBodyDataList setTopics(java.util.List<ListDisasterRecoveryItemsResponseBodyDataListTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<ListDisasterRecoveryItemsResponseBodyDataListTopics> getTopics() {
            return this.topics;
        }

        public ListDisasterRecoveryItemsResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListDisasterRecoveryItemsResponseBodyData extends TeaModel {
        /**
         * <p>Paged data</p>
         */
        @NameInMap("list")
        public java.util.List<ListDisasterRecoveryItemsResponseBodyDataList> list;

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
         * <p>Request scroll ID.
         * Automatically generated by the system, subsequent pagination requests need to include this return value to continue pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>B13D0B07-F24B-4790-88D8-D47A38063D00</p>
         */
        @NameInMap("scrollId")
        public String scrollId;

        /**
         * <p>Total number of records</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListDisasterRecoveryItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDisasterRecoveryItemsResponseBodyData self = new ListDisasterRecoveryItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDisasterRecoveryItemsResponseBodyData setList(java.util.List<ListDisasterRecoveryItemsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDisasterRecoveryItemsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListDisasterRecoveryItemsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDisasterRecoveryItemsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDisasterRecoveryItemsResponseBodyData setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public ListDisasterRecoveryItemsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

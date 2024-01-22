// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsResponseBody extends TeaModel {
    /**
     * <p>The events.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryEventsResponseBodyItems> items;

    /**
     * <p>The page number. Valid values: any non-zero positive integer. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHistoryEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryEventsResponseBody self = new DescribeHistoryEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryEventsResponseBody setItems(java.util.List<DescribeHistoryEventsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHistoryEventsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeHistoryEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHistoryEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHistoryEventsResponseBodyItemsData extends TeaModel {
        /**
         * <p>The cloud service type of the application group. Valid values: **web** and native. The value web indicates a web application. The value **native** indicates a local application.</p>
         */
        @NameInMap("CmsProduct")
        public String cmsProduct;

        /**
         * <p>The database engine.</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The pagination parameter.</p>
         */
        @NameInMap("DetailImpact")
        public String detailImpact;

        /**
         * <p>The details of the instance operation.</p>
         */
        @NameInMap("DetailReason")
        public String detailReason;

        /**
         * <p>The time when the alert was closed. The time follows the ISO 8601 standard in the *yyyy-mm-dd*t*hh:mm*z format. The time is displayed in UTC.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The system event category. For more information, see [View the event history of an ApsaraDB RDS instance](~~129759~~).</p>
         */
        @NameInMap("EventCategory")
        public String eventCategory;

        /**
         * <p>The event code.</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The event details.</p>
         */
        @NameInMap("EventDetail")
        public String eventDetail;

        /**
         * <p>The event ID.</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The event impact.</p>
         */
        @NameInMap("EventImpact")
        public String eventImpact;

        /**
         * <p>The event level. For more information, see [View the event history of an ApsaraDB RDS instance](~~129759~~).</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The event source.</p>
         */
        @NameInMap("EventReason")
        public String eventReason;

        /**
         * <p>The status of the alert event. Valid values:</p>
         * <br>
         * <p>*   **1**: pending</p>
         * <p>*   **2**: ignored</p>
         * <p>*   **4**: confirmed</p>
         * <p>*   **8**: marked as false positive</p>
         * <p>*   **16**: handling</p>
         * <p>*   **32**: handled</p>
         * <p>*   **64**: expired</p>
         */
        @NameInMap("EventStatus")
        public String eventStatus;

        /**
         * <p>The event type. Valid values:</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The creation time. The time follows the ISO 8601 standard in the *yyyy-mm-dd*t*hh:mm*z format. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The update time. The time follows the ISO 8601 standard in the *yyyy-mm-dd*t*hh:mm*z format. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The handling status.</p>
         */
        @NameInMap("HandleStatus")
        public String handleStatus;

        /**
         * <p>Indicates whether the event has a lifecycle.</p>
         */
        @NameInMap("HasLifeCycle")
        public Integer hasLifeCycle;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the alert is closed. Valid values: **0**: closed. **1**: not closed.</p>
         */
        @NameInMap("IsClosed")
        public Integer isClosed;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource type. The value is fixed as **INSTANCE**.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The type of the source data.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The start time. The time follows the ISO 8601 standard in the *yyyy-mm-dd*t*hh:mm*z format. The time is displayed in UTC.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The ID of the resource owner.</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeHistoryEventsResponseBodyItemsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryEventsResponseBodyItemsData self = new DescribeHistoryEventsResponseBodyItemsData();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryEventsResponseBodyItemsData setCmsProduct(String cmsProduct) {
            this.cmsProduct = cmsProduct;
            return this;
        }
        public String getCmsProduct() {
            return this.cmsProduct;
        }

        public DescribeHistoryEventsResponseBodyItemsData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeHistoryEventsResponseBodyItemsData setDetailImpact(String detailImpact) {
            this.detailImpact = detailImpact;
            return this;
        }
        public String getDetailImpact() {
            return this.detailImpact;
        }

        public DescribeHistoryEventsResponseBodyItemsData setDetailReason(String detailReason) {
            this.detailReason = detailReason;
            return this;
        }
        public String getDetailReason() {
            return this.detailReason;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEventCategory(String eventCategory) {
            this.eventCategory = eventCategory;
            return this;
        }
        public String getEventCategory() {
            return this.eventCategory;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEventDetail(String eventDetail) {
            this.eventDetail = eventDetail;
            return this;
        }
        public String getEventDetail() {
            return this.eventDetail;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEventImpact(String eventImpact) {
            this.eventImpact = eventImpact;
            return this;
        }
        public String getEventImpact() {
            return this.eventImpact;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEventReason(String eventReason) {
            this.eventReason = eventReason;
            return this;
        }
        public String getEventReason() {
            return this.eventReason;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public DescribeHistoryEventsResponseBodyItemsData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeHistoryEventsResponseBodyItemsData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeHistoryEventsResponseBodyItemsData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeHistoryEventsResponseBodyItemsData setHandleStatus(String handleStatus) {
            this.handleStatus = handleStatus;
            return this;
        }
        public String getHandleStatus() {
            return this.handleStatus;
        }

        public DescribeHistoryEventsResponseBodyItemsData setHasLifeCycle(Integer hasLifeCycle) {
            this.hasLifeCycle = hasLifeCycle;
            return this;
        }
        public Integer getHasLifeCycle() {
            return this.hasLifeCycle;
        }

        public DescribeHistoryEventsResponseBodyItemsData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHistoryEventsResponseBodyItemsData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeHistoryEventsResponseBodyItemsData setIsClosed(Integer isClosed) {
            this.isClosed = isClosed;
            return this;
        }
        public Integer getIsClosed() {
            return this.isClosed;
        }

        public DescribeHistoryEventsResponseBodyItemsData setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeHistoryEventsResponseBodyItemsData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHistoryEventsResponseBodyItemsData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeHistoryEventsResponseBodyItemsData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeHistoryEventsResponseBodyItemsData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeHistoryEventsResponseBodyItemsData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class DescribeHistoryEventsResponseBodyItems extends TeaModel {
        /**
         * <p>The details of the data.</p>
         */
        @NameInMap("Data")
        public DescribeHistoryEventsResponseBodyItemsData data;

        /**
         * <p>The task ID</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The event source.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The database engine version.</p>
         */
        @NameInMap("Specversion")
        public String specversion;

        /**
         * <p>The name of the pending event.</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>The amount of time that has elapsed from the start time of the query. Unit: seconds.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The event type. For more information, see [View the event history of an ApsaraDB RDS instance](~~129759~~).</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeHistoryEventsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryEventsResponseBodyItems self = new DescribeHistoryEventsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryEventsResponseBodyItems setData(DescribeHistoryEventsResponseBodyItemsData data) {
            this.data = data;
            return this;
        }
        public DescribeHistoryEventsResponseBodyItemsData getData() {
            return this.data;
        }

        public DescribeHistoryEventsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeHistoryEventsResponseBodyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeHistoryEventsResponseBodyItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeHistoryEventsResponseBodyItems setSpecversion(String specversion) {
            this.specversion = specversion;
            return this;
        }
        public String getSpecversion() {
            return this.specversion;
        }

        public DescribeHistoryEventsResponseBodyItems setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeHistoryEventsResponseBodyItems setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeHistoryEventsResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

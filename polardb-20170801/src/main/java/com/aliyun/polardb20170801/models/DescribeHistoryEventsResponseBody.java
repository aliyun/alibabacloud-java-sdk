// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsResponseBody extends TeaModel {
    /**
     * <p>The event list.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryEventsResponseBodyItems> items;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB07CFF0-D8A4-5C76-AED7-D00E26FC2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
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
         * <p>The cloud service type of the application group. Valid values:</p>
         * <ul>
         * <li><strong>web</strong>: Web application.</li>
         * <li><strong>native</strong>: Native application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("CmsProduct")
        public String cmsProduct;

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The pagination parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DetailImpact")
        public String detailImpact;

        /**
         * <p>The instance operation details.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance needs to be restarted for system maintenance</p>
         */
        @NameInMap("DetailReason")
        public String detailReason;

        /**
         * <p>The end time of the query. The end time must be later than the start time, and the interval between the start time and the end time must be within 24 hours. Specify the time in the <code>YYYY-MM-DDThh:mmZ</code> format (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-24T02:24:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The system event category. Valid values:</p>
         * <ul>
         * <li><strong>Exception</strong>: Exception events.</li>
         * <li><strong>Optimize</strong>: Optimization events.</li>
         * <li><strong>Notification</strong>: Notification events.</li>
         * <li><strong>Maintenance</strong>: Scheduled O&amp;M events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exception</p>
         */
        @NameInMap("EventCategory")
        public String eventCategory;

        /**
         * <p>The event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_aamexg3015</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The event details.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance will be restarted within the maintenance window</p>
         */
        @NameInMap("EventDetail")
        public String eventDetail;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>600324</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The event impact overview.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance connection may be briefly interrupted</p>
         */
        @NameInMap("EventImpact")
        public String eventImpact;

        /**
         * <p>The event level. Valid values:</p>
         * <ul>
         * <li><strong>INFO</strong>: Notification.</li>
         * <li><strong>WARN</strong>: Warning.</li>
         * <li><strong>CRITICAL</strong>: Critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The source of the event operation.</p>
         * 
         * <strong>example:</strong>
         * <p>System maintenance</p>
         */
        @NameInMap("EventReason")
        public String eventReason;

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li><strong>Inquiring</strong>: Inquiring.</li>
         * <li><strong>Scheduled</strong>: Scheduled.</li>
         * <li><strong>Running</strong>: Running.</li>
         * <li><strong>Succeed</strong>: Succeeded.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Canceled</strong>: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inquiring</p>
         */
        @NameInMap("EventStatus")
        public String eventStatus;

        /**
         * <p>The system event type. Valid values: </p>
         * <ul>
         * <li><strong>SystemMaintenance.Reboot</strong>: The instance is restarted due to system maintenance.</li>
         * <li><strong>SystemMaintenance.Redeploy</strong>: The instance is redeployed due to system maintenance.</li>
         * <li><strong>SystemFailure.Reboot</strong>: The instance is restarted due to a system failure.</li>
         * <li><strong>SystemFailure.Redeploy</strong>: The instance is redeployed due to a system failure.</li>
         * <li><strong>SystemFailure.Delete</strong>: The instance is released due to a creation failure.</li>
         * <li><strong>InstanceFailure.Reboot</strong>: The instance is restarted due to an instance failure.</li>
         * <li><strong>InstanceExpiration.Stop</strong>: The subscription instance is stopped due to expiration.</li>
         * <li><strong>InstanceExpiration.Delete</strong>: The subscription instance is released due to expiration.</li>
         * <li><strong>AccountUnbalanced.Stop</strong>: The pay-as-you-go instance is stopped due to an overdue payment.</li>
         * <li><strong>AccountUnbalanced.Delete</strong>: The pay-as-you-go instance is released due to an overdue payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SystemFailure.Delete</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-15T14:53:06+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-07T15:10:32+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The handling status.</p>
         * 
         * <strong>example:</strong>
         * <p>done</p>
         */
        @NameInMap("HandleStatus")
        public String handleStatus;

        /**
         * <p>Indicates whether the event has a lifecycle.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HasLifeCycle")
        public Integer hasLifeCycle;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze150h1p29t***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>dhimgsearch</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the event is closed. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Closed.</li>
         * <li><strong>1</strong>: Open.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsClosed")
        public Integer isClosed;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong>: Instance resources.</li>
         * <li><strong>Host</strong>: Host resources.</li>
         * <li><strong>User</strong>: User resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The source data type.</p>
         * 
         * <strong>example:</strong>
         * <p>loanBill</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The start time of the query. Specify the time in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-27T02:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The ID of the user to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1540497309282125</p>
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
         * <p>The data overview.</p>
         */
        @NameInMap("Data")
        public DescribeHistoryEventsResponseBodyItemsData data;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The region ID of the region where the task resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The event source.</p>
         * 
         * <strong>example:</strong>
         * <p>loanBill</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The database version.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("Specversion")
        public String specversion;

        /**
         * <p>The name of the pending event.</p>
         * 
         * <strong>example:</strong>
         * <p>QiTian</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>The running time of the query task. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1758680209206</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
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

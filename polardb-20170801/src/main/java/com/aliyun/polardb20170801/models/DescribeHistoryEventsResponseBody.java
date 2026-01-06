// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeHistoryEventsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EB07CFF0-D8A4-5C76-AED7-D00E26FC2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("CmsProduct")
        public String cmsProduct;

        /**
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DetailImpact")
        public String detailImpact;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("DetailReason")
        public String detailReason;

        /**
         * <strong>example:</strong>
         * <p>2025-12-24T02:24:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>Exception</p>
         */
        @NameInMap("EventCategory")
        public String eventCategory;

        /**
         * <strong>example:</strong>
         * <p>de_aamexg3015</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("EventDetail")
        public String eventDetail;

        /**
         * <strong>example:</strong>
         * <p>600324</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("EventImpact")
        public String eventImpact;

        /**
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("EventReason")
        public String eventReason;

        /**
         * <strong>example:</strong>
         * <p>Inquiring</p>
         */
        @NameInMap("EventStatus")
        public String eventStatus;

        /**
         * <strong>example:</strong>
         * <p>SystemFailure.Delete</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <strong>example:</strong>
         * <p>2025-07-15T14:53:06+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2025-01-07T15:10:32+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>done</p>
         */
        @NameInMap("HandleStatus")
        public String handleStatus;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasLifeCycle")
        public Integer hasLifeCycle;

        /**
         * <strong>example:</strong>
         * <p>pc-2ze150h1p29t***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>dhimgsearch</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsClosed")
        public Integer isClosed;

        /**
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>loanBill</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>2025-02-27T02:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
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
        @NameInMap("Data")
        public DescribeHistoryEventsResponseBodyItemsData data;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>loanBill</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("Specversion")
        public String specversion;

        /**
         * <strong>example:</strong>
         * <p>QiTian</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <strong>example:</strong>
         * <p>1758680209206</p>
         */
        @NameInMap("Time")
        public String time;

        /**
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

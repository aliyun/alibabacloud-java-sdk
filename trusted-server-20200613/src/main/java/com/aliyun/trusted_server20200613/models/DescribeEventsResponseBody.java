// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeEventsResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponseBody self = new DescribeEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventsResponseBody setItems(java.util.List<DescribeEventsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeEventsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEventsResponseBodyItems extends TeaModel {
        @NameInMap("Accumulation")
        public String accumulation;

        @NameInMap("EventAffiliation")
        public String eventAffiliation;

        @NameInMap("EventLevel")
        public String eventLevel;

        @NameInMap("EventStatus")
        public String eventStatus;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("EventUuid")
        public String eventUuid;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtHandle")
        public Long gmtHandle;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("HandleType")
        public String handleType;

        @NameInMap("PropertyName")
        public String propertyName;

        @NameInMap("PropertyPrivateIp")
        public String propertyPrivateIp;

        @NameInMap("PropertyPublicIp")
        public String propertyPublicIp;

        @NameInMap("PropertyUuid")
        public String propertyUuid;

        @NameInMap("Suspect")
        public String suspect;

        @NameInMap("SuspectSig")
        public String suspectSig;

        @NameInMap("SuspectWhiteList")
        public String suspectWhiteList;

        public static DescribeEventsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsResponseBodyItems self = new DescribeEventsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventsResponseBodyItems setAccumulation(String accumulation) {
            this.accumulation = accumulation;
            return this;
        }
        public String getAccumulation() {
            return this.accumulation;
        }

        public DescribeEventsResponseBodyItems setEventAffiliation(String eventAffiliation) {
            this.eventAffiliation = eventAffiliation;
            return this;
        }
        public String getEventAffiliation() {
            return this.eventAffiliation;
        }

        public DescribeEventsResponseBodyItems setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeEventsResponseBodyItems setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public DescribeEventsResponseBodyItems setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventsResponseBodyItems setEventUuid(String eventUuid) {
            this.eventUuid = eventUuid;
            return this;
        }
        public String getEventUuid() {
            return this.eventUuid;
        }

        public DescribeEventsResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEventsResponseBodyItems setGmtHandle(Long gmtHandle) {
            this.gmtHandle = gmtHandle;
            return this;
        }
        public Long getGmtHandle() {
            return this.gmtHandle;
        }

        public DescribeEventsResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEventsResponseBodyItems setHandleType(String handleType) {
            this.handleType = handleType;
            return this;
        }
        public String getHandleType() {
            return this.handleType;
        }

        public DescribeEventsResponseBodyItems setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public DescribeEventsResponseBodyItems setPropertyPrivateIp(String propertyPrivateIp) {
            this.propertyPrivateIp = propertyPrivateIp;
            return this;
        }
        public String getPropertyPrivateIp() {
            return this.propertyPrivateIp;
        }

        public DescribeEventsResponseBodyItems setPropertyPublicIp(String propertyPublicIp) {
            this.propertyPublicIp = propertyPublicIp;
            return this;
        }
        public String getPropertyPublicIp() {
            return this.propertyPublicIp;
        }

        public DescribeEventsResponseBodyItems setPropertyUuid(String propertyUuid) {
            this.propertyUuid = propertyUuid;
            return this;
        }
        public String getPropertyUuid() {
            return this.propertyUuid;
        }

        public DescribeEventsResponseBodyItems setSuspect(String suspect) {
            this.suspect = suspect;
            return this;
        }
        public String getSuspect() {
            return this.suspect;
        }

        public DescribeEventsResponseBodyItems setSuspectSig(String suspectSig) {
            this.suspectSig = suspectSig;
            return this;
        }
        public String getSuspectSig() {
            return this.suspectSig;
        }

        public DescribeEventsResponseBodyItems setSuspectWhiteList(String suspectWhiteList) {
            this.suspectWhiteList = suspectWhiteList;
            return this;
        }
        public String getSuspectWhiteList() {
            return this.suspectWhiteList;
        }

    }

}

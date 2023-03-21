// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarSecurityEventsResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeSimilarSecurityEventsResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityEventsResponse")
    public java.util.List<DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse> securityEventsResponse;

    public static DescribeSimilarSecurityEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimilarSecurityEventsResponseBody self = new DescribeSimilarSecurityEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSimilarSecurityEventsResponseBody setPageInfo(DescribeSimilarSecurityEventsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeSimilarSecurityEventsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeSimilarSecurityEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSimilarSecurityEventsResponseBody setSecurityEventsResponse(java.util.List<DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse> securityEventsResponse) {
        this.securityEventsResponse = securityEventsResponse;
        return this;
    }
    public java.util.List<DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse> getSecurityEventsResponse() {
        return this.securityEventsResponse;
    }

    public static class DescribeSimilarSecurityEventsResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSimilarSecurityEventsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSimilarSecurityEventsResponseBodyPageInfo self = new DescribeSimilarSecurityEventsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSimilarSecurityEventsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSimilarSecurityEventsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeSimilarSecurityEventsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSimilarSecurityEventsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse extends TeaModel {
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("OccurrenceTime")
        public Long occurrenceTime;

        @NameInMap("SecurityEventId")
        public Long securityEventId;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse self = new DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse();
            return TeaModel.build(map, self);
        }

        public DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse setOccurrenceTime(Long occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public Long getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse setSecurityEventId(Long securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        public DescribeSimilarSecurityEventsResponseBodySecurityEventsResponse setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}

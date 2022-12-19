// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarSecurityEventsResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeSimilarSecurityEventsResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array consisting of the alert events that are triggered by the same rule or of the same alert type.
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **20**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
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
        // The name of the alert event.
        @NameInMap("EventName")
        public String eventName;

        // The alert type of the alert event. Valid values:
        // 
        // *   Suspicious process
        // *   Webshell
        // *   Unusual logon
        // *   Exception
        // *   Sensitive file tampering
        // *   Malicious process (cloud threat detection)
        // *   Suspicious network connection
        // *   Other
        // *   Abnormal account
        // *   Application intrusion event
        // *   Cloud threat detection
        // *   Precise defense
        // *   Application whitelist
        // *   Persistent webshell
        // *   Web application threat detection
        // *   Malicious script
        // *   Threat intelligence
        // *   Malicious network activity
        // *   Cluster exception
        // *   Webshell (on-premises threat detection)
        // *   Vulnerability exploitation
        // *   Malicious process (on-premises threat detection)
        // *   Trusted exception
        // 
        // For more information about alert types, see [Alerts](~~191144~~).
        @NameInMap("EventType")
        public String eventType;

        // The timestamp when the alert event was last detected. Unit: milliseconds.
        @NameInMap("LastTime")
        public Long lastTime;

        // The timestamp when the alert event was first detected. Unit: milliseconds.
        @NameInMap("OccurrenceTime")
        public Long occurrenceTime;

        // The ID of the alert event.
        @NameInMap("SecurityEventId")
        public Long securityEventId;

        // The UUID of the server that is affected by the alert event.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarSecurityEventsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeSimilarSecurityEventsResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the alert events that are triggered by the same rule or of the same alert type.</p>
     */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: **20**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
        /**
         * <p>The name of the alert event.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The type of the alert event. Valid values:</p>
         * <br>
         * <p>*   Suspicious Process</p>
         * <p>*   Webshell</p>
         * <p>*   Unusual Logon</p>
         * <p>*   Malicious Software</p>
         * <p>*   Sensitive File Tampering</p>
         * <p>*   Unusual Network Connection</p>
         * <p>*   Other</p>
         * <p>*   Suspicious Account</p>
         * <p>*   Cloud threat detection</p>
         * <p>*   Precision defense</p>
         * <p>*   Application Whitelist</p>
         * <p>*   Persistence</p>
         * <p>*   Web Application Threat Detection</p>
         * <p>*   Malicious scripts</p>
         * <p>*   Malicious Network Activity</p>
         * <p>*   K8s Abnormal Behavior</p>
         * <p>*   Website backdoor (local engine)</p>
         * <p>*   Exploit</p>
         * <p>*   Image Scan</p>
         * <p>*   Trusted exception</p>
         * <br>
         * <p>For more information about alert types, see [Overview](https://help.aliyun.com/document_detail/68388.html).</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The timestamp generated when the alert event was last detected. Unit: milliseconds.</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The timestamp generated when the alert event was first detected. Unit: milliseconds.</p>
         */
        @NameInMap("OccurrenceTime")
        public Long occurrenceTime;

        /**
         * <p>The ID of the alert event.</p>
         */
        @NameInMap("SecurityEventId")
        public Long securityEventId;

        /**
         * <p>The UUID of the server that was affected by the alert event.</p>
         */
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

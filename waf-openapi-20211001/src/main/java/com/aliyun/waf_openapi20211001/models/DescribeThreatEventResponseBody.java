// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>98106632-6865-5600-A834-3D909***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of noteworthy security events.</p>
     */
    @NameInMap("ThreatEvents")
    public java.util.List<DescribeThreatEventResponseBodyThreatEvents> threatEvents;

    /**
     * <p>The total number of queried events.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeThreatEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeThreatEventResponseBody self = new DescribeThreatEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeThreatEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeThreatEventResponseBody setThreatEvents(java.util.List<DescribeThreatEventResponseBodyThreatEvents> threatEvents) {
        this.threatEvents = threatEvents;
        return this;
    }
    public java.util.List<DescribeThreatEventResponseBodyThreatEvents> getThreatEvents() {
        return this.threatEvents;
    }

    public DescribeThreatEventResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeThreatEventResponseBodyThreatEvents extends TeaModel {
        /**
         * <p>The percentage of blocked requests.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("BlockRate")
        public String blockRate;

        /**
         * <p>The most recent Attack Time. The format is a UNIX timestamp in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1768406400000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The ID of the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>f439994c8ab39f84eced33490f0c4388</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The severity level of the event. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: critical.</li>
         * <li><strong>high</strong>: high.</li>
         * <li><strong>medium</strong>: medium.</li>
         * <li><strong>low</strong>: low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The Attack Source IP Addresses.</p>
         * <blockquote>
         * <p>A security event may involve multiple source IP addresses. This operation returns only one source IP address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3.3.3.3</p>
         */
        @NameInMap("EventSrc")
        public String eventSrc;

        /**
         * <p>The name of the event. Valid values:</p>
         * <ul>
         * <li><strong>MultipleDomainDirscan</strong>: folder and file scanning targeting multiple domain names.</li>
         * <li><strong>SingleDomainDirscan</strong>: folder and file scanning targeting a single domain name.</li>
         * <li><strong>MultipleDomainWebscan</strong>: web vulnerability scanning targeting multiple domain names.</li>
         * <li><strong>SingleDomainWebscan</strong>: web vulnerability scanning targeting a single domain name.</li>
         * <li><strong>MultipleDomainWebattack</strong>: web vulnerability attacks targeting multiple domain names.</li>
         * <li><strong>SingleDomainWebattack</strong>: web vulnerability attacks targeting a single domain name.</li>
         * <li><strong>SingleURLWebattack</strong>: web vulnerability attacks targeting a specific URL.</li>
         * <li><strong>SingleURLSqlattack</strong>: SQL injection attacks targeting a specific URL.</li>
         * <li><strong>SingleURLXssattack</strong>: XSS attacks targeting a specific URL.</li>
         * <li><strong>WebshellUpload</strong>: attempts to upload backdoor trojans.</li>
         * <li><strong>RandomVulnTest</strong>: random web vulnerability probing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Event_InternalLoginWeakPasswd</p>
         */
        @NameInMap("EventTag")
        public String eventTag;

        /**
         * <p>The protected object of the Attack Target.</p>
         * <blockquote>
         * <p>A security event may involve multiple protected objects targeted by the attack. This operation returns only one protected object.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test.aliyundemo.com-waf</p>
         */
        @NameInMap("EventTarget")
        public String eventTarget;

        public static DescribeThreatEventResponseBodyThreatEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeThreatEventResponseBodyThreatEvents self = new DescribeThreatEventResponseBodyThreatEvents();
            return TeaModel.build(map, self);
        }

        public DescribeThreatEventResponseBodyThreatEvents setBlockRate(String blockRate) {
            this.blockRate = blockRate;
            return this;
        }
        public String getBlockRate() {
            return this.blockRate;
        }

        public DescribeThreatEventResponseBodyThreatEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeThreatEventResponseBodyThreatEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeThreatEventResponseBodyThreatEvents setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeThreatEventResponseBodyThreatEvents setEventSrc(String eventSrc) {
            this.eventSrc = eventSrc;
            return this;
        }
        public String getEventSrc() {
            return this.eventSrc;
        }

        public DescribeThreatEventResponseBodyThreatEvents setEventTag(String eventTag) {
            this.eventTag = eventTag;
            return this;
        }
        public String getEventTag() {
            return this.eventTag;
        }

        public DescribeThreatEventResponseBodyThreatEvents setEventTarget(String eventTarget) {
            this.eventTarget = eventTarget;
            return this;
        }
        public String getEventTarget() {
            return this.eventTarget;
        }

    }

}

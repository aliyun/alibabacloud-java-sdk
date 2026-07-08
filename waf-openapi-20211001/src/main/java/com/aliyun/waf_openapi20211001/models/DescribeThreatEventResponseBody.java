// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98106632-6865-5600-A834-3D909***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of notable security events.</p>
     */
    @NameInMap("ThreatEvents")
    public java.util.List<DescribeThreatEventResponseBodyThreatEvents> threatEvents;

    /**
     * <p>The total number of security events that match the query conditions.</p>
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
         * <p>The percentage of attack requests that were blocked by WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("BlockRate")
        public String blockRate;

        /**
         * <p>The time when the last attack occurred. This value is a UNIX timestamp in milliseconds.</p>
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
         * <p>The severity level of the security event. Valid values:</p>
         * <ul>
         * <li><p><strong>critical</strong></p>
         * </li>
         * <li><p><strong>high</strong></p>
         * </li>
         * <li><p><strong>medium</strong></p>
         * </li>
         * <li><p><strong>low</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The source IP address of the attack.</p>
         * <blockquote>
         * <p>A security event may have multiple source IP addresses. This operation returns only one of them.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3.3.3.3</p>
         */
        @NameInMap("EventSrc")
        public String eventSrc;

        /**
         * <p>The type of the security event. Valid values:</p>
         * <ul>
         * <li><p><strong>MultipleDomainDirscan</strong>: a directory and file scan against multiple domain names.</p>
         * </li>
         * <li><p><strong>SingleDomainDirscan</strong>: a directory and file scan against a single domain name.</p>
         * </li>
         * <li><p><strong>MultipleDomainWebscan</strong>: a web vulnerability scan against multiple domain names.</p>
         * </li>
         * <li><p><strong>SingleDomainWebscan</strong>: a web vulnerability scan against a single domain name.</p>
         * </li>
         * <li><p><strong>MultipleDomainWebattack</strong>: a web vulnerability attack against multiple domain names.</p>
         * </li>
         * <li><p><strong>SingleDomainWebattack</strong>: a web vulnerability attack against a single domain name.</p>
         * </li>
         * <li><p><strong>SingleURLWebattack</strong>: a web vulnerability attack against a specific URL.</p>
         * </li>
         * <li><p><strong>SingleURLSqlattack</strong>: an SQL injection attack against a specific URL.</p>
         * </li>
         * <li><p><strong>SingleURLXssattack</strong>: an XSS attack against a specific URL.</p>
         * </li>
         * <li><p><strong>WebshellUpload</strong>: an attack that attempts to upload backdoor trojans.</p>
         * </li>
         * <li><p><strong>RandomVulnTest</strong>: a random web vulnerability probe.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Event_InternalLoginWeakPasswd</p>
         */
        @NameInMap("EventTag")
        public String eventTag;

        /**
         * <p>The protected object that is the target of the attack.</p>
         * <blockquote>
         * <p>A security event may have multiple protected objects as targets. This operation returns only one of them.</p>
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

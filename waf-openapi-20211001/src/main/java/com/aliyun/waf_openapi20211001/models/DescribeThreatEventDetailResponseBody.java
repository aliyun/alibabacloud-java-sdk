// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventDetailResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the security event.</p>
     */
    @NameInMap("ThreatEventDetail")
    public DescribeThreatEventDetailResponseBodyThreatEventDetail threatEventDetail;

    public static DescribeThreatEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeThreatEventDetailResponseBody self = new DescribeThreatEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeThreatEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeThreatEventDetailResponseBody setThreatEventDetail(DescribeThreatEventDetailResponseBodyThreatEventDetail threatEventDetail) {
        this.threatEventDetail = threatEventDetail;
        return this;
    }
    public DescribeThreatEventDetailResponseBodyThreatEventDetail getThreatEventDetail() {
        return this.threatEventDetail;
    }

    public static class DescribeThreatEventDetailResponseBodyThreatEventDetail extends TeaModel {
        /**
         * <p>The time of the most recent attack. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1749916800000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of attacks that were blocked in the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EventBlock")
        public String eventBlock;

        /**
         * <p>The total number of attacks in the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EventCnt")
        public String eventCnt;

        /**
         * <p>The filter condition for viewing logs. The value is a JSON object in the string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;end_ts&quot;: 1766637714, &quot;start_ts&quot;: 1764096746, &quot;condition&quot;: {&quot;real_client_ip&quot;: [&quot;78.153.140.179&quot;, &quot;78.153.140.203&quot;, &quot;78.153.140.177&quot;, &quot;78.153.140.178&quot;, &quot;78.153.140.151&quot;]}}</p>
         */
        @NameInMap("EventCondition")
        public String eventCondition;

        /**
         * <p>The threat intelligence associated with the event. The value is a JSON array in the string format.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;CVE-2020-14882&quot;,&quot;DDoS Attack&quot;]</p>
         */
        @NameInMap("EventIntelligence")
        public String eventIntelligence;

        /**
         * <p>The severity level of the event. Valid values:</p>
         * <ul>
         * <li><p><strong>critical</strong>: Critical severity.</p>
         * </li>
         * <li><p><strong>high</strong>: High severity.</p>
         * </li>
         * <li><p><strong>medium</strong>: Medium severity.</p>
         * </li>
         * <li><p><strong>low</strong>: Low severity.</p>
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
         * <p>XX.XX.XX.XX</p>
         */
        @NameInMap("EventSrc")
        public String eventSrc;

        /**
         * <p>The country of the source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("EventSrcCountry")
        public String eventSrcCountry;

        /**
         * <p>The region of the source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>GB-ENG</p>
         */
        @NameInMap("EventSrcRegion")
        public String eventSrcRegion;

        /**
         * <p>The security suggestion. Valid values:</p>
         * <ul>
         * <li><p><strong>ProtectInterface</strong>: The attack target appears to be a backend management address. If the address has specific access patterns, configure custom rules in the access control module to restrict access.</p>
         * </li>
         * <li><p><strong>BlockArea</strong>: Monitor the attack source region. If the attack source region is different from your normal business regions, configure a location blacklist or an IP address blacklist in the access control module to restrict access.</p>
         * </li>
         * <li><p><strong>SwitchBlock</strong>: The current protection rule is in Alert mode. To ensure business security, switch to Block mode. Before you switch, check for false positives.</p>
         * </li>
         * <li><p><strong>FixBug</strong>: Check the attack target for security vulnerabilities. If any vulnerabilities exist, fix them promptly to prevent exploitation.</p>
         * </li>
         * <li><p><strong>SwitchStrict</strong>: If it does not affect your normal business, change the policies of modules, such as protection rules and scan protection, to a stricter mode. Before you change the policies, check for false positives.</p>
         * </li>
         * <li><p><strong>ProtectFile</strong>: Check the target domain name for sensitive files or paths to prevent them from being detected and exploited.</p>
         * </li>
         * <li><p><strong>BlockIP</strong>: The source IP address has a high degree of maliciousness. Keep monitoring it. If it does not affect your normal business, use an IP address blacklist to block access from the malicious IP address.</p>
         * </li>
         * <li><p><strong>KeepConcerned</strong>: No threats are found. Continue to monitor the situation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FixBug</p>
         */
        @NameInMap("EventSuggest")
        public String eventSuggest;

        /**
         * <p>The name of the event. Valid values:</p>
         * <ul>
         * <li><p><strong>MultipleDomainDirscan</strong>: A directory and file scan for multiple domain names.</p>
         * </li>
         * <li><p><strong>SingleDomainDirscan</strong>: A directory and file scan for a single domain name.</p>
         * </li>
         * <li><p><strong>MultipleDomainWebscan</strong>: A web vulnerability scan for multiple domain names.</p>
         * </li>
         * <li><p><strong>SingleDomainWebscan</strong>: A web vulnerability scan for a single domain name.</p>
         * </li>
         * <li><p><strong>MultipleDomainWebattack</strong>: A web vulnerability attack on multiple domain names.</p>
         * </li>
         * <li><p><strong>SingleDomainWebattack</strong>: A web vulnerability attack on a single domain name.</p>
         * </li>
         * <li><p><strong>SingleURLWebattack</strong>: A web vulnerability attack on a specific URL.</p>
         * </li>
         * <li><p><strong>SingleURLSqlattack</strong>: An SQL injection attack on a specific URL.</p>
         * </li>
         * <li><p><strong>SingleURLXssattack</strong>: A cross-site scripting (XSS) attack on a specific URL.</p>
         * </li>
         * <li><p><strong>WebshellUpload</strong>: An attempt to upload backdoor trojans.</p>
         * </li>
         * <li><p><strong>RandomVulnTest</strong>: A random web vulnerability probe.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MultipleDomainWebattack</p>
         */
        @NameInMap("EventTag")
        public String eventTag;

        /**
         * <p>Indicates whether the event is a persistent attack. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The event is not a persistent attack.</p>
         * </li>
         * <li><p><strong>1</strong>: The event is a persistent attack.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsPersistent")
        public Long isPersistent;

        public static DescribeThreatEventDetailResponseBodyThreatEventDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeThreatEventDetailResponseBodyThreatEventDetail self = new DescribeThreatEventDetailResponseBodyThreatEventDetail();
            return TeaModel.build(map, self);
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventBlock(String eventBlock) {
            this.eventBlock = eventBlock;
            return this;
        }
        public String getEventBlock() {
            return this.eventBlock;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventCnt(String eventCnt) {
            this.eventCnt = eventCnt;
            return this;
        }
        public String getEventCnt() {
            return this.eventCnt;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventCondition(String eventCondition) {
            this.eventCondition = eventCondition;
            return this;
        }
        public String getEventCondition() {
            return this.eventCondition;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventIntelligence(String eventIntelligence) {
            this.eventIntelligence = eventIntelligence;
            return this;
        }
        public String getEventIntelligence() {
            return this.eventIntelligence;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventSrc(String eventSrc) {
            this.eventSrc = eventSrc;
            return this;
        }
        public String getEventSrc() {
            return this.eventSrc;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventSrcCountry(String eventSrcCountry) {
            this.eventSrcCountry = eventSrcCountry;
            return this;
        }
        public String getEventSrcCountry() {
            return this.eventSrcCountry;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventSrcRegion(String eventSrcRegion) {
            this.eventSrcRegion = eventSrcRegion;
            return this;
        }
        public String getEventSrcRegion() {
            return this.eventSrcRegion;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventSuggest(String eventSuggest) {
            this.eventSuggest = eventSuggest;
            return this;
        }
        public String getEventSuggest() {
            return this.eventSuggest;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setEventTag(String eventTag) {
            this.eventTag = eventTag;
            return this;
        }
        public String getEventTag() {
            return this.eventTag;
        }

        public DescribeThreatEventDetailResponseBodyThreatEventDetail setIsPersistent(Long isPersistent) {
            this.isPersistent = isPersistent;
            return this;
        }
        public Long getIsPersistent() {
            return this.isPersistent;
        }

    }

}

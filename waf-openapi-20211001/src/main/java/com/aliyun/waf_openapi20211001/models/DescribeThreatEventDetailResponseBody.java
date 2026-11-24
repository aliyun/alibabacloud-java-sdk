// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
         * <p>The most recent attack time. The value is a UNIX timestamp in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1749916800000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of blocked attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EventBlock")
        public String eventBlock;

        /**
         * <p>The total number of attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EventCnt")
        public String eventCnt;

        /**
         * <p>The filter condition for the log query feature. The value is a string converted from a <strong>JSON</strong> structure constructed with a series of parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;end_ts&quot;: 1766637714, &quot;start_ts&quot;: 1764096746, &quot;condition&quot;: {&quot;real_client_ip&quot;: [&quot;78.153.140.179&quot;, &quot;78.153.140.203&quot;, &quot;78.153.140.177&quot;, &quot;78.153.140.178&quot;, &quot;78.153.140.151&quot;]}}</p>
         */
        @NameInMap("EventCondition")
        public String eventCondition;

        /**
         * <p>The threat intelligence associated with the event. The value is a string converted from a <strong>JSON</strong> array.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;CVE-2020-14882&quot;,&quot;DDoS Attack&quot;]</p>
         */
        @NameInMap("EventIntelligence")
        public String eventIntelligence;

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
         * <p>The attack source IP addresses.</p>
         * <blockquote>
         * <p>A security event may have multiple attack source IP addresses. This operation returns only one.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>XX.XX.XX.XX</p>
         */
        @NameInMap("EventSrc")
        public String eventSrc;

        /**
         * <p>The country to which the attack source IP addresses belong.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("EventSrcCountry")
        public String eventSrcCountry;

        /**
         * <p>The region to which the attack source IP addresses belong.</p>
         * 
         * <strong>example:</strong>
         * <p>GB-ENG</p>
         */
        @NameInMap("EventSrcRegion")
        public String eventSrcRegion;

        /**
         * <p>The security suggestion. Valid values:</p>
         * <ul>
         * <li><strong>ProtectInterface</strong>: The Attack Target is suspected to be a backend management address. If the address has fixed access characteristics, configure custom rules in the access control module to restrict access.</li>
         * <li><strong>BlockArea</strong>: Monitor the source region of the attack. If the attack source differs from the normal regional distribution of your service, configure Location Blacklist or IP blacklist rules in the access control module to restrict access.</li>
         * <li><strong>SwitchBlock</strong>: The current rule protection is in alerting mode. To ensure service security, switch to block mode. Before switching, check for false positives.</li>
         * <li><strong>FixBug</strong>: Check whether the Attack Target has a security vulnerability. If the security vulnerability exists, fix it promptly to prevent exploitation by attackers.</li>
         * <li><strong>SwitchStrict</strong>: If normal service is not affected, adjust the policy of modules such as rule protection and scan protection to a stricter pattern. Before adjusting the policy, check for false positives.</li>
         * <li><strong>ProtectFile</strong>: Check whether sensitive files or paths exist under the target domain name to prevent detection and exploitation by attackers.</li>
         * <li><strong>BlockIP</strong>: The source IP address of the attack is highly malicious. Monitor the IP address. If normal service is not affected, block access from the malicious IP address by using an IP blacklist.</li>
         * <li><strong>KeepConcerned</strong>: No risks are detected. Continue to monitor the event.</li>
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
         * <li><strong>MultipleDomainDirscan</strong>: directory and file scanning targeting multiple domain names</li>
         * <li><strong>SingleDomainDirscan</strong>: directory and file scanning targeting a single domain name</li>
         * <li><strong>MultipleDomainWebscan</strong>: web vulnerability scanning targeting multiple domain names</li>
         * <li><strong>SingleDomainWebscan</strong>: web vulnerability scanning targeting a single domain name</li>
         * <li><strong>MultipleDomainWebattack</strong>: web vulnerability attacks targeting multiple domain names</li>
         * <li><strong>SingleDomainWebattack</strong>: web vulnerability attacks targeting a single domain name</li>
         * <li><strong>SingleURLWebattack</strong>: web vulnerability attacks targeting a specific URL</li>
         * <li><strong>SingleURLSqlattack</strong>: SQL injection attacks targeting a specific URL</li>
         * <li><strong>SingleURLXssattack</strong>: XSS attacks targeting a specific URL</li>
         * <li><strong>WebshellUpload</strong>: attack behavior attempting to upload backdoor trojans</li>
         * <li><strong>RandomVulnTest</strong>: random web vulnerability detection behavior</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MultipleDomainWebattack</p>
         */
        @NameInMap("EventTag")
        public String eventTag;

        /**
         * <p>Indicates whether the attack event is a targeted persistent attack event. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: non-persistent attack.</p>
         * </li>
         * <li><p><strong>1</strong>: persistent attack.</p>
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

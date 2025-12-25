// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>1749916800000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EventBlock")
        public String eventBlock;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EventCnt")
        public String eventCnt;

        /**
         * <strong>example:</strong>
         * <p>{&quot;end_ts&quot;: 1766637714, &quot;start_ts&quot;: 1764096746, &quot;condition&quot;: {&quot;real_client_ip&quot;: [&quot;78.153.140.179&quot;, &quot;78.153.140.203&quot;, &quot;78.153.140.177&quot;, &quot;78.153.140.178&quot;, &quot;78.153.140.151&quot;]}}</p>
         */
        @NameInMap("EventCondition")
        public String eventCondition;

        /**
         * <strong>example:</strong>
         * <p>[&quot;CVE-2020-14882&quot;,&quot;DDoS Attack&quot;]</p>
         */
        @NameInMap("EventIntelligence")
        public String eventIntelligence;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <strong>example:</strong>
         * <p>XX.XX.XX.XX</p>
         */
        @NameInMap("EventSrc")
        public String eventSrc;

        /**
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("EventSrcCountry")
        public String eventSrcCountry;

        /**
         * <strong>example:</strong>
         * <p>GB-ENG</p>
         */
        @NameInMap("EventSrcRegion")
        public String eventSrcRegion;

        /**
         * <strong>example:</strong>
         * <p>FixBug</p>
         */
        @NameInMap("EventSuggest")
        public String eventSuggest;

        /**
         * <strong>example:</strong>
         * <p>MultipleDomainWebattack</p>
         */
        @NameInMap("EventTag")
        public String eventTag;

        /**
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

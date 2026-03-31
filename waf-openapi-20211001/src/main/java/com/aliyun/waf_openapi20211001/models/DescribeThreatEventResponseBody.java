// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>98106632-6865-5600-A834-3D909***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ThreatEvents")
    public java.util.List<DescribeThreatEventResponseBodyThreatEvents> threatEvents;

    /**
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
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("BlockRate")
        public String blockRate;

        /**
         * <strong>example:</strong>
         * <p>1768406400000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>f439994c8ab39f84eced33490f0c4388</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <strong>example:</strong>
         * <p>3.3.3.3</p>
         */
        @NameInMap("EventSrc")
        public String eventSrc;

        /**
         * <strong>example:</strong>
         * <p>Event_InternalLoginWeakPasswd</p>
         */
        @NameInMap("EventTag")
        public String eventTag;

        /**
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

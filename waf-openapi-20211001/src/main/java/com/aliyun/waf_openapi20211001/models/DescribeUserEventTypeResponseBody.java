// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserEventTypeResponseBody extends TeaModel {
    /**
     * <p>The types and statistics of security events.</p>
     */
    @NameInMap("Event")
    public java.util.List<DescribeUserEventTypeResponseBodyEvent> event;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>177BA739-6512-5470-98C6-E***0BAA3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserEventTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEventTypeResponseBody self = new DescribeUserEventTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserEventTypeResponseBody setEvent(java.util.List<DescribeUserEventTypeResponseBodyEvent> event) {
        this.event = event;
        return this;
    }
    public java.util.List<DescribeUserEventTypeResponseBodyEvent> getEvent() {
        return this.event;
    }

    public DescribeUserEventTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserEventTypeResponseBodyEvent extends TeaModel {
        /**
         * <p>The code of the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>Event_LoginCollision</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EventCount")
        public Long eventCount;

        /**
         * <p>The parent type of the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>EventType_Account</p>
         */
        @NameInMap("EventParentType")
        public String eventParentType;

        /**
         * <p>The type of the security event.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported types of security events.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Event_AbnormalFrequency</p>
         */
        @NameInMap("EventType")
        public String eventType;

        public static DescribeUserEventTypeResponseBodyEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserEventTypeResponseBodyEvent self = new DescribeUserEventTypeResponseBodyEvent();
            return TeaModel.build(map, self);
        }

        public DescribeUserEventTypeResponseBodyEvent setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeUserEventTypeResponseBodyEvent setEventCount(Long eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Long getEventCount() {
            return this.eventCount;
        }

        public DescribeUserEventTypeResponseBodyEvent setEventParentType(String eventParentType) {
            this.eventParentType = eventParentType;
            return this;
        }
        public String getEventParentType() {
            return this.eventParentType;
        }

        public DescribeUserEventTypeResponseBodyEvent setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

}

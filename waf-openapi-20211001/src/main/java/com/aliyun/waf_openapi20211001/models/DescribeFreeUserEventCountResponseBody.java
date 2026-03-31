// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFreeUserEventCountResponseBody extends TeaModel {
    /**
     * <p>The information about the security events that are detected by using the basic detection feature.</p>
     */
    @NameInMap("Event")
    public DescribeFreeUserEventCountResponseBodyEvent event;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0D9FB3BC-0DE9-58A8-9663-ACE56F24F405</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFreeUserEventCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFreeUserEventCountResponseBody self = new DescribeFreeUserEventCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFreeUserEventCountResponseBody setEvent(DescribeFreeUserEventCountResponseBodyEvent event) {
        this.event = event;
        return this;
    }
    public DescribeFreeUserEventCountResponseBodyEvent getEvent() {
        return this.event;
    }

    public DescribeFreeUserEventCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFreeUserEventCountResponseBodyEvent extends TeaModel {
        /**
         * <p>The number of high-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventHigh")
        public Long eventHigh;

        /**
         * <p>The number of low-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("EventLow")
        public Long eventLow;

        /**
         * <p>The number of medium-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EventMedium")
        public Long eventMedium;

        /**
         * <p>The total number of security events.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("EventTotal")
        public Long eventTotal;

        public static DescribeFreeUserEventCountResponseBodyEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeFreeUserEventCountResponseBodyEvent self = new DescribeFreeUserEventCountResponseBodyEvent();
            return TeaModel.build(map, self);
        }

        public DescribeFreeUserEventCountResponseBodyEvent setEventHigh(Long eventHigh) {
            this.eventHigh = eventHigh;
            return this;
        }
        public Long getEventHigh() {
            return this.eventHigh;
        }

        public DescribeFreeUserEventCountResponseBodyEvent setEventLow(Long eventLow) {
            this.eventLow = eventLow;
            return this;
        }
        public Long getEventLow() {
            return this.eventLow;
        }

        public DescribeFreeUserEventCountResponseBodyEvent setEventMedium(Long eventMedium) {
            this.eventMedium = eventMedium;
            return this;
        }
        public Long getEventMedium() {
            return this.eventMedium;
        }

        public DescribeFreeUserEventCountResponseBodyEvent setEventTotal(Long eventTotal) {
            this.eventTotal = eventTotal;
            return this;
        }
        public Long getEventTotal() {
            return this.eventTotal;
        }

    }

}

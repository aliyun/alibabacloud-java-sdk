// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcUserEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Events")
    public java.util.List<DescribeRtcUserEventsResponseBodyEvents> events;

    public static DescribeRtcUserEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserEventsResponseBody self = new DescribeRtcUserEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcUserEventsResponseBody setEvents(java.util.List<DescribeRtcUserEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeRtcUserEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public static class DescribeRtcUserEventsResponseBodyEvents extends TeaModel {
        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("Category")
        public String category;

        public static DescribeRtcUserEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcUserEventsResponseBodyEvents self = new DescribeRtcUserEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeRtcUserEventsResponseBodyEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeRtcUserEventsResponseBodyEvents setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public DescribeRtcUserEventsResponseBodyEvents setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

}

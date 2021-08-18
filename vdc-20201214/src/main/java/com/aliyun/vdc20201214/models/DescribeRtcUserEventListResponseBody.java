// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcUserEventListResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 指标列表
    @NameInMap("Events")
    public java.util.List<DescribeRtcUserEventListResponseBodyEvents> events;

    public static DescribeRtcUserEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserEventListResponseBody self = new DescribeRtcUserEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcUserEventListResponseBody setEvents(java.util.List<DescribeRtcUserEventListResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeRtcUserEventListResponseBodyEvents> getEvents() {
        return this.events;
    }

    public static class DescribeRtcUserEventListResponseBodyEvents extends TeaModel {
        // 时间发生unix timestamp
        @NameInMap("EventTime")
        public Long eventTime;

        // 事件Id
        @NameInMap("EventId")
        public Integer eventId;

        // 事件类型
        @NameInMap("Category")
        public String category;

        public static DescribeRtcUserEventListResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcUserEventListResponseBodyEvents self = new DescribeRtcUserEventListResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeRtcUserEventListResponseBodyEvents setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public DescribeRtcUserEventListResponseBodyEvents setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeRtcUserEventListResponseBodyEvents setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

}

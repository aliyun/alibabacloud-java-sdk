// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcUserEventListResponseBody extends TeaModel {
    // 指标列表
    @NameInMap("Events")
    public java.util.List<DescribeRtcUserEventListResponseBodyEvents> events;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRtcUserEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserEventListResponseBody self = new DescribeRtcUserEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserEventListResponseBody setEvents(java.util.List<DescribeRtcUserEventListResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeRtcUserEventListResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeRtcUserEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRtcUserEventListResponseBodyEvents extends TeaModel {
        // 事件类型
        @NameInMap("Category")
        public String category;

        // 事件Id
        @NameInMap("EventId")
        public Integer eventId;

        // 时间发生unix timestamp
        @NameInMap("EventTime")
        public Long eventTime;

        public static DescribeRtcUserEventListResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcUserEventListResponseBodyEvents self = new DescribeRtcUserEventListResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeRtcUserEventListResponseBodyEvents setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRtcUserEventListResponseBodyEvents setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeRtcUserEventListResponseBodyEvents setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

    }

}

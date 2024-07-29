// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAllCallbackResponseBody extends TeaModel {
    @NameInMap("Callbacks")
    public java.util.List<DescribeAllCallbackResponseBodyCallbacks> callbacks;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAllCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllCallbackResponseBody self = new DescribeAllCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllCallbackResponseBody setCallbacks(java.util.List<DescribeAllCallbackResponseBodyCallbacks> callbacks) {
        this.callbacks = callbacks;
        return this;
    }
    public java.util.List<DescribeAllCallbackResponseBodyCallbacks> getCallbacks() {
        return this.callbacks;
    }

    public DescribeAllCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAllCallbackResponseBodyCallbacksSubEvent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Event")
        public Integer event;

        /**
         * <strong>example:</strong>
         * <p>录制开始</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static DescribeAllCallbackResponseBodyCallbacksSubEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllCallbackResponseBodyCallbacksSubEvent self = new DescribeAllCallbackResponseBodyCallbacksSubEvent();
            return TeaModel.build(map, self);
        }

        public DescribeAllCallbackResponseBodyCallbacksSubEvent setEvent(Integer event) {
            this.event = event;
            return this;
        }
        public Integer getEvent() {
            return this.event;
        }

        public DescribeAllCallbackResponseBodyCallbacksSubEvent setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeAllCallbackResponseBodyCallbacksSubEvent setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeAllCallbackResponseBodyCallbacks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RecordEvent</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>录制回调</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("SubEvent")
        public java.util.List<DescribeAllCallbackResponseBodyCallbacksSubEvent> subEvent;

        public static DescribeAllCallbackResponseBodyCallbacks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllCallbackResponseBodyCallbacks self = new DescribeAllCallbackResponseBodyCallbacks();
            return TeaModel.build(map, self);
        }

        public DescribeAllCallbackResponseBodyCallbacks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAllCallbackResponseBodyCallbacks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAllCallbackResponseBodyCallbacks setSubEvent(java.util.List<DescribeAllCallbackResponseBodyCallbacksSubEvent> subEvent) {
            this.subEvent = subEvent;
            return this;
        }
        public java.util.List<DescribeAllCallbackResponseBodyCallbacksSubEvent> getSubEvent() {
            return this.subEvent;
        }

    }

}

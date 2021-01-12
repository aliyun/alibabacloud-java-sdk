// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeNextEventForSignResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EventItems")
    public DescribeNextEventForSignResponseBodyEventItems eventItems;

    public static DescribeNextEventForSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNextEventForSignResponseBody self = new DescribeNextEventForSignResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNextEventForSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNextEventForSignResponseBody setEventItems(DescribeNextEventForSignResponseBodyEventItems eventItems) {
        this.eventItems = eventItems;
        return this;
    }
    public DescribeNextEventForSignResponseBodyEventItems getEventItems() {
        return this.eventItems;
    }

    public static class DescribeNextEventForSignResponseBodyEventItemsEventItems extends TeaModel {
        @NameInMap("EventId")
        public Integer eventId;

        @NameInMap("EventContent")
        public String eventContent;

        public static DescribeNextEventForSignResponseBodyEventItemsEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeNextEventForSignResponseBodyEventItemsEventItems self = new DescribeNextEventForSignResponseBodyEventItemsEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeNextEventForSignResponseBodyEventItemsEventItems setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeNextEventForSignResponseBodyEventItemsEventItems setEventContent(String eventContent) {
            this.eventContent = eventContent;
            return this;
        }
        public String getEventContent() {
            return this.eventContent;
        }

    }

    public static class DescribeNextEventForSignResponseBodyEventItems extends TeaModel {
        @NameInMap("EventItems")
        public java.util.List<DescribeNextEventForSignResponseBodyEventItemsEventItems> eventItems;

        public static DescribeNextEventForSignResponseBodyEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeNextEventForSignResponseBodyEventItems self = new DescribeNextEventForSignResponseBodyEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeNextEventForSignResponseBodyEventItems setEventItems(java.util.List<DescribeNextEventForSignResponseBodyEventItemsEventItems> eventItems) {
            this.eventItems = eventItems;
            return this;
        }
        public java.util.List<DescribeNextEventForSignResponseBodyEventItemsEventItems> getEventItems() {
            return this.eventItems;
        }

    }

}

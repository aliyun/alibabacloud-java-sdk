// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeNextEventForSignResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EventItems")
    @Validation(required = true)
    public DescribeNextEventForSignResponseEventItems eventItems;

    public static DescribeNextEventForSignResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNextEventForSignResponse self = new DescribeNextEventForSignResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNextEventForSignResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNextEventForSignResponse setEventItems(DescribeNextEventForSignResponseEventItems eventItems) {
        this.eventItems = eventItems;
        return this;
    }
    public DescribeNextEventForSignResponseEventItems getEventItems() {
        return this.eventItems;
    }

    public static class DescribeNextEventForSignResponseEventItemsEventItems extends TeaModel {
        @NameInMap("EventId")
        @Validation(required = true)
        public Integer eventId;

        @NameInMap("EventContent")
        @Validation(required = true)
        public String eventContent;

        public static DescribeNextEventForSignResponseEventItemsEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeNextEventForSignResponseEventItemsEventItems self = new DescribeNextEventForSignResponseEventItemsEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeNextEventForSignResponseEventItemsEventItems setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeNextEventForSignResponseEventItemsEventItems setEventContent(String eventContent) {
            this.eventContent = eventContent;
            return this;
        }
        public String getEventContent() {
            return this.eventContent;
        }

    }

    public static class DescribeNextEventForSignResponseEventItems extends TeaModel {
        @NameInMap("EventItems")
        @Validation(required = true)
        public java.util.List<DescribeNextEventForSignResponseEventItemsEventItems> eventItems;

        public static DescribeNextEventForSignResponseEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeNextEventForSignResponseEventItems self = new DescribeNextEventForSignResponseEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeNextEventForSignResponseEventItems setEventItems(java.util.List<DescribeNextEventForSignResponseEventItemsEventItems> eventItems) {
            this.eventItems = eventItems;
            return this;
        }
        public java.util.List<DescribeNextEventForSignResponseEventItemsEventItems> getEventItems() {
            return this.eventItems;
        }

    }

}

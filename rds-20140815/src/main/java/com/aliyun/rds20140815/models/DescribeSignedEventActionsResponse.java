// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSignedEventActionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextPageEventId")
    @Validation(required = true)
    public Integer nextPageEventId;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("FromBegin")
    @Validation(required = true)
    public Boolean fromBegin;

    @NameInMap("ToEnd")
    @Validation(required = true)
    public Boolean toEnd;

    @NameInMap("EventItems")
    @Validation(required = true)
    public DescribeSignedEventActionsResponseEventItems eventItems;

    public static DescribeSignedEventActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignedEventActionsResponse self = new DescribeSignedEventActionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSignedEventActionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSignedEventActionsResponse setNextPageEventId(Integer nextPageEventId) {
        this.nextPageEventId = nextPageEventId;
        return this;
    }
    public Integer getNextPageEventId() {
        return this.nextPageEventId;
    }

    public DescribeSignedEventActionsResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSignedEventActionsResponse setFromBegin(Boolean fromBegin) {
        this.fromBegin = fromBegin;
        return this;
    }
    public Boolean getFromBegin() {
        return this.fromBegin;
    }

    public DescribeSignedEventActionsResponse setToEnd(Boolean toEnd) {
        this.toEnd = toEnd;
        return this;
    }
    public Boolean getToEnd() {
        return this.toEnd;
    }

    public DescribeSignedEventActionsResponse setEventItems(DescribeSignedEventActionsResponseEventItems eventItems) {
        this.eventItems = eventItems;
        return this;
    }
    public DescribeSignedEventActionsResponseEventItems getEventItems() {
        return this.eventItems;
    }

    public static class DescribeSignedEventActionsResponseEventItemsEventItems extends TeaModel {
        @NameInMap("EventId")
        @Validation(required = true)
        public Integer eventId;

        @NameInMap("EventContent")
        @Validation(required = true)
        public String eventContent;

        @NameInMap("EventSig")
        @Validation(required = true)
        public String eventSig;

        @NameInMap("EventRcpt")
        @Validation(required = true)
        public String eventRcpt;

        public static DescribeSignedEventActionsResponseEventItemsEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignedEventActionsResponseEventItemsEventItems self = new DescribeSignedEventActionsResponseEventItemsEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeSignedEventActionsResponseEventItemsEventItems setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeSignedEventActionsResponseEventItemsEventItems setEventContent(String eventContent) {
            this.eventContent = eventContent;
            return this;
        }
        public String getEventContent() {
            return this.eventContent;
        }

        public DescribeSignedEventActionsResponseEventItemsEventItems setEventSig(String eventSig) {
            this.eventSig = eventSig;
            return this;
        }
        public String getEventSig() {
            return this.eventSig;
        }

        public DescribeSignedEventActionsResponseEventItemsEventItems setEventRcpt(String eventRcpt) {
            this.eventRcpt = eventRcpt;
            return this;
        }
        public String getEventRcpt() {
            return this.eventRcpt;
        }

    }

    public static class DescribeSignedEventActionsResponseEventItems extends TeaModel {
        @NameInMap("EventItems")
        @Validation(required = true)
        public java.util.List<DescribeSignedEventActionsResponseEventItemsEventItems> eventItems;

        public static DescribeSignedEventActionsResponseEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignedEventActionsResponseEventItems self = new DescribeSignedEventActionsResponseEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeSignedEventActionsResponseEventItems setEventItems(java.util.List<DescribeSignedEventActionsResponseEventItemsEventItems> eventItems) {
            this.eventItems = eventItems;
            return this;
        }
        public java.util.List<DescribeSignedEventActionsResponseEventItemsEventItems> getEventItems() {
            return this.eventItems;
        }

    }

}

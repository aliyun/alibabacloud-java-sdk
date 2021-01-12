// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSignedEventActionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextPageEventId")
    public Integer nextPageEventId;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("FromBegin")
    public Boolean fromBegin;

    @NameInMap("ToEnd")
    public Boolean toEnd;

    @NameInMap("EventItems")
    public DescribeSignedEventActionsResponseBodyEventItems eventItems;

    public static DescribeSignedEventActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignedEventActionsResponseBody self = new DescribeSignedEventActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSignedEventActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSignedEventActionsResponseBody setNextPageEventId(Integer nextPageEventId) {
        this.nextPageEventId = nextPageEventId;
        return this;
    }
    public Integer getNextPageEventId() {
        return this.nextPageEventId;
    }

    public DescribeSignedEventActionsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSignedEventActionsResponseBody setFromBegin(Boolean fromBegin) {
        this.fromBegin = fromBegin;
        return this;
    }
    public Boolean getFromBegin() {
        return this.fromBegin;
    }

    public DescribeSignedEventActionsResponseBody setToEnd(Boolean toEnd) {
        this.toEnd = toEnd;
        return this;
    }
    public Boolean getToEnd() {
        return this.toEnd;
    }

    public DescribeSignedEventActionsResponseBody setEventItems(DescribeSignedEventActionsResponseBodyEventItems eventItems) {
        this.eventItems = eventItems;
        return this;
    }
    public DescribeSignedEventActionsResponseBodyEventItems getEventItems() {
        return this.eventItems;
    }

    public static class DescribeSignedEventActionsResponseBodyEventItemsEventItems extends TeaModel {
        @NameInMap("EventId")
        public Integer eventId;

        @NameInMap("EventContent")
        public String eventContent;

        @NameInMap("EventSig")
        public String eventSig;

        @NameInMap("EventRcpt")
        public String eventRcpt;

        public static DescribeSignedEventActionsResponseBodyEventItemsEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignedEventActionsResponseBodyEventItemsEventItems self = new DescribeSignedEventActionsResponseBodyEventItemsEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeSignedEventActionsResponseBodyEventItemsEventItems setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeSignedEventActionsResponseBodyEventItemsEventItems setEventContent(String eventContent) {
            this.eventContent = eventContent;
            return this;
        }
        public String getEventContent() {
            return this.eventContent;
        }

        public DescribeSignedEventActionsResponseBodyEventItemsEventItems setEventSig(String eventSig) {
            this.eventSig = eventSig;
            return this;
        }
        public String getEventSig() {
            return this.eventSig;
        }

        public DescribeSignedEventActionsResponseBodyEventItemsEventItems setEventRcpt(String eventRcpt) {
            this.eventRcpt = eventRcpt;
            return this;
        }
        public String getEventRcpt() {
            return this.eventRcpt;
        }

    }

    public static class DescribeSignedEventActionsResponseBodyEventItems extends TeaModel {
        @NameInMap("EventItems")
        public java.util.List<DescribeSignedEventActionsResponseBodyEventItemsEventItems> eventItems;

        public static DescribeSignedEventActionsResponseBodyEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignedEventActionsResponseBodyEventItems self = new DescribeSignedEventActionsResponseBodyEventItems();
            return TeaModel.build(map, self);
        }

        public DescribeSignedEventActionsResponseBodyEventItems setEventItems(java.util.List<DescribeSignedEventActionsResponseBodyEventItemsEventItems> eventItems) {
            this.eventItems = eventItems;
            return this;
        }
        public java.util.List<DescribeSignedEventActionsResponseBodyEventItemsEventItems> getEventItems() {
            return this.eventItems;
        }

    }

}

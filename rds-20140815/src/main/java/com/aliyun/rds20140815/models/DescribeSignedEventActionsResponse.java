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

    }

    public static class DescribeSignedEventActionsResponseEventItems extends TeaModel {
        @NameInMap("EventItems")
        @Validation(required = true)
        public java.util.List<DescribeSignedEventActionsResponseEventItemsEventItems> eventItems;

        public static DescribeSignedEventActionsResponseEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSignedEventActionsResponseEventItems self = new DescribeSignedEventActionsResponseEventItems();
            return TeaModel.build(map, self);
        }

    }

}

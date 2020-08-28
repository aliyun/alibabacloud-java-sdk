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

    }

    public static class DescribeNextEventForSignResponseEventItems extends TeaModel {
        @NameInMap("EventItems")
        @Validation(required = true)
        public java.util.List<DescribeNextEventForSignResponseEventItemsEventItems> eventItems;

        public static DescribeNextEventForSignResponseEventItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeNextEventForSignResponseEventItems self = new DescribeNextEventForSignResponseEventItems();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsStatResponseBody extends TeaModel {
    /**
     * <p>The event.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryEventsStatResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E52666CC-330E-418A-8E5B-A19E3FB42D13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHistoryEventsStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryEventsStatResponseBody self = new DescribeHistoryEventsStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryEventsStatResponseBody setItems(java.util.List<DescribeHistoryEventsStatResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHistoryEventsStatResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeHistoryEventsStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHistoryEventsStatResponseBodyItems extends TeaModel {
        /**
         * <p>The system event category. For more information, see <a href="https://help.aliyun.com/document_detail/129759.html">View the event history of an ApsaraDB RDS instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Exception</p>
         */
        @NameInMap("EventCategory")
        public String eventCategory;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeHistoryEventsStatResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryEventsStatResponseBodyItems self = new DescribeHistoryEventsStatResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryEventsStatResponseBodyItems setEventCategory(String eventCategory) {
            this.eventCategory = eventCategory;
            return this;
        }
        public String getEventCategory() {
            return this.eventCategory;
        }

        public DescribeHistoryEventsStatResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

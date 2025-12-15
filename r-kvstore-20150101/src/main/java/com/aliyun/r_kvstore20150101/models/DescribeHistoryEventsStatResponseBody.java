// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsStatResponseBody extends TeaModel {
    /**
     * <p>The queried events.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryEventsStatResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B32A350C-3A8E-5FF1-A56F-51C3769D****</p>
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
         * <p>The system event category. Valid values:</p>
         * <ul>
         * <li><strong>Exception</strong>: abnormal events</li>
         * <li><strong>Optimize</strong>: optimization events.</li>
         * <li><strong>Notification</strong>: notification events.</li>
         * <li><strong>Maintenance</strong>: scheduled maintenance events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exception</p>
         */
        @NameInMap("EventCategory")
        public String eventCategory;

        /**
         * <p>The total number of returned events.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
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

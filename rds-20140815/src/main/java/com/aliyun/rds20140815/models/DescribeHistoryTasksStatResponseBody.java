// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksStatResponseBody extends TeaModel {
    /**
     * <p>The queried tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryTasksStatResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHistoryTasksStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksStatResponseBody self = new DescribeHistoryTasksStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksStatResponseBody setItems(java.util.List<DescribeHistoryTasksStatResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHistoryTasksStatResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeHistoryTasksStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHistoryTasksStatResponseBodyItems extends TeaModel {
        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>Scheduled</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Succeed</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>Cancelling</strong></li>
         * <li><strong>Canceled</strong></li>
         * <li><strong>Waiting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed,Waiting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeHistoryTasksStatResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryTasksStatResponseBodyItems self = new DescribeHistoryTasksStatResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryTasksStatResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHistoryTasksStatResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

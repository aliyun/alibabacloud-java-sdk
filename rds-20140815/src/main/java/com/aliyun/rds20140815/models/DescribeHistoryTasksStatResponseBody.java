// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksStatResponseBody extends TeaModel {
    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryTasksStatResponseBodyItems> items;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The status of the migration task. Valid values:</p>
         * <br>
         * <p>*   **NoStart**: The task is not started.</p>
         * <p>*   **Running**:The task is in progress.</p>
         * <p>*   **Success**: The task is successful.</p>
         * <p>*   **Failed**: The task failed.</p>
         * <p>*   **Waiting**: The task is waiting for an incremental backup file to be imported.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of tasks that meet these constraints without taking pagination into account.</p>
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

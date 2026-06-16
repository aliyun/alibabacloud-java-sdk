// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMonitorTaskLimitResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response object.</p>
     */
    @NameInMap("resultObject")
    public DescribeMonitorTaskLimitResponseBodyResultObject resultObject;

    public static DescribeMonitorTaskLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorTaskLimitResponseBody self = new DescribeMonitorTaskLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorTaskLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorTaskLimitResponseBody setResultObject(DescribeMonitorTaskLimitResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeMonitorTaskLimitResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeMonitorTaskLimitResponseBodyResultObject extends TeaModel {
        /**
         * <p>Indicates whether the maximum number is reached.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("limit")
        public Boolean limit;

        /**
         * <p>The maximum number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("maxTotalItem")
        public Integer maxTotalItem;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("totalItem")
        public Integer totalItem;

        public static DescribeMonitorTaskLimitResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorTaskLimitResponseBodyResultObject self = new DescribeMonitorTaskLimitResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorTaskLimitResponseBodyResultObject setLimit(Boolean limit) {
            this.limit = limit;
            return this;
        }
        public Boolean getLimit() {
            return this.limit;
        }

        public DescribeMonitorTaskLimitResponseBodyResultObject setMaxTotalItem(Integer maxTotalItem) {
            this.maxTotalItem = maxTotalItem;
            return this;
        }
        public Integer getMaxTotalItem() {
            return this.maxTotalItem;
        }

        public DescribeMonitorTaskLimitResponseBodyResultObject setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

    }

}

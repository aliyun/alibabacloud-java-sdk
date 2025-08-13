// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListLimitResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public DescribeNameListLimitResponseBodyResultObject resultObject;

    public static DescribeNameListLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListLimitResponseBody self = new DescribeNameListLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNameListLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNameListLimitResponseBody setResultObject(DescribeNameListLimitResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeNameListLimitResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeNameListLimitResponseBodyResultObject extends TeaModel {
        /**
         * <p>Whether it exceeds the maximum quantity</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("limit")
        public Boolean limit;

        /**
         * <p>Maximum number of creatable items</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxTotalItem")
        public Long maxTotalItem;

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("totalItem")
        public Long totalItem;

        public static DescribeNameListLimitResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeNameListLimitResponseBodyResultObject self = new DescribeNameListLimitResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeNameListLimitResponseBodyResultObject setLimit(Boolean limit) {
            this.limit = limit;
            return this;
        }
        public Boolean getLimit() {
            return this.limit;
        }

        public DescribeNameListLimitResponseBodyResultObject setMaxTotalItem(Long maxTotalItem) {
            this.maxTotalItem = maxTotalItem;
            return this;
        }
        public Long getMaxTotalItem() {
            return this.maxTotalItem;
        }

        public DescribeNameListLimitResponseBodyResultObject setTotalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Long getTotalItem() {
            return this.totalItem;
        }

    }

}

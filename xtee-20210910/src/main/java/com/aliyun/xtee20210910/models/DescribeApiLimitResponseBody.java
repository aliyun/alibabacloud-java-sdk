// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiLimitResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DescribeApiLimitResponseBodyResultObject resultObject;

    public static DescribeApiLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiLimitResponseBody self = new DescribeApiLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiLimitResponseBody setResultObject(DescribeApiLimitResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeApiLimitResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeApiLimitResponseBodyResultObject extends TeaModel {
        /**
         * <p>Whether the maximum number has been exceeded</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("limit")
        public Boolean limit;

        /**
         * <p>Maximum number of items that can be created</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("maxTotalItem")
        public Long maxTotalItem;

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("totalItem")
        public Long totalItem;

        public static DescribeApiLimitResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiLimitResponseBodyResultObject self = new DescribeApiLimitResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeApiLimitResponseBodyResultObject setLimit(Boolean limit) {
            this.limit = limit;
            return this;
        }
        public Boolean getLimit() {
            return this.limit;
        }

        public DescribeApiLimitResponseBodyResultObject setMaxTotalItem(Long maxTotalItem) {
            this.maxTotalItem = maxTotalItem;
            return this;
        }
        public Long getMaxTotalItem() {
            return this.maxTotalItem;
        }

        public DescribeApiLimitResponseBodyResultObject setTotalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Long getTotalItem() {
            return this.totalItem;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiLimitResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("limit")
        public Boolean limit;

        @NameInMap("maxTotalItem")
        public Long maxTotalItem;

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

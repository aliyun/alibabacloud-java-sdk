// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListLimitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("limit")
        public Boolean limit;

        @NameInMap("maxTotalItem")
        public Long maxTotalItem;

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

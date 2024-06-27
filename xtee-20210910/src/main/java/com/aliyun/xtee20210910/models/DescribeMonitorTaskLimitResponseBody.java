// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMonitorTaskLimitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("limit")
        public Boolean limit;

        @NameInMap("maxTotalItem")
        public Integer maxTotalItem;

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

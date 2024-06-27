// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplateCountResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeTemplateCountResponseBodyResultObject resultObject;

    public static DescribeTemplateCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateCountResponseBody self = new DescribeTemplateCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateCountResponseBody setResultObject(DescribeTemplateCountResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeTemplateCountResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeTemplateCountResponseBodyResultObject extends TeaModel {
        @NameInMap("limit")
        public Boolean limit;

        @NameInMap("maxTotalItem")
        public Integer maxTotalItem;

        @NameInMap("totalItem")
        public Integer totalItem;

        public static DescribeTemplateCountResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateCountResponseBodyResultObject self = new DescribeTemplateCountResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateCountResponseBodyResultObject setLimit(Boolean limit) {
            this.limit = limit;
            return this;
        }
        public Boolean getLimit() {
            return this.limit;
        }

        public DescribeTemplateCountResponseBodyResultObject setMaxTotalItem(Integer maxTotalItem) {
            this.maxTotalItem = maxTotalItem;
            return this;
        }
        public Integer getMaxTotalItem() {
            return this.maxTotalItem;
        }

        public DescribeTemplateCountResponseBodyResultObject setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeInputFeildCountByEventCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeInputFeildCountByEventCodeResponseBodyResultObject resultObject;

    public static DescribeInputFeildCountByEventCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInputFeildCountByEventCodeResponseBody self = new DescribeInputFeildCountByEventCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInputFeildCountByEventCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInputFeildCountByEventCodeResponseBody setResultObject(DescribeInputFeildCountByEventCodeResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeInputFeildCountByEventCodeResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeInputFeildCountByEventCodeResponseBodyResultObject extends TeaModel {
        @NameInMap("limit")
        public Boolean limit;

        @NameInMap("maxTotalItem")
        public Integer maxTotalItem;

        @NameInMap("totalItem")
        public Integer totalItem;

        public static DescribeInputFeildCountByEventCodeResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeInputFeildCountByEventCodeResponseBodyResultObject self = new DescribeInputFeildCountByEventCodeResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeInputFeildCountByEventCodeResponseBodyResultObject setLimit(Boolean limit) {
            this.limit = limit;
            return this;
        }
        public Boolean getLimit() {
            return this.limit;
        }

        public DescribeInputFeildCountByEventCodeResponseBodyResultObject setMaxTotalItem(Integer maxTotalItem) {
            this.maxTotalItem = maxTotalItem;
            return this;
        }
        public Integer getMaxTotalItem() {
            return this.maxTotalItem;
        }

        public DescribeInputFeildCountByEventCodeResponseBodyResultObject setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

    }

}

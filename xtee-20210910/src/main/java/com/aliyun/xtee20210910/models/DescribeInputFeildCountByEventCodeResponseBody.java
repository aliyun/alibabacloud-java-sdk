// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeInputFeildCountByEventCodeResponseBody extends TeaModel {
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
        /**
         * <p>Whether it exceeds the maximum quantity</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("limit")
        public Boolean limit;

        /**
         * <p>Maximum number of created items</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxTotalItem")
        public Integer maxTotalItem;

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
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

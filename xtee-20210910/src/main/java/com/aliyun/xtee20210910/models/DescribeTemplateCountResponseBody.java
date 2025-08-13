// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplateCountResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
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
        /**
         * <p>Template quantity limit.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("limit")
        public Boolean limit;

        /**
         * <p>Maximum count</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("maxTotalItem")
        public Integer maxTotalItem;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleCountByUserIdResponseBody extends TeaModel {
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
    public DescribeRuleCountByUserIdResponseBodyResultObject resultObject;

    public static DescribeRuleCountByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleCountByUserIdResponseBody self = new DescribeRuleCountByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleCountByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleCountByUserIdResponseBody setResultObject(DescribeRuleCountByUserIdResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeRuleCountByUserIdResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeRuleCountByUserIdResponseBodyResultObject extends TeaModel {
        /**
         * <p>Indicates whether the limit condition is reached. Valid values: - <strong>true</strong>: The limit condition is reached. - <strong>false</strong>: The limit condition is not reached.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("limit")
        public Boolean limit;

        /**
         * <p>The maximum number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxTotalItem")
        public Integer maxTotalItem;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("totalItem")
        public Integer totalItem;

        public static DescribeRuleCountByUserIdResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleCountByUserIdResponseBodyResultObject self = new DescribeRuleCountByUserIdResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRuleCountByUserIdResponseBodyResultObject setLimit(Boolean limit) {
            this.limit = limit;
            return this;
        }
        public Boolean getLimit() {
            return this.limit;
        }

        public DescribeRuleCountByUserIdResponseBodyResultObject setMaxTotalItem(Integer maxTotalItem) {
            this.maxTotalItem = maxTotalItem;
            return this;
        }
        public Integer getMaxTotalItem() {
            return this.maxTotalItem;
        }

        public DescribeRuleCountByUserIdResponseBodyResultObject setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

    }

}

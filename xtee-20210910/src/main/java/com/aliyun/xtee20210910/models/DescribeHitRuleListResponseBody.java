// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHitRuleListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Response object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeHitRuleListResponseBodyResultObject> resultObject;

    public static DescribeHitRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHitRuleListResponseBody self = new DescribeHitRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHitRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHitRuleListResponseBody setResultObject(java.util.List<DescribeHitRuleListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeHitRuleListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeHitRuleListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Number of hits.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("hitCount")
        public Integer hitCount;

        /**
         * <p>Strategy name</p>
         * 
         * <strong>example:</strong>
         * <p>营销风险识别</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        public static DescribeHitRuleListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeHitRuleListResponseBodyResultObject self = new DescribeHitRuleListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeHitRuleListResponseBodyResultObject setHitCount(Integer hitCount) {
            this.hitCount = hitCount;
            return this;
        }
        public Integer getHitCount() {
            return this.hitCount;
        }

        public DescribeHitRuleListResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}

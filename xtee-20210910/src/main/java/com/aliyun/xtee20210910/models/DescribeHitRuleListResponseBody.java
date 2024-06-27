// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHitRuleListResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("hitCount")
        public Integer hitCount;

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

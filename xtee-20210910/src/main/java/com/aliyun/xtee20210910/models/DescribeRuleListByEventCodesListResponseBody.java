// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleListByEventCodesListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeRuleListByEventCodesListResponseBodyResultObject> resultObject;

    public static DescribeRuleListByEventCodesListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleListByEventCodesListResponseBody self = new DescribeRuleListByEventCodesListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleListByEventCodesListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleListByEventCodesListResponseBody setResultObject(java.util.List<DescribeRuleListByEventCodesListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeRuleListByEventCodesListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeRuleListByEventCodesListResponseBodyResultObject extends TeaModel {
        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("ruleName")
        public String ruleName;

        public static DescribeRuleListByEventCodesListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleListByEventCodesListResponseBodyResultObject self = new DescribeRuleListByEventCodesListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRuleListByEventCodesListResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRuleListByEventCodesListResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}

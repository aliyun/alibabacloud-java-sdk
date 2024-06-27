// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHitRuleFluctuationResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeHitRuleFluctuationResponseBodyResultObject> resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeHitRuleFluctuationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHitRuleFluctuationResponseBody self = new DescribeHitRuleFluctuationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHitRuleFluctuationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHitRuleFluctuationResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeHitRuleFluctuationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHitRuleFluctuationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHitRuleFluctuationResponseBody setResultObject(java.util.List<DescribeHitRuleFluctuationResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeHitRuleFluctuationResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeHitRuleFluctuationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeHitRuleFluctuationResponseBodyResultObject extends TeaModel {
        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("ruleName")
        public String ruleName;

        @NameInMap("todayNum")
        public Long todayNum;

        @NameInMap("withinSevenDayNum")
        public String withinSevenDayNum;

        @NameInMap("withinThirtyDayNum")
        public String withinThirtyDayNum;

        @NameInMap("withinThreeDayNum")
        public String withinThreeDayNum;

        @NameInMap("yesterdayNum")
        public Long yesterdayNum;

        public static DescribeHitRuleFluctuationResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeHitRuleFluctuationResponseBodyResultObject self = new DescribeHitRuleFluctuationResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeHitRuleFluctuationResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeHitRuleFluctuationResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeHitRuleFluctuationResponseBodyResultObject setTodayNum(Long todayNum) {
            this.todayNum = todayNum;
            return this;
        }
        public Long getTodayNum() {
            return this.todayNum;
        }

        public DescribeHitRuleFluctuationResponseBodyResultObject setWithinSevenDayNum(String withinSevenDayNum) {
            this.withinSevenDayNum = withinSevenDayNum;
            return this;
        }
        public String getWithinSevenDayNum() {
            return this.withinSevenDayNum;
        }

        public DescribeHitRuleFluctuationResponseBodyResultObject setWithinThirtyDayNum(String withinThirtyDayNum) {
            this.withinThirtyDayNum = withinThirtyDayNum;
            return this;
        }
        public String getWithinThirtyDayNum() {
            return this.withinThirtyDayNum;
        }

        public DescribeHitRuleFluctuationResponseBodyResultObject setWithinThreeDayNum(String withinThreeDayNum) {
            this.withinThreeDayNum = withinThreeDayNum;
            return this;
        }
        public String getWithinThreeDayNum() {
            return this.withinThreeDayNum;
        }

        public DescribeHitRuleFluctuationResponseBodyResultObject setYesterdayNum(Long yesterdayNum) {
            this.yesterdayNum = yesterdayNum;
            return this;
        }
        public Long getYesterdayNum() {
            return this.yesterdayNum;
        }

    }

}

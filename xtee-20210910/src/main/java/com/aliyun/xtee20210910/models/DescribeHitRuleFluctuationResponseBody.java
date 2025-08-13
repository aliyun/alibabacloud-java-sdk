// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHitRuleFluctuationResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The input parameter data is not valid. order_storage_company_num component not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeHitRuleFluctuationResponseBodyResultObject> resultObject;

    /**
     * <p>Whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>115019</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Policy name</p>
         * 
         * <strong>example:</strong>
         * <p>营销风险识别</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>Today\&quot;s count</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("todayNum")
        public Long todayNum;

        /**
         * <p>Count within seven days</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("withinSevenDayNum")
        public String withinSevenDayNum;

        /**
         * <p>Count within thirty days</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("withinThirtyDayNum")
        public String withinThirtyDayNum;

        /**
         * <p>Count within three days</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("withinThreeDayNum")
        public String withinThreeDayNum;

        /**
         * <p>Yesterday\&quot;s count</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
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

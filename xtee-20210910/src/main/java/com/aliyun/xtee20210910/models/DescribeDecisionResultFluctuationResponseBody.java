// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDecisionResultFluctuationResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeDecisionResultFluctuationResponseBodyResultObject> resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeDecisionResultFluctuationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDecisionResultFluctuationResponseBody self = new DescribeDecisionResultFluctuationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDecisionResultFluctuationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDecisionResultFluctuationResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDecisionResultFluctuationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDecisionResultFluctuationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDecisionResultFluctuationResponseBody setResultObject(java.util.List<DescribeDecisionResultFluctuationResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeDecisionResultFluctuationResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeDecisionResultFluctuationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDecisionResultFluctuationResponseBodyResultObject extends TeaModel {
        @NameInMap("status")
        public String status;

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

        public static DescribeDecisionResultFluctuationResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeDecisionResultFluctuationResponseBodyResultObject self = new DescribeDecisionResultFluctuationResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeDecisionResultFluctuationResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDecisionResultFluctuationResponseBodyResultObject setTodayNum(Long todayNum) {
            this.todayNum = todayNum;
            return this;
        }
        public Long getTodayNum() {
            return this.todayNum;
        }

        public DescribeDecisionResultFluctuationResponseBodyResultObject setWithinSevenDayNum(String withinSevenDayNum) {
            this.withinSevenDayNum = withinSevenDayNum;
            return this;
        }
        public String getWithinSevenDayNum() {
            return this.withinSevenDayNum;
        }

        public DescribeDecisionResultFluctuationResponseBodyResultObject setWithinThirtyDayNum(String withinThirtyDayNum) {
            this.withinThirtyDayNum = withinThirtyDayNum;
            return this;
        }
        public String getWithinThirtyDayNum() {
            return this.withinThirtyDayNum;
        }

        public DescribeDecisionResultFluctuationResponseBodyResultObject setWithinThreeDayNum(String withinThreeDayNum) {
            this.withinThreeDayNum = withinThreeDayNum;
            return this;
        }
        public String getWithinThreeDayNum() {
            return this.withinThreeDayNum;
        }

        public DescribeDecisionResultFluctuationResponseBodyResultObject setYesterdayNum(Long yesterdayNum) {
            this.yesterdayNum = yesterdayNum;
            return this;
        }
        public Long getYesterdayNum() {
            return this.yesterdayNum;
        }

    }

}

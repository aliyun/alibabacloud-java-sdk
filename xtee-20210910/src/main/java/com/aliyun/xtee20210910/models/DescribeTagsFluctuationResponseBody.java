// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsFluctuationResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeTagsFluctuationResponseBodyResultObject> resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeTagsFluctuationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsFluctuationResponseBody self = new DescribeTagsFluctuationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsFluctuationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTagsFluctuationResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTagsFluctuationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTagsFluctuationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsFluctuationResponseBody setResultObject(java.util.List<DescribeTagsFluctuationResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeTagsFluctuationResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeTagsFluctuationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTagsFluctuationResponseBodyResultObject extends TeaModel {
        @NameInMap("tableName")
        public String tableName;

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

        public static DescribeTagsFluctuationResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsFluctuationResponseBodyResultObject self = new DescribeTagsFluctuationResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTagsFluctuationResponseBodyResultObject setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeTagsFluctuationResponseBodyResultObject setTodayNum(Long todayNum) {
            this.todayNum = todayNum;
            return this;
        }
        public Long getTodayNum() {
            return this.todayNum;
        }

        public DescribeTagsFluctuationResponseBodyResultObject setWithinSevenDayNum(String withinSevenDayNum) {
            this.withinSevenDayNum = withinSevenDayNum;
            return this;
        }
        public String getWithinSevenDayNum() {
            return this.withinSevenDayNum;
        }

        public DescribeTagsFluctuationResponseBodyResultObject setWithinThirtyDayNum(String withinThirtyDayNum) {
            this.withinThirtyDayNum = withinThirtyDayNum;
            return this;
        }
        public String getWithinThirtyDayNum() {
            return this.withinThirtyDayNum;
        }

        public DescribeTagsFluctuationResponseBodyResultObject setWithinThreeDayNum(String withinThreeDayNum) {
            this.withinThreeDayNum = withinThreeDayNum;
            return this;
        }
        public String getWithinThreeDayNum() {
            return this.withinThreeDayNum;
        }

        public DescribeTagsFluctuationResponseBodyResultObject setYesterdayNum(Long yesterdayNum) {
            this.yesterdayNum = yesterdayNum;
            return this;
        }
        public Long getYesterdayNum() {
            return this.yesterdayNum;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsFluctuationResponseBody extends TeaModel {
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
    public java.util.List<DescribeTagsFluctuationResponseBodyResultObject> resultObject;

    /**
     * <p>Indicates whether the call was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Tag name</p>
         * 
         * <strong>example:</strong>
         * <p>accountId</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>Data for today</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("todayNum")
        public Long todayNum;

        /**
         * <p>Data for the last seven days</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("withinSevenDayNum")
        public String withinSevenDayNum;

        /**
         * <p>Data for the last thirty days</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("withinThirtyDayNum")
        public String withinThirtyDayNum;

        /**
         * <p>Data for the last three days</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("withinThreeDayNum")
        public String withinThreeDayNum;

        /**
         * <p>Data for yesterday</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
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

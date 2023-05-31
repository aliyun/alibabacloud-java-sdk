// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventLevelCountResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The statistics of alerts by risk level.</p>
     */
    @NameInMap("EventLevels")
    public DescribeEventLevelCountResponseBodyEventLevels eventLevels;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeEventLevelCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLevelCountResponseBody self = new DescribeEventLevelCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventLevelCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventLevelCountResponseBody setEventLevels(DescribeEventLevelCountResponseBodyEventLevels eventLevels) {
        this.eventLevels = eventLevels;
        return this;
    }
    public DescribeEventLevelCountResponseBodyEventLevels getEventLevels() {
        return this.eventLevels;
    }

    public DescribeEventLevelCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventLevelCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventLevelCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEventLevelCountResponseBodyEventLevels extends TeaModel {
        /**
         * <p>The number of alerts whose Emergency level is Reminder.</p>
         */
        @NameInMap("Remind")
        public Integer remind;

        /**
         * <p>The number of alerts whose Emergency level is Urgent.</p>
         */
        @NameInMap("Serious")
        public Integer serious;

        /**
         * <p>The number of alerts whose Emergency level is Suspicious.</p>
         */
        @NameInMap("Suspicious")
        public Integer suspicious;

        public static DescribeEventLevelCountResponseBodyEventLevels build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventLevelCountResponseBodyEventLevels self = new DescribeEventLevelCountResponseBodyEventLevels();
            return TeaModel.build(map, self);
        }

        public DescribeEventLevelCountResponseBodyEventLevels setRemind(Integer remind) {
            this.remind = remind;
            return this;
        }
        public Integer getRemind() {
            return this.remind;
        }

        public DescribeEventLevelCountResponseBodyEventLevels setSerious(Integer serious) {
            this.serious = serious;
            return this;
        }
        public Integer getSerious() {
            return this.serious;
        }

        public DescribeEventLevelCountResponseBodyEventLevels setSuspicious(Integer suspicious) {
            this.suspicious = suspicious;
            return this;
        }
        public Integer getSuspicious() {
            return this.suspicious;
        }

    }

}

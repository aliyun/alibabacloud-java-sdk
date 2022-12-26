// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventLevelCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("EventLevels")
    public DescribeEventLevelCountResponseBodyEventLevels eventLevels;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Remind")
        public Integer remind;

        @NameInMap("Serious")
        public Integer serious;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetBaseStrategyPeriodResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("OnlyWeekdays")
    public Boolean onlyWeekdays;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("WorkingTime")
    public java.util.List<GetBaseStrategyPeriodResponseBodyWorkingTime> workingTime;

    public static GetBaseStrategyPeriodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBaseStrategyPeriodResponseBody self = new GetBaseStrategyPeriodResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBaseStrategyPeriodResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBaseStrategyPeriodResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBaseStrategyPeriodResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBaseStrategyPeriodResponseBody setOnlyWeekdays(Boolean onlyWeekdays) {
        this.onlyWeekdays = onlyWeekdays;
        return this;
    }
    public Boolean getOnlyWeekdays() {
        return this.onlyWeekdays;
    }

    public GetBaseStrategyPeriodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaseStrategyPeriodResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBaseStrategyPeriodResponseBody setWorkingTime(java.util.List<GetBaseStrategyPeriodResponseBodyWorkingTime> workingTime) {
        this.workingTime = workingTime;
        return this;
    }
    public java.util.List<GetBaseStrategyPeriodResponseBodyWorkingTime> getWorkingTime() {
        return this.workingTime;
    }

    public static class GetBaseStrategyPeriodResponseBodyWorkingTime extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("BeginTimeMillis")
        public Long beginTimeMillis;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EndTimeMillis")
        public Long endTimeMillis;

        public static GetBaseStrategyPeriodResponseBodyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            GetBaseStrategyPeriodResponseBodyWorkingTime self = new GetBaseStrategyPeriodResponseBodyWorkingTime();
            return TeaModel.build(map, self);
        }

        public GetBaseStrategyPeriodResponseBodyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetBaseStrategyPeriodResponseBodyWorkingTime setBeginTimeMillis(Long beginTimeMillis) {
            this.beginTimeMillis = beginTimeMillis;
            return this;
        }
        public Long getBeginTimeMillis() {
            return this.beginTimeMillis;
        }

        public GetBaseStrategyPeriodResponseBodyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetBaseStrategyPeriodResponseBodyWorkingTime setEndTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            return this;
        }
        public Long getEndTimeMillis() {
            return this.endTimeMillis;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetBaseStrategyPeriodResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the time periods apply only to weekends.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyWeekdays")
    public Boolean onlyWeekdays;

    /**
     * <p>Indicates whether the time periods apply only to workdays.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyWorkdays")
    public Boolean onlyWorkdays;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The execution time periods of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
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

    public GetBaseStrategyPeriodResponseBody setOnlyWorkdays(Boolean onlyWorkdays) {
        this.onlyWorkdays = onlyWorkdays;
        return this;
    }
    public Boolean getOnlyWorkdays() {
        return this.onlyWorkdays;
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
        /**
         * <p>The start time. Format: HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The daily start time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BeginTimeMillis")
        public Long beginTimeMillis;

        /**
         * <p>The end time. Format: HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The daily end time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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

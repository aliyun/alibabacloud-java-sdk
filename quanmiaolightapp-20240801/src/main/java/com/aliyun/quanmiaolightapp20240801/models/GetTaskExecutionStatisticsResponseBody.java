// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetTaskExecutionStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetTaskExecutionStatisticsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-GHIJ-KLMNOPQRST</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTaskExecutionStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskExecutionStatisticsResponseBody self = new GetTaskExecutionStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskExecutionStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskExecutionStatisticsResponseBody setData(GetTaskExecutionStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskExecutionStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetTaskExecutionStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTaskExecutionStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskExecutionStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskExecutionStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTaskExecutionStatisticsResponseBodyDataTpmPerMinute extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>2024-08-01 10:00</p>
         */
        @NameInMap("time")
        public String time;

        public static GetTaskExecutionStatisticsResponseBodyDataTpmPerMinute build(java.util.Map<String, ?> map) throws Exception {
            GetTaskExecutionStatisticsResponseBodyDataTpmPerMinute self = new GetTaskExecutionStatisticsResponseBodyDataTpmPerMinute();
            return TeaModel.build(map, self);
        }

        public GetTaskExecutionStatisticsResponseBodyDataTpmPerMinute setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetTaskExecutionStatisticsResponseBodyDataTpmPerMinute setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class GetTaskExecutionStatisticsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("completedCount")
        public Long completedCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("runningCount")
        public Long runningCount;

        @NameInMap("tpmPerMinute")
        public java.util.List<GetTaskExecutionStatisticsResponseBodyDataTpmPerMinute> tpmPerMinute;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("waitingCount")
        public Long waitingCount;

        public static GetTaskExecutionStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskExecutionStatisticsResponseBodyData self = new GetTaskExecutionStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskExecutionStatisticsResponseBodyData setCompletedCount(Long completedCount) {
            this.completedCount = completedCount;
            return this;
        }
        public Long getCompletedCount() {
            return this.completedCount;
        }

        public GetTaskExecutionStatisticsResponseBodyData setRunningCount(Long runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Long getRunningCount() {
            return this.runningCount;
        }

        public GetTaskExecutionStatisticsResponseBodyData setTpmPerMinute(java.util.List<GetTaskExecutionStatisticsResponseBodyDataTpmPerMinute> tpmPerMinute) {
            this.tpmPerMinute = tpmPerMinute;
            return this;
        }
        public java.util.List<GetTaskExecutionStatisticsResponseBodyDataTpmPerMinute> getTpmPerMinute() {
            return this.tpmPerMinute;
        }

        public GetTaskExecutionStatisticsResponseBodyData setWaitingCount(Long waitingCount) {
            this.waitingCount = waitingCount;
            return this;
        }
        public Long getWaitingCount() {
            return this.waitingCount;
        }

    }

}

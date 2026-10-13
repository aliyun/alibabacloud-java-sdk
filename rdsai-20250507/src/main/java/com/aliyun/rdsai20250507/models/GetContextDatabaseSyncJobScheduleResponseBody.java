// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncJobScheduleResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetContextDatabaseSyncJobScheduleResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetContextDatabaseSyncJobScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncJobScheduleResponseBody self = new GetContextDatabaseSyncJobScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncJobScheduleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContextDatabaseSyncJobScheduleResponseBody setData(GetContextDatabaseSyncJobScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContextDatabaseSyncJobScheduleResponseBodyData getData() {
        return this.data;
    }

    public GetContextDatabaseSyncJobScheduleResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContextDatabaseSyncJobScheduleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContextDatabaseSyncJobScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseSyncJobScheduleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContextDatabaseSyncJobScheduleResponseBodyData extends TeaModel {
        /**
         * <p>The reason for the automatic pause.</p>
         * 
         * <strong>example:</strong>
         * <p>Three consecutive execution failures</p>
         */
        @NameInMap("AutoPauseReason")
        public String autoPauseReason;

        /**
         * <p>Indicates whether the task is automatically paused.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPaused")
        public Boolean autoPaused;

        /**
         * <p>The list of daily trigger times for daily-times scheduling in the HH:mm 24-hour format. The number of times ranges from 1 to 6.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;09:00&quot;, &quot;18:00&quot;]</p>
         */
        @NameInMap("DailyTimes")
        public java.util.List<String> dailyTimes;

        /**
         * <p>The interval in minutes for interval scheduling. The minimum value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IntervalMinutes")
        public Integer intervalMinutes;

        /**
         * <p>The processing policy for missed schedules. Valid values: skip and catch-up.</p>
         * 
         * <strong>example:</strong>
         * <p>skip</p>
         */
        @NameInMap("MissedPolicy")
        public String missedPolicy;

        /**
         * <p>The next run time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("NextRunAt")
        public String nextRunAt;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>The scheduling type. Valid values: interval and daily-times.</p>
         * 
         * <strong>example:</strong>
         * <p>daily-times</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static GetContextDatabaseSyncJobScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncJobScheduleResponseBodyData self = new GetContextDatabaseSyncJobScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncJobScheduleResponseBodyData setAutoPauseReason(String autoPauseReason) {
            this.autoPauseReason = autoPauseReason;
            return this;
        }
        public String getAutoPauseReason() {
            return this.autoPauseReason;
        }

        public GetContextDatabaseSyncJobScheduleResponseBodyData setAutoPaused(Boolean autoPaused) {
            this.autoPaused = autoPaused;
            return this;
        }
        public Boolean getAutoPaused() {
            return this.autoPaused;
        }

        public GetContextDatabaseSyncJobScheduleResponseBodyData setDailyTimes(java.util.List<String> dailyTimes) {
            this.dailyTimes = dailyTimes;
            return this;
        }
        public java.util.List<String> getDailyTimes() {
            return this.dailyTimes;
        }

        public GetContextDatabaseSyncJobScheduleResponseBodyData setIntervalMinutes(Integer intervalMinutes) {
            this.intervalMinutes = intervalMinutes;
            return this;
        }
        public Integer getIntervalMinutes() {
            return this.intervalMinutes;
        }

        public GetContextDatabaseSyncJobScheduleResponseBodyData setMissedPolicy(String missedPolicy) {
            this.missedPolicy = missedPolicy;
            return this;
        }
        public String getMissedPolicy() {
            return this.missedPolicy;
        }

        public GetContextDatabaseSyncJobScheduleResponseBodyData setNextRunAt(String nextRunAt) {
            this.nextRunAt = nextRunAt;
            return this;
        }
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        public GetContextDatabaseSyncJobScheduleResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public GetContextDatabaseSyncJobScheduleResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetContextDatabaseSyncJobScheduleResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}

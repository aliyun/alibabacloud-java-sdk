// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncJobReadinessResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetContextDatabaseSyncJobReadinessResponseBodyData data;

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
     * <p>Sample value</p>
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

    public static GetContextDatabaseSyncJobReadinessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncJobReadinessResponseBody self = new GetContextDatabaseSyncJobReadinessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncJobReadinessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContextDatabaseSyncJobReadinessResponseBody setData(GetContextDatabaseSyncJobReadinessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContextDatabaseSyncJobReadinessResponseBodyData getData() {
        return this.data;
    }

    public GetContextDatabaseSyncJobReadinessResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContextDatabaseSyncJobReadinessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContextDatabaseSyncJobReadinessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseSyncJobReadinessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContextDatabaseSyncJobReadinessResponseBodyDataChecks extends TeaModel {
        /**
         * <p>Indicates whether the data source is ready.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConnectionReady")
        public Boolean connectionReady;

        /**
         * <p>Indicates whether the import task is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("JobEnabled")
        public Boolean jobEnabled;

        /**
         * <p>Indicates whether scheduling is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScheduleConfigured")
        public Boolean scheduleConfigured;

        /**
         * <p>Indicates whether scheduling is not automatically paused.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScheduleNotAutoPaused")
        public Boolean scheduleNotAutoPaused;

        /**
         * <p>Indicates whether the selection is confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SelectionConfirmed")
        public Boolean selectionConfirmed;

        /**
         * <p>Indicates whether the target is ready.</p>
         */
        @NameInMap("TargetReady")
        public Boolean targetReady;

        public static GetContextDatabaseSyncJobReadinessResponseBodyDataChecks build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncJobReadinessResponseBodyDataChecks self = new GetContextDatabaseSyncJobReadinessResponseBodyDataChecks();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyDataChecks setConnectionReady(Boolean connectionReady) {
            this.connectionReady = connectionReady;
            return this;
        }
        public Boolean getConnectionReady() {
            return this.connectionReady;
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyDataChecks setJobEnabled(Boolean jobEnabled) {
            this.jobEnabled = jobEnabled;
            return this;
        }
        public Boolean getJobEnabled() {
            return this.jobEnabled;
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyDataChecks setScheduleConfigured(Boolean scheduleConfigured) {
            this.scheduleConfigured = scheduleConfigured;
            return this;
        }
        public Boolean getScheduleConfigured() {
            return this.scheduleConfigured;
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyDataChecks setScheduleNotAutoPaused(Boolean scheduleNotAutoPaused) {
            this.scheduleNotAutoPaused = scheduleNotAutoPaused;
            return this;
        }
        public Boolean getScheduleNotAutoPaused() {
            return this.scheduleNotAutoPaused;
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyDataChecks setSelectionConfirmed(Boolean selectionConfirmed) {
            this.selectionConfirmed = selectionConfirmed;
            return this;
        }
        public Boolean getSelectionConfirmed() {
            return this.selectionConfirmed;
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyDataChecks setTargetReady(Boolean targetReady) {
            this.targetReady = targetReady;
            return this;
        }
        public Boolean getTargetReady() {
            return this.targetReady;
        }

    }

    public static class GetContextDatabaseSyncJobReadinessResponseBodyData extends TeaModel {
        /**
         * <p>The reason for the automatic pause.</p>
         * 
         * <strong>example:</strong>
         * <p>Three consecutive execution failures</p>
         */
        @NameInMap("AutoPauseReason")
        public String autoPauseReason;

        /**
         * <p>The summary of check items.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;jobEnabled&quot;:true,&quot;connectionReady&quot;:true,&quot;selectionConfirmed&quot;:true,&quot;scheduleConfigured&quot;:true,&quot;scheduleNotAutoPaused&quot;:true}</p>
         */
        @NameInMap("Checks")
        public GetContextDatabaseSyncJobReadinessResponseBodyDataChecks checks;

        /**
         * <p>Indicates whether the task is ready.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Ready")
        public Boolean ready;

        /**
         * <p>Indicates whether the task is ready for a manual run.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReadyForManualRun")
        public Boolean readyForManualRun;

        /**
         * <p>Indicates whether the task is ready for a scheduled run.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReadyForScheduledRun")
        public Boolean readyForScheduledRun;

        public static GetContextDatabaseSyncJobReadinessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncJobReadinessResponseBodyData self = new GetContextDatabaseSyncJobReadinessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyData setAutoPauseReason(String autoPauseReason) {
            this.autoPauseReason = autoPauseReason;
            return this;
        }
        public String getAutoPauseReason() {
            return this.autoPauseReason;
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyData setChecks(GetContextDatabaseSyncJobReadinessResponseBodyDataChecks checks) {
            this.checks = checks;
            return this;
        }
        public GetContextDatabaseSyncJobReadinessResponseBodyDataChecks getChecks() {
            return this.checks;
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyData setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyData setReadyForManualRun(Boolean readyForManualRun) {
            this.readyForManualRun = readyForManualRun;
            return this;
        }
        public Boolean getReadyForManualRun() {
            return this.readyForManualRun;
        }

        public GetContextDatabaseSyncJobReadinessResponseBodyData setReadyForScheduledRun(Boolean readyForScheduledRun) {
            this.readyForScheduledRun = readyForScheduledRun;
            return this;
        }
        public Boolean getReadyForScheduledRun() {
            return this.readyForScheduledRun;
        }

    }

}

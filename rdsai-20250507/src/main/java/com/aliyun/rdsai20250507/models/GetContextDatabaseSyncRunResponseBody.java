// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncRunResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>example value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetContextDatabaseSyncRunResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>example value</p>
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
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetContextDatabaseSyncRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncRunResponseBody self = new GetContextDatabaseSyncRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncRunResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContextDatabaseSyncRunResponseBody setData(GetContextDatabaseSyncRunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContextDatabaseSyncRunResponseBodyData getData() {
        return this.data;
    }

    public GetContextDatabaseSyncRunResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContextDatabaseSyncRunResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContextDatabaseSyncRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseSyncRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContextDatabaseSyncRunResponseBodyDataSummary extends TeaModel {
        /**
         * <p>The number of cancelled items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Cancelled")
        public Integer cancelled;

        /**
         * <p>The number of deferred items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Deferred")
        public Integer deferred;

        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Failed")
        public Integer failed;

        /**
         * <p>The number of items whose metadata was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MetadataUpdated")
        public Integer metadataUpdated;

        /**
         * <p>The number of items being processed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Processing")
        public Integer processing;

        /**
         * <p>The number of skipped items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Integer skipped;

        /**
         * <p>The number of unchanged items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Unchanged")
        public Integer unchanged;

        /**
         * <p>The number of accepted items.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("UploadAccepted")
        public Integer uploadAccepted;

        /**
         * <p>The number of uploaded items.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Uploaded")
        public Integer uploaded;

        public static GetContextDatabaseSyncRunResponseBodyDataSummary build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncRunResponseBodyDataSummary self = new GetContextDatabaseSyncRunResponseBodyDataSummary();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncRunResponseBodyDataSummary setCancelled(Integer cancelled) {
            this.cancelled = cancelled;
            return this;
        }
        public Integer getCancelled() {
            return this.cancelled;
        }

        public GetContextDatabaseSyncRunResponseBodyDataSummary setDeferred(Integer deferred) {
            this.deferred = deferred;
            return this;
        }
        public Integer getDeferred() {
            return this.deferred;
        }

        public GetContextDatabaseSyncRunResponseBodyDataSummary setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public GetContextDatabaseSyncRunResponseBodyDataSummary setMetadataUpdated(Integer metadataUpdated) {
            this.metadataUpdated = metadataUpdated;
            return this;
        }
        public Integer getMetadataUpdated() {
            return this.metadataUpdated;
        }

        public GetContextDatabaseSyncRunResponseBodyDataSummary setProcessing(Integer processing) {
            this.processing = processing;
            return this;
        }
        public Integer getProcessing() {
            return this.processing;
        }

        public GetContextDatabaseSyncRunResponseBodyDataSummary setSkipped(Integer skipped) {
            this.skipped = skipped;
            return this;
        }
        public Integer getSkipped() {
            return this.skipped;
        }

        public GetContextDatabaseSyncRunResponseBodyDataSummary setUnchanged(Integer unchanged) {
            this.unchanged = unchanged;
            return this;
        }
        public Integer getUnchanged() {
            return this.unchanged;
        }

        public GetContextDatabaseSyncRunResponseBodyDataSummary setUploadAccepted(Integer uploadAccepted) {
            this.uploadAccepted = uploadAccepted;
            return this;
        }
        public Integer getUploadAccepted() {
            return this.uploadAccepted;
        }

        public GetContextDatabaseSyncRunResponseBodyDataSummary setUploaded(Integer uploaded) {
            this.uploaded = uploaded;
            return this;
        }
        public Integer getUploaded() {
            return this.uploaded;
        }

    }

    public static class GetContextDatabaseSyncRunResponseBodyData extends TeaModel {
        /**
         * <p>The number of attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Attempt")
        public Integer attempt;

        /**
         * <p>The time when the cancellation was requested.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("CancelRequestedAt")
        public String cancelRequestedAt;

        /**
         * <p>Specifies whether the run is a dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DryRun")
        public Boolean dryRun;

        /**
         * <p>The time when the run finished.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The version number of the import node configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("JobConfigVersion")
        public Integer jobConfigVersion;

        /**
         * <p>The node ID, which is a UUID generated by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the import node.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Team Document Import</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The ID of the target knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-as1llqmkol****</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The most recent error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Data source authorization has expired</p>
         */
        @NameInMap("LastError")
        public String lastError;

        /**
         * <p>The plug-in reference.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:dingtalk@1.0.0">dingtalk@1.0.0</a></p>
         */
        @NameInMap("PluginRef")
        public String pluginRef;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1B2C3D4E-5F6A-4B7C-8D9E-0F1A2B3C4D5E</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The run ID, which is a UUID generated by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The scheduled run time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("ScheduledAt")
        public String scheduledAt;

        /**
         * <p>The time when the run started.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("StartedAt")
        public String startedAt;

        /**
         * <p>The run status. Valid values: queued, running, cancelling, succeeded, partial, failed, cancelled, skipped, and dead.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The summary of the run results.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;uploaded&quot;:12,&quot;unchanged&quot;:3,&quot;skipped&quot;:1,&quot;deferred&quot;:0,&quot;failed&quot;:0,&quot;processing&quot;:0}</p>
         */
        @NameInMap("Summary")
        public GetContextDatabaseSyncRunResponseBodyDataSummary summary;

        /**
         * <p>The trigger method of the run. Valid values: manual, schedule, and retry.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        public static GetContextDatabaseSyncRunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncRunResponseBodyData self = new GetContextDatabaseSyncRunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncRunResponseBodyData setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }
        public Integer getAttempt() {
            return this.attempt;
        }

        public GetContextDatabaseSyncRunResponseBodyData setCancelRequestedAt(String cancelRequestedAt) {
            this.cancelRequestedAt = cancelRequestedAt;
            return this;
        }
        public String getCancelRequestedAt() {
            return this.cancelRequestedAt;
        }

        public GetContextDatabaseSyncRunResponseBodyData setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public GetContextDatabaseSyncRunResponseBodyData setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetContextDatabaseSyncRunResponseBodyData setJobConfigVersion(Integer jobConfigVersion) {
            this.jobConfigVersion = jobConfigVersion;
            return this;
        }
        public Integer getJobConfigVersion() {
            return this.jobConfigVersion;
        }

        public GetContextDatabaseSyncRunResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetContextDatabaseSyncRunResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetContextDatabaseSyncRunResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetContextDatabaseSyncRunResponseBodyData setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public GetContextDatabaseSyncRunResponseBodyData setPluginRef(String pluginRef) {
            this.pluginRef = pluginRef;
            return this;
        }
        public String getPluginRef() {
            return this.pluginRef;
        }

        public GetContextDatabaseSyncRunResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetContextDatabaseSyncRunResponseBodyData setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetContextDatabaseSyncRunResponseBodyData setScheduledAt(String scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }
        public String getScheduledAt() {
            return this.scheduledAt;
        }

        public GetContextDatabaseSyncRunResponseBodyData setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetContextDatabaseSyncRunResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetContextDatabaseSyncRunResponseBodyData setSummary(GetContextDatabaseSyncRunResponseBodyDataSummary summary) {
            this.summary = summary;
            return this;
        }
        public GetContextDatabaseSyncRunResponseBodyDataSummary getSummary() {
            return this.summary;
        }

        public GetContextDatabaseSyncRunResponseBodyData setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

    }

}

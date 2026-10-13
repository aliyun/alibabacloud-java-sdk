// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncRunsResponseBody extends TeaModel {
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
    public ListContextDatabaseSyncRunsResponseBodyData data;

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
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListContextDatabaseSyncRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncRunsResponseBody self = new ListContextDatabaseSyncRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncRunsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContextDatabaseSyncRunsResponseBody setData(ListContextDatabaseSyncRunsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListContextDatabaseSyncRunsResponseBodyData getData() {
        return this.data;
    }

    public ListContextDatabaseSyncRunsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContextDatabaseSyncRunsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContextDatabaseSyncRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseSyncRunsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContextDatabaseSyncRunsResponseBodyDataRunsSummary extends TeaModel {
        /**
         * <p>The number of canceled items.</p>
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
         * <p>The number of items with updated metadata.</p>
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
         * <p>The number of accepted uploads.</p>
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

        public static ListContextDatabaseSyncRunsResponseBodyDataRunsSummary build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncRunsResponseBodyDataRunsSummary self = new ListContextDatabaseSyncRunsResponseBodyDataRunsSummary();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary setCancelled(Integer cancelled) {
            this.cancelled = cancelled;
            return this;
        }
        public Integer getCancelled() {
            return this.cancelled;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary setDeferred(Integer deferred) {
            this.deferred = deferred;
            return this;
        }
        public Integer getDeferred() {
            return this.deferred;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary setMetadataUpdated(Integer metadataUpdated) {
            this.metadataUpdated = metadataUpdated;
            return this;
        }
        public Integer getMetadataUpdated() {
            return this.metadataUpdated;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary setProcessing(Integer processing) {
            this.processing = processing;
            return this;
        }
        public Integer getProcessing() {
            return this.processing;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary setSkipped(Integer skipped) {
            this.skipped = skipped;
            return this;
        }
        public Integer getSkipped() {
            return this.skipped;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary setUnchanged(Integer unchanged) {
            this.unchanged = unchanged;
            return this;
        }
        public Integer getUnchanged() {
            return this.unchanged;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary setUploadAccepted(Integer uploadAccepted) {
            this.uploadAccepted = uploadAccepted;
            return this;
        }
        public Integer getUploadAccepted() {
            return this.uploadAccepted;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary setUploaded(Integer uploaded) {
            this.uploaded = uploaded;
            return this;
        }
        public Integer getUploaded() {
            return this.uploaded;
        }

    }

    public static class ListContextDatabaseSyncRunsResponseBodyDataRuns extends TeaModel {
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
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The configuration version number of the import job.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("JobConfigVersion")
        public Integer jobConfigVersion;

        /**
         * <p>The job ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the import job.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D team document import</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The ID of the destination knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-as1llqmkol****</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The latest error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Data source authorization has expired</p>
         */
        @NameInMap("LastError")
        public String lastError;

        /**
         * <p>The plugin reference.</p>
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
         * <p>The run ID, which is a system-generated UUID.</p>
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
         * <p>The start time.</p>
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
        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary summary;

        /**
         * <p>The trigger method of the run. Valid values: manual, schedule, and retry.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        public static ListContextDatabaseSyncRunsResponseBodyDataRuns build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncRunsResponseBodyDataRuns self = new ListContextDatabaseSyncRunsResponseBodyDataRuns();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }
        public Integer getAttempt() {
            return this.attempt;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setCancelRequestedAt(String cancelRequestedAt) {
            this.cancelRequestedAt = cancelRequestedAt;
            return this;
        }
        public String getCancelRequestedAt() {
            return this.cancelRequestedAt;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setJobConfigVersion(Integer jobConfigVersion) {
            this.jobConfigVersion = jobConfigVersion;
            return this;
        }
        public Integer getJobConfigVersion() {
            return this.jobConfigVersion;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setPluginRef(String pluginRef) {
            this.pluginRef = pluginRef;
            return this;
        }
        public String getPluginRef() {
            return this.pluginRef;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setScheduledAt(String scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }
        public String getScheduledAt() {
            return this.scheduledAt;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setSummary(ListContextDatabaseSyncRunsResponseBodyDataRunsSummary summary) {
            this.summary = summary;
            return this;
        }
        public ListContextDatabaseSyncRunsResponseBodyDataRunsSummary getSummary() {
            return this.summary;
        }

        public ListContextDatabaseSyncRunsResponseBodyDataRuns setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

    }

    public static class ListContextDatabaseSyncRunsResponseBodyData extends TeaModel {
        /**
         * <p>The page number. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of runs.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;RunId&quot;:&quot;run-as1llqmkol****&quot;, &quot;JobId&quot;:&quot;job-as1llqmkol****&quot;, &quot;JobName&quot;:&quot;R&amp;D team document import&quot;, &quot;KnowledgeBaseId&quot;:&quot;kb-as1llqmkol****&quot;}]</p>
         */
        @NameInMap("Runs")
        public java.util.List<ListContextDatabaseSyncRunsResponseBodyDataRuns> runs;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListContextDatabaseSyncRunsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncRunsResponseBodyData self = new ListContextDatabaseSyncRunsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncRunsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListContextDatabaseSyncRunsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListContextDatabaseSyncRunsResponseBodyData setRuns(java.util.List<ListContextDatabaseSyncRunsResponseBodyDataRuns> runs) {
            this.runs = runs;
            return this;
        }
        public java.util.List<ListContextDatabaseSyncRunsResponseBodyDataRuns> getRuns() {
            return this.runs;
        }

        public ListContextDatabaseSyncRunsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}

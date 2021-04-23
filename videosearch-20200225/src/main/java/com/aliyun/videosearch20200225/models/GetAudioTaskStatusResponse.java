// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetAudioTaskStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Integer data;

    @NameInMap("TaskInfo")
    @Validation(required = true)
    public GetAudioTaskStatusResponseTaskInfo taskInfo;

    public static GetAudioTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioTaskStatusResponse self = new GetAudioTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioTaskStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudioTaskStatusResponse setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public GetAudioTaskStatusResponse setTaskInfo(GetAudioTaskStatusResponseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public GetAudioTaskStatusResponseTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class GetAudioTaskStatusResponseTaskInfo extends TeaModel {
        @NameInMap("AnalysisUseTime")
        @Validation(required = true)
        public Long analysisUseTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public Float duration;

        @NameInMap("ProcessResultOss")
        @Validation(required = true)
        public String processResultOss;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("SubmitTime")
        @Validation(required = true)
        public Long submitTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("TaskId")
        @Validation(required = true)
        public Long taskId;

        @NameInMap("ErrorInfo")
        @Validation(required = true)
        public String errorInfo;

        @NameInMap("StorageInfo")
        @Validation(required = true)
        public Integer storageInfo;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AudioId")
        @Validation(required = true)
        public String audioId;

        @NameInMap("AudioTags")
        @Validation(required = true)
        public String audioTags;

        @NameInMap("AudioUrl")
        @Validation(required = true)
        public String audioUrl;

        @NameInMap("QueryTags")
        @Validation(required = true)
        public String queryTags;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ReplaceStorageThreshold")
        @Validation(required = true)
        public String replaceStorageThreshold;

        public static GetAudioTaskStatusResponseTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAudioTaskStatusResponseTaskInfo self = new GetAudioTaskStatusResponseTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetAudioTaskStatusResponseTaskInfo setAnalysisUseTime(Long analysisUseTime) {
            this.analysisUseTime = analysisUseTime;
            return this;
        }
        public Long getAnalysisUseTime() {
            return this.analysisUseTime;
        }

        public GetAudioTaskStatusResponseTaskInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetAudioTaskStatusResponseTaskInfo setProcessResultOss(String processResultOss) {
            this.processResultOss = processResultOss;
            return this;
        }
        public String getProcessResultOss() {
            return this.processResultOss;
        }

        public GetAudioTaskStatusResponseTaskInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAudioTaskStatusResponseTaskInfo setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public GetAudioTaskStatusResponseTaskInfo setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetAudioTaskStatusResponseTaskInfo setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetAudioTaskStatusResponseTaskInfo setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public GetAudioTaskStatusResponseTaskInfo setStorageInfo(Integer storageInfo) {
            this.storageInfo = storageInfo;
            return this;
        }
        public Integer getStorageInfo() {
            return this.storageInfo;
        }

        public GetAudioTaskStatusResponseTaskInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAudioTaskStatusResponseTaskInfo setAudioId(String audioId) {
            this.audioId = audioId;
            return this;
        }
        public String getAudioId() {
            return this.audioId;
        }

        public GetAudioTaskStatusResponseTaskInfo setAudioTags(String audioTags) {
            this.audioTags = audioTags;
            return this;
        }
        public String getAudioTags() {
            return this.audioTags;
        }

        public GetAudioTaskStatusResponseTaskInfo setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
            return this;
        }
        public String getAudioUrl() {
            return this.audioUrl;
        }

        public GetAudioTaskStatusResponseTaskInfo setQueryTags(String queryTags) {
            this.queryTags = queryTags;
            return this;
        }
        public String getQueryTags() {
            return this.queryTags;
        }

        public GetAudioTaskStatusResponseTaskInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAudioTaskStatusResponseTaskInfo setReplaceStorageThreshold(String replaceStorageThreshold) {
            this.replaceStorageThreshold = replaceStorageThreshold;
            return this;
        }
        public String getReplaceStorageThreshold() {
            return this.replaceStorageThreshold;
        }

    }

}

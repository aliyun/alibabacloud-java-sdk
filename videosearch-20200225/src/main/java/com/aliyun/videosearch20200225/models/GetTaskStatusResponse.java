// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Integer data;

    @NameInMap("TaskInfo")
    @Validation(required = true)
    public GetTaskStatusResponseTaskInfo taskInfo;

    public static GetTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusResponse self = new GetTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskStatusResponse setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public GetTaskStatusResponse setTaskInfo(GetTaskStatusResponseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public GetTaskStatusResponseTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class GetTaskStatusResponseTaskInfo extends TeaModel {
        @NameInMap("AnalysisUseTime")
        @Validation(required = true)
        public Long analysisUseTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public Float duration;

        @NameInMap("ProcessResultOss")
        @Validation(required = true)
        public String processResultOss;

        @NameInMap("Resolution")
        @Validation(required = true)
        public String resolution;

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

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("VideoTags")
        @Validation(required = true)
        public String videoTags;

        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        @NameInMap("QueryTags")
        @Validation(required = true)
        public String queryTags;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ReplaceStorageThreshold")
        @Validation(required = true)
        public String replaceStorageThreshold;

        public static GetTaskStatusResponseTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTaskStatusResponseTaskInfo self = new GetTaskStatusResponseTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetTaskStatusResponseTaskInfo setAnalysisUseTime(Long analysisUseTime) {
            this.analysisUseTime = analysisUseTime;
            return this;
        }
        public Long getAnalysisUseTime() {
            return this.analysisUseTime;
        }

        public GetTaskStatusResponseTaskInfo setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetTaskStatusResponseTaskInfo setProcessResultOss(String processResultOss) {
            this.processResultOss = processResultOss;
            return this;
        }
        public String getProcessResultOss() {
            return this.processResultOss;
        }

        public GetTaskStatusResponseTaskInfo setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetTaskStatusResponseTaskInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetTaskStatusResponseTaskInfo setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public GetTaskStatusResponseTaskInfo setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetTaskStatusResponseTaskInfo setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetTaskStatusResponseTaskInfo setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public GetTaskStatusResponseTaskInfo setStorageInfo(Integer storageInfo) {
            this.storageInfo = storageInfo;
            return this;
        }
        public Integer getStorageInfo() {
            return this.storageInfo;
        }

        public GetTaskStatusResponseTaskInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTaskStatusResponseTaskInfo setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetTaskStatusResponseTaskInfo setVideoTags(String videoTags) {
            this.videoTags = videoTags;
            return this;
        }
        public String getVideoTags() {
            return this.videoTags;
        }

        public GetTaskStatusResponseTaskInfo setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public GetTaskStatusResponseTaskInfo setQueryTags(String queryTags) {
            this.queryTags = queryTags;
            return this;
        }
        public String getQueryTags() {
            return this.queryTags;
        }

        public GetTaskStatusResponseTaskInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetTaskStatusResponseTaskInfo setReplaceStorageThreshold(String replaceStorageThreshold) {
            this.replaceStorageThreshold = replaceStorageThreshold;
            return this;
        }
        public String getReplaceStorageThreshold() {
            return this.replaceStorageThreshold;
        }

    }

}

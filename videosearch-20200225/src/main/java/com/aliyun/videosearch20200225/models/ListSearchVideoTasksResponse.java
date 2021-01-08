// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListSearchVideoTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListSearchVideoTasksResponseData data;

    public static ListSearchVideoTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchVideoTasksResponse self = new ListSearchVideoTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchVideoTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchVideoTasksResponse setData(ListSearchVideoTasksResponseData data) {
        this.data = data;
        return this;
    }
    public ListSearchVideoTasksResponseData getData() {
        return this.data;
    }

    public static class ListSearchVideoTasksResponseDataTaskList extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("VideoName")
        @Validation(required = true)
        public String videoName;

        @NameInMap("ProcessTime")
        @Validation(required = true)
        public Long processTime;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("ProcessResultUrl")
        @Validation(required = true)
        public String processResultUrl;

        @NameInMap("StorageType")
        @Validation(required = true)
        public Integer storageType;

        @NameInMap("StorageInfo")
        @Validation(required = true)
        public Integer storageInfo;

        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        @NameInMap("ErrorDetail")
        @Validation(required = true)
        public String errorDetail;

        @NameInMap("ReplaceStorageThreshold")
        @Validation(required = true)
        public String replaceStorageThreshold;

        @NameInMap("QueryTags")
        @Validation(required = true)
        public String queryTags;

        @NameInMap("RemoteTaskId")
        @Validation(required = true)
        public String remoteTaskId;

        @NameInMap("VideoTags")
        @Validation(required = true)
        public String videoTags;

        @NameInMap("SearchType")
        @Validation(required = true)
        public Integer searchType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static ListSearchVideoTasksResponseDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListSearchVideoTasksResponseDataTaskList self = new ListSearchVideoTasksResponseDataTaskList();
            return TeaModel.build(map, self);
        }

        public ListSearchVideoTasksResponseDataTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListSearchVideoTasksResponseDataTaskList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public ListSearchVideoTasksResponseDataTaskList setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public ListSearchVideoTasksResponseDataTaskList setProcessTime(Long processTime) {
            this.processTime = processTime;
            return this;
        }
        public Long getProcessTime() {
            return this.processTime;
        }

        public ListSearchVideoTasksResponseDataTaskList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListSearchVideoTasksResponseDataTaskList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListSearchVideoTasksResponseDataTaskList setProcessResultUrl(String processResultUrl) {
            this.processResultUrl = processResultUrl;
            return this;
        }
        public String getProcessResultUrl() {
            return this.processResultUrl;
        }

        public ListSearchVideoTasksResponseDataTaskList setStorageType(Integer storageType) {
            this.storageType = storageType;
            return this;
        }
        public Integer getStorageType() {
            return this.storageType;
        }

        public ListSearchVideoTasksResponseDataTaskList setStorageInfo(Integer storageInfo) {
            this.storageInfo = storageInfo;
            return this;
        }
        public Integer getStorageInfo() {
            return this.storageInfo;
        }

        public ListSearchVideoTasksResponseDataTaskList setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public ListSearchVideoTasksResponseDataTaskList setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public ListSearchVideoTasksResponseDataTaskList setReplaceStorageThreshold(String replaceStorageThreshold) {
            this.replaceStorageThreshold = replaceStorageThreshold;
            return this;
        }
        public String getReplaceStorageThreshold() {
            return this.replaceStorageThreshold;
        }

        public ListSearchVideoTasksResponseDataTaskList setQueryTags(String queryTags) {
            this.queryTags = queryTags;
            return this;
        }
        public String getQueryTags() {
            return this.queryTags;
        }

        public ListSearchVideoTasksResponseDataTaskList setRemoteTaskId(String remoteTaskId) {
            this.remoteTaskId = remoteTaskId;
            return this;
        }
        public String getRemoteTaskId() {
            return this.remoteTaskId;
        }

        public ListSearchVideoTasksResponseDataTaskList setVideoTags(String videoTags) {
            this.videoTags = videoTags;
            return this;
        }
        public String getVideoTags() {
            return this.videoTags;
        }

        public ListSearchVideoTasksResponseDataTaskList setSearchType(Integer searchType) {
            this.searchType = searchType;
            return this;
        }
        public Integer getSearchType() {
            return this.searchType;
        }

        public ListSearchVideoTasksResponseDataTaskList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListSearchVideoTasksResponseData extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TaskList")
        @Validation(required = true)
        public java.util.List<ListSearchVideoTasksResponseDataTaskList> taskList;

        public static ListSearchVideoTasksResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListSearchVideoTasksResponseData self = new ListSearchVideoTasksResponseData();
            return TeaModel.build(map, self);
        }

        public ListSearchVideoTasksResponseData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListSearchVideoTasksResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSearchVideoTasksResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSearchVideoTasksResponseData setTaskList(java.util.List<ListSearchVideoTasksResponseDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<ListSearchVideoTasksResponseDataTaskList> getTaskList() {
            return this.taskList;
        }

    }

}

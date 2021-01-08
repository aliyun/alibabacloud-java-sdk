// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListStorageVideoTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListStorageVideoTasksResponseData data;

    public static ListStorageVideoTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStorageVideoTasksResponse self = new ListStorageVideoTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListStorageVideoTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStorageVideoTasksResponse setData(ListStorageVideoTasksResponseData data) {
        this.data = data;
        return this;
    }
    public ListStorageVideoTasksResponseData getData() {
        return this.data;
    }

    public static class ListStorageVideoTasksResponseDataTaskList extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public Long taskId;

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("VideoName")
        @Validation(required = true)
        public String videoName;

        @NameInMap("ProcessTime")
        @Validation(required = true)
        public Long processTime;

        @NameInMap("StorageInfo")
        @Validation(required = true)
        public Integer storageInfo;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ErrorDetail")
        @Validation(required = true)
        public String errorDetail;

        @NameInMap("RemoteTaskId")
        @Validation(required = true)
        public String remoteTaskId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static ListStorageVideoTasksResponseDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListStorageVideoTasksResponseDataTaskList self = new ListStorageVideoTasksResponseDataTaskList();
            return TeaModel.build(map, self);
        }

        public ListStorageVideoTasksResponseDataTaskList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListStorageVideoTasksResponseDataTaskList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public ListStorageVideoTasksResponseDataTaskList setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public ListStorageVideoTasksResponseDataTaskList setProcessTime(Long processTime) {
            this.processTime = processTime;
            return this;
        }
        public Long getProcessTime() {
            return this.processTime;
        }

        public ListStorageVideoTasksResponseDataTaskList setStorageInfo(Integer storageInfo) {
            this.storageInfo = storageInfo;
            return this;
        }
        public Integer getStorageInfo() {
            return this.storageInfo;
        }

        public ListStorageVideoTasksResponseDataTaskList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListStorageVideoTasksResponseDataTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStorageVideoTasksResponseDataTaskList setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public ListStorageVideoTasksResponseDataTaskList setRemoteTaskId(String remoteTaskId) {
            this.remoteTaskId = remoteTaskId;
            return this;
        }
        public String getRemoteTaskId() {
            return this.remoteTaskId;
        }

        public ListStorageVideoTasksResponseDataTaskList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStorageVideoTasksResponseDataTaskList setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class ListStorageVideoTasksResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("TaskList")
        @Validation(required = true)
        public java.util.List<ListStorageVideoTasksResponseDataTaskList> taskList;

        public static ListStorageVideoTasksResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListStorageVideoTasksResponseData self = new ListStorageVideoTasksResponseData();
            return TeaModel.build(map, self);
        }

        public ListStorageVideoTasksResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListStorageVideoTasksResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListStorageVideoTasksResponseData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListStorageVideoTasksResponseData setTaskList(java.util.List<ListStorageVideoTasksResponseDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<ListStorageVideoTasksResponseDataTaskList> getTaskList() {
            return this.taskList;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListStorageAudioTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListStorageAudioTasksResponseData data;

    public static ListStorageAudioTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStorageAudioTasksResponse self = new ListStorageAudioTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListStorageAudioTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStorageAudioTasksResponse setData(ListStorageAudioTasksResponseData data) {
        this.data = data;
        return this;
    }
    public ListStorageAudioTasksResponseData getData() {
        return this.data;
    }

    public static class ListStorageAudioTasksResponseDataTaskList extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public Long taskId;

        @NameInMap("AudioId")
        @Validation(required = true)
        public String audioId;

        @NameInMap("ProcessTime")
        @Validation(required = true)
        public Long processTime;

        @NameInMap("StorageInfo")
        @Validation(required = true)
        public Integer storageInfo;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

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

        @NameInMap("AudioUrl")
        @Validation(required = true)
        public String audioUrl;

        @NameInMap("Sort")
        @Validation(required = true)
        public Integer sort;

        public static ListStorageAudioTasksResponseDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListStorageAudioTasksResponseDataTaskList self = new ListStorageAudioTasksResponseDataTaskList();
            return TeaModel.build(map, self);
        }

        public ListStorageAudioTasksResponseDataTaskList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListStorageAudioTasksResponseDataTaskList setAudioId(String audioId) {
            this.audioId = audioId;
            return this;
        }
        public String getAudioId() {
            return this.audioId;
        }

        public ListStorageAudioTasksResponseDataTaskList setProcessTime(Long processTime) {
            this.processTime = processTime;
            return this;
        }
        public Long getProcessTime() {
            return this.processTime;
        }

        public ListStorageAudioTasksResponseDataTaskList setStorageInfo(Integer storageInfo) {
            this.storageInfo = storageInfo;
            return this;
        }
        public Integer getStorageInfo() {
            return this.storageInfo;
        }

        public ListStorageAudioTasksResponseDataTaskList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListStorageAudioTasksResponseDataTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStorageAudioTasksResponseDataTaskList setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public ListStorageAudioTasksResponseDataTaskList setRemoteTaskId(String remoteTaskId) {
            this.remoteTaskId = remoteTaskId;
            return this;
        }
        public String getRemoteTaskId() {
            return this.remoteTaskId;
        }

        public ListStorageAudioTasksResponseDataTaskList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStorageAudioTasksResponseDataTaskList setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
            return this;
        }
        public String getAudioUrl() {
            return this.audioUrl;
        }

        public ListStorageAudioTasksResponseDataTaskList setSort(Integer sort) {
            this.sort = sort;
            return this;
        }
        public Integer getSort() {
            return this.sort;
        }

    }

    public static class ListStorageAudioTasksResponseData extends TeaModel {
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
        public java.util.List<ListStorageAudioTasksResponseDataTaskList> taskList;

        public static ListStorageAudioTasksResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListStorageAudioTasksResponseData self = new ListStorageAudioTasksResponseData();
            return TeaModel.build(map, self);
        }

        public ListStorageAudioTasksResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListStorageAudioTasksResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListStorageAudioTasksResponseData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListStorageAudioTasksResponseData setTaskList(java.util.List<ListStorageAudioTasksResponseDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<ListStorageAudioTasksResponseDataTaskList> getTaskList() {
            return this.taskList;
        }

    }

}

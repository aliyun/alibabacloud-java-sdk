// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListSearchAudioTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListSearchAudioTasksResponseData data;

    public static ListSearchAudioTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchAudioTasksResponse self = new ListSearchAudioTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchAudioTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchAudioTasksResponse setData(ListSearchAudioTasksResponseData data) {
        this.data = data;
        return this;
    }
    public ListSearchAudioTasksResponseData getData() {
        return this.data;
    }

    public static class ListSearchAudioTasksResponseDataTaskList extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("AudioId")
        @Validation(required = true)
        public String audioId;

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

        @NameInMap("StorageInfo")
        @Validation(required = true)
        public Integer storageInfo;

        @NameInMap("AudioUrl")
        @Validation(required = true)
        public String audioUrl;

        @NameInMap("ErrorDetail")
        @Validation(required = true)
        public String errorDetail;

        @NameInMap("RemoteTaskId")
        @Validation(required = true)
        public String remoteTaskId;

        @NameInMap("AudioTags")
        @Validation(required = true)
        public String audioTags;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Sort")
        @Validation(required = true)
        public Integer sort;

        public static ListSearchAudioTasksResponseDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListSearchAudioTasksResponseDataTaskList self = new ListSearchAudioTasksResponseDataTaskList();
            return TeaModel.build(map, self);
        }

        public ListSearchAudioTasksResponseDataTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListSearchAudioTasksResponseDataTaskList setAudioId(String audioId) {
            this.audioId = audioId;
            return this;
        }
        public String getAudioId() {
            return this.audioId;
        }

        public ListSearchAudioTasksResponseDataTaskList setProcessTime(Long processTime) {
            this.processTime = processTime;
            return this;
        }
        public Long getProcessTime() {
            return this.processTime;
        }

        public ListSearchAudioTasksResponseDataTaskList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListSearchAudioTasksResponseDataTaskList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListSearchAudioTasksResponseDataTaskList setProcessResultUrl(String processResultUrl) {
            this.processResultUrl = processResultUrl;
            return this;
        }
        public String getProcessResultUrl() {
            return this.processResultUrl;
        }

        public ListSearchAudioTasksResponseDataTaskList setStorageInfo(Integer storageInfo) {
            this.storageInfo = storageInfo;
            return this;
        }
        public Integer getStorageInfo() {
            return this.storageInfo;
        }

        public ListSearchAudioTasksResponseDataTaskList setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
            return this;
        }
        public String getAudioUrl() {
            return this.audioUrl;
        }

        public ListSearchAudioTasksResponseDataTaskList setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public ListSearchAudioTasksResponseDataTaskList setRemoteTaskId(String remoteTaskId) {
            this.remoteTaskId = remoteTaskId;
            return this;
        }
        public String getRemoteTaskId() {
            return this.remoteTaskId;
        }

        public ListSearchAudioTasksResponseDataTaskList setAudioTags(String audioTags) {
            this.audioTags = audioTags;
            return this;
        }
        public String getAudioTags() {
            return this.audioTags;
        }

        public ListSearchAudioTasksResponseDataTaskList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSearchAudioTasksResponseDataTaskList setSort(Integer sort) {
            this.sort = sort;
            return this;
        }
        public Integer getSort() {
            return this.sort;
        }

    }

    public static class ListSearchAudioTasksResponseData extends TeaModel {
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
        public java.util.List<ListSearchAudioTasksResponseDataTaskList> taskList;

        public static ListSearchAudioTasksResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListSearchAudioTasksResponseData self = new ListSearchAudioTasksResponseData();
            return TeaModel.build(map, self);
        }

        public ListSearchAudioTasksResponseData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListSearchAudioTasksResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSearchAudioTasksResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSearchAudioTasksResponseData setTaskList(java.util.List<ListSearchAudioTasksResponseDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<ListSearchAudioTasksResponseDataTaskList> getTaskList() {
            return this.taskList;
        }

    }

}

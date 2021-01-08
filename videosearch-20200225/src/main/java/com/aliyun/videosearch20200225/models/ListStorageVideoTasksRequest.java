// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListStorageVideoTasksRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("VideoName")
    public String videoName;

    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("StatusList")
    public String statusList;

    @NameInMap("Description")
    public String description;

    @NameInMap("StorageInfoList")
    public String storageInfoList;

    public static ListStorageVideoTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStorageVideoTasksRequest self = new ListStorageVideoTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListStorageVideoTasksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListStorageVideoTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListStorageVideoTasksRequest setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }
    public String getVideoName() {
        return this.videoName;
    }

    public ListStorageVideoTasksRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public ListStorageVideoTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStorageVideoTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStorageVideoTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListStorageVideoTasksRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public ListStorageVideoTasksRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListStorageVideoTasksRequest setStorageInfoList(String storageInfoList) {
        this.storageInfoList = storageInfoList;
        return this;
    }
    public String getStorageInfoList() {
        return this.storageInfoList;
    }

}

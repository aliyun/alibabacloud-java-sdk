// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListStorageAudioTasksRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("AudioId")
    public String audioId;

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

    @NameInMap("SortList")
    public String sortList;

    public static ListStorageAudioTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStorageAudioTasksRequest self = new ListStorageAudioTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListStorageAudioTasksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListStorageAudioTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListStorageAudioTasksRequest setAudioId(String audioId) {
        this.audioId = audioId;
        return this;
    }
    public String getAudioId() {
        return this.audioId;
    }

    public ListStorageAudioTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStorageAudioTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStorageAudioTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListStorageAudioTasksRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public ListStorageAudioTasksRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListStorageAudioTasksRequest setStorageInfoList(String storageInfoList) {
        this.storageInfoList = storageInfoList;
        return this;
    }
    public String getStorageInfoList() {
        return this.storageInfoList;
    }

    public ListStorageAudioTasksRequest setSortList(String sortList) {
        this.sortList = sortList;
        return this;
    }
    public String getSortList() {
        return this.sortList;
    }

}

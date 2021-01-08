// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListSearchVideoTasksRequest extends TeaModel {
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

    @NameInMap("SearchTypeList")
    public String searchTypeList;

    @NameInMap("Description")
    public String description;

    public static ListSearchVideoTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSearchVideoTasksRequest self = new ListSearchVideoTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListSearchVideoTasksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListSearchVideoTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListSearchVideoTasksRequest setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }
    public String getVideoName() {
        return this.videoName;
    }

    public ListSearchVideoTasksRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public ListSearchVideoTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSearchVideoTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchVideoTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSearchVideoTasksRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public ListSearchVideoTasksRequest setSearchTypeList(String searchTypeList) {
        this.searchTypeList = searchTypeList;
        return this;
    }
    public String getSearchTypeList() {
        return this.searchTypeList;
    }

    public ListSearchVideoTasksRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}

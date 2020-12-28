// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessagePageQueryByGroupIdRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsDLQMessagePageQueryByGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessagePageQueryByGroupIdRequest self = new OnsDLQMessagePageQueryByGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessagePageQueryByGroupIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsDLQMessagePageQueryByGroupIdRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public OnsDLQMessagePageQueryByGroupIdRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OnsDLQMessagePageQueryByGroupIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public OnsDLQMessagePageQueryByGroupIdRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public OnsDLQMessagePageQueryByGroupIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OnsDLQMessagePageQueryByGroupIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

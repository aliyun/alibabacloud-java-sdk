// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateOnceTaskResponseBody extends TeaModel {
    /**
     * <p>The number of scan tasks that are complete.</p>
     */
    @NameInMap("CanCreate")
    public Boolean canCreate;

    @NameInMap("CollectTime")
    public Long collectTime;

    @NameInMap("FinishCount")
    public Integer finishCount;

    @NameInMap("LastTask")
    public String lastTask;

    /**
     * <p>The ID of the scan task.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GenerateOnceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOnceTaskResponseBody self = new GenerateOnceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOnceTaskResponseBody setCanCreate(Boolean canCreate) {
        this.canCreate = canCreate;
        return this;
    }
    public Boolean getCanCreate() {
        return this.canCreate;
    }

    public GenerateOnceTaskResponseBody setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }
    public Long getCollectTime() {
        return this.collectTime;
    }

    public GenerateOnceTaskResponseBody setFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
        return this;
    }
    public Integer getFinishCount() {
        return this.finishCount;
    }

    public GenerateOnceTaskResponseBody setLastTask(String lastTask) {
        this.lastTask = lastTask;
        return this;
    }
    public String getLastTask() {
        return this.lastTask;
    }

    public GenerateOnceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateOnceTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GenerateOnceTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}

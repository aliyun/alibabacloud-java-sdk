// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateOnceTaskResponseBody extends TeaModel {
    /**
     * <p>Indicates whether you can create more scan tasks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * <blockquote>
     * <p>By default, a maximum of 10 scan tasks can be running at the same time. If 10 image scan tasks are running, you cannot create a scan task by calling this operation. You must wait for at least one of the 10 existing scan tasks to complete before you can create a scan task.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanCreate")
    public Boolean canCreate;

    /**
     * <p>The collection time.</p>
     * 
     * <strong>example:</strong>
     * <p>1670307567000</p>
     */
    @NameInMap("CollectTime")
    public Long collectTime;

    /**
     * <p>The number of scan tasks that are complete.</p>
     * 
     * <strong>example:</strong>
     * <p>61</p>
     */
    @NameInMap("FinishCount")
    public Integer finishCount;

    /**
     * <p>The ID of the last scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>38730bb078f4a1461d4ed283994c****</p>
     */
    @NameInMap("LastTask")
    public String lastTask;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8BB6B8FA-39E8-5654-A309-8EED13B1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>38730bb078f4a1461d4ed283994c****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The total number of scan tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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

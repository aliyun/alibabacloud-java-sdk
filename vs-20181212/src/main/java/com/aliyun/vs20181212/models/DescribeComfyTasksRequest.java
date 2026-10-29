// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyTasksRequest extends TeaModel {
    /**
     * <p>The Hive ID, used as a filter to query tasks executed under the specified Hive.</p>
     * 
     * <strong>example:</strong>
     * <p>hive-26cd567b35c04a0a90f0xxxxx</p>
     */
    @NameInMap("HiveId")
    public String hiveId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records to display on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the Comfy task, used as a filter.</p>
     * 
     * <strong>example:</strong>
     * <p>6c8234f4-d1e1-4cea-b08b-7926fbdea144</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task state, used as a filter.</p>
     * 
     * <strong>example:</strong>
     * <p>QUEUED</p>
     */
    @NameInMap("TaskState")
    public String taskState;

    /**
     * <p>The ID of the Comfy workflow, used as a filter.</p>
     * 
     * <strong>example:</strong>
     * <p>wf_adb32aed-ccdc-42ae-b4d4-a21181ac8a5f</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static DescribeComfyTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyTasksRequest self = new DescribeComfyTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComfyTasksRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

    public DescribeComfyTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeComfyTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeComfyTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeComfyTasksRequest setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public DescribeComfyTasksRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}

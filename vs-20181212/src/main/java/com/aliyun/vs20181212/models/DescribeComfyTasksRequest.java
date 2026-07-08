// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyTasksRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of tasks per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The task state. If specified, the operation returns only tasks in that state.</p>
     * 
     * <strong>example:</strong>
     * <p>QUEUED</p>
     */
    @NameInMap("TaskState")
    public String taskState;

    /**
     * <p>If you specify this parameter, the operation returns only tasks for the specified workflow.</p>
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

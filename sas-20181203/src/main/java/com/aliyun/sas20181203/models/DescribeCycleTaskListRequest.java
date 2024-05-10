// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCycleTaskListRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the task. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_VUL_SCHEDULE_SCAN**: virus scan task</p>
     * <p>*   **IMAGE_SCAN**: image scan task</p>
     * <p>*   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **VIRUS_VUL_SCHEDULE_SCAN**: virus scan task</p>
     * <p>*   **IMAGE_SCAN**: image scan task</p>
     * <p>*   **EMG_VUL_SCHEDULE_SCAN**: urgent vulnerability scan task</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeCycleTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCycleTaskListRequest self = new DescribeCycleTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCycleTaskListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCycleTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCycleTaskListRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeCycleTaskListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}

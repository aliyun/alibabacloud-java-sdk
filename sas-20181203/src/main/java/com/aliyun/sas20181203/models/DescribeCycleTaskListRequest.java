// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCycleTaskListRequest extends TeaModel {
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the task. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan task</li>
     * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
     * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: urgent vulnerability scan task</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_SCAN</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: virus scan task</li>
     * <li><strong>IMAGE_SCAN</strong>: image scan task</li>
     * <li><strong>EMG_VUL_SCHEDULE_SCAN</strong>: urgent vulnerability scan task</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_SCAN</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeCycleTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCycleTaskListRequest self = new DescribeCycleTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCycleTaskListRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
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

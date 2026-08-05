// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListOfflineTaskRequest extends TeaModel {
    /**
     * <p>The list of task labels.</p>
     */
    @NameInMap("labels")
    public java.util.List<String> labels;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>syh</p>
     */
    @NameInMap("taskName")
    public String taskName;

    /**
     * <p>The task status.</p>
     */
    @NameInMap("taskStatus")
    public java.util.List<String> taskStatus;

    public static ListOfflineTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineTaskRequest self = new ListOfflineTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListOfflineTaskRequest setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public ListOfflineTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOfflineTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOfflineTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOfflineTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListOfflineTaskRequest setTaskStatus(java.util.List<String> taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public java.util.List<String> getTaskStatus() {
        return this.taskStatus;
    }

}

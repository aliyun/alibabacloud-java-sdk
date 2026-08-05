// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListOfflineTaskShrinkRequest extends TeaModel {
    /**
     * <p>The list of task labels.</p>
     */
    @NameInMap("labels")
    public String labelsShrink;

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
    public String taskStatusShrink;

    public static ListOfflineTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfflineTaskShrinkRequest self = new ListOfflineTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListOfflineTaskShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public ListOfflineTaskShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOfflineTaskShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOfflineTaskShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOfflineTaskShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListOfflineTaskShrinkRequest setTaskStatusShrink(String taskStatusShrink) {
        this.taskStatusShrink = taskStatusShrink;
        return this;
    }
    public String getTaskStatusShrink() {
        return this.taskStatusShrink;
    }

}

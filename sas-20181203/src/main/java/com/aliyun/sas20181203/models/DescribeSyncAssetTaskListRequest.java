// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSyncAssetTaskListRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The timestamp when the IDC scan task ends. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1662430077000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The timestamp when the IDC scan task starts. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1652063828796</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The name of the IDC scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>IDC_PROBE_SCAN***</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeSyncAssetTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncAssetTaskListRequest self = new DescribeSyncAssetTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncAssetTaskListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSyncAssetTaskListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSyncAssetTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSyncAssetTaskListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSyncAssetTaskListRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}

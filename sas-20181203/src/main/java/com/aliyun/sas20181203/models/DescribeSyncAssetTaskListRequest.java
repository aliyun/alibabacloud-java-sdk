// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSyncAssetTaskListRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Default value: 1, which indicates that the first page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end timestamp of the IDC scan task to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1662430077000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of entries per page in a paged query. Default value: 20. If the PageSize parameter is left empty, 20 entries are returned by default.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start timestamp of the IDC scan task to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1652063828796</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The task name.</p>
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

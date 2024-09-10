// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSyncAssetTaskLogDetailRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end timestamp of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1668064495000</p>
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
     * <p>The ID of the IDC scan task. You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeSyncAssetTaskList</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7e9565f537146fdf6bfb4e01f6f08818</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    /**
     * <p>The start timestamp of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1644027670</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The name of the IDC scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>IDC_PROBE_SCAN-TEST_001</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeSyncAssetTaskLogDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncAssetTaskLogDetailRequest self = new DescribeSyncAssetTaskLogDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncAssetTaskLogDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSyncAssetTaskLogDetailRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSyncAssetTaskLogDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSyncAssetTaskLogDetailRequest setRootTaskId(String rootTaskId) {
        this.rootTaskId = rootTaskId;
        return this;
    }
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    public DescribeSyncAssetTaskLogDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSyncAssetTaskLogDetailRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}

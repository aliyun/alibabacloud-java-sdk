// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskLeafRecordPageRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The timestamp of the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1668064495000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of entries per page in a paged query. Default value: 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to associate extended information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RelateInfo")
    public Boolean relateInfo;

    /**
     * <p>The request source.</p>
     * 
     * <strong>example:</strong>
     * <p>console_batch</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The timestamp of the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1648438617000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The list of statuses.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>The ID of the task to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>1471d8ebb96795b41ede090b9758****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>IMAGE_SCAN</strong>: image scanning</li>
     * <li><strong>IMAGE_REGISTRY_PULL</strong>: image asset synchronization.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLIENT_PROBLEM_CHECK</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeOnceTaskLeafRecordPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnceTaskLeafRecordPageRequest self = new DescribeOnceTaskLeafRecordPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnceTaskLeafRecordPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOnceTaskLeafRecordPageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeOnceTaskLeafRecordPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOnceTaskLeafRecordPageRequest setRelateInfo(Boolean relateInfo) {
        this.relateInfo = relateInfo;
        return this;
    }
    public Boolean getRelateInfo() {
        return this.relateInfo;
    }

    public DescribeOnceTaskLeafRecordPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeOnceTaskLeafRecordPageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeOnceTaskLeafRecordPageRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public DescribeOnceTaskLeafRecordPageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeOnceTaskLeafRecordPageRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}

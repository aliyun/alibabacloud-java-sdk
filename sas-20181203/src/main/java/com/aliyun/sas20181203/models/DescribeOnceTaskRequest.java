// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The timestamp when the root task ends. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1651766520000</p>
     */
    @NameInMap("EndTimeQuery")
    public Long endTimeQuery;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the root task.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>TaskType</strong> and <strong>RootTaskId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bb5d657479bba5e1d308b6c9e85c9174</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    /**
     * <p>The source of the task. Valid values include the following values:</p>
     * <ul>
     * <li><strong>schedule</strong>: automatic scheduling of Cloud Security Scanner.</li>
     * <li><strong>console</strong>: one-click detection in the Cloud Security Scanner console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The timestamp when the root task starts. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1651737301000</p>
     */
    @NameInMap("StartTimeQuery")
    public Long startTimeQuery;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>d7b2acf8d362742123e4a84e1bf8****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a task of the Security Center agent</li>
     * <li><strong>CLIENT_DEV_OPS</strong>: an O\&amp;M task of Cloud Assistant</li>
     * <li><strong>ASSET_SECURITY_CHECK</strong>: a task of asset information collection</li>
     * </ul>
     * <blockquote>
     * <p>You must specify at least one of the <strong>TaskType</strong> and <strong>RootTaskId</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CLIENT_PROBLEM_CHECK</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnceTaskRequest self = new DescribeOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnceTaskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOnceTaskRequest setEndTimeQuery(Long endTimeQuery) {
        this.endTimeQuery = endTimeQuery;
        return this;
    }
    public Long getEndTimeQuery() {
        return this.endTimeQuery;
    }

    public DescribeOnceTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOnceTaskRequest setRootTaskId(String rootTaskId) {
        this.rootTaskId = rootTaskId;
        return this;
    }
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    public DescribeOnceTaskRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeOnceTaskRequest setStartTimeQuery(Long startTimeQuery) {
        this.startTimeQuery = startTimeQuery;
        return this;
    }
    public Long getStartTimeQuery() {
        return this.startTimeQuery;
    }

    public DescribeOnceTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeOnceTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}

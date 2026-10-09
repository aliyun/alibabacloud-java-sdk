// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessTaskShrinkRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paging query.</p>
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
     * <p>1635575219000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The public IP address of the asset to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The private IP address of the asset to query.</p>
     * 
     * <strong>example:</strong>
     * <p>172.26.XX.XX</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The language type. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>oracle-win-001****</p>
     */
    @NameInMap("MachineName")
    public String machineName;

    /**
     * <p>The maximum number of entries to return per page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to query the root task list. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Queries root tasks.</li>
     * <li><strong>false</strong>: Queries subtasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RootTask")
    public Boolean rootTask;

    /**
     * <p>The ID of the root task.</p>
     * 
     * <strong>example:</strong>
     * <p>12c27343861610c5db3f7a2573b4****</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    /**
     * <p>The timestamp of the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1651290987000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the detection task. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: running</li>
     * <li><strong>2</strong>: completed</li>
     * <li><strong>3</strong>: failed</li>
     * <li><strong>4</strong>: timed out</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The name of the scan target.</p>
     * 
     * <strong>example:</strong>
     * <p>source-test-obj-0****</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>The object type of the scan. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: snapshot </li>
     * <li><strong>2</strong>: image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <p>The ID of the root task. Specify this parameter when you query the list of subtasks under a root task.</p>
     * 
     * <strong>example:</strong>
     * <p>d7b2acf8d362742123e4a84e1bf8****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The list of task IDs to return. You can specify up to 100 IDs. You must specify RootTask and cannot specify this parameter together with TaskId. If RootTask is set to true, root tasks are queried. If RootTask is set to false, subtasks are queried, and cross-root task queries are allowed. If RootTaskId is specified, the intersection is returned.</p>
     */
    @NameInMap("TaskIdList")
    public String taskIdListShrink;

    /**
     * <p>The UUID of the server to query.</p>
     * 
     * <strong>example:</strong>
     * <p>e4af3620-6895-4e2f-a641-a9d8fb53****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListAgentlessTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessTaskShrinkRequest self = new ListAgentlessTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentlessTaskShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAgentlessTaskShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAgentlessTaskShrinkRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ListAgentlessTaskShrinkRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public ListAgentlessTaskShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAgentlessTaskShrinkRequest setMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }
    public String getMachineName() {
        return this.machineName;
    }

    public ListAgentlessTaskShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentlessTaskShrinkRequest setRootTask(Boolean rootTask) {
        this.rootTask = rootTask;
        return this;
    }
    public Boolean getRootTask() {
        return this.rootTask;
    }

    public ListAgentlessTaskShrinkRequest setRootTaskId(String rootTaskId) {
        this.rootTaskId = rootTaskId;
        return this;
    }
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    public ListAgentlessTaskShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListAgentlessTaskShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListAgentlessTaskShrinkRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ListAgentlessTaskShrinkRequest setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

    public ListAgentlessTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListAgentlessTaskShrinkRequest setTaskIdListShrink(String taskIdListShrink) {
        this.taskIdListShrink = taskIdListShrink;
        return this;
    }
    public String getTaskIdListShrink() {
        return this.taskIdListShrink;
    }

    public ListAgentlessTaskShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

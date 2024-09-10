// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessTaskRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
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
     * <p>1635575219000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The public IP address of the asset that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The private IP address of the asset that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>172.26.XX.XX</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The language type. Valid values:</p>
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
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to query main tasks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: queries main tasks.</li>
     * <li><strong>false</strong>: queries subtasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RootTask")
    public Boolean rootTask;

    /**
     * <p>The ID of the main task.</p>
     * 
     * <strong>example:</strong>
     * <p>12c27343861610c5db3f7a2573b4****</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    /**
     * <p>The start timestamp of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1651290987000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the detection task.</p>
     * <ul>
     * <li><strong>1</strong>: The detection task is in progress.</li>
     * <li><strong>2</strong>: The detection task is complete.</li>
     * <li><strong>3</strong>: The detection task fails.</li>
     * <li><strong>4</strong>: The detection task times out.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The name of the asset that you want to detect.</p>
     * 
     * <strong>example:</strong>
     * <p>source-test-obj-0****</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>The type of the asset that you want to detect. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: snapshot</li>
     * <li><strong>2</strong>: image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <p>The ID of the main task. If you want to query subtasks of a main task, you must specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>d7b2acf8d362742123e4a84e1bf8****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>e4af3620-6895-4e2f-a641-a9d8fb53****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListAgentlessTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessTaskRequest self = new ListAgentlessTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentlessTaskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAgentlessTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAgentlessTaskRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ListAgentlessTaskRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public ListAgentlessTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAgentlessTaskRequest setMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }
    public String getMachineName() {
        return this.machineName;
    }

    public ListAgentlessTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentlessTaskRequest setRootTask(Boolean rootTask) {
        this.rootTask = rootTask;
        return this;
    }
    public Boolean getRootTask() {
        return this.rootTask;
    }

    public ListAgentlessTaskRequest setRootTaskId(String rootTaskId) {
        this.rootTaskId = rootTaskId;
        return this;
    }
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    public ListAgentlessTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListAgentlessTaskRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListAgentlessTaskRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ListAgentlessTaskRequest setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

    public ListAgentlessTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListAgentlessTaskRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

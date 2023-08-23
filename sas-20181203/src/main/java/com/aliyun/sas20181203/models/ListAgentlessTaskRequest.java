// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessTaskRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end timestamp of the task.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The public IP address of the asset that you want to query.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The private IP address of the asset that you want to query.</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The language type. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("MachineName")
    public String machineName;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to query main tasks. Valid values:</p>
     * <br>
     * <p>*   **true**: queries main tasks.</p>
     * <p>*   **false**: queries subtasks.</p>
     */
    @NameInMap("RootTask")
    public Boolean rootTask;

    /**
     * <p>The ID of the main task.</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    /**
     * <p>The start timestamp of the task.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the detection task.</p>
     * <br>
     * <p>*   **1**: The detection task is in progress.</p>
     * <p>*   **2**: The detection task is complete.</p>
     * <p>*   **3**: The detection task fails.</p>
     * <p>*   **4**: The detection task times out.</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The name of the asset that you want to detect.</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>The type of the asset that you want to detect. Valid values:</p>
     * <br>
     * <p>*   **1**: snapshot</p>
     * <p>*   **2**: image</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <p>The ID of the main task. If you want to query subtasks of a main task, you must specify this parameter.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The UUID of the server.</p>
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

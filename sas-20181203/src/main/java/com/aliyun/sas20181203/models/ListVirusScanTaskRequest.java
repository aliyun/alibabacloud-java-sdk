// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskRequest extends TeaModel {
    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The timestamp when the virus scan task ended. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The public IP address of the server.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The private IP address of the server.</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the server.</p>
     */
    @NameInMap("MachineName")
    public String machineName;

    /**
     * <p>The number of entries per page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the virus scan task is the root task.</p>
     */
    @NameInMap("RootTask")
    public Boolean rootTask;

    /**
     * <p>The ID of the root task.</p>
     * <br>
     * <p>>  You can call the [GetVirusScanLatestTaskStatistic](~~GetVirusScanLatestTaskStatistic~~) operation to query the ID.</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    /**
     * <p>The type of the virus scan task. Valid values:</p>
     * <br>
     * <p>*   **system**: automatic scan task</p>
     * <p>*   **user**: custom scan task</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The timestamp when the virus scan task started. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the virus scan task. Valid values:</p>
     * <br>
     * <p>*   **1**: running</p>
     * <p>*   **2**: complete</p>
     * <p>*   **3**: failed</p>
     * <p>*   **4**: timed out</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The statuses of virus scan tasks.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<Integer> statusList;

    /**
     * <p>The ID of the virus scan task.</p>
     * <br>
     * <p>>  You can call the [ListVirusScanTask](~~ListVirusScanTask~~) operation to query the ID.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ListVirusScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTaskRequest self = new ListVirusScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTaskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListVirusScanTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListVirusScanTaskRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ListVirusScanTaskRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public ListVirusScanTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListVirusScanTaskRequest setMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }
    public String getMachineName() {
        return this.machineName;
    }

    public ListVirusScanTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVirusScanTaskRequest setRootTask(Boolean rootTask) {
        this.rootTask = rootTask;
        return this;
    }
    public Boolean getRootTask() {
        return this.rootTask;
    }

    public ListVirusScanTaskRequest setRootTaskId(String rootTaskId) {
        this.rootTaskId = rootTaskId;
        return this;
    }
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    public ListVirusScanTaskRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

    public ListVirusScanTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListVirusScanTaskRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListVirusScanTaskRequest setStatusList(java.util.List<Integer> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<Integer> getStatusList() {
        return this.statusList;
    }

    public ListVirusScanTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

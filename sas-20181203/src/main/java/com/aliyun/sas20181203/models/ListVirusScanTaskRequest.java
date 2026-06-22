// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskRequest extends TeaModel {
    /**
     * <p>The page number of the results to return. Default value: <strong>1</strong>, which indicates that results start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The timestamp of the task end time to query, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1680919232999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>120.27.XX.XX</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.26.XX.XX</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The language type of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>oracle-win-001****</p>
     */
    @NameInMap("MachineName")
    public String machineName;

    /**
     * <p>The number of tasks per page in a paged query. Default value: <strong>20</strong>, which indicates that each page contains 20 tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the task is the root task of the virus scan.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RootTask")
    public Boolean rootTask;

    /**
     * <p>The root task ID.</p>
     * <blockquote>
     * <p>Call <a href="~~GetVirusScanLatestTaskStatistic~~">GetVirusScanLatestTaskStatistic</a> to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>89f5d7813bd59dd237580a8664b3xxxx</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    /**
     * <p>The scan type of the virus scan task to query. Valid values:</p>
     * <ul>
     * <li><strong>system</strong>: automatic system scan</li>
     * <li><strong>user</strong>: custom user scan.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The timestamp of the task start time to query, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1680919232000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The execution status of the virus scan task. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Scanning.</li>
     * <li><strong>2</strong>: Completed.</li>
     * <li><strong>3</strong>: Failed.</li>
     * <li><strong>4</strong>: Timed out.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The list of statuses used to filter tasks by multiple statuses.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<Integer> statusList;

    /**
     * <p>The ID of the virus scan task to query.</p>
     * <blockquote>
     * <p>Call <a href="~~ListVirusScanTask~~">ListVirusScanTask</a> to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1471d8ebb96795b41ede090b9758****</p>
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

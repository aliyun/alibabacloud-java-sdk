// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectClientEventRequest extends TeaModel {
    /**
     * <p>The list of alert notification levels.</p>
     */
    @NameInMap("AlertLevels")
    public java.util.List<Integer> alertLevels;

    /**
     * <p>The page number of the current page when paging is used in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1650470399999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The file path.</p>
     * 
     * <strong>example:</strong>
     * <p>/etc/pam****</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The ID of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1fu4aqltf1huhc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_cpm_****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

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
     * <p>The type of operation performed on the file. Valid values:</p>
     * <ul>
     * <li><strong>DELETE</strong>: deletes the file.</li>
     * <li><strong>WRITE</strong>: writes to the file.</li>
     * <li><strong>READ</strong>: reads the file.</li>
     * <li><strong>RENAME</strong>: renames the file.</li>
     * <li><strong>CHOWN</strong>: changes the file owner and associated group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>READ</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The maximum number of entries per page when paging is used in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The process path.</p>
     * 
     * <strong>example:</strong>
     * <p>c:/windows/system32/i****</p>
     */
    @NameInMap("ProcPath")
    public String procPath;

    /**
     * <p>The name of the configuration rule.</p>
     * 
     * <strong>example:</strong>
     * <p>text-001</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1650470399999</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Unhandled.</li>
     * <li><strong>1</strong>: Handled.</li>
     * <li><strong>2</strong>: Whitelisted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The UUID of the server to query.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListFileProtectClientEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectClientEventRequest self = new ListFileProtectClientEventRequest();
        return TeaModel.build(map, self);
    }

    public ListFileProtectClientEventRequest setAlertLevels(java.util.List<Integer> alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }
    public java.util.List<Integer> getAlertLevels() {
        return this.alertLevels;
    }

    public ListFileProtectClientEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListFileProtectClientEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListFileProtectClientEventRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ListFileProtectClientEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFileProtectClientEventRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListFileProtectClientEventRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ListFileProtectClientEventRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public ListFileProtectClientEventRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ListFileProtectClientEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFileProtectClientEventRequest setProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }
    public String getProcPath() {
        return this.procPath;
    }

    public ListFileProtectClientEventRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListFileProtectClientEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListFileProtectClientEventRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListFileProtectClientEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

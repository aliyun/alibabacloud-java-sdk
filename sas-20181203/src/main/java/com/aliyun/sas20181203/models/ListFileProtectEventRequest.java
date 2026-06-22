// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectEventRequest extends TeaModel {
    /**
     * <p>The list of alert notification levels.</p>
     */
    @NameInMap("AlertLevels")
    public java.util.List<Integer> alertLevels;

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
     * <p>1683257937775</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g6wxdwps7s9dz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the server to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_cpm_****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The public IP address of the asset to query.</p>
     * 
     * <strong>example:</strong>
     * <p>120.27.XX.XX</p>
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
     * <p>The maximum number of entries to return on each page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-rule-1</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The timestamp of the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1656038740435</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li>0: Unhandled. </li>
     * <li>1: Manually handled.</li>
     * <li>2: Whitelisted.</li>
     * <li>3: Ignored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The UUID of the server to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListFileProtectEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectEventRequest self = new ListFileProtectEventRequest();
        return TeaModel.build(map, self);
    }

    public ListFileProtectEventRequest setAlertLevels(java.util.List<Integer> alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }
    public java.util.List<Integer> getAlertLevels() {
        return this.alertLevels;
    }

    public ListFileProtectEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListFileProtectEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListFileProtectEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFileProtectEventRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListFileProtectEventRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ListFileProtectEventRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public ListFileProtectEventRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ListFileProtectEventRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListFileProtectEventRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListFileProtectEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListFileProtectEventRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListFileProtectEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

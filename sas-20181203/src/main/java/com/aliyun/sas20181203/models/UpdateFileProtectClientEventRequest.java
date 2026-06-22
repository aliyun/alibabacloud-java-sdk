// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectClientEventRequest extends TeaModel {
    /**
     * <p>The list of alert notification levels.</p>
     */
    @NameInMap("AlertLevels")
    public java.util.List<Integer> alertLevels;

    /**
     * <p>The timestamp of the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1650470399999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of excluded event IDs.</p>
     */
    @NameInMap("ExcludeIdList")
    public java.util.List<Long> excludeIdList;

    /**
     * <p>The file path.</p>
     * 
     * <strong>example:</strong>
     * <p>/etc/pam****</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The list of event IDs.</p>
     */
    @NameInMap("IdList")
    public java.util.List<Long> idList;

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
     * <p>test</p>
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
     * <p>The internal IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.26.XX.XX</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The new status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Unhandled.</li>
     * <li><strong>1</strong>: Handled.</li>
     * <li><strong>2</strong>: Whitelisted.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewStatus")
    public Integer newStatus;

    /**
     * <p>The type of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>READ</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The process path.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/1111/****</p>
     */
    @NameInMap("ProcPath")
    public String procPath;

    /**
     * <p>The remarks.</p>
     */
    @NameInMap("Remark")
    public java.util.List<String> remark;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>tetsRule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies whether to select all.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SelectAll")
    public Boolean selectAll;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1649260800000</p>
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
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The UUID of the protected server.</p>
     * 
     * <strong>example:</strong>
     * <p>ae1527a9-2308-46ab-b10a-48ae7ff7****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static UpdateFileProtectClientEventRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectClientEventRequest self = new UpdateFileProtectClientEventRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectClientEventRequest setAlertLevels(java.util.List<Integer> alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }
    public java.util.List<Integer> getAlertLevels() {
        return this.alertLevels;
    }

    public UpdateFileProtectClientEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateFileProtectClientEventRequest setExcludeIdList(java.util.List<Long> excludeIdList) {
        this.excludeIdList = excludeIdList;
        return this;
    }
    public java.util.List<Long> getExcludeIdList() {
        return this.excludeIdList;
    }

    public UpdateFileProtectClientEventRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UpdateFileProtectClientEventRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public UpdateFileProtectClientEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateFileProtectClientEventRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateFileProtectClientEventRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public UpdateFileProtectClientEventRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public UpdateFileProtectClientEventRequest setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
        return this;
    }
    public Integer getNewStatus() {
        return this.newStatus;
    }

    public UpdateFileProtectClientEventRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateFileProtectClientEventRequest setProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }
    public String getProcPath() {
        return this.procPath;
    }

    public UpdateFileProtectClientEventRequest setRemark(java.util.List<String> remark) {
        this.remark = remark;
        return this;
    }
    public java.util.List<String> getRemark() {
        return this.remark;
    }

    public UpdateFileProtectClientEventRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateFileProtectClientEventRequest setSelectAll(Boolean selectAll) {
        this.selectAll = selectAll;
        return this;
    }
    public Boolean getSelectAll() {
        return this.selectAll;
    }

    public UpdateFileProtectClientEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateFileProtectClientEventRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateFileProtectClientEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

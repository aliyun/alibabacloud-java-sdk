// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectRemarkRequest extends TeaModel {
    /**
     * <p>The list of alert notification levels.</p>
     */
    @NameInMap("AlertLevels")
    public java.util.List<Integer> alertLevels;

    /**
     * <p>The timestamp of the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1649040221</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1764</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The list of event IDs.</p>
     */
    @NameInMap("IdList")
    public java.util.List<Long> idList;

    /**
     * <p>The ID of the asset instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g6wxdwps7s9dz****</p>
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
     * <p>101.132.XX.XX</p>
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
     * <p>The type of operation performed on the file. Valid values:</p>
     * <ul>
     * <li><strong>DELETE</strong>: Delete the file.</li>
     * <li><strong>WRITE</strong>: Write to the file.</li>
     * <li><strong>READ</strong>: Read the file.</li>
     * <li><strong>RENAME</strong>: Rename the file.</li>
     * <li><strong>CHOWN</strong>: Change the file owner and file group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>READ</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The remarks.</p>
     */
    @NameInMap("Remark")
    public java.util.List<String> remark;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-rule-1</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies whether to select all items across pages. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SelectAllAcrossPages")
    public Boolean selectAllAcrossPages;

    /**
     * <p>The timestamp of the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1651290987000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>5d55af3c-35f3-4d4d-8ccc-8c5443b0****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static UpdateFileProtectRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectRemarkRequest self = new UpdateFileProtectRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectRemarkRequest setAlertLevels(java.util.List<Integer> alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }
    public java.util.List<Integer> getAlertLevels() {
        return this.alertLevels;
    }

    public UpdateFileProtectRemarkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateFileProtectRemarkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateFileProtectRemarkRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public UpdateFileProtectRemarkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateFileProtectRemarkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateFileProtectRemarkRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public UpdateFileProtectRemarkRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public UpdateFileProtectRemarkRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateFileProtectRemarkRequest setRemark(java.util.List<String> remark) {
        this.remark = remark;
        return this;
    }
    public java.util.List<String> getRemark() {
        return this.remark;
    }

    public UpdateFileProtectRemarkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateFileProtectRemarkRequest setSelectAllAcrossPages(Boolean selectAllAcrossPages) {
        this.selectAllAcrossPages = selectAllAcrossPages;
        return this;
    }
    public Boolean getSelectAllAcrossPages() {
        return this.selectAllAcrossPages;
    }

    public UpdateFileProtectRemarkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateFileProtectRemarkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

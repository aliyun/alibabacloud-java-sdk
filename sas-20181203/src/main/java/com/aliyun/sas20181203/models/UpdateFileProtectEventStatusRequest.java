// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectEventStatusRequest extends TeaModel {
    @NameInMap("AlertLevels")
    public java.util.List<Integer> alertLevels;

    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The IDs of the events.</p>
     */
    @NameInMap("Id")
    public java.util.List<Long> id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InternetIp")
    public String internetIp;

    @NameInMap("IntranetIp")
    public String intranetIp;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SelectAllAcrossPages")
    public Boolean selectAllAcrossPages;

    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The handling status of the event. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: unhandled</li>
     * <li><strong>1</strong>: handled</li>
     * <li><strong>2</strong>: added to the whitelist</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    @NameInMap("Uuid")
    public String uuid;

    public static UpdateFileProtectEventStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectEventStatusRequest self = new UpdateFileProtectEventStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectEventStatusRequest setAlertLevels(java.util.List<Integer> alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }
    public java.util.List<Integer> getAlertLevels() {
        return this.alertLevels;
    }

    public UpdateFileProtectEventStatusRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateFileProtectEventStatusRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

    public UpdateFileProtectEventStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateFileProtectEventStatusRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateFileProtectEventStatusRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public UpdateFileProtectEventStatusRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public UpdateFileProtectEventStatusRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateFileProtectEventStatusRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateFileProtectEventStatusRequest setSelectAllAcrossPages(Boolean selectAllAcrossPages) {
        this.selectAllAcrossPages = selectAllAcrossPages;
        return this;
    }
    public Boolean getSelectAllAcrossPages() {
        return this.selectAllAcrossPages;
    }

    public UpdateFileProtectEventStatusRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateFileProtectEventStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public UpdateFileProtectEventStatusRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

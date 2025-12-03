// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectRemarkRequest extends TeaModel {
    @NameInMap("AlertLevels")
    public java.util.List<Integer> alertLevels;

    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>1764</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("IdList")
    public java.util.List<Long> idList;

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

    /**
     * <p>The remarks.</p>
     */
    @NameInMap("Remark")
    public java.util.List<String> remark;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SelectAllAcrossPages")
    public Boolean selectAllAcrossPages;

    @NameInMap("StartTime")
    public Long startTime;

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

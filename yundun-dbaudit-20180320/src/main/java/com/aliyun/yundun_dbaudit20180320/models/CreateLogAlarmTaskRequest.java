// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateLogAlarmTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("ToMailList")
    public java.util.List<String> toMailList;

    @NameInMap("DbIdList")
    public java.util.List<String> dbIdList;

    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    public static CreateLogAlarmTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogAlarmTaskRequest self = new CreateLogAlarmTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogAlarmTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLogAlarmTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLogAlarmTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateLogAlarmTaskRequest setToMailList(java.util.List<String> toMailList) {
        this.toMailList = toMailList;
        return this;
    }
    public java.util.List<String> getToMailList() {
        return this.toMailList;
    }

    public CreateLogAlarmTaskRequest setDbIdList(java.util.List<String> dbIdList) {
        this.dbIdList = dbIdList;
        return this;
    }
    public java.util.List<String> getDbIdList() {
        return this.dbIdList;
    }

    public CreateLogAlarmTaskRequest setRiskLevelList(java.util.List<String> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

}

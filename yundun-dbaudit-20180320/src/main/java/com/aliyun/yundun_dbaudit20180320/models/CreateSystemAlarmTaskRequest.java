// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateSystemAlarmTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("ToMailList")
    public java.util.List<String> toMailList;

    public static CreateSystemAlarmTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSystemAlarmTaskRequest self = new CreateSystemAlarmTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSystemAlarmTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSystemAlarmTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSystemAlarmTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateSystemAlarmTaskRequest setToMailList(java.util.List<String> toMailList) {
        this.toMailList = toMailList;
        return this;
    }
    public java.util.List<String> getToMailList() {
        return this.toMailList;
    }

}

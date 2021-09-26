// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifySystemAlarmTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("ToMailList")
    public java.util.List<String> toMailList;

    public static ModifySystemAlarmTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemAlarmTaskRequest self = new ModifySystemAlarmTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifySystemAlarmTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySystemAlarmTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySystemAlarmTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ModifySystemAlarmTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public ModifySystemAlarmTaskRequest setToMailList(java.util.List<String> toMailList) {
        this.toMailList = toMailList;
        return this;
    }
    public java.util.List<String> getToMailList() {
        return this.toMailList;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterTimedScheduleTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pgm-bp102g323jd4****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>2022-05-06T09:24:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <strong>example:</strong>
     * <p>440437220</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ModifyParameterTimedScheduleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterTimedScheduleTaskRequest self = new ModifyParameterTimedScheduleTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParameterTimedScheduleTaskRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyParameterTimedScheduleTaskRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public ModifyParameterTimedScheduleTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteParameterTimedScheduleTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>41698</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DeleteParameterTimedScheduleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterTimedScheduleTaskRequest self = new DeleteParameterTimedScheduleTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteParameterTimedScheduleTaskRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DeleteParameterTimedScheduleTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}

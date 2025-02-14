// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ProcessSoarStrategyTaskRequest extends TeaModel {
    /**
     * <p>ID of the strategy task.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> interface.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StrategyTaskId")
    public Long strategyTaskId;

    /**
     * <p>Task action status. Values:</p>
     * <ul>
     * <li>SCHEDULE: Schedule</li>
     * <li>PAUSE: Pause</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SCHEDULE</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    public static ProcessSoarStrategyTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessSoarStrategyTaskRequest self = new ProcessSoarStrategyTaskRequest();
        return TeaModel.build(map, self);
    }

    public ProcessSoarStrategyTaskRequest setStrategyTaskId(Long strategyTaskId) {
        this.strategyTaskId = strategyTaskId;
        return this;
    }
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

    public ProcessSoarStrategyTaskRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

}

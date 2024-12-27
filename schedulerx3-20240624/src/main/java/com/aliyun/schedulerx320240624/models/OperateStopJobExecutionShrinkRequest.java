// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateStopJobExecutionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    @NameInMap("TaskList")
    public String taskListShrink;

    public static OperateStopJobExecutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateStopJobExecutionShrinkRequest self = new OperateStopJobExecutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OperateStopJobExecutionShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateStopJobExecutionShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateStopJobExecutionShrinkRequest setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    public OperateStopJobExecutionShrinkRequest setTaskListShrink(String taskListShrink) {
        this.taskListShrink = taskListShrink;
        return this;
    }
    public String getTaskListShrink() {
        return this.taskListShrink;
    }

}

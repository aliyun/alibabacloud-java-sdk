// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateRetryJobExecutionShrinkRequest extends TeaModel {
    /**
     * <p>The Application Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The Job Execution ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    /**
     * <p>A list of Sub-task execution IDs for a Broadcast Sharding Job.</p>
     * <blockquote>
     * <p>To retry a specific Sub-task of a Broadcast Sharding Job, set this parameter to the execution ID of that Sub-task.</p>
     * </blockquote>
     */
    @NameInMap("TaskList")
    public String taskListShrink;

    /**
     * <p>Specifies whether to trigger downstream jobs.</p>
     */
    @NameInMap("TriggerChild")
    public Boolean triggerChild;

    public static OperateRetryJobExecutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateRetryJobExecutionShrinkRequest self = new OperateRetryJobExecutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OperateRetryJobExecutionShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public OperateRetryJobExecutionShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OperateRetryJobExecutionShrinkRequest setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    public OperateRetryJobExecutionShrinkRequest setTaskListShrink(String taskListShrink) {
        this.taskListShrink = taskListShrink;
        return this;
    }
    public String getTaskListShrink() {
        return this.taskListShrink;
    }

    public OperateRetryJobExecutionShrinkRequest setTriggerChild(Boolean triggerChild) {
        this.triggerChild = triggerChild;
        return this;
    }
    public Boolean getTriggerChild() {
        return this.triggerChild;
    }

}

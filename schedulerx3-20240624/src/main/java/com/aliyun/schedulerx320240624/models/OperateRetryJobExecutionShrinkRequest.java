// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateRetryJobExecutionShrinkRequest extends TeaModel {
    @NameInMap("AppGroupId")
    public Long appGroupId;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The job execution ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1310630367761285120</p>
     */
    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    /**
     * <p>The list of subtask execution IDs (for broadcast jobs).</p>
     * <blockquote>
     * <p>To rerun a subtask of a broadcast job, set this field to the execution ID of the corresponding subtask.</p>
     * </blockquote>
     */
    @NameInMap("TaskList")
    public String taskListShrink;

    /**
     * <p>Specifies whether to trigger downstream nodes.</p>
     */
    @NameInMap("TriggerChild")
    public Boolean triggerChild;

    public static OperateRetryJobExecutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateRetryJobExecutionShrinkRequest self = new OperateRetryJobExecutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OperateRetryJobExecutionShrinkRequest setAppGroupId(Long appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }
    public Long getAppGroupId() {
        return this.appGroupId;
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

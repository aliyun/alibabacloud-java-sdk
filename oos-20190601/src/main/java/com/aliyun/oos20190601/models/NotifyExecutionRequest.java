// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class NotifyExecutionRequest extends TeaModel {
    /**
     * <p>The ID of the execution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-xxx</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The state of the terminated execution. This parameter is valid if you set the NotifyType parameter to CompleteExecution.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ExecutionStatus")
    public String executionStatus;

    /**
     * <p>The items of the child node in the loop task.</p>
     * 
     * <strong>example:</strong>
     * <p>i-xxx</p>
     */
    @NameInMap("LoopItem")
    public String loopItem;

    /**
     * <p>The description for the notification.</p>
     * 
     * <strong>example:</strong>
     * <p>Note</p>
     */
    @NameInMap("NotifyNote")
    public String notifyNote;

    /**
     * <p>The type of the notification. Valid values:</p>
     * <ul>
     * <li><strong>ExecuteTask</strong>: starts to run a specific task. This value is used if you perform debugging in the Debug mode. If you set this parameter to ExecuteTask, you also need to set the Parameters parameter.</li>
     * <li><strong>CancelTask</strong>: cancels a current task. This value is used if you perform debugging in the Debug mode.</li>
     * <li><strong>CompleteExecution</strong>: manually terminates an execution if you perform debugging in the Debug mode. You can specify the state of the terminated execution by using the <strong>ExecutionStatus</strong> parameter.</li>
     * <li><strong>Approve</strong>: approves an execution. For example, you are aware of the risks of an operation task and agree to approve the execution.</li>
     * <li><strong>Reject</strong>: rejects an execution. For example, you want to reject the execution of a high-risk operation task.</li>
     * <li><strong>RetryTask</strong>: retries a failed task whose execution mode is Suspend upon Failure.</li>
     * <li><strong>SkipTask</strong>: skips a failed task whose execution mode is Suspend upon Failure.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Approve</p>
     */
    @NameInMap("NotifyType")
    public String notifyType;

    /**
     * <p>The parameters of the subsequent task. This parameter is valid if you set the NotifyType parameter to ExecuteTask.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The ID of the region in which the execution resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The execution ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>task-exec-xxx</p>
     */
    @NameInMap("TaskExecutionId")
    public String taskExecutionId;

    /**
     * <p>The execution IDs of the tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;exec-79c321c11003a97c&quot;,&quot;exec-79c321c11003aqw97cz&quot;]</p>
     */
    @NameInMap("TaskExecutionIds")
    public String taskExecutionIds;

    /**
     * <p>The name of the subsequent task.</p>
     * 
     * <strong>example:</strong>
     * <p>describeInstance</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static NotifyExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyExecutionRequest self = new NotifyExecutionRequest();
        return TeaModel.build(map, self);
    }

    public NotifyExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public NotifyExecutionRequest setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public NotifyExecutionRequest setLoopItem(String loopItem) {
        this.loopItem = loopItem;
        return this;
    }
    public String getLoopItem() {
        return this.loopItem;
    }

    public NotifyExecutionRequest setNotifyNote(String notifyNote) {
        this.notifyNote = notifyNote;
        return this;
    }
    public String getNotifyNote() {
        return this.notifyNote;
    }

    public NotifyExecutionRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public NotifyExecutionRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public NotifyExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public NotifyExecutionRequest setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    public NotifyExecutionRequest setTaskExecutionIds(String taskExecutionIds) {
        this.taskExecutionIds = taskExecutionIds;
        return this;
    }
    public String getTaskExecutionIds() {
        return this.taskExecutionIds;
    }

    public NotifyExecutionRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}

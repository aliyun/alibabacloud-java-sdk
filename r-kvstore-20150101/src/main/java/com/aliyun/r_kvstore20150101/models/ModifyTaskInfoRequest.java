// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoRequest extends TeaModel {
    /**
     * <p>The parameters related to the action, in JSON format.
     * If <strong>TaskAction</strong> is set to <strong>modifySwitchTime</strong>, set this parameter to <code>{&quot;recoverMode&quot;: &quot;xxx&quot;, &quot;recoverTime&quot;: &quot;xxx&quot;}</code>.</p>
     * <ul>
     * <li><p><strong>recoverMode</strong>: the recovery mode of the task. Valid values:</p>
     * <ul>
     * <li><strong>imePoint</strong>: executes the task at a specified point in time.</li>
     * <li><strong>immediate</strong>: executes the task immediately.</li>
     * <li><strong>maintainTime</strong>: executes the task during the O&amp;M window.</li>
     * </ul>
     * </li>
     * <li><p><strong>recoverTime</strong>: the specified point in time. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. This parameter is required when <strong>recoverMode</strong> is set to <strong>timePoint</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;recoverMode&quot;:&quot;immediate&quot;}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the current execution step. You can call the <a href="https://help.aliyun.com/document_detail/2400077.html">DescribeHistoryTasks</a> operation to query the current execution step of a specified task. A common value is <strong>do_pause</strong>, which indicates that the task is waiting to be executed at a preset time.</p>
     * 
     * <strong>example:</strong>
     * <p>do_pause</p>
     */
    @NameInMap("StepName")
    public String stepName;

    /**
     * <p>The operation name. Valid value: <strong>modifySwitchTime</strong>, which indicates modifying the switchover time or recovery time.</p>
     * 
     * <strong>example:</strong>
     * <p>modifySwitchTime</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    /**
     * <p>The task ID. Separate multiple task IDs with commas (,). A maximum of 30 task IDs are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-0mq3kfhn8i1nlt****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTaskInfoRequest self = new ModifyTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTaskInfoRequest setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public ModifyTaskInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTaskInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTaskInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTaskInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyTaskInfoRequest setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public ModifyTaskInfoRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

    public ModifyTaskInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

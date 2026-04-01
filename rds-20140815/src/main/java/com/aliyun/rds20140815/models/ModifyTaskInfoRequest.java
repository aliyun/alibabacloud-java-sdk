// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoRequest extends TeaModel {
    /**
     * <p>The action-related parameters. You can add action-related parameters based on your business requirements. If you set the TaskAction parameter to modifySwitchTime, you must set this parameter to <code>{&quot;recoverMode&quot;: &quot;xxx&quot;, &quot;recoverTime&quot;: &quot;xxx&quot;}</code>.</p>
     * <p>The recoverMode field specifies the task restoration mode. valid values:</p>
     * <ul>
     * <li><strong>timePoint</strong>: The task is executed at a specified point in time.</li>
     * <li><strong>Immediate</strong>: The task is executed immediately.</li>
     * <li><strong>maintainTime</strong>: The task is executed based on the O\&amp;M time.</li>
     * </ul>
     * <p>The recoverTime field specifies restoration time. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If you set the recoverMode field to timePoint, you must also specify the recoverTime field.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;recoverTime\&quot;:\&quot;2023-04-12T18:30:00Z\&quot;,\&quot;recoverMode\&quot;:\&quot;timePoint\&quot;}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public Long resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the execution step.</p>
     * 
     * <strong>example:</strong>
     * <p>ha_switch</p>
     */
    @NameInMap("StepName")
    public String stepName;

    /**
     * <p>The task action. Set the value to modifySwitchTime. The value specifies that you want to change the switching time or restoration time.</p>
     * 
     * <strong>example:</strong>
     * <p>ImportImage</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    /**
     * <p>The task ID. You can call the DescribeTasks operation to query task IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-83br18hloum8u3948s</p>
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

    public ModifyTaskInfoRequest setResourceOwnerAccount(Long resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public Long getResourceOwnerAccount() {
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoRequest extends TeaModel {
    /**
     * <p>The parameters related to the action, in JSON format.
     * If <strong>TaskAction</strong> is set to <strong>modifySwitchTime</strong>, the ActionParams value is <code>{&quot;recoverMode&quot;: &quot;xxx&quot;, &quot;recoverTime&quot;: &quot;xxx&quot;}</code>.</p>
     * <ul>
     * <li><p><strong>recoverMode</strong> specifies the task recovery mode. Valid values:</p>
     * <ul>
     * <li><strong>imePoint</strong>: Execute at a specified point in time.</li>
     * <li><strong>immediate</strong>: Execute immediately.</li>
     * <li><strong>maintainTime</strong>: Execute during the O&amp;M window.</li>
     * </ul>
     * </li>
     * <li><p><strong>recoverTime</strong> specifies the point in time, in UTC+0, in the yyyy-MM-ddTHH:mm:ssZ format. This parameter is required when <strong>recoverMode</strong> is set to <strong>timePoint</strong>.</p>
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
     * <p>The name of the current execution step. You can call <a href="https://help.aliyun.com/document_detail/2400077.html">DescribeHistoryTasks</a> to query the current execution step of a specified node ID. A common value is <strong>do_pause</strong>, which indicates waiting for the preset time to execute.</p>
     * 
     * <strong>example:</strong>
     * <p>do_pause</p>
     */
    @NameInMap("StepName")
    public String stepName;

    /**
     * <p>The operation name. Currently, the valid value is <strong>modifySwitchTime</strong>, which indicates modifying the switchover time or recovery time.</p>
     * 
     * <strong>example:</strong>
     * <p>modifySwitchTime</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    /**
     * <p>The node ID. To specify multiple IDs, separate them with commas (,). You can specify up to 30 IDs.</p>
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

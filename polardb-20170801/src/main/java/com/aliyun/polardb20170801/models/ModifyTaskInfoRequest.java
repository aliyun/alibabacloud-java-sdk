// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoRequest extends TeaModel {
    /**
     * <p>The operation parameters for the task.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>The ID of the region where the task is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
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
     * <p>The name of the task step to modify. Usage note: These two parameters are required in actual calls. If they are not provided, the Param.Invalid error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>create_instance</p>
     */
    @NameInMap("StepName")
    public String stepName;

    /**
     * <p>The name of the API operation associated with the task. Usage note: These two parameters are required in actual calls. If they are not provided, the Param.Invalid error is returned. Usage note: Provide a complete list of valid values or instructions on how to obtain them (such as by calling an associated query API), and correct the current invalid example value CreateDBInstance to an actual valid TaskAction value.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateDBInstance</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    /**
     * <p>The ID of the task to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>32077061</p>
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

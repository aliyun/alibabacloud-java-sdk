// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateTeamInput extends TeaModel {
    /**
     * <p>The new description of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>Production sandbox environment for the algorithm team</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The new plan specification of the team. Valid values: eco (economy), std (standard), pro (professional), ent (enterprise).</p>
     * 
     * <strong>example:</strong>
     * <p>pro</p>
     */
    @NameInMap("plan")
    public String plan;

    /**
     * <p>The ID of the new Alibaba Cloud resource group to which the team belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The new name of the team. The name can be modified only when allowUpdateTeamName of the team is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-prod</p>
     */
    @NameInMap("teamName")
    public String teamName;

    public static UpdateTeamInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateTeamInput self = new UpdateTeamInput();
        return TeaModel.build(map, self);
    }

    public UpdateTeamInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTeamInput setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
    }

    public UpdateTeamInput setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public UpdateTeamInput setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

}

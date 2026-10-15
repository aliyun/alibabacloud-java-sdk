// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTeamInput extends TeaModel {
    /**
     * <p>The description of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>Sandbox environment for the algorithm team</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The plan specification of the team. Valid values: eco (economy), std (standard), pro (professional), ent (enterprise).</p>
     * 
     * <strong>example:</strong>
     * <p>std</p>
     */
    @NameInMap("plan")
    public String plan;

    /**
     * <p>The ID of the Alibaba Cloud resource group to which the team belongs. If this parameter is not specified, the default resource group of the account is used.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The name of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-dev</p>
     */
    @NameInMap("teamName")
    public String teamName;

    public static CreateTeamInput build(java.util.Map<String, ?> map) throws Exception {
        CreateTeamInput self = new CreateTeamInput();
        return TeaModel.build(map, self);
    }

    public CreateTeamInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTeamInput setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
    }

    public CreateTeamInput setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public CreateTeamInput setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

}

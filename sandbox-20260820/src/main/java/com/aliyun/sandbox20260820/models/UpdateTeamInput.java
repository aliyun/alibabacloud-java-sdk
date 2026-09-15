// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateTeamInput extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("plan")
    public String plan;

    @NameInMap("resourceGroupID")
    public String resourceGroupID;

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

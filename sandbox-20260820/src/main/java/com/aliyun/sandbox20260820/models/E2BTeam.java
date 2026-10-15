// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class E2BTeam extends TeaModel {
    /**
     * <p>Specifies whether the team name can be modified. The default team does not allow modification.</p>
     */
    @NameInMap("allowUpdateTeamName")
    public Boolean allowUpdateTeamName;

    /**
     * <p>The creation time of the team in UTC, in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-20T08:30:00Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The team description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sandbox environment for the algorithm team</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The team plan specification. Valid values:</p>
     * <ul>
     * <li>eco: economy.</li>
     * <li>std: standard.</li>
     * <li>pro: professional.</li>
     * <li>ent: enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>std</p>
     */
    @NameInMap("plan")
    public String plan;

    /**
     * <p>Indicates whether the current caller has read-only access to the team. If the value is true, the team configuration cannot be modified.</p>
     */
    @NameInMap("readOnly")
    public Boolean readOnly;

    /**
     * <p>The ID of the Alibaba Cloud resource group to which the team belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The team status. Valid values:</p>
     * <ul>
     * <li>active: Normal.</li>
     * <li>deleting: Being deleted.</li>
     * <li>delete_failed: Failed to delete.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The ID of the team to which the resource belongs, in UUID format.</p>
     * 
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The team name.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox-dev</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <p>The user ID of the team creator, in UUID format.</p>
     * 
     * <strong>example:</strong>
     * <p>9c1d4e72-****</p>
     */
    @NameInMap("userID")
    public String userID;

    public static E2BTeam build(java.util.Map<String, ?> map) throws Exception {
        E2BTeam self = new E2BTeam();
        return TeaModel.build(map, self);
    }

    public E2BTeam setAllowUpdateTeamName(Boolean allowUpdateTeamName) {
        this.allowUpdateTeamName = allowUpdateTeamName;
        return this;
    }
    public Boolean getAllowUpdateTeamName() {
        return this.allowUpdateTeamName;
    }

    public E2BTeam setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public E2BTeam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public E2BTeam setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
    }

    public E2BTeam setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public E2BTeam setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BTeam setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public E2BTeam setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BTeam setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public E2BTeam setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

}

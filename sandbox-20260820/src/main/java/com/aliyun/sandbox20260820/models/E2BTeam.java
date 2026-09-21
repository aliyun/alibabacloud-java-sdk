// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class E2BTeam extends TeaModel {
    @NameInMap("allowUpdateTeamName")
    public Boolean allowUpdateTeamName;

    /**
     * <strong>example:</strong>
     * <p>2026-08-20T08:30:00Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>算法团队的沙箱环境</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>std</p>
     */
    @NameInMap("plan")
    public String plan;

    @NameInMap("readOnly")
    public Boolean readOnly;

    /**
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>5f4a2c18-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <strong>example:</strong>
     * <p>sandbox-dev</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
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

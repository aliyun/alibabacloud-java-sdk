// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicWarmPoolConfig extends TeaModel {
    /**
     * <p>The warm pool capacity policy, which includes the base target capacity and optional scheduling rules.</p>
     */
    @NameInMap("capacityPolicy")
    public WarmPoolCapacityPolicy capacityPolicy;

    /**
     * <p>Indicates whether the warm pool is being deleted.</p>
     */
    @NameInMap("deleting")
    public Boolean deleting;

    /**
     * <p>The team ID.</p>
     * 
     * <strong>example:</strong>
     * <p>team-example1234567890</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The template ID, which specifies the template associated with the warm pool.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl-example1234567890</p>
     */
    @NameInMap("templateID")
    public String templateID;

    public static PublicWarmPoolConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicWarmPoolConfig self = new PublicWarmPoolConfig();
        return TeaModel.build(map, self);
    }

    public PublicWarmPoolConfig setCapacityPolicy(WarmPoolCapacityPolicy capacityPolicy) {
        this.capacityPolicy = capacityPolicy;
        return this;
    }
    public WarmPoolCapacityPolicy getCapacityPolicy() {
        return this.capacityPolicy;
    }

    public PublicWarmPoolConfig setDeleting(Boolean deleting) {
        this.deleting = deleting;
        return this;
    }
    public Boolean getDeleting() {
        return this.deleting;
    }

    public PublicWarmPoolConfig setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public PublicWarmPoolConfig setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}

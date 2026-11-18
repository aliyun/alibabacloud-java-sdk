// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicWarmPool extends TeaModel {
    /**
     * <p>The most recent observation time of the capacity status.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-12-01T00:00:00Z</p>
     */
    @NameInMap("capacityObservedTime")
    public String capacityObservedTime;

    /**
     * <p>The capacity policy of the warm pool, which includes the base target capacity and optional scheduled rules.</p>
     */
    @NameInMap("capacityPolicy")
    public WarmPoolCapacityPolicy capacityPolicy;

    /**
     * <p>The masked text of the current background error. This value is null if no error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>SourceNotFound: source template does not exist</p>
     */
    @NameInMap("currentError")
    public String currentError;

    /**
     * <p>Indicates whether the warm pool is being deleted.</p>
     */
    @NameInMap("deleting")
    public Boolean deleting;

    /**
     * <p>The number of sandboxes that are currently being prepared.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("preparing")
    public Long preparing;

    /**
     * <p>The number of sandboxes that are currently ready.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ready")
    public Long ready;

    /**
     * <p>The number of sandboxes that are currently being released.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("releasing")
    public Long releasing;

    /**
     * <p>Indicates whether the source of the associated template is unavailable.</p>
     */
    @NameInMap("sourceUnavailable")
    public Boolean sourceUnavailable;

    /**
     * <p>The current target capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("targetCapacity")
    public Long targetCapacity;

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

    public static PublicWarmPool build(java.util.Map<String, ?> map) throws Exception {
        PublicWarmPool self = new PublicWarmPool();
        return TeaModel.build(map, self);
    }

    public PublicWarmPool setCapacityObservedTime(String capacityObservedTime) {
        this.capacityObservedTime = capacityObservedTime;
        return this;
    }
    public String getCapacityObservedTime() {
        return this.capacityObservedTime;
    }

    public PublicWarmPool setCapacityPolicy(WarmPoolCapacityPolicy capacityPolicy) {
        this.capacityPolicy = capacityPolicy;
        return this;
    }
    public WarmPoolCapacityPolicy getCapacityPolicy() {
        return this.capacityPolicy;
    }

    public PublicWarmPool setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public PublicWarmPool setDeleting(Boolean deleting) {
        this.deleting = deleting;
        return this;
    }
    public Boolean getDeleting() {
        return this.deleting;
    }

    public PublicWarmPool setPreparing(Long preparing) {
        this.preparing = preparing;
        return this;
    }
    public Long getPreparing() {
        return this.preparing;
    }

    public PublicWarmPool setReady(Long ready) {
        this.ready = ready;
        return this;
    }
    public Long getReady() {
        return this.ready;
    }

    public PublicWarmPool setReleasing(Long releasing) {
        this.releasing = releasing;
        return this;
    }
    public Long getReleasing() {
        return this.releasing;
    }

    public PublicWarmPool setSourceUnavailable(Boolean sourceUnavailable) {
        this.sourceUnavailable = sourceUnavailable;
        return this;
    }
    public Boolean getSourceUnavailable() {
        return this.sourceUnavailable;
    }

    public PublicWarmPool setTargetCapacity(Long targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }
    public Long getTargetCapacity() {
        return this.targetCapacity;
    }

    public PublicWarmPool setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public PublicWarmPool setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}

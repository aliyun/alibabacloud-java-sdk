// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaDetails extends TeaModel {
    /**
     * <p>Total MinQuota amount actually assigned</p>
     */
    @NameInMap("ActualMinQuota")
    public ResourceAmount actualMinQuota;

    /**
     * <p>Quota amount assignable by the User</p>
     */
    @NameInMap("AllocatableQuota")
    public ResourceAmount allocatableQuota;

    /**
     * <p>Total Quota usage information</p>
     */
    @NameInMap("AllocatedQuota")
    public ResourceAmount allocatedQuota;

    /**
     * <p>Quota usage information of ancestors</p>
     */
    @NameInMap("AncestorsAllocatedQuota")
    public ResourceAmount ancestorsAllocatedQuota;

    /**
     * <p>Quota usage information of descendants</p>
     */
    @NameInMap("DescendantsAllocatedQuota")
    public ResourceAmount descendantsAllocatedQuota;

    /**
     * <p>Total MinQuota amount requested by the User</p>
     */
    @NameInMap("DesiredMinQuota")
    public ResourceAmount desiredMinQuota;

    @NameInMap("NodeStatistics")
    public QuotaNodeStatistics nodeStatistics;

    /**
     * <p>Quota request amount</p>
     */
    @NameInMap("RequestedQuota")
    public ResourceAmount requestedQuota;

    /**
     * <p>Quota usage information at the current level</p>
     */
    @NameInMap("SelfAllocatedQuota")
    public ResourceAmount selfAllocatedQuota;

    @NameInMap("SelfSubmittedQuota")
    public ResourceAmount selfSubmittedQuota;

    /**
     * <p>System-reserved Quota amount</p>
     */
    @NameInMap("SystemReservedQuota")
    public ResourceAmount systemReservedQuota;

    /**
     * <p>Quota usage amount</p>
     */
    @NameInMap("UsedQuota")
    public ResourceAmount usedQuota;

    public static QuotaDetails build(java.util.Map<String, ?> map) throws Exception {
        QuotaDetails self = new QuotaDetails();
        return TeaModel.build(map, self);
    }

    public QuotaDetails setActualMinQuota(ResourceAmount actualMinQuota) {
        this.actualMinQuota = actualMinQuota;
        return this;
    }
    public ResourceAmount getActualMinQuota() {
        return this.actualMinQuota;
    }

    public QuotaDetails setAllocatableQuota(ResourceAmount allocatableQuota) {
        this.allocatableQuota = allocatableQuota;
        return this;
    }
    public ResourceAmount getAllocatableQuota() {
        return this.allocatableQuota;
    }

    public QuotaDetails setAllocatedQuota(ResourceAmount allocatedQuota) {
        this.allocatedQuota = allocatedQuota;
        return this;
    }
    public ResourceAmount getAllocatedQuota() {
        return this.allocatedQuota;
    }

    public QuotaDetails setAncestorsAllocatedQuota(ResourceAmount ancestorsAllocatedQuota) {
        this.ancestorsAllocatedQuota = ancestorsAllocatedQuota;
        return this;
    }
    public ResourceAmount getAncestorsAllocatedQuota() {
        return this.ancestorsAllocatedQuota;
    }

    public QuotaDetails setDescendantsAllocatedQuota(ResourceAmount descendantsAllocatedQuota) {
        this.descendantsAllocatedQuota = descendantsAllocatedQuota;
        return this;
    }
    public ResourceAmount getDescendantsAllocatedQuota() {
        return this.descendantsAllocatedQuota;
    }

    public QuotaDetails setDesiredMinQuota(ResourceAmount desiredMinQuota) {
        this.desiredMinQuota = desiredMinQuota;
        return this;
    }
    public ResourceAmount getDesiredMinQuota() {
        return this.desiredMinQuota;
    }

    public QuotaDetails setNodeStatistics(QuotaNodeStatistics nodeStatistics) {
        this.nodeStatistics = nodeStatistics;
        return this;
    }
    public QuotaNodeStatistics getNodeStatistics() {
        return this.nodeStatistics;
    }

    public QuotaDetails setRequestedQuota(ResourceAmount requestedQuota) {
        this.requestedQuota = requestedQuota;
        return this;
    }
    public ResourceAmount getRequestedQuota() {
        return this.requestedQuota;
    }

    public QuotaDetails setSelfAllocatedQuota(ResourceAmount selfAllocatedQuota) {
        this.selfAllocatedQuota = selfAllocatedQuota;
        return this;
    }
    public ResourceAmount getSelfAllocatedQuota() {
        return this.selfAllocatedQuota;
    }

    public QuotaDetails setSelfSubmittedQuota(ResourceAmount selfSubmittedQuota) {
        this.selfSubmittedQuota = selfSubmittedQuota;
        return this;
    }
    public ResourceAmount getSelfSubmittedQuota() {
        return this.selfSubmittedQuota;
    }

    public QuotaDetails setSystemReservedQuota(ResourceAmount systemReservedQuota) {
        this.systemReservedQuota = systemReservedQuota;
        return this;
    }
    public ResourceAmount getSystemReservedQuota() {
        return this.systemReservedQuota;
    }

    public QuotaDetails setUsedQuota(ResourceAmount usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public ResourceAmount getUsedQuota() {
        return this.usedQuota;
    }

}

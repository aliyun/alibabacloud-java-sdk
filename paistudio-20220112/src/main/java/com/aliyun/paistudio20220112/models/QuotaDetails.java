// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaDetails extends TeaModel {
    /**
     * <p>The total MinQuota actually allocated. For example, if the user configured 10 nodes but only 8 nodes are actually bound, this value returns the total resources of the 8 nodes.</p>
     */
    @NameInMap("ActualMinQuota")
    public ResourceAmount actualMinQuota;

    /**
     * <p>The user-allocatable quota amount. For general computing resources, each node has system-reserved resources. This value represents the quota resources that user workloads can occupy.
     * ActualMin = AllocatableQuota + SystemReservedQuota.</p>
     */
    @NameInMap("AllocatableQuota")
    public ResourceAmount allocatableQuota;

    /**
     * <p>The total quota usage information, which is the total resources occupied by workloads after scheduling to nodes.</p>
     */
    @NameInMap("AllocatedQuota")
    public ResourceAmount allocatedQuota;

    /**
     * <p>The ancestor quota usage information, which is the total resources of workloads submitted using ancestor quotas after they are scheduled to nodes.</p>
     */
    @NameInMap("AncestorsAllocatedQuota")
    public ResourceAmount ancestorsAllocatedQuota;

    /**
     * <p>The descendant quota usage information, which is the total resources of workloads submitted using descendant quotas after they are scheduled to nodes.</p>
     */
    @NameInMap("DescendantsAllocatedQuota")
    public ResourceAmount descendantsAllocatedQuota;

    /**
     * <p>The total MinQuota desired by the user.</p>
     */
    @NameInMap("DesiredMinQuota")
    public ResourceAmount desiredMinQuota;

    /**
     * <p>The statistics information of nodes within the quota.</p>
     */
    @NameInMap("NodeStatistics")
    public QuotaNodeStatistics nodeStatistics;

    /**
     * <p>The quota requested amount, which is the total resources occupied by workloads after they are dequeued.</p>
     */
    @NameInMap("RequestedQuota")
    public ResourceAmount requestedQuota;

    /**
     * <p>The current-level quota usage information, which is the total resources of workloads submitted using this quota after they are scheduled to nodes.</p>
     */
    @NameInMap("SelfAllocatedQuota")
    public ResourceAmount selfAllocatedQuota;

    /**
     * <p>The amount submitted to this quota, which is the total resources of workloads submitted to this quota, including workloads that are queued.</p>
     */
    @NameInMap("SelfSubmittedQuota")
    public ResourceAmount selfSubmittedQuota;

    /**
     * <p>The system-reserved quota amount.</p>
     */
    @NameInMap("SystemReservedQuota")
    public ResourceAmount systemReservedQuota;

    /**
     * <p>The quota used amount. This field is deprecating. Use AllocatedQuota instead.</p>
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

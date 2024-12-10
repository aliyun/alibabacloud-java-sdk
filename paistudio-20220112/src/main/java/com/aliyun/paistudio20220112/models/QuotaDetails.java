// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaDetails extends TeaModel {
    @NameInMap("ActualMinQuota")
    public ResourceAmount actualMinQuota;

    @NameInMap("AllocatedQuota")
    public ResourceAmount allocatedQuota;

    @NameInMap("AncestorsAllocatedQuota")
    public ResourceAmount ancestorsAllocatedQuota;

    @NameInMap("DescendantsAllocatedQuota")
    public ResourceAmount descendantsAllocatedQuota;

    @NameInMap("DesiredMinQuota")
    public ResourceAmount desiredMinQuota;

    @NameInMap("RequestedQuota")
    public ResourceAmount requestedQuota;

    @NameInMap("SelfAllocatedQuota")
    public ResourceAmount selfAllocatedQuota;

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

    public QuotaDetails setUsedQuota(ResourceAmount usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public ResourceAmount getUsedQuota() {
        return this.usedQuota;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SelfQuotaPreemptionConfig extends TeaModel {
    /**
     * <p>The priorities that can be preempted.</p>
     */
    @NameInMap("PreemptedPriorities")
    public java.util.List<Integer> preemptedPriorities;

    /**
     * <p>The task types that can be preempted.</p>
     */
    @NameInMap("PreemptedProducts")
    public java.util.List<String> preemptedProducts;

    /**
     * <p>The priorities that can initiate preemption.</p>
     */
    @NameInMap("PreemptorPriorities")
    public java.util.List<Integer> preemptorPriorities;

    public static SelfQuotaPreemptionConfig build(java.util.Map<String, ?> map) throws Exception {
        SelfQuotaPreemptionConfig self = new SelfQuotaPreemptionConfig();
        return TeaModel.build(map, self);
    }

    public SelfQuotaPreemptionConfig setPreemptedPriorities(java.util.List<Integer> preemptedPriorities) {
        this.preemptedPriorities = preemptedPriorities;
        return this;
    }
    public java.util.List<Integer> getPreemptedPriorities() {
        return this.preemptedPriorities;
    }

    public SelfQuotaPreemptionConfig setPreemptedProducts(java.util.List<String> preemptedProducts) {
        this.preemptedProducts = preemptedProducts;
        return this;
    }
    public java.util.List<String> getPreemptedProducts() {
        return this.preemptedProducts;
    }

    public SelfQuotaPreemptionConfig setPreemptorPriorities(java.util.List<Integer> preemptorPriorities) {
        this.preemptorPriorities = preemptorPriorities;
        return this;
    }
    public java.util.List<Integer> getPreemptorPriorities() {
        return this.preemptorPriorities;
    }

}

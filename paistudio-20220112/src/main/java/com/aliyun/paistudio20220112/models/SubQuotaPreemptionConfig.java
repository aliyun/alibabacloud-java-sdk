// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SubQuotaPreemptionConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("PreemptedPriorityUpperBound")
    public Long preemptedPriorityUpperBound;

    @NameInMap("PreemptedProducts")
    public java.util.List<String> preemptedProducts;

    public static SubQuotaPreemptionConfig build(java.util.Map<String, ?> map) throws Exception {
        SubQuotaPreemptionConfig self = new SubQuotaPreemptionConfig();
        return TeaModel.build(map, self);
    }

    public SubQuotaPreemptionConfig setPreemptedPriorityUpperBound(Long preemptedPriorityUpperBound) {
        this.preemptedPriorityUpperBound = preemptedPriorityUpperBound;
        return this;
    }
    public Long getPreemptedPriorityUpperBound() {
        return this.preemptedPriorityUpperBound;
    }

    public SubQuotaPreemptionConfig setPreemptedProducts(java.util.List<String> preemptedProducts) {
        this.preemptedProducts = preemptedProducts;
        return this;
    }
    public java.util.List<String> getPreemptedProducts() {
        return this.preemptedProducts;
    }

}

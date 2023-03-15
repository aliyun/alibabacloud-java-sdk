// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcReviewListResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<PbcReview> data;

    /**
     * <p>总数量</p>
     */
    @NameInMap("total")
    public Integer total;

    public static PbcReviewListResult build(java.util.Map<String, ?> map) throws Exception {
        PbcReviewListResult self = new PbcReviewListResult();
        return TeaModel.build(map, self);
    }

    public PbcReviewListResult setData(java.util.List<PbcReview> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PbcReview> getData() {
        return this.data;
    }

    public PbcReviewListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}

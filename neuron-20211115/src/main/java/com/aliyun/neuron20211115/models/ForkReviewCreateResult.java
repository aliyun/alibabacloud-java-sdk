// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ForkReviewCreateResult extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("requestId")
    public String requestId;

    public static ForkReviewCreateResult build(java.util.Map<String, ?> map) throws Exception {
        ForkReviewCreateResult self = new ForkReviewCreateResult();
        return TeaModel.build(map, self);
    }

    public ForkReviewCreateResult setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ForkReviewCreateResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ForkReviewAuditCmd extends TeaModel {
    @NameInMap("approve")
    public Boolean approve;

    public static ForkReviewAuditCmd build(java.util.Map<String, ?> map) throws Exception {
        ForkReviewAuditCmd self = new ForkReviewAuditCmd();
        return TeaModel.build(map, self);
    }

    public ForkReviewAuditCmd setApprove(Boolean approve) {
        this.approve = approve;
        return this;
    }
    public Boolean getApprove() {
        return this.approve;
    }

}

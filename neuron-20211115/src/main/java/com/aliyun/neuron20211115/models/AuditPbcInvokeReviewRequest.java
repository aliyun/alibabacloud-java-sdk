// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuditPbcInvokeReviewRequest extends TeaModel {
    @NameInMap("approve")
    public Boolean approve;

    public static AuditPbcInvokeReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditPbcInvokeReviewRequest self = new AuditPbcInvokeReviewRequest();
        return TeaModel.build(map, self);
    }

    public AuditPbcInvokeReviewRequest setApprove(Boolean approve) {
        this.approve = approve;
        return this;
    }
    public Boolean getApprove() {
        return this.approve;
    }

}

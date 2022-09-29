// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuditForkReviewRequest extends TeaModel {
    @NameInMap("body")
    public ForkReviewAuditCmd body;

    public static AuditForkReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditForkReviewRequest self = new AuditForkReviewRequest();
        return TeaModel.build(map, self);
    }

    public AuditForkReviewRequest setBody(ForkReviewAuditCmd body) {
        this.body = body;
        return this;
    }
    public ForkReviewAuditCmd getBody() {
        return this.body;
    }

}

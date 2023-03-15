// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RevokePbcReviewRequest extends TeaModel {
    @NameInMap("body")
    public RevokeReviewCmd body;

    public static RevokePbcReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokePbcReviewRequest self = new RevokePbcReviewRequest();
        return TeaModel.build(map, self);
    }

    public RevokePbcReviewRequest setBody(RevokeReviewCmd body) {
        this.body = body;
        return this;
    }
    public RevokeReviewCmd getBody() {
        return this.body;
    }

}

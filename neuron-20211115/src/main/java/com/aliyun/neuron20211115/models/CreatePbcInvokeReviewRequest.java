// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInvokeReviewRequest extends TeaModel {
    @NameInMap("body")
    public PbcInvokeReviewCreateCmd body;

    public static CreatePbcInvokeReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInvokeReviewRequest self = new CreatePbcInvokeReviewRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcInvokeReviewRequest setBody(PbcInvokeReviewCreateCmd body) {
        this.body = body;
        return this;
    }
    public PbcInvokeReviewCreateCmd getBody() {
        return this.body;
    }

}

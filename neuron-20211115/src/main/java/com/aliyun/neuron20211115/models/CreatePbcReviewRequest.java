// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcReviewRequest extends TeaModel {
    @NameInMap("body")
    public PbcReviewCreateCmd body;

    public static CreatePbcReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcReviewRequest self = new CreatePbcReviewRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcReviewRequest setBody(PbcReviewCreateCmd body) {
        this.body = body;
        return this;
    }
    public PbcReviewCreateCmd getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateForkReviewRequest extends TeaModel {
    @NameInMap("body")
    public ForkReviewCreateCmd body;

    public static CreateForkReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForkReviewRequest self = new CreateForkReviewRequest();
        return TeaModel.build(map, self);
    }

    public CreateForkReviewRequest setBody(ForkReviewCreateCmd body) {
        this.body = body;
        return this;
    }
    public ForkReviewCreateCmd getBody() {
        return this.body;
    }

}

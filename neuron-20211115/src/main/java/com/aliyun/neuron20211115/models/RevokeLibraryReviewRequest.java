// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RevokeLibraryReviewRequest extends TeaModel {
    @NameInMap("body")
    public RevokeLibraryReviewCmd body;

    public static RevokeLibraryReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeLibraryReviewRequest self = new RevokeLibraryReviewRequest();
        return TeaModel.build(map, self);
    }

    public RevokeLibraryReviewRequest setBody(RevokeLibraryReviewCmd body) {
        this.body = body;
        return this;
    }
    public RevokeLibraryReviewCmd getBody() {
        return this.body;
    }

}

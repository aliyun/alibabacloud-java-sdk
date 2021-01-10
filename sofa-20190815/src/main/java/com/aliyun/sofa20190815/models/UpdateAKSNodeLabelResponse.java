// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSNodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAKSNodeLabelResponseBody body;

    public static UpdateAKSNodeLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSNodeLabelResponse self = new UpdateAKSNodeLabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAKSNodeLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAKSNodeLabelResponse setBody(UpdateAKSNodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAKSNodeLabelResponseBody getBody() {
        return this.body;
    }

}

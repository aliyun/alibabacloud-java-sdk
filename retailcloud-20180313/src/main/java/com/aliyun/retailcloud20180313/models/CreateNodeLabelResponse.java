// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateNodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNodeLabelResponseBody body;

    public static CreateNodeLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeLabelResponse self = new CreateNodeLabelResponse();
        return TeaModel.build(map, self);
    }

    public CreateNodeLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNodeLabelResponse setBody(CreateNodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNodeLabelResponseBody getBody() {
        return this.body;
    }

}

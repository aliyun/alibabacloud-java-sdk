// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktIterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinktIterationResponseBody body;

    public static DeleteLinkeLinktIterationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktIterationResponse self = new DeleteLinkeLinktIterationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktIterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinktIterationResponse setBody(DeleteLinkeLinktIterationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinktIterationResponseBody getBody() {
        return this.body;
    }

}

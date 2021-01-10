// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktTagResponseBody body;

    public static UpdateLinkeLinktTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktTagResponse self = new UpdateLinkeLinktTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktTagResponse setBody(UpdateLinkeLinktTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktTagResponseBody getBody() {
        return this.body;
    }

}

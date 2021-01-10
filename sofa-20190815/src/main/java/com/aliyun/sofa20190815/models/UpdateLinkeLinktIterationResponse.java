// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktIterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktIterationResponseBody body;

    public static UpdateLinkeLinktIterationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktIterationResponse self = new UpdateLinkeLinktIterationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktIterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktIterationResponse setBody(UpdateLinkeLinktIterationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktIterationResponseBody getBody() {
        return this.body;
    }

}

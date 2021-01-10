// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktIterationmeetingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktIterationmeetingResponseBody body;

    public static UpdateLinkeLinktIterationmeetingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktIterationmeetingResponse self = new UpdateLinkeLinktIterationmeetingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktIterationmeetingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktIterationmeetingResponse setBody(UpdateLinkeLinktIterationmeetingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktIterationmeetingResponseBody getBody() {
        return this.body;
    }

}

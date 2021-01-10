// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktIterationmeetingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeLinktIterationmeetingResponseBody body;

    public static DeleteLinkeLinktIterationmeetingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktIterationmeetingResponse self = new DeleteLinkeLinktIterationmeetingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktIterationmeetingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeLinktIterationmeetingResponse setBody(DeleteLinkeLinktIterationmeetingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeLinktIterationmeetingResponseBody getBody() {
        return this.body;
    }

}

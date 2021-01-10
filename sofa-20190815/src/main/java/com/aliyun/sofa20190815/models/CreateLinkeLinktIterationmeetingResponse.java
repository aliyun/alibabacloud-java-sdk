// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktIterationmeetingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktIterationmeetingResponseBody body;

    public static CreateLinkeLinktIterationmeetingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktIterationmeetingResponse self = new CreateLinkeLinktIterationmeetingResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktIterationmeetingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktIterationmeetingResponse setBody(CreateLinkeLinktIterationmeetingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktIterationmeetingResponseBody getBody() {
        return this.body;
    }

}

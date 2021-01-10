// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktIterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeLinktIterationResponseBody body;

    public static AddLinkeLinktIterationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktIterationResponse self = new AddLinkeLinktIterationResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktIterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeLinktIterationResponse setBody(AddLinkeLinktIterationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeLinktIterationResponseBody getBody() {
        return this.body;
    }

}

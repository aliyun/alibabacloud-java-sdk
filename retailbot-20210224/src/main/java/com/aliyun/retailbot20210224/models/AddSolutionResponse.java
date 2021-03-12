// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddSolutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSolutionResponseBody body;

    public static AddSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSolutionResponse self = new AddSolutionResponse();
        return TeaModel.build(map, self);
    }

    public AddSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSolutionResponse setBody(AddSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSolutionResponseBody getBody() {
        return this.body;
    }

}

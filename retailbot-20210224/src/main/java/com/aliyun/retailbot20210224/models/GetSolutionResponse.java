// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetSolutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSolutionResponseBody body;

    public static GetSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSolutionResponse self = new GetSolutionResponse();
        return TeaModel.build(map, self);
    }

    public GetSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSolutionResponse setBody(GetSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSolutionResponseBody getBody() {
        return this.body;
    }

}

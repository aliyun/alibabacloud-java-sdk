// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFunctionInstanceResponseBody body;

    public static GetFunctionInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionInstanceResponse self = new GetFunctionInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionInstanceResponse setBody(GetFunctionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionInstanceResponseBody getBody() {
        return this.body;
    }

}

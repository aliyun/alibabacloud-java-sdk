// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASAppgrayconfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCASAppgrayconfigsResponseBody body;

    public static GetCASAppgrayconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCASAppgrayconfigsResponse self = new GetCASAppgrayconfigsResponse();
        return TeaModel.build(map, self);
    }

    public GetCASAppgrayconfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCASAppgrayconfigsResponse setBody(GetCASAppgrayconfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCASAppgrayconfigsResponseBody getBody() {
        return this.body;
    }

}

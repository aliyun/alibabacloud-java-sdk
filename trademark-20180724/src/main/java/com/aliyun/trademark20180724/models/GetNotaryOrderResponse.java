// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetNotaryOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNotaryOrderResponseBody body;

    public static GetNotaryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotaryOrderResponse self = new GetNotaryOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetNotaryOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNotaryOrderResponse setBody(GetNotaryOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNotaryOrderResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrafficDataResponseBody body;

    public static GetTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficDataResponse self = new GetTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public GetTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrafficDataResponse setBody(GetTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrafficDataResponseBody getBody() {
        return this.body;
    }

}

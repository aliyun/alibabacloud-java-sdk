// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBalanceTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBalanceTrafficDataResponseBody body;

    public static GetBalanceTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBalanceTrafficDataResponse self = new GetBalanceTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBalanceTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBalanceTrafficDataResponse setBody(GetBalanceTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBalanceTrafficDataResponseBody getBody() {
        return this.body;
    }

}

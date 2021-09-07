// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class GetPolarXPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPolarXPriceResponseBody body;

    public static GetPolarXPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolarXPriceResponse self = new GetPolarXPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetPolarXPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolarXPriceResponse setBody(GetPolarXPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolarXPriceResponseBody getBody() {
        return this.body;
    }

}

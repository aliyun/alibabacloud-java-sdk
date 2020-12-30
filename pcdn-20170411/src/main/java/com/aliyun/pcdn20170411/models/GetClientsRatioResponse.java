// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetClientsRatioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClientsRatioResponseBody body;

    public static GetClientsRatioResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientsRatioResponse self = new GetClientsRatioResponse();
        return TeaModel.build(map, self);
    }

    public GetClientsRatioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientsRatioResponse setBody(GetClientsRatioResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientsRatioResponseBody getBody() {
        return this.body;
    }

}

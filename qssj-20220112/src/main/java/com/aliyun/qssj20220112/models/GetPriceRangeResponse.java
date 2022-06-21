// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetPriceRangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPriceRangeResponseBody body;

    public static GetPriceRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPriceRangeResponse self = new GetPriceRangeResponse();
        return TeaModel.build(map, self);
    }

    public GetPriceRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPriceRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPriceRangeResponse setBody(GetPriceRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPriceRangeResponseBody getBody() {
        return this.body;
    }

}

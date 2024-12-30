// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetSpotPriceHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSpotPriceHistoryResponseBody body;

    public static GetSpotPriceHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpotPriceHistoryResponse self = new GetSpotPriceHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetSpotPriceHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpotPriceHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpotPriceHistoryResponse setBody(GetSpotPriceHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpotPriceHistoryResponseBody getBody() {
        return this.body;
    }

}

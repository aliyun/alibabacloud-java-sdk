// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkRankingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNisNetworkRankingResponseBody body;

    public static GetNisNetworkRankingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNisNetworkRankingResponse self = new GetNisNetworkRankingResponse();
        return TeaModel.build(map, self);
    }

    public GetNisNetworkRankingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNisNetworkRankingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNisNetworkRankingResponse setBody(GetNisNetworkRankingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNisNetworkRankingResponseBody getBody() {
        return this.body;
    }

}

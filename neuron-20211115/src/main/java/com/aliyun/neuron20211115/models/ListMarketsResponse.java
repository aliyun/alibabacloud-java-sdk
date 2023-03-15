// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMarketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MarketListResult body;

    public static ListMarketsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMarketsResponse self = new ListMarketsResponse();
        return TeaModel.build(map, self);
    }

    public ListMarketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMarketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMarketsResponse setBody(MarketListResult body) {
        this.body = body;
        return this;
    }
    public MarketListResult getBody() {
        return this.body;
    }

}

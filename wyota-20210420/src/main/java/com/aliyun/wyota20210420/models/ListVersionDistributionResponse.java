// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListVersionDistributionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVersionDistributionResponseBody body;

    public static ListVersionDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVersionDistributionResponse self = new ListVersionDistributionResponse();
        return TeaModel.build(map, self);
    }

    public ListVersionDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVersionDistributionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVersionDistributionResponse setBody(ListVersionDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVersionDistributionResponseBody getBody() {
        return this.body;
    }

}

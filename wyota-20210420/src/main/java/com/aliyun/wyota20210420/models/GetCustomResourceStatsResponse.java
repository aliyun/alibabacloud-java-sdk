// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetCustomResourceStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomResourceStatsResponseBody body;

    public static GetCustomResourceStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomResourceStatsResponse self = new GetCustomResourceStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomResourceStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomResourceStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomResourceStatsResponse setBody(GetCustomResourceStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomResourceStatsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNetworkTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNetworkTrendResponseBody body;

    public static GetNetworkTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkTrendResponse self = new GetNetworkTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkTrendResponse setBody(GetNetworkTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkTrendResponseBody getBody() {
        return this.body;
    }

}

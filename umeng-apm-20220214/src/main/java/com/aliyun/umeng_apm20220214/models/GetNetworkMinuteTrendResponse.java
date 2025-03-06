// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNetworkMinuteTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNetworkMinuteTrendResponseBody body;

    public static GetNetworkMinuteTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkMinuteTrendResponse self = new GetNetworkMinuteTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetNetworkMinuteTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetworkMinuteTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNetworkMinuteTrendResponse setBody(GetNetworkMinuteTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetworkMinuteTrendResponseBody getBody() {
        return this.body;
    }

}

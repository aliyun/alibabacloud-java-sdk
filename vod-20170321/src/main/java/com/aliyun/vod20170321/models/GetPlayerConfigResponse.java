// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayerConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPlayerConfigResponseBody body;

    public static GetPlayerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlayerConfigResponse self = new GetPlayerConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetPlayerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPlayerConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPlayerConfigResponse setBody(GetPlayerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPlayerConfigResponseBody getBody() {
        return this.body;
    }

}

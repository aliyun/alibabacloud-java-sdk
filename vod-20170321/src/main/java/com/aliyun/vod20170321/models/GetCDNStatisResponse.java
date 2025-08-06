// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCDNStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCDNStatisResponseBody body;

    public static GetCDNStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCDNStatisResponse self = new GetCDNStatisResponse();
        return TeaModel.build(map, self);
    }

    public GetCDNStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCDNStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCDNStatisResponse setBody(GetCDNStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCDNStatisResponseBody getBody() {
        return this.body;
    }

}

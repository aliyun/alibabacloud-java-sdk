// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTotalStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTotalStatisResponseBody body;

    public static GetTotalStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTotalStatisResponse self = new GetTotalStatisResponse();
        return TeaModel.build(map, self);
    }

    public GetTotalStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTotalStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTotalStatisResponse setBody(GetTotalStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTotalStatisResponseBody getBody() {
        return this.body;
    }

}

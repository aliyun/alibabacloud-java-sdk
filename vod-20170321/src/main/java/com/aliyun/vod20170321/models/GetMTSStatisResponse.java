// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMTSStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMTSStatisResponseBody body;

    public static GetMTSStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMTSStatisResponse self = new GetMTSStatisResponse();
        return TeaModel.build(map, self);
    }

    public GetMTSStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMTSStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMTSStatisResponse setBody(GetMTSStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMTSStatisResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPlayConfigResponseBody body;

    public static GetPlayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPlayConfigResponse self = new GetPlayConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetPlayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPlayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPlayConfigResponse setBody(GetPlayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPlayConfigResponseBody getBody() {
        return this.body;
    }

}

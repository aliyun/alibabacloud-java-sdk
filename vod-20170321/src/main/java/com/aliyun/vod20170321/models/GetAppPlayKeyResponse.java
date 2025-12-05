// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppPlayKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppPlayKeyResponseBody body;

    public static GetAppPlayKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppPlayKeyResponse self = new GetAppPlayKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetAppPlayKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppPlayKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppPlayKeyResponse setBody(GetAppPlayKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppPlayKeyResponseBody getBody() {
        return this.body;
    }

}

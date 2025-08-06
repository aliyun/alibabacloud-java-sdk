// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWatermarkConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWatermarkConsoleResponseBody body;

    public static GetWatermarkConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkConsoleResponse self = new GetWatermarkConsoleResponse();
        return TeaModel.build(map, self);
    }

    public GetWatermarkConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWatermarkConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWatermarkConsoleResponse setBody(GetWatermarkConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWatermarkConsoleResponseBody getBody() {
        return this.body;
    }

}

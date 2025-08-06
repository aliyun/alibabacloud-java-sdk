// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultWatermarkConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultWatermarkConsoleResponseBody body;

    public static SetDefaultWatermarkConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultWatermarkConsoleResponse self = new SetDefaultWatermarkConsoleResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultWatermarkConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultWatermarkConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultWatermarkConsoleResponse setBody(SetDefaultWatermarkConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultWatermarkConsoleResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWatermarkConsoleResponseBody body;

    public static AddWatermarkConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkConsoleResponse self = new AddWatermarkConsoleResponse();
        return TeaModel.build(map, self);
    }

    public AddWatermarkConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWatermarkConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWatermarkConsoleResponse setBody(AddWatermarkConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWatermarkConsoleResponseBody getBody() {
        return this.body;
    }

}

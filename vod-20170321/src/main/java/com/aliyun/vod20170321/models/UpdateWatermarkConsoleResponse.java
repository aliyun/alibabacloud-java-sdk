// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateWatermarkConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWatermarkConsoleResponseBody body;

    public static UpdateWatermarkConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkConsoleResponse self = new UpdateWatermarkConsoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWatermarkConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWatermarkConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWatermarkConsoleResponse setBody(UpdateWatermarkConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWatermarkConsoleResponseBody getBody() {
        return this.body;
    }

}

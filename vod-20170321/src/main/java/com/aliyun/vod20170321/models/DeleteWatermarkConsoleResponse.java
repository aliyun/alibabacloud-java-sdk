// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteWatermarkConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWatermarkConsoleResponseBody body;

    public static DeleteWatermarkConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkConsoleResponse self = new DeleteWatermarkConsoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWatermarkConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWatermarkConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWatermarkConsoleResponse setBody(DeleteWatermarkConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWatermarkConsoleResponseBody getBody() {
        return this.body;
    }

}

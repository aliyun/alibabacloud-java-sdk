// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SendRenderingInstanceCommandsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendRenderingInstanceCommandsResponseBody body;

    public static SendRenderingInstanceCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendRenderingInstanceCommandsResponse self = new SendRenderingInstanceCommandsResponse();
        return TeaModel.build(map, self);
    }

    public SendRenderingInstanceCommandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendRenderingInstanceCommandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendRenderingInstanceCommandsResponse setBody(SendRenderingInstanceCommandsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendRenderingInstanceCommandsResponseBody getBody() {
        return this.body;
    }

}

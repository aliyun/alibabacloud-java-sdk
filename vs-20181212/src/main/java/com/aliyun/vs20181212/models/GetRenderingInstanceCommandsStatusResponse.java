// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingInstanceCommandsStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRenderingInstanceCommandsStatusResponseBody body;

    public static GetRenderingInstanceCommandsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRenderingInstanceCommandsStatusResponse self = new GetRenderingInstanceCommandsStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetRenderingInstanceCommandsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRenderingInstanceCommandsStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRenderingInstanceCommandsStatusResponse setBody(GetRenderingInstanceCommandsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRenderingInstanceCommandsStatusResponseBody getBody() {
        return this.body;
    }

}

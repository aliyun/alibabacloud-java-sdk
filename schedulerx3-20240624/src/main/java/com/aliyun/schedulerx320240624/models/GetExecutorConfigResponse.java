// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetExecutorConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExecutorConfigResponseBody body;

    public static GetExecutorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExecutorConfigResponse self = new GetExecutorConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetExecutorConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExecutorConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExecutorConfigResponse setBody(GetExecutorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExecutorConfigResponseBody getBody() {
        return this.body;
    }

}

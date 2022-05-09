// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetPackSceneTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPackSceneTaskStatusResponseBody body;

    public static GetPackSceneTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPackSceneTaskStatusResponse self = new GetPackSceneTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPackSceneTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPackSceneTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPackSceneTaskStatusResponse setBody(GetPackSceneTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPackSceneTaskStatusResponseBody getBody() {
        return this.body;
    }

}

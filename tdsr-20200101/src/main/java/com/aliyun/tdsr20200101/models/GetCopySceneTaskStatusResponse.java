// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetCopySceneTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCopySceneTaskStatusResponseBody body;

    public static GetCopySceneTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCopySceneTaskStatusResponse self = new GetCopySceneTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetCopySceneTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCopySceneTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCopySceneTaskStatusResponse setBody(GetCopySceneTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCopySceneTaskStatusResponseBody getBody() {
        return this.body;
    }

}

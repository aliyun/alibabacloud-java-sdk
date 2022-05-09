// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSubSceneTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSubSceneTaskStatusResponseBody body;

    public static GetSubSceneTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubSceneTaskStatusResponse self = new GetSubSceneTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetSubSceneTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubSceneTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubSceneTaskStatusResponse setBody(GetSubSceneTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubSceneTaskStatusResponseBody getBody() {
        return this.body;
    }

}

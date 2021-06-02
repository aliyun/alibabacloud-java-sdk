// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSubSceneTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public GetSubSceneTaskStatusResponse setBody(GetSubSceneTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubSceneTaskStatusResponseBody getBody() {
        return this.body;
    }

}

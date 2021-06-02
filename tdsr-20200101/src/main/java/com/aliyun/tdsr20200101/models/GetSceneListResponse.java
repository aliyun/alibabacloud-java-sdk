// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSceneListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSceneListResponseBody body;

    public static GetSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneListResponse self = new GetSceneListResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSceneListResponse setBody(GetSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSceneListResponseBody getBody() {
        return this.body;
    }

}

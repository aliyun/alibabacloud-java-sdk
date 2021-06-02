// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSceneDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSceneDataResponseBody body;

    public static GetSceneDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneDataResponse self = new GetSceneDataResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSceneDataResponse setBody(GetSceneDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSceneDataResponseBody getBody() {
        return this.body;
    }

}

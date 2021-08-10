// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScenePreviewInfoResponseBody body;

    public static GetScenePreviewInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewInfoResponse self = new GetScenePreviewInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScenePreviewInfoResponse setBody(GetScenePreviewInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScenePreviewInfoResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScenePreviewResourceResponseBody body;

    public static GetScenePreviewResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewResourceResponse self = new GetScenePreviewResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScenePreviewResourceResponse setBody(GetScenePreviewResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScenePreviewResourceResponseBody getBody() {
        return this.body;
    }

}

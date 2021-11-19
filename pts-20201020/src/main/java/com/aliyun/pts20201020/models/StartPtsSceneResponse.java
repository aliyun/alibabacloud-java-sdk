// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StartPtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartPtsSceneResponseBody body;

    public static StartPtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPtsSceneResponse self = new StartPtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public StartPtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPtsSceneResponse setBody(StartPtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPtsSceneResponseBody getBody() {
        return this.body;
    }

}

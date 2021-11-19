// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopDebugPtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDebugPtsSceneResponseBody body;

    public static StopDebugPtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDebugPtsSceneResponse self = new StopDebugPtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public StopDebugPtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDebugPtsSceneResponse setBody(StopDebugPtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDebugPtsSceneResponseBody getBody() {
        return this.body;
    }

}

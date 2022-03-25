// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class SavePtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SavePtsSceneResponseBody body;

    public static SavePtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        SavePtsSceneResponse self = new SavePtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public SavePtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SavePtsSceneResponse setBody(SavePtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public SavePtsSceneResponseBody getBody() {
        return this.body;
    }

}

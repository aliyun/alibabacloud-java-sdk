// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ModifyPtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPtsSceneResponseBody body;

    public static ModifyPtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPtsSceneResponse self = new ModifyPtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPtsSceneResponse setBody(ModifyPtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPtsSceneResponseBody getBody() {
        return this.body;
    }

}

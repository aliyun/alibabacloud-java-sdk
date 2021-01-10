// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateClriskSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClriskSceneResponseBody body;

    public static UpdateClriskSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClriskSceneResponse self = new UpdateClriskSceneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClriskSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClriskSceneResponse setBody(UpdateClriskSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClriskSceneResponseBody getBody() {
        return this.body;
    }

}

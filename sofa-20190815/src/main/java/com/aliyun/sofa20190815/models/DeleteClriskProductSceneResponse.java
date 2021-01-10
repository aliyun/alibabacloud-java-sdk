// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskProductSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClriskProductSceneResponseBody body;

    public static DeleteClriskProductSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskProductSceneResponse self = new DeleteClriskProductSceneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClriskProductSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClriskProductSceneResponse setBody(DeleteClriskProductSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClriskProductSceneResponseBody getBody() {
        return this.body;
    }

}

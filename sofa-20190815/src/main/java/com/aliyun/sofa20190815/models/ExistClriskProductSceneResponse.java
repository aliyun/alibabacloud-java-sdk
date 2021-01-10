// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExistClriskProductSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExistClriskProductSceneResponseBody body;

    public static ExistClriskProductSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistClriskProductSceneResponse self = new ExistClriskProductSceneResponse();
        return TeaModel.build(map, self);
    }

    public ExistClriskProductSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExistClriskProductSceneResponse setBody(ExistClriskProductSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ExistClriskProductSceneResponseBody getBody() {
        return this.body;
    }

}

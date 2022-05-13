// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CopySceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CopySceneResponseBody body;

    public static CopySceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CopySceneResponse self = new CopySceneResponse();
        return TeaModel.build(map, self);
    }

    public CopySceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopySceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopySceneResponse setBody(CopySceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CopySceneResponseBody getBody() {
        return this.body;
    }

}

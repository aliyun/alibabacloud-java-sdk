// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateABTestSceneResponseBody body;

    public static CreateABTestSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestSceneResponse self = new CreateABTestSceneResponse();
        return TeaModel.build(map, self);
    }

    public CreateABTestSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateABTestSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateABTestSceneResponse setBody(CreateABTestSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateABTestSceneResponseBody getBody() {
        return this.body;
    }

}

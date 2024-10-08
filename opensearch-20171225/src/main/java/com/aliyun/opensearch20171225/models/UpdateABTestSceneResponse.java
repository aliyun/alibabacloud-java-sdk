// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateABTestSceneResponseBody body;

    public static UpdateABTestSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestSceneResponse self = new UpdateABTestSceneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateABTestSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateABTestSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateABTestSceneResponse setBody(UpdateABTestSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateABTestSceneResponseBody getBody() {
        return this.body;
    }

}

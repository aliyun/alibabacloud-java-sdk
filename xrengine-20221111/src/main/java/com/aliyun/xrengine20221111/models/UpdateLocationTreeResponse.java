// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class UpdateLocationTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLocationTreeResponseBody body;

    public static UpdateLocationTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocationTreeResponse self = new UpdateLocationTreeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLocationTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLocationTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLocationTreeResponse setBody(UpdateLocationTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLocationTreeResponseBody getBody() {
        return this.body;
    }

}

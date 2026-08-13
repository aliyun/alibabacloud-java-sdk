// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateSourceContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSourceContentResponseBody body;

    public static UpdateSourceContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSourceContentResponse self = new UpdateSourceContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSourceContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSourceContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSourceContentResponse setBody(UpdateSourceContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSourceContentResponseBody getBody() {
        return this.body;
    }

}

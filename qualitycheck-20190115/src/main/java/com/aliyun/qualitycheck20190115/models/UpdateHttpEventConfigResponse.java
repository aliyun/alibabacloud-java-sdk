// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateHttpEventConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpEventConfigResponseBody body;

    public static UpdateHttpEventConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpEventConfigResponse self = new UpdateHttpEventConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpEventConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpEventConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpEventConfigResponse setBody(UpdateHttpEventConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpEventConfigResponseBody getBody() {
        return this.body;
    }

}

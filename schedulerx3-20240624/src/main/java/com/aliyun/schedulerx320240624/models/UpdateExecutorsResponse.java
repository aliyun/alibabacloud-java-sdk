// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateExecutorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExecutorsResponseBody body;

    public static UpdateExecutorsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExecutorsResponse self = new UpdateExecutorsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExecutorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExecutorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExecutorsResponse setBody(UpdateExecutorsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExecutorsResponseBody getBody() {
        return this.body;
    }

}

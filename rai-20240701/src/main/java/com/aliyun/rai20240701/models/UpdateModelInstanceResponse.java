// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdateModelInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelInstanceResponseBody body;

    public static UpdateModelInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelInstanceResponse self = new UpdateModelInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelInstanceResponse setBody(UpdateModelInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelInstanceResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class UpdateActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateActionResponseBody body;

    public static UpdateActionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateActionResponse self = new UpdateActionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateActionResponse setBody(UpdateActionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateActionResponseBody getBody() {
        return this.body;
    }

}

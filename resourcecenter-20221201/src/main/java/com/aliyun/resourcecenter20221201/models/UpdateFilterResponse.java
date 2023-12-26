// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFilterResponseBody body;

    public static UpdateFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFilterResponse self = new UpdateFilterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFilterResponse setBody(UpdateFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFilterResponseBody getBody() {
        return this.body;
    }

}

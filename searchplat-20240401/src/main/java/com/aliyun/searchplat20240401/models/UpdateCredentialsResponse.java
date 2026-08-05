// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class UpdateCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCredentialsResponseBody body;

    public static UpdateCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialsResponse self = new UpdateCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCredentialsResponse setBody(UpdateCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCredentialsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CompleteModelingProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompleteModelingProjectResponseBody body;

    public static CompleteModelingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteModelingProjectResponse self = new CompleteModelingProjectResponse();
        return TeaModel.build(map, self);
    }

    public CompleteModelingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteModelingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteModelingProjectResponse setBody(CompleteModelingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteModelingProjectResponseBody getBody() {
        return this.body;
    }

}

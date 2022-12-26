// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeCheckConfigResponseBody body;

    public static ChangeCheckConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckConfigResponse self = new ChangeCheckConfigResponse();
        return TeaModel.build(map, self);
    }

    public ChangeCheckConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeCheckConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeCheckConfigResponse setBody(ChangeCheckConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeCheckConfigResponseBody getBody() {
        return this.body;
    }

}

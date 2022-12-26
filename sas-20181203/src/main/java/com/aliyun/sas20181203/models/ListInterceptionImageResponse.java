// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInterceptionImageResponseBody body;

    public static ListInterceptionImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionImageResponse self = new ListInterceptionImageResponse();
        return TeaModel.build(map, self);
    }

    public ListInterceptionImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterceptionImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInterceptionImageResponse setBody(ListInterceptionImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterceptionImageResponseBody getBody() {
        return this.body;
    }

}

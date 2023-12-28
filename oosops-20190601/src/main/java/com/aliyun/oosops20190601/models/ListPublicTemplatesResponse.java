// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListPublicTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPublicTemplatesResponseBody body;

    public static ListPublicTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicTemplatesResponse self = new ListPublicTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicTemplatesResponse setBody(ListPublicTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicTemplatesResponseBody getBody() {
        return this.body;
    }

}

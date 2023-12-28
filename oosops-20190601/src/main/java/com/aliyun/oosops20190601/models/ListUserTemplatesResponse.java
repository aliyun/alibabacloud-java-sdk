// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserTemplatesResponseBody body;

    public static ListUserTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserTemplatesResponse self = new ListUserTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserTemplatesResponse setBody(ListUserTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserTemplatesResponseBody getBody() {
        return this.body;
    }

}

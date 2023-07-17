// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class AddNameListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddNameListResponseBody body;

    public static AddNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddNameListResponse self = new AddNameListResponse();
        return TeaModel.build(map, self);
    }

    public AddNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddNameListResponse setBody(AddNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddNameListResponseBody getBody() {
        return this.body;
    }

}

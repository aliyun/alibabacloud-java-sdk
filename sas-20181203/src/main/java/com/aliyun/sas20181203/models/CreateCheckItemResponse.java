// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCheckItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCheckItemResponseBody body;

    public static CreateCheckItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckItemResponse self = new CreateCheckItemResponse();
        return TeaModel.build(map, self);
    }

    public CreateCheckItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCheckItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCheckItemResponse setBody(CreateCheckItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCheckItemResponseBody getBody() {
        return this.body;
    }

}

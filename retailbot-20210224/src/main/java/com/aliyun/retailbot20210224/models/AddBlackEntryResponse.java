// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddBlackEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddBlackEntryResponseBody body;

    public static AddBlackEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBlackEntryResponse self = new AddBlackEntryResponse();
        return TeaModel.build(map, self);
    }

    public AddBlackEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBlackEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBlackEntryResponse setBody(AddBlackEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBlackEntryResponseBody getBody() {
        return this.body;
    }

}

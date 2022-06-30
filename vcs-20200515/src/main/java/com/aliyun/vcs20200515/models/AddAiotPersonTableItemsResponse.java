// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotPersonTableItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddAiotPersonTableItemsResponseBody body;

    public static AddAiotPersonTableItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAiotPersonTableItemsResponse self = new AddAiotPersonTableItemsResponse();
        return TeaModel.build(map, self);
    }

    public AddAiotPersonTableItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAiotPersonTableItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAiotPersonTableItemsResponse setBody(AddAiotPersonTableItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAiotPersonTableItemsResponseBody getBody() {
        return this.body;
    }

}

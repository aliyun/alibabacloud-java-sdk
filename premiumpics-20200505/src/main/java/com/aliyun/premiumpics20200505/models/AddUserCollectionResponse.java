// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class AddUserCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserCollectionResponseBody body;

    public static AddUserCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserCollectionResponse self = new AddUserCollectionResponse();
        return TeaModel.build(map, self);
    }

    public AddUserCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserCollectionResponse setBody(AddUserCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserCollectionResponseBody getBody() {
        return this.body;
    }

}

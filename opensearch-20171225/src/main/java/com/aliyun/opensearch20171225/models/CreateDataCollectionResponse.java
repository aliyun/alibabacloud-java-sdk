// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateDataCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataCollectionResponseBody body;

    public static CreateDataCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCollectionResponse self = new CreateDataCollectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataCollectionResponse setBody(CreateDataCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataCollectionResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateDynamicDictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDynamicDictResponseBody body;

    public static CreateDynamicDictResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicDictResponse self = new CreateDynamicDictResponse();
        return TeaModel.build(map, self);
    }

    public CreateDynamicDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDynamicDictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDynamicDictResponse setBody(CreateDynamicDictResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDynamicDictResponseBody getBody() {
        return this.body;
    }

}

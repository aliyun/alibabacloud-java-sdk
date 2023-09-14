// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateParamResponseBody body;

    public static CreateParamResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParamResponse self = new CreateParamResponse();
        return TeaModel.build(map, self);
    }

    public CreateParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateParamResponse setBody(CreateParamResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParamResponseBody getBody() {
        return this.body;
    }

}

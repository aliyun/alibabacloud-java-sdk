// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateYouhuiForOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateYouhuiForOrderResponseBody body;

    public static CreateYouhuiForOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateYouhuiForOrderResponse self = new CreateYouhuiForOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateYouhuiForOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateYouhuiForOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateYouhuiForOrderResponse setBody(CreateYouhuiForOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateYouhuiForOrderResponseBody getBody() {
        return this.body;
    }

}

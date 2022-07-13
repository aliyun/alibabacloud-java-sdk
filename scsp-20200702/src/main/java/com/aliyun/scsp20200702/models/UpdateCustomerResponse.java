// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UpdateCustomerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCustomerResponseBody body;

    public static UpdateCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomerResponse self = new UpdateCustomerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomerResponse setBody(UpdateCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomerResponseBody getBody() {
        return this.body;
    }

}

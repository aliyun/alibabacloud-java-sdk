// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProvisionedProductResponseBody body;

    public static UpdateProvisionedProductResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProvisionedProductResponse self = new UpdateProvisionedProductResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProvisionedProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProvisionedProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProvisionedProductResponse setBody(UpdateProvisionedProductResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProvisionedProductResponseBody getBody() {
        return this.body;
    }

}

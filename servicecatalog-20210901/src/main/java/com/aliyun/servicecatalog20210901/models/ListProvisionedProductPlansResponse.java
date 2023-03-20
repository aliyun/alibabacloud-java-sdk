// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProvisionedProductPlansResponseBody body;

    public static ListProvisionedProductPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionedProductPlansResponse self = new ListProvisionedProductPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListProvisionedProductPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProvisionedProductPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProvisionedProductPlansResponse setBody(ListProvisionedProductPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProvisionedProductPlansResponseBody getBody() {
        return this.body;
    }

}

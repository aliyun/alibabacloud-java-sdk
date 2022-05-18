// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsAdminResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductsAsAdminResponseBody body;

    public static ListProductsAsAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductsAsAdminResponse self = new ListProductsAsAdminResponse();
        return TeaModel.build(map, self);
    }

    public ListProductsAsAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductsAsAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductsAsAdminResponse setBody(ListProductsAsAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductsAsAdminResponseBody getBody() {
        return this.body;
    }

}
